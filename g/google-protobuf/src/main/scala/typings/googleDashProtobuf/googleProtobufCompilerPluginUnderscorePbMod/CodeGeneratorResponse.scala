package typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.AsObject
import typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
@js.native
class CodeGeneratorResponse () extends Message {
  def addFile(): File = js.native
  def addFile(value: File): File = js.native
  def addFile(value: File, index: Double): File = js.native
  def clearError(): Unit = js.native
  def clearFileList(): Unit = js.native
  def getError(): js.UndefOr[String] = js.native
  def getFileList(): js.Array[File] = js.native
  def hasError(): Boolean = js.native
  def setError(value: String): Unit = js.native
  def setFileList(value: js.Array[File]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
@js.native
object CodeGeneratorResponse extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): CodeGeneratorResponse = js.native
  def deserializeBinaryFromReader(message: CodeGeneratorResponse, reader: BinaryReader): CodeGeneratorResponse = js.native
  def serializeBinaryToWriter(message: CodeGeneratorResponse, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: CodeGeneratorResponse): AsObject = js.native
}

