package typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.Version

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

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.Version = js.native
  def deserializeBinaryFromReader(
    message: typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.Version,
    reader: BinaryReader
  ): typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.Version = js.native
  def serializeBinaryToWriter(
    message: typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.Version,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.Version
  ): AsObject = js.native
}

