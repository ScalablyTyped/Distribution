package typings.firebase.firebaseMod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "firestore.WriteBatch")
@js.native
class WriteBatch protected () extends js.Object {
  /**
    * Commits all of the writes in this write batch as a single atomic unit.
    *
    * @return A Promise resolved once all of the writes in the batch have been
    * successfully written to the backend as an atomic unit. Note that it won't
    * resolve while you're offline.
    */
  def commit(): js.Promise[Unit] = js.native
  /**
    * Deletes the document referred to by the provided `DocumentReference`.
    *
    * @param documentRef A reference to the document to be deleted.
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def delete(documentRef: DocumentReference): WriteBatch = js.native
  /**
    * Writes to the document referred to by the provided `DocumentReference`.
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
    * Updates fields in the document referred to by the provided
    * `DocumentReference`. The update will fail if applied to a document that
    * does not exist.
    *
    * @param documentRef A reference to the document to be updated.
    * @param data An object containing the fields and values with which to
    * update the document. Fields can contain dots to reference nested fields
    * within the document.
    * @return This `WriteBatch` instance. Used for chaining method calls.
    */
  def update(documentRef: DocumentReference, data: UpdateData): WriteBatch = js.native
  /**
    * Updates fields in the document referred to by this `DocumentReference`.
    * The update will fail if applied to a document that does not exist.
    *
    * Nested fields can be update by providing dot-separated field path strings
    * or by providing FieldPath objects.
    *
    * @param documentRef A reference to the document to be updated.
    * @param field The first field to update.
    * @param value The first value.
    * @param moreFieldsAndValues Additional key value pairs.
    * @return A Promise resolved once the data has been successfully written
    * to the backend (Note that it won't resolve while you're offline).
    */
  def update(documentRef: DocumentReference, field: String, value: js.Any, moreFieldsAndValues: js.Any*): WriteBatch = js.native
  def update(documentRef: DocumentReference, field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): WriteBatch = js.native
}

