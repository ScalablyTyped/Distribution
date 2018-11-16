package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorSet")
@js.native
class FileDescriptorSet ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addFile(): scala.Unit = js.native
  def addFile(value: FileDescriptorProto): scala.Unit = js.native
  def addFile(value: FileDescriptorProto, index: scala.Double): scala.Unit = js.native
  def clearFileList(): scala.Unit = js.native
  def getFileList(): js.Array[FileDescriptorProto] = js.native
  def setFileList(value: js.Array[FileDescriptorProto]): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorSet")
@js.native
object FileDescriptorSet extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorSet = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorSet,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorSet = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorSet,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorSet
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorSetNs.AsObject = js.native
}

