package typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value.KindCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "Value")
@js.native
class Value_ () extends Message {
  def clearBoolValue(): Unit = js.native
  def clearListValue(): Unit = js.native
  def clearNullValue(): Unit = js.native
  def clearNumberValue(): Unit = js.native
  def clearStringValue(): Unit = js.native
  def clearStructValue(): Unit = js.native
  def getBoolValue(): Boolean = js.native
  def getKindCase(): KindCase = js.native
  def getListValue(): js.UndefOr[ListValue] = js.native
  def getNullValue(): NullValue = js.native
  def getNumberValue(): Double = js.native
  def getStringValue(): String = js.native
  def getStructValue(): js.UndefOr[Struct] = js.native
  def hasBoolValue(): Boolean = js.native
  def hasListValue(): Boolean = js.native
  def hasNullValue(): Boolean = js.native
  def hasNumberValue(): Boolean = js.native
  def hasStringValue(): Boolean = js.native
  def hasStructValue(): Boolean = js.native
  def setBoolValue(value: Boolean): Unit = js.native
  def setListValue(): Unit = js.native
  def setListValue(value: ListValue): Unit = js.native
  def setNullValue(value: NullValue): Unit = js.native
  def setNumberValue(value: Double): Unit = js.native
  def setStringValue(value: String): Unit = js.native
  def setStructValue(): Unit = js.native
  def setStructValue(value: Struct): Unit = js.native
  def toJavaScript(): JavaScriptValue = js.native
}

