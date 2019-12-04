package typings.googleDashProtobuf.googleProtobufCompilerPluginUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest")
@js.native
class CodeGeneratorRequest_ () extends Message {
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

