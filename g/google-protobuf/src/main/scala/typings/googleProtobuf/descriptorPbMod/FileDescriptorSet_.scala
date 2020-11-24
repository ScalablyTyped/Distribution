package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileDescriptorSet")
@js.native
class FileDescriptorSet_ () extends Message {
  
  def addFile(): FileDescriptorProto = js.native
  def addFile(value: js.UndefOr[scala.Nothing], index: Double): FileDescriptorProto = js.native
  def addFile(value: FileDescriptorProto): FileDescriptorProto = js.native
  def addFile(value: FileDescriptorProto, index: Double): FileDescriptorProto = js.native
  
  def clearFileList(): FileDescriptorSet = js.native
  
  def getFileList(): js.Array[FileDescriptorProto] = js.native
  
  def setFileList(value: js.Array[FileDescriptorProto]): FileDescriptorSet = js.native
}
