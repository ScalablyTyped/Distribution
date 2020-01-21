package typings.googleProtobuf.pluginPbMod

import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
@js.native
class CodeGeneratorResponse_ () extends Message {
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

