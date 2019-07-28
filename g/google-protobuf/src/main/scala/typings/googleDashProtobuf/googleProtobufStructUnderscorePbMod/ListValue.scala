package typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValueNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue")
@js.native
class ListValue () extends Message {
  def addValues(): Value = js.native
  def addValues(value: Value): Value = js.native
  def addValues(value: Value, index: Double): Value = js.native
  def clearValuesList(): Unit = js.native
  def getValuesList(): js.Array[Value] = js.native
  def setValuesList(value: js.Array[Value]): Unit = js.native
  def toJavaScript(): js.Array[JavaScriptValue] = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue")
@js.native
object ListValue extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): ListValue = js.native
  def deserializeBinaryFromReader(message: ListValue, reader: BinaryReader): ListValue = js.native
  def fromJavaScript(value: js.Array[JavaScriptValue]): ListValue = js.native
  def serializeBinaryToWriter(message: ListValue, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: ListValue): AsObject = js.native
}

