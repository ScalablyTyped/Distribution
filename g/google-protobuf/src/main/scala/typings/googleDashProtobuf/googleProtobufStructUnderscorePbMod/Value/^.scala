package typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.JavaScriptValue
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "Value")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value = js.native
  def deserializeBinaryFromReader(
    message: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value,
    reader: BinaryReader
  ): typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value = js.native
  def fromJavaScript(value: JavaScriptValue): typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value = js.native
  def serializeBinaryToWriter(
    message: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Value
  ): AsObject = js.native
}

