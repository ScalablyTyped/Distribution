package typings.firebase.mod.default.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "firestore.FieldPath")
@js.native
class FieldPath protected () extends js.Object {
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
@JSImport("firebase", "firestore.FieldPath")
@js.native
object FieldPath extends js.Object {
  
  /**
    * Returns a special sentinel `FieldPath` to refer to the ID of a document.
    * It can be used in queries to sort or filter by the document ID.
    */
  def documentId(): typings.firebase.mod.firebase.firestore.FieldPath = js.native
}
