package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "DocumentSnapshot")
@js.native
class DocumentSnapshot protected () extends js.Object {
  /** True if the document exists. */
  val exists: Boolean = js.native
  /**
    * The ID of the document for which this `DocumentSnapshot` contains data.
    */
  val id: String = js.native
  /**
    * Metadata about this snapshot, concerning its source and if it has local
    * modifications.
    */
  val metadata: SnapshotMetadata = js.native
  /** A `DocumentReference` to the document location. */
  val ref: DocumentReference = js.native
  /**
    * Retrieves all fields in the document as an Object. Returns 'undefined' if
    * the document doesn't exist.
    *
    * By default, `FieldValue.serverTimestamp()` values that have not yet been
    * set to their final value will be returned as `null`. You can override
    * this by passing an options object.
    *
    * @param options An options object to configure how data is retrieved from
    * the snapshot (e.g. the desired behavior for server timestamps that have
    * not yet been set to their final value).
    * @return An Object containing all fields in the document or 'undefined' if
    * the document doesn't exist.
    */
  def data(): js.UndefOr[DocumentData] = js.native
  def data(options: SnapshotOptions): js.UndefOr[DocumentData] = js.native
  /**
    * Retrieves the field specified by `fieldPath`. Returns 'undefined' if the
    * document or field doesn't exist.
    *
    * By default, a `FieldValue.serverTimestamp()` that has not yet been set to
    * its final value will be returned as `null`. You can override this by
    * passing an options object.
    *
    * @param fieldPath The path (e.g. 'foo' or 'foo.bar') to a specific field.
    * @param options An options object to configure how the field is retrieved
    * from the snapshot (e.g. the desired behavior for server timestamps that
    * have not yet been set to their final value).
    * @return The data at the specified field location or undefined if no such
    * field exists in the document.
    */
  def get(fieldPath: String): js.Any = js.native
  def get(fieldPath: String, options: SnapshotOptions): js.Any = js.native
  def get(fieldPath: FieldPath): js.Any = js.native
  def get(fieldPath: FieldPath, options: SnapshotOptions): js.Any = js.native
  /**
    * Returns true if this `DocumentSnapshot` is equal to the provided one.
    *
    * @param other The `DocumentSnapshot` to compare against.
    * @return true if this `DocumentSnapshot` is equal to the provided one.
    */
  def isEqual(other: DocumentSnapshot): Boolean = js.native
}

