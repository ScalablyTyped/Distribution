package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore
import typings.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.SetOptions
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.UpdateData
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.WithFieldValue
import typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot
import typings.firebaseFirestore.distFirestoreSrcLiteApiTransactionOptionsMod.TransactionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcLiteApiTransactionMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/transaction", "Transaction")
  @js.native
  open class Transaction protected () extends StObject {
    /** @hideconstructor */
    def this(
      _firestore: Firestore,
      _transaction: typings.firebaseFirestore.distFirestoreSrcCoreTransactionMod.Transaction
    ) = this()
    
    /* private */ val _dataReader: Any = js.native
    
    /* protected */ val _firestore: Firestore = js.native
    
    /* private */ val _transaction: Any = js.native
    
    /**
      * Deletes the document referred to by the provided {@link DocumentReference}.
      *
      * @param documentRef - A reference to the document to be deleted.
      * @returns This `Transaction` instance. Used for chaining method calls.
      */
    def delete(documentRef: DocumentReference[Any]): this.type = js.native
    
    /**
      * Reads the document referenced by the provided {@link DocumentReference}.
      *
      * @param documentRef - A reference to the document to be read.
      * @returns A `DocumentSnapshot` with the read data.
      */
    def get[T](documentRef: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = js.native
    
    /**
      * Writes to the document referred to by the provided {@link
      * DocumentReference}. If the document does not exist yet, it will be created.
      * If you provide `merge` or `mergeFields`, the provided data can be merged
      * into an existing document.
      *
      * @param documentRef - A reference to the document to be set.
      * @param data - An object of the fields and values for the document.
      * @param options - An object to configure the set behavior.
      * @throws Error - If the provided input is not a valid Firestore document.
      * @returns This `Transaction` instance. Used for chaining method calls.
      */
    def set[T](documentRef: DocumentReference[T], data: PartialWithFieldValue[T], options: SetOptions): this.type = js.native
    /**
      * Writes to the document referred to by the provided {@link
      * DocumentReference}. If the document does not exist yet, it will be created.
      *
      * @param documentRef - A reference to the document to be set.
      * @param data - An object of the fields and values for the document.
      * @throws Error - If the provided input is not a valid Firestore document.
      * @returns This `Transaction` instance. Used for chaining method calls.
      */
    def set[T](documentRef: DocumentReference[T], data: WithFieldValue[T]): this.type = js.native
    
    /**
      * Updates fields in the document referred to by the provided {@link
      * DocumentReference}. The update will fail if applied to a document that does
      * not exist.
      *
      * Nested fields can be updated by providing dot-separated field path
      * strings or by providing `FieldPath` objects.
      *
      * @param documentRef - A reference to the document to be updated.
      * @param field - The first field to update.
      * @param value - The first value.
      * @param moreFieldsAndValues - Additional key/value pairs.
      * @throws Error - If the provided input is not valid Firestore data.
      * @returns This `Transaction` instance. Used for chaining method calls.
      */
    def update(documentRef: DocumentReference[Any], field: String, value: Any, moreFieldsAndValues: Any*): this.type = js.native
    def update(documentRef: DocumentReference[Any], field: FieldPath, value: Any, moreFieldsAndValues: Any*): this.type = js.native
    /**
      * Updates fields in the document referred to by the provided {@link
      * DocumentReference}. The update will fail if applied to a document that does
      * not exist.
      *
      * @param documentRef - A reference to the document to be updated.
      * @param data - An object containing the fields and values with which to
      * update the document. Fields can contain dots to reference nested fields
      * within the document.
      * @throws Error - If the provided input is not valid Firestore data.
      * @returns This `Transaction` instance. Used for chaining method calls.
      */
    def update[T](documentRef: DocumentReference[T], data: UpdateData[T]): this.type = js.native
  }
  
  inline def runTransaction[T](firestore: Firestore, updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def runTransaction[T](
    firestore: Firestore,
    updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
    options: TransactionOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
