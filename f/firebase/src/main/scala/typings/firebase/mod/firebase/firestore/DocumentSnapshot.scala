package typings.firebase.mod.firebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSnapshot[T] extends StObject {
  
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
  def data(): js.UndefOr[T] = js.native
  def data(options: SnapshotOptions): js.UndefOr[T] = js.native
  
  /**
    * Property of the `DocumentSnapshot` that signals whether or not the data
    * exists. True if the document exists.
    */
  val exists: Boolean = js.native
  
  /**
    * Retrieves the field specified by `fieldPath`. Returns `undefined` if the
    * document or field doesn't exist.
    *
    * By default, a `FieldValue.serverTimestamp()` that has not yet been set to
    * its final value will be returned as `null`. You can override this by
    * passing an options object.
    *
    * @param fieldPath The path (e.g. 'foo' or 'foo.bar') to a specific field.
    * @param options An options object to configure how the field is retrieved
    * from the snapshot (e.g. the desired behavior for server timestamps that have
    * not yet been set to their final value).
    * @return The data at the specified field location or undefined if no such
    * field exists in the document.
    */
  def get(fieldPath: String): js.Any = js.native
  def get(fieldPath: String, options: SnapshotOptions): js.Any = js.native
  def get(fieldPath: FieldPath): js.Any = js.native
  def get(fieldPath: FieldPath, options: SnapshotOptions): js.Any = js.native
  
  /**
    * Property of the `DocumentSnapshot` that provides the document's ID.
    */
  val id: String = js.native
  
  /**
    * Returns true if this `DocumentSnapshot` is equal to the provided one.
    *
    * @param other The `DocumentSnapshot` to compare against.
    * @return true if this `DocumentSnapshot` is equal to the provided one.
    */
  def isEqual(other: DocumentSnapshot[T]): Boolean = js.native
  
  /**
    *  Metadata about the `DocumentSnapshot`, including information about its
    *  source and local modifications.
    */
  val metadata: SnapshotMetadata = js.native
  
  /**
    * The `DocumentReference` for the document included in the `DocumentSnapshot`.
    */
  val ref: DocumentReference[T] = js.native
}
