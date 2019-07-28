package typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequestNs.AsObject
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest")
@js.native
class CodeGeneratorRequest () extends Message {
  def addFileToGenerate(value: String): String = js.native
  def addFileToGenerate(value: String, index: Double): String = js.native
  def addProtoFile(): FileDescriptorProto = js.native
  def addProtoFile(value: FileDescriptorProto): FileDescriptorProto = js.native
  def addProtoFile(value: FileDescriptorProto, index: Double): FileDescriptorProto = js.native
  def clearCompilerVersion(): Unit = js.native
  def clearFileToGenerateList(): Unit = js.native
  def clearParameter(): Unit = js.native
  def clearProtoFileList(): Unit = js.native
  def getCompilerVersion(): js.UndefOr[Version] = js.native
  def getFileToGenerateList(): js.Array[String] = js.native
  def getParameter(): js.UndefOr[String] = js.native
  def getProtoFileList(): js.Array[FileDescriptorProto] = js.native
  def hasCompilerVersion(): Boolean = js.native
  def hasParameter(): Boolean = js.native
  def setCompilerVersion(): Unit = js.native
  def setCompilerVersion(value: Version): Unit = js.native
  def setFileToGenerateList(value: js.Array[String]): Unit = js.native
  def setParameter(value: String): Unit = js.native
  def setProtoFileList(value: js.Array[FileDescriptorProto]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest")
@js.native
object CodeGeneratorRequest extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): CodeGeneratorRequest = js.native
  def deserializeBinaryFromReader(message: CodeGeneratorRequest, reader: BinaryReader): CodeGeneratorRequest = js.native
  def serializeBinaryToWriter(message: CodeGeneratorRequest, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: CodeGeneratorRequest): AsObject = js.native
}

