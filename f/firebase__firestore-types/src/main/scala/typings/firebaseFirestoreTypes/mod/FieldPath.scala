package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "FieldPath")
@js.native
class FieldPath protected () extends js.Object {
  def this(fieldNames: String*) = this()
  
  def isEqual(other: FieldPath): Boolean = js.native
}
/* static members */
@JSImport("@firebase/firestore-types", "FieldPath")
@js.native
object FieldPath extends js.Object {
  
  def documentId(): FieldPath = js.native
}
