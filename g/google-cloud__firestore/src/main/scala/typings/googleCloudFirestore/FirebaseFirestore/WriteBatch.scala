package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteBatch extends StObject {
  
  /**
    * Commits all of the writes in this write batch as a single atomic unit.
    *
    * @return A Promise resolved once all of the writes in the batch have been
    * successfully written to the backend as an atomic unit.
    */
  def commit(): js.Promise[js.Array[WriteResult]] = js.native
  
  /**
    * Create the document referred to by the provided `DocumentReference`. The
    * operation will fail the batch if a document exists at the specified
    * location.
    *
    * @param documentRef A reference to the document to be created.
    * @param data The object data to serialize as the document.
    * @throws Error If the provided input is not a valid Firestore document.
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def create[T](documentRef: DocumentReference[T], data: WithFieldValue[T]): WriteBatch = js.native
  
  /**
    * Deletes the document referred to by the provided `DocumentReference`.
    *
    * @param documentRef A reference to the document to be deleted.
    * @param precondition A Precondition to enforce for this delete.
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def delete(documentRef: DocumentReference[Any]): WriteBatch = js.native
  def delete(documentRef: DocumentReference[Any], precondition: Precondition): WriteBatch = js.native
  
  /**
    * Write to the document referred to by the provided `DocumentReference`.
    * If the document does not exist yet, it will be created. If you pass
    * `SetOptions`, the provided data can be merged into the existing document.
    *
    * @param documentRef A reference to the document to be set.
    * @param data An object of the fields and values for the document.
    * @param options An object to configure the set behavior.
    * @param  options.merge - If true, set() merges the values specified in its
    * data argument. Fields omitted from this set() call remain untouched. If
    * your input sets any field to an empty map, all nested fields are
    * overwritten.
    * @param options.mergeFields - If provided, set() only replaces the
    * specified field paths. Any field path that is not specified is ignored
    * and remains untouched. If your input sets any field to an empty map, all
    * nested fields are overwritten.
    * @throws Error If the provided input is not a valid Firestore document.
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def set[T](documentRef: DocumentReference[T], data: PartialWithFieldValue[T], options: SetOptions): WriteBatch = js.native
  def set[T](documentRef: DocumentReference[T], data: WithFieldValue[T]): WriteBatch = js.native
  
  /**
    * Updates fields in the document referred to by the provided
    * `DocumentReference`. The update will fail if applied to a document that
    * does not exist.
    *
    * Nested fields can be updated by providing dot-separated field path
    * strings or by providing FieldPath objects.
    *
    * A `Precondition` restricting this update can be specified as the last
    * argument.
    *
    * @param documentRef A reference to the document to be updated.
    * @param field The first field to update.
    * @param value The first value
    * @param fieldsOrPrecondition An alternating list of field paths and values
    * to update, optionally followed a `Precondition` to enforce on this
    * update.
    * @throws Error If the provided input is not valid Firestore data.
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def update(documentRef: DocumentReference[Any], field: String, value: Any, fieldsOrPrecondition: Any*): WriteBatch = js.native
  def update(documentRef: DocumentReference[Any], field: FieldPath, value: Any, fieldsOrPrecondition: Any*): WriteBatch = js.native
  /**
    * Update fields of the document referred to by the provided
    * `DocumentReference`. If the document doesn't yet exist, the update fails
    * and the entire batch will be rejected.
    *
    * Nested fields can be updated by providing dot-separated field path
    * strings.
    *
    * @param documentRef A reference to the document to be updated.
    * @param data An object containing the fields and values with which to
    * update the document.
    * @param precondition A Precondition to enforce on this update.
    * @throws Error If the provided input is not valid Firestore data.
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def update[T](documentRef: DocumentReference[T], data: UpdateData[T]): WriteBatch = js.native
  def update[T](documentRef: DocumentReference[T], data: UpdateData[T], precondition: Precondition): WriteBatch = js.native
}
