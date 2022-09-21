package typings.firebaseFirestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore", "DocumentSnapshot")
@js.native
/* protected */ open class DocumentSnapshot[T] () extends StObject {
  
  /**
    * Retrieves all fields in the document as an `Object`. Returns `undefined` if
    * the document doesn't exist.
    *
    * By default, `serverTimestamp()` values that have not yet been
    * set to their final value will be returned as `null`. You can override
    * this by passing an options object.
    *
    * @param options - An options object to configure how data is retrieved from
    * the snapshot (for example the desired behavior for server timestamps that
    * have not yet been set to their final value).
    * @returns An `Object` containing all fields in the document or `undefined` if
    * the document doesn't exist.
    */
  def data(): js.UndefOr[T] = js.native
  def data(options: SnapshotOptions): js.UndefOr[T] = js.native
  
  /**
    * Returns whether or not the data exists. True if the document exists.
    */
  def exists(): /* is @firebase/firestore.@firebase/firestore.QueryDocumentSnapshot<T> */ Boolean = js.native
  
  /**
    * Retrieves the field specified by `fieldPath`. Returns `undefined` if the
    * document or field doesn't exist.
    *
    * By default, a `serverTimestamp()` that has not yet been set to
    * its final value will be returned as `null`. You can override this by
    * passing an options object.
    *
    * @param fieldPath - The path (for example 'foo' or 'foo.bar') to a specific
    * field.
    * @param options - An options object to configure how the field is retrieved
    * from the snapshot (for example the desired behavior for server timestamps
    * that have not yet been set to their final value).
    * @returns The data at the specified field location or undefined if no such
    * field exists in the document.
    */
  def get(fieldPath: String): Any = js.native
  def get(fieldPath: String, options: SnapshotOptions): Any = js.native
  def get(fieldPath: FieldPath): Any = js.native
  def get(fieldPath: FieldPath, options: SnapshotOptions): Any = js.native
  
  /**
    * Property of the `DocumentSnapshot` that provides the document's ID.
    */
  def id: String = js.native
  
  /**
    *  Metadata about the `DocumentSnapshot`, including information about its
    *  source and local modifications.
    */
  val metadata: SnapshotMetadata = js.native
  
  /**
    * The `DocumentReference` for the document included in the `DocumentSnapshot`.
    */
  def ref: DocumentReference[T] = js.native
}
