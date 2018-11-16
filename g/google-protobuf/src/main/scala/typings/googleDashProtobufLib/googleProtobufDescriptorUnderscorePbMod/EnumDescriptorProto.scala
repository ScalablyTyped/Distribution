package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
class EnumDescriptorProto ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addValue(): scala.Unit = js.native
  def addValue(value: EnumValueDescriptorProto): scala.Unit = js.native
  def addValue(value: EnumValueDescriptorProto, index: scala.Double): scala.Unit = js.native
  def clearName(): scala.Unit = js.native
  def clearOptions(): scala.Unit = js.native
  def clearValueList(): scala.Unit = js.native
  def getName(): java.lang.String = js.native
  def getOptions(): EnumOptions = js.native
  def getValueList(): js.Array[EnumValueDescriptorProto] = js.native
  def hasName(): scala.Boolean = js.native
  def hasOptions(): scala.Boolean = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setOptions(): scala.Unit = js.native
  def setOptions(value: EnumOptions): scala.Unit = js.native
  def setValueList(value: js.Array[EnumValueDescriptorProto]): scala.Unit = js.native
}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
object EnumDescriptorProto extends js.Object {
  var extensions: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: ScalablyTyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.AsObject = js.native
}

