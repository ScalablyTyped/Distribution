package typings.firebaseFirestore.modelFieldValueMod

import typings.firebaseFirestore.timestampMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "ServerTimestampValue")
@js.native
class ServerTimestampValue protected () extends FieldValue {
  def this(localWriteTime: Timestamp) = this()
  def this(localWriteTime: Timestamp, previousValue: FieldValue) = this()
  val localWriteTime: Timestamp = js.native
  val previousValue: FieldValue | Null = js.native
}

