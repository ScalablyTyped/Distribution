package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto")
@js.native
class EnumValueDescriptorProto ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def clearName(): scala.Unit = js.native
  def clearNumber(): scala.Unit = js.native
  def clearOptions(): scala.Unit = js.native
  def getName(): java.lang.String = js.native
  def getNumber(): scala.Double = js.native
  def getOptions(): EnumValueOptions = js.native
  def hasName(): scala.Boolean = js.native
  def hasNumber(): scala.Boolean = js.native
  def hasOptions(): scala.Boolean = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setNumber(value: scala.Double): scala.Unit = js.native
  def setOptions(): scala.Unit = js.native
  def setOptions(value: EnumValueOptions): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto")
@js.native
object EnumValueDescriptorProto extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProto = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProto,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProto = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProto,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProto
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProtoNs.AsObject = js.native
}

