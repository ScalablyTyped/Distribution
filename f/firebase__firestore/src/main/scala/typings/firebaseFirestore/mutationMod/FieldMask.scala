package typings.firebaseFirestore.mutationMod

import typings.firebaseFirestore.pathMod.FieldPath
import typings.firebaseFirestore.sortedSetMod.SortedSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/mutation", "FieldMask")
@js.native
class FieldMask protected () extends js.Object {
  def this(fields: SortedSet[FieldPath]) = this()
  val fields: SortedSet[FieldPath] = js.native
  /**
    * Verifies that `fieldPath` is included by at least one field in this field
    * mask.
    *
    * This is an O(n) operation, where `n` is the size of the field mask.
    */
  def covers(fieldPath: FieldPath): Boolean = js.native
  def isEqual(other: FieldMask): Boolean = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/model/mutation", "FieldMask")
@js.native
object FieldMask extends js.Object {
  def fromArray(fields: js.Array[FieldPath]): FieldMask = js.native
  def fromSet(fields: SortedSet[FieldPath]): FieldMask = js.native
}

