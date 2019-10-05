package typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse.File

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

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse.File = js.native
  def deserializeBinaryFromReader(
    message: typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse.File,
    reader: BinaryReader
  ): typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse.File = js.native
  def serializeBinaryToWriter(
    message: typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse.File,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse.File
  ): typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse.File.AsObject = js.native
}

