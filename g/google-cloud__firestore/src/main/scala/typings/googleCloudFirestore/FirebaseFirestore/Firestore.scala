package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firestore extends StObject {
  
  /**
    * Creates a write batch, used for performing multiple writes as a single
    * atomic operation.
    */
  def batch(): WriteBatch = js.native
  
  /**
    * Creates a [BulkWriter]{@link BulkWriter}, used for performing
    * multiple writes in parallel. Gradually ramps up writes as specified
    * by the 500/50/5 rule.
    *
    * @see https://firebase.google.com/docs/firestore/best-practices#ramping_up_traffic
    *
    * @param options An options object used to configure the throttling
    * behavior for the underlying BulkWriter.
    */
  def bulkWriter(): BulkWriter = js.native
  def bulkWriter(options: BulkWriterOptions): BulkWriter = js.native
  
  /**
    * Creates a new `BundleBuilder` instance to package selected Firestore data into
    * a bundle.
    *
    * @param bundleId The ID of the bundle. When loaded on clients, client SDKs use this ID
    * and the timestamp associated with the bundle to tell if it has been loaded already.
    * If not specified, a random identifier will be used.
    *
    *
    * @example
    * const bundle = firestore.bundle('data-bundle');
    * const docSnapshot = await firestore.doc('abc/123').get();
    * const querySnapshot = await firestore.collection('coll').get();
    *
    * const bundleBuffer = bundle.add(docSnapshot); // Add a document
    *                            .add('coll-query', querySnapshot) // Add a named query.
    *                            .build()
    * // Save `bundleBuffer` to CDN or stream it to clients.
    */
  def bundle(): BundleBuilder = js.native
  def bundle(bundleId: String): BundleBuilder = js.native
  
  /**
    * Gets a `CollectionReference` instance that refers to the collection at
    * the specified path.
    *
    * @param collectionPath A slash-separated path to a collection.
    * @return The `CollectionReference` instance.
    */
  def collection(collectionPath: String): CollectionReference[DocumentData] = js.native
  
  /**
    * Creates and returns a new Query that includes all documents in the
    * database that are contained in a collection or subcollection with the
    * given collectionId.
    *
    * @param collectionId Identifies the collections to query over. Every
    * collection or subcollection with this ID as the last segment of its path
    * will be included. Cannot contain a slash.
    * @return The created `CollectionGroup`.
    */
  def collectionGroup(collectionId: String): CollectionGroup[DocumentData] = js.native
  
  /**
    * Gets a `DocumentReference` instance that refers to the document at the
    * specified path.
    *
    * @param documentPath A slash-separated path to a document.
    * @return The `DocumentReference` instance.
    */
  def doc(documentPath: String): DocumentReference[DocumentData] = js.native
  
  /**
    * Retrieves multiple documents from Firestore.
    *
    * The first argument is required and must be of type `DocumentReference`
    * followed by any additional `DocumentReference` documents. If used, the
    * optional `ReadOptions` must be the last argument.
    *
    * @param {Array.<DocumentReference|ReadOptions>} documentRefsOrReadOptions
    * The `DocumentReferences` to receive, followed by an optional field
    * mask.
    * @return A Promise that resolves with an array of resulting document
    * snapshots.
    */
  def getAll(documentRefsOrReadOptions: (DocumentReference[DocumentData] | ReadOptions)*): js.Promise[js.Array[DocumentSnapshot[DocumentData]]] = js.native
  
  /**
    * Fetches the root collections that are associated with this Firestore
    * database.
    *
    * @returns A Promise that resolves with an array of CollectionReferences.
    */
  def listCollections(): js.Promise[js.Array[CollectionReference[DocumentData]]] = js.native
  
  /**
    * Recursively deletes all documents and subcollections at and under the
    * specified level.
    *
    * If any delete fails, the promise is rejected with an error message
    * containing the number of failed deletes and the stack trace of the last
    * failed delete. The provided reference is deleted regardless of whether
    * all deletes succeeded.
    *
    * `recursiveDelete()` uses a BulkWriter instance with default settings to
    * perform the deletes. To customize throttling rates or add success/error
    * callbacks, pass in a custom BulkWriter instance.
    *
    * @param ref The reference of a document or collection to delete.
    * @param bulkWriter A custom BulkWriter instance used to perform the
    * deletes.
    * @return A promise that resolves when all deletes have been performed.
    * The promise is rejected if any of the deletes fail.
    *
    * @example
    * // Recursively delete a reference and log the references of failures.
    * const bulkWriter = firestore.bulkWriter();
    * bulkWriter
    *   .onWriteError((error) => {
    *     if (
    *       error.failedAttempts < MAX_RETRY_ATTEMPTS
    *     ) {
    *       return true;
    *     } else {
    *       console.log('Failed write at document: ', error.documentRef.path);
    *       return false;
    *     }
    *   });
    * await firestore.recursiveDelete(docRef, bulkWriter);
    */
  def recursiveDelete(ref: CollectionReference[Any]): js.Promise[Unit] = js.native
  def recursiveDelete(ref: CollectionReference[Any], bulkWriter: BulkWriter): js.Promise[Unit] = js.native
  def recursiveDelete(ref: DocumentReference[Any]): js.Promise[Unit] = js.native
  def recursiveDelete(ref: DocumentReference[Any], bulkWriter: BulkWriter): js.Promise[Unit] = js.native
  
  /**
    * Executes the given updateFunction and commits the changes applied within
    * the transaction.
    *
    * You can use the transaction object passed to 'updateFunction' to read and
    * modify Firestore documents under lock. You have to perform all reads
    * before before you perform any write.
    *
    * Transactions can be performed as read-only or read-write transactions. By
    * default, transactions are executed in read-write mode.
    *
    * A read-write transaction obtains a pessimistic lock on all documents that
    * are read during the transaction. These locks block other transactions,
    * batched writes, and other non-transactional writes from changing that
    * document. Any writes in a read-write transactions are committed once
    * 'updateFunction' resolves, which also releases all locks.
    *
    * If a read-write transaction fails with contention, the transaction is
    * retried up to five times. The `updateFunction` is invoked once for each
    * attempt.
    *
    * Read-only transactions do not lock documents. They can be used to read
    * documents at a consistent snapshot in time, which may be up to 60 seconds
    * in the past. Read-only transactions are not retried.
    *
    * Transactions time out after 60 seconds if no documents are read.
    * Transactions that are not committed within than 270 seconds are also
    * aborted. Any remaining locks are released when a transaction times out.
    *
    * @param updateFunction The function to execute within the transaction
    * context.
    * @param transactionOptions Transaction options.
    * @return If the transaction completed successfully or was explicitly
    * aborted (by the updateFunction returning a failed Promise), the Promise
    * returned by the updateFunction will be returned here. Else if the
    * transaction failed, a rejected Promise with the corresponding failure
    * error will be returned.
    */
  def runTransaction[T](updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = js.native
  def runTransaction[T](
    updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
    transactionOptions: ReadOnlyTransactionOptions
  ): js.Promise[T] = js.native
  def runTransaction[T](
    updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
    transactionOptions: ReadWriteTransactionOptions
  ): js.Promise[T] = js.native
  
  /**
    * Specifies custom settings to be used to configure the `Firestore`
    * instance. Can only be invoked once and before any other Firestore
    * method.
    *
    * If settings are provided via both `settings()` and the `Firestore`
    * constructor, both settings objects are merged and any settings provided
    * via `settings()` take precedence.
    *
    * @param {object} settings The settings to use for all Firestore
    * operations.
    */
  def settings(settings: Settings): Unit = js.native
  
  /**
    * Terminates the Firestore client and closes all open streams.
    *
    * @return A Promise that resolves when the client is terminated.
    */
  def terminate(): js.Promise[Unit] = js.native
}
