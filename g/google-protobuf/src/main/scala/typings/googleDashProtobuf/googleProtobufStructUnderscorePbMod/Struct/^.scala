package typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
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

@JSImport("google-protobuf/google/protobuf/struct_pb", "Struct")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct = js.native
  def deserializeBinaryFromReader(
    message: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct,
    reader: BinaryReader
  ): typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct = js.native
  def fromJavaScript(value: StringDictionary[JavaScriptValue]): typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct = js.native
  def serializeBinaryToWriter(
    message: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.Struct
  ): AsObject = js.native
}

