package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceDescriptorProto")
@js.native
class ServiceDescriptorProto ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addMethod(): scala.Unit = js.native
  def addMethod(value: MethodDescriptorProto): scala.Unit = js.native
  def addMethod(value: MethodDescriptorProto, index: scala.Double): scala.Unit = js.native
  def clearMethodList(): scala.Unit = js.native
  def clearName(): scala.Unit = js.native
  def clearOptions(): scala.Unit = js.native
  def getMethodList(): js.Array[MethodDescriptorProto] = js.native
  def getName(): java.lang.String = js.native
  def getOptions(): ServiceOptions = js.native
  def hasName(): scala.Boolean = js.native
  def hasOptions(): scala.Boolean = js.native
  def setMethodList(value: js.Array[MethodDescriptorProto]): scala.Unit = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setOptions(): scala.Unit = js.native
  def setOptions(value: ServiceOptions): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "ServiceDescriptorProto")
@js.native
object ServiceDescriptorProto extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProto = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProto,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProto = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProto,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProto
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProtoNs.AsObject = js.native
}

