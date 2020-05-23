package typings.firebaseFirestore.mutationMod

import typings.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "FieldMask")
@js.native
class FieldMask protected () extends js.Object {
  def this(fields: js.Array[FieldPath]) = this()
  val fields: js.Array[FieldPath] = js.native
  /**
    * Verifies that `fieldPath` is included by at least one field in this field
    * mask.
    *
    * This is an O(n) operation, where `n` is the size of the field mask.
    */
  def covers(fieldPath: FieldPath): Boolean = js.native
  def isEqual(other: FieldMask): Boolean = js.native
}

