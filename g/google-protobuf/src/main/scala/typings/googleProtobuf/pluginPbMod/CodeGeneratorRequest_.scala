package typings.googleProtobuf.pluginPbMod

import typings.googleProtobuf.descriptorPbMod.FileDescriptorProto
import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest")
@js.native
class CodeGeneratorRequest_ () extends Message {
  
  def addFileToGenerate(value: String): String = js.native
  def addFileToGenerate(value: String, index: Double): String = js.native
  
  def addProtoFile(): FileDescriptorProto = js.native
  def addProtoFile(value: js.UndefOr[scala.Nothing], index: Double): FileDescriptorProto = js.native
  def addProtoFile(value: FileDescriptorProto): FileDescriptorProto = js.native
  def addProtoFile(value: FileDescriptorProto, index: Double): FileDescriptorProto = js.native
  
  def clearCompilerVersion(): CodeGeneratorRequest = js.native
  
  def clearFileToGenerateList(): CodeGeneratorRequest = js.native
  
  def clearParameter(): CodeGeneratorRequest = js.native
  
  def clearProtoFileList(): CodeGeneratorRequest = js.native
  
  def getCompilerVersion(): js.UndefOr[Version] = js.native
  
  def getFileToGenerateList(): js.Array[String] = js.native
  
  def getParameter(): js.UndefOr[String] = js.native
  
  def getProtoFileList(): js.Array[FileDescriptorProto] = js.native
  
  def hasCompilerVersion(): Boolean = js.native
  
  def hasParameter(): Boolean = js.native
  
  def setCompilerVersion(): CodeGeneratorRequest = js.native
  def setCompilerVersion(value: Version): CodeGeneratorRequest = js.native
  
  def setFileToGenerateList(value: js.Array[String]): CodeGeneratorRequest = js.native
  
  def setParameter(value: String): CodeGeneratorRequest = js.native
  
  def setProtoFileList(value: js.Array[FileDescriptorProto]): CodeGeneratorRequest = js.native
}
