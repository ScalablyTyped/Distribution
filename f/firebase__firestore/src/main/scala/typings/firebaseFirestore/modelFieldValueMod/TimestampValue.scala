package typings.firebaseFirestore.modelFieldValueMod

import typings.firebaseFirestore.timestampMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "TimestampValue")
@js.native
class TimestampValue protected () extends FieldValue {
  def this(internalValue: Timestamp) = this()
  val internalValue: Timestamp = js.native
}

