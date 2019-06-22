package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
class EnumDescriptorProto ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addReservedName(value: java.lang.String): java.lang.String = js.native
  def addReservedName(value: java.lang.String, index: scala.Double): java.lang.String = js.native
  def addReservedRange(): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange = js.native
  def addReservedRange(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange = js.native
  def addReservedRange(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange,
    index: scala.Double
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange = js.native
  def addValue(): EnumValueDescriptorProto = js.native
  def addValue(value: EnumValueDescriptorProto): EnumValueDescriptorProto = js.native
  def addValue(value: EnumValueDescriptorProto, index: scala.Double): EnumValueDescriptorProto = js.native
  def clearName(): scala.Unit = js.native
  def clearOptions(): scala.Unit = js.native
  def clearReservedNameList(): scala.Unit = js.native
  def clearReservedRangeList(): scala.Unit = js.native
  def clearValueList(): scala.Unit = js.native
  def getName(): js.UndefOr[java.lang.String] = js.native
  def getOptions(): js.UndefOr[EnumOptions] = js.native
  def getReservedNameList(): js.Array[java.lang.String] = js.native
  def getReservedRangeList(): js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange
  ] = js.native
  def getValueList(): js.Array[EnumValueDescriptorProto] = js.native
  def hasName(): scala.Boolean = js.native
  def hasOptions(): scala.Boolean = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setOptions(): scala.Unit = js.native
  def setOptions(value: EnumOptions): scala.Unit = js.native
  def setReservedNameList(value: js.Array[java.lang.String]): scala.Unit = js.native
  def setReservedRangeList(
    value: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProtoNs.EnumReservedRange
    ]
  ): scala.Unit = js.native
  def setValueList(value: js.Array[EnumValueDescriptorProto]): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
object EnumDescriptorProto extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
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

