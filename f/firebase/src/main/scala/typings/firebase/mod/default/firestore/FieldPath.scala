package typings.firebase.mod.default.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "default.firestore.FieldPath")
@js.native
class FieldPath protected () extends StObject {
  /**
    * Creates a FieldPath from the provided field names. If more than one field
    * name is provided, the path will point to a nested field in a document.
    *
    * @param fieldNames A list of field names.
    */
  def this(fieldNames: String*) = this()
  
  /**
    * Returns true if this `FieldPath` is equal to the provided one.
    *
    * @param other The `FieldPath` to compare against.
    * @return true if this `FieldPath` is equal to the provided one.
    */
  def isEqual(other: typings.firebase.mod.firebase.firestore.FieldPath): Boolean = js.native
}
/* static members */
object FieldPath {
  
  @JSImport("firebase", "default.firestore.FieldPath")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a special sentinel `FieldPath` to refer to the ID of a document.
    * It can be used in queries to sort or filter by the document ID.
    */
  @scala.inline
  def documentId(): typings.firebase.mod.firebase.firestore.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebase.mod.firebase.firestore.FieldPath]
}
