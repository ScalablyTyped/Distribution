package typings
package googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
@js.native
class CodeGeneratorResponse ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addFile(): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File = js.native
  def addFile(
    value: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File
  ): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File = js.native
  def addFile(
    value: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File,
    index: scala.Double
  ): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File = js.native
  def clearError(): scala.Unit = js.native
  def clearFileList(): scala.Unit = js.native
  def getError(): js.UndefOr[java.lang.String] = js.native
  def getFileList(): js.Array[
    googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File
  ] = js.native
  def hasError(): scala.Boolean = js.native
  def setError(value: java.lang.String): scala.Unit = js.native
  def setFileList(
    value: js.Array[
      googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.File
    ]
  ): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
@js.native
object CodeGeneratorResponse extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponse
  ): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorResponseNs.AsObject = js.native
}

