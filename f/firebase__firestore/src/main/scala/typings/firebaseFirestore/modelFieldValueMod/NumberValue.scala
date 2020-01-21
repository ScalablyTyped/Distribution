package typings.firebaseFirestore.modelFieldValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "NumberValue")
@js.native
abstract class NumberValue protected () extends FieldValue {
  def this(internalValue: Double) = this()
  val internalValue: Double = js.native
}

