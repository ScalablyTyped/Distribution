package typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Map
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.StructNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "Struct")
@js.native
class Struct () extends Message {
  def clearFieldsMap(): Unit = js.native
  def getFieldsMap(): Map[String, Value] = js.native
  def toJavaScript(): StringDictionary[JavaScriptValue] = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/struct_pb", "Struct")
@js.native
object Struct extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): Struct = js.native
  def deserializeBinaryFromReader(message: Struct, reader: BinaryReader): Struct = js.native
  def fromJavaScript(value: StringDictionary[JavaScriptValue]): Struct = js.native
  def serializeBinaryToWriter(message: Struct, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: Struct): AsObject = js.native
}

