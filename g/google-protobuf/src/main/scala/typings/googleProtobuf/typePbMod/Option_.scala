package typings.googleProtobuf.typePbMod

import typings.googleProtobuf.anyPbMod.Any
import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Option")
@js.native
class Option_ () extends Message {
  def clearValue(): Unit = js.native
  def getName(): String = js.native
  def getValue(): js.UndefOr[Any] = js.native
  def hasValue(): Boolean = js.native
  def setName(value: String): Unit = js.native
  def setValue(): Unit = js.native
  def setValue(value: Any): Unit = js.native
}

