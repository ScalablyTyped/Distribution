package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto")
@js.native
class MethodDescriptorProto ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def clearClientStreaming(): scala.Unit = js.native
  def clearInputType(): scala.Unit = js.native
  def clearName(): scala.Unit = js.native
  def clearOptions(): scala.Unit = js.native
  def clearOutputType(): scala.Unit = js.native
  def clearServerStreaming(): scala.Unit = js.native
  def getClientStreaming(): scala.Boolean = js.native
  def getInputType(): java.lang.String = js.native
  def getName(): java.lang.String = js.native
  def getOptions(): MethodOptions = js.native
  def getOutputType(): java.lang.String = js.native
  def getServerStreaming(): scala.Boolean = js.native
  def hasClientStreaming(): scala.Boolean = js.native
  def hasInputType(): scala.Boolean = js.native
  def hasName(): scala.Boolean = js.native
  def hasOptions(): scala.Boolean = js.native
  def hasOutputType(): scala.Boolean = js.native
  def hasServerStreaming(): scala.Boolean = js.native
  def setClientStreaming(value: scala.Boolean): scala.Unit = js.native
  def setInputType(value: java.lang.String): scala.Unit = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setOptions(): scala.Unit = js.native
  def setOptions(value: MethodOptions): scala.Unit = js.native
  def setOutputType(value: java.lang.String): scala.Unit = js.native
  def setServerStreaming(value: scala.Boolean): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto")
@js.native
object MethodDescriptorProto extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProto = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProto,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProto = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProto,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProto
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProtoNs.AsObject = js.native
}

