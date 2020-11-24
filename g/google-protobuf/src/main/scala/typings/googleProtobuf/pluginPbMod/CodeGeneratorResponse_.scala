package typings.googleProtobuf.pluginPbMod

import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
@js.native
class CodeGeneratorResponse_ () extends Message {
  
  def addFile(): File = js.native
  def addFile(value: js.UndefOr[scala.Nothing], index: Double): File = js.native
  def addFile(value: File): File = js.native
  def addFile(value: File, index: Double): File = js.native
  
  def clearError(): CodeGeneratorResponse = js.native
  
  def clearFileList(): CodeGeneratorResponse = js.native
  
  def getError(): js.UndefOr[String] = js.native
  
  def getFileList(): js.Array[File] = js.native
  
  def hasError(): Boolean = js.native
  
  def setError(value: String): CodeGeneratorResponse = js.native
  
  def setFileList(value: js.Array[File]): CodeGeneratorResponse = js.native
}
