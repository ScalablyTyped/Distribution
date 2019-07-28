package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorSetNs.AsObject
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorSet")
@js.native
class FileDescriptorSet () extends Message {
  def addFile(): FileDescriptorProto = js.native
  def addFile(value: FileDescriptorProto): FileDescriptorProto = js.native
  def addFile(value: FileDescriptorProto, index: Double): FileDescriptorProto = js.native
  def clearFileList(): Unit = js.native
  def getFileList(): js.Array[FileDescriptorProto] = js.native
  def setFileList(value: js.Array[FileDescriptorProto]): Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorSet")
@js.native
object FileDescriptorSet extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): FileDescriptorSet = js.native
  def deserializeBinaryFromReader(message: FileDescriptorSet, reader: BinaryReader): FileDescriptorSet = js.native
  def serializeBinaryToWriter(message: FileDescriptorSet, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: FileDescriptorSet): AsObject = js.native
}

