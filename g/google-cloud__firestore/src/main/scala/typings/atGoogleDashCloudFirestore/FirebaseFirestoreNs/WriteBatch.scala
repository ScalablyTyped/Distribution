package typings.atGoogleDashCloudFirestore.FirebaseFirestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FirebaseFirestore.WriteBatch")
@js.native
class WriteBatch protected () extends js.Object {
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
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def create(documentRef: DocumentReference, data: DocumentData): WriteBatch = js.native
  /**
    * Deletes the document referred to by the provided `DocumentReference`.
    *
    * @param documentRef A reference to the document to be deleted.
    * @param precondition A Precondition to enforce for this delete.
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def delete(documentRef: DocumentReference): WriteBatch = js.native
  def delete(documentRef: DocumentReference, precondition: Precondition): WriteBatch = js.native
  /**
    * Write to the document referred to by the provided `DocumentReference`.
    * If the document does not exist yet, it will be created. If you pass
    * `SetOptions`, the provided data can be merged into the existing document.
    *
    * @param documentRef A reference to the document to be set.
    * @param data An object of the fields and values for the document.
    * @param options An object to configure the set behavior.
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def set(documentRef: DocumentReference, data: DocumentData): WriteBatch = js.native
  def set(documentRef: DocumentReference, data: DocumentData, options: SetOptions): WriteBatch = js.native
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
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def update(documentRef: DocumentReference, data: UpdateData): WriteBatch = js.native
  def update(documentRef: DocumentReference, data: UpdateData, precondition: Precondition): WriteBatch = js.native
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
    * to update, optionally followed a `Precondition` to enforce on this update.
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def update(documentRef: DocumentReference, field: String, value: js.Any, fieldsOrPrecondition: js.Any*): WriteBatch = js.native
  def update(documentRef: DocumentReference, field: FieldPath, value: js.Any, fieldsOrPrecondition: js.Any*): WriteBatch = js.native
}

