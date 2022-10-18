package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiDatabaseMod.Firestore
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.DocumentReference
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.SetOptions
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.UpdateData
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.WithFieldValue
import typings.firebaseFirestore.distPackagesFirestoreSrcModelMutationMod.Mutation
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLiteApiWriteBatchMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/write_batch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/write_batch", "WriteBatch")
  @js.native
  open class WriteBatch_ protected () extends StObject {
    /** @hideconstructor */
    def this(_firestore: Firestore, _commitHandler: js.Function1[/* m */ js.Array[Mutation], js.Promise[Unit]]) = this()
    
    /* private */ val _commitHandler: Any = js.native
    
    /* private */ var _committed: Any = js.native
    
    /* private */ val _dataReader: Any = js.native
    
    /* private */ val _firestore: Any = js.native
    
    /* private */ var _mutations: Any = js.native
    
    /* private */ var _verifyNotCommitted: Any = js.native
    
    /**
      * Commits all of the writes in this write batch as a single atomic unit.
      *
      * The result of these writes will only be reflected in document reads that
      * occur after the returned promise resolves. If the client is offline, the
      * write fails. If you would like to see local modifications or buffer writes
      * until the client is online, use the full Firestore SDK.
      *
      * @returns A `Promise` resolved once all of the writes in the batch have been
      * successfully written to the backend as an atomic unit (note that it won't
      * resolve while you're offline).
      */
    def commit(): js.Promise[Unit] = js.native
    
    /**
      * Deletes the document referred to by the provided {@link DocumentReference}.
      *
      * @param documentRef - A reference to the document to be deleted.
      * @returns This `WriteBatch` instance. Used for chaining method calls.
      */
    def delete(documentRef: DocumentReference[Any]): WriteBatch_ = js.native
    
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
      * @returns This `WriteBatch` instance. Used for chaining method calls.
      */
    def set[T](documentRef: DocumentReference[T], data: PartialWithFieldValue[T], options: SetOptions): WriteBatch_ = js.native
    /**
      * Writes to the document referred to by the provided {@link
      * DocumentReference}. If the document does not exist yet, it will be created.
      *
      * @param documentRef - A reference to the document to be set.
      * @param data - An object of the fields and values for the document.
      * @returns This `WriteBatch` instance. Used for chaining method calls.
      */
    def set[T](documentRef: DocumentReference[T], data: WithFieldValue[T]): WriteBatch_ = js.native
    
    /**
      * Updates fields in the document referred to by this {@link
      * DocumentReference}. The update will fail if applied to a document that does
      * not exist.
      *
      * Nested fields can be update by providing dot-separated field path strings
      * or by providing `FieldPath` objects.
      *
      * @param documentRef - A reference to the document to be updated.
      * @param field - The first field to update.
      * @param value - The first value.
      * @param moreFieldsAndValues - Additional key value pairs.
      * @throws Error - If the provided input is not valid Firestore data.
      * @returns This `WriteBatch` instance. Used for chaining method calls.
      */
    def update(documentRef: DocumentReference[Any], field: String, value: Any, moreFieldsAndValues: Any*): WriteBatch_ = js.native
    def update(documentRef: DocumentReference[Any], field: FieldPath, value: Any, moreFieldsAndValues: Any*): WriteBatch_ = js.native
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
      * @returns This `WriteBatch` instance. Used for chaining method calls.
      */
    def update[T](documentRef: DocumentReference[T], data: UpdateData[T]): WriteBatch_ = js.native
  }
  
  inline def validateReference[T](documentRef: DocumentReference[T], firestore: Firestore): DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateReference")(documentRef.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any])).asInstanceOf[DocumentReference[T]]
  inline def validateReference[T](documentRef: Compat[DocumentReference[T]], firestore: Firestore): DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateReference")(documentRef.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any])).asInstanceOf[DocumentReference[T]]
  
  inline def writeBatch(firestore: Firestore): WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[WriteBatch_]
}
