package typings.firebaseFirestore.distLiteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite", "DocumentSnapshot")
@js.native
/* protected */ open class DocumentSnapshot[T] () extends StObject {
  
  /**
    * Retrieves all fields in the document as an `Object`. Returns `undefined` if
    * the document doesn't exist.
    *
    * @returns An `Object` containing all fields in the document or `undefined`
    * if the document doesn't exist.
    */
  def data(): js.UndefOr[T] = js.native
  
  /**
    * Signals whether or not the document at the snapshot's location exists.
    *
    * @returns true if the document exists.
    */
  def exists(): /* is @firebase/firestore.@firebase/firestore/dist/lite.QueryDocumentSnapshot<T> */ Boolean = js.native
  
  /**
    * Retrieves the field specified by `fieldPath`. Returns `undefined` if the
    * document or field doesn't exist.
    *
    * @param fieldPath - The path (for example 'foo' or 'foo.bar') to a specific
    * field.
    * @returns The data at the specified field location or undefined if no such
    * field exists in the document.
    */
  def get(fieldPath: String): Any = js.native
  def get(fieldPath: FieldPath): Any = js.native
  
  /** Property of the `DocumentSnapshot` that provides the document's ID. */
  def id: String = js.native
  
  /**
    * The `DocumentReference` for the document included in the `DocumentSnapshot`.
    */
  def ref: DocumentReference[T] = js.native
}
