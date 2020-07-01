package typings.firebaseFirestore.indexDotnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "FieldPath")
@js.native
class FieldPath protected ()
  extends typings.firebaseFirestore.fieldPathMod.FieldPath {
  /**
    * Creates a FieldPath from the provided field names. If more than one field
    * name is provided, the path will point to a nested field in a document.
    *
    * @param fieldNames A list of field names.
    */
  def this(fieldNames: String*) = this()
}

