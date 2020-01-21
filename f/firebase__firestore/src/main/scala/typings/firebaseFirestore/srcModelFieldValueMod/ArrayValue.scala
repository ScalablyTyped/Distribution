package typings.firebaseFirestore.srcModelFieldValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/field_value", "ArrayValue")
@js.native
class ArrayValue protected () extends FieldValue {
  def this(internalValue: js.Array[FieldValue]) = this()
  val internalValue: js.Array[FieldValue] = js.native
  /**
    * Returns true if the given value is contained in this array.
    */
  def contains(value: FieldValue): Boolean = js.native
  def forEach(action: js.Function1[/* value */ FieldValue, Unit]): Unit = js.native
}

