package typings
package googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest")
@js.native
class CodeGeneratorRequest ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addFileToGenerate(value: java.lang.String): java.lang.String = js.native
  def addFileToGenerate(value: java.lang.String, index: scala.Double): java.lang.String = js.native
  def addProtoFile(): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto = js.native
  def addProtoFile(value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto = js.native
  def addProtoFile(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto,
    index: scala.Double
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto = js.native
  def clearCompilerVersion(): scala.Unit = js.native
  def clearFileToGenerateList(): scala.Unit = js.native
  def clearParameter(): scala.Unit = js.native
  def clearProtoFileList(): scala.Unit = js.native
  def getCompilerVersion(): js.UndefOr[Version] = js.native
  def getFileToGenerateList(): js.Array[java.lang.String] = js.native
  def getParameter(): js.UndefOr[java.lang.String] = js.native
  def getProtoFileList(): js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto
  ] = js.native
  def hasCompilerVersion(): scala.Boolean = js.native
  def hasParameter(): scala.Boolean = js.native
  def setCompilerVersion(): scala.Unit = js.native
  def setCompilerVersion(value: Version): scala.Unit = js.native
  def setFileToGenerateList(value: js.Array[java.lang.String]): scala.Unit = js.native
  def setParameter(value: java.lang.String): scala.Unit = js.native
  def setProtoFileList(
    value: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto
    ]
  ): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest")
@js.native
object CodeGeneratorRequest extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequest = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequest,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequest = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequest,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequest
  ): googleDashProtobufLib.googleProtobufCompilerPluginUnderscorePbMod.CodeGeneratorRequestNs.AsObject = js.native
}

