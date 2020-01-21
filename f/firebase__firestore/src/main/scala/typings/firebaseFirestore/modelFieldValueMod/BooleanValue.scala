package typings.firebaseFirestore.modelFieldValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "BooleanValue")
@js.native
class BooleanValue protected () extends FieldValue {
  val internalValue: Boolean = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "BooleanValue")
@js.native
object BooleanValue extends js.Object {
  var FALSE: BooleanValue = js.native
  var TRUE: BooleanValue = js.native
  def of(value: Boolean): BooleanValue = js.native
}

