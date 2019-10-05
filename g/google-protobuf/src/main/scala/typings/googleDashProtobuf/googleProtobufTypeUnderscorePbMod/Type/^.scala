package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Type

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Type")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Type = js.native
  def deserializeBinaryFromReader(message: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Type, reader: BinaryReader): typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Type = js.native
  def serializeBinaryToWriter(message: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Type, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Type): AsObject = js.native
}

