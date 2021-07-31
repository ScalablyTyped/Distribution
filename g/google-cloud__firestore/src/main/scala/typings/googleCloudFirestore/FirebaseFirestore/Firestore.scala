package typings.googleCloudFirestore.FirebaseFirestore

import typings.googleCloudFirestore.anon.MaxAttempts
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
    * @param options An options object used to configure the throttling
    * behavior for the underlying BulkWriter.
    */
  def bulkWriter(): BulkWriter = js.native
  def bulkWriter(options: BulkWriterOptions): BulkWriter = js.native
  
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
    * Executes the given updateFunction and commits the changes applied within
    * the transaction.
    *
    * You can use the transaction object passed to 'updateFunction' to read and
    * modify Firestore documents under lock. Transactions are committed once
    * 'updateFunction' resolves and attempted up to five times on failure.
    *
    * @param updateFunction The function to execute within the transaction
    * context.
    * @param {object=} transactionOptions Transaction options.
    * @param {number=} transactionOptions.maxAttempts The maximum number of
    * attempts for this transaction.
    * @return If the transaction completed successfully or was explicitly
    * aborted (by the updateFunction returning a failed Promise), the Promise
    * returned by the updateFunction will be returned here. Else if the
    * transaction failed, a rejected Promise with the corresponding failure
    * error will be returned.
    */
  def runTransaction[T](updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = js.native
  def runTransaction[T](
    updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
    transactionOptions: MaxAttempts
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
