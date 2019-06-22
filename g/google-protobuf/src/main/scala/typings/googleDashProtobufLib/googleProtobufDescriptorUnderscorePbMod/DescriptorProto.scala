package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto")
@js.native
class DescriptorProto ()
  extends googleDashProtobufLib.googleDashProtobufMod.Message {
  def addEnumType(): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto, index: scala.Double): EnumDescriptorProto = js.native
  def addExtension(): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto, index: scala.Double): FieldDescriptorProto = js.native
  def addExtensionRange(): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange = js.native
  def addExtensionRange(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange = js.native
  def addExtensionRange(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange,
    index: scala.Double
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange = js.native
  def addField(): FieldDescriptorProto = js.native
  def addField(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addField(value: FieldDescriptorProto, index: scala.Double): FieldDescriptorProto = js.native
  def addNestedType(): DescriptorProto = js.native
  def addNestedType(value: DescriptorProto): DescriptorProto = js.native
  def addNestedType(value: DescriptorProto, index: scala.Double): DescriptorProto = js.native
  def addOneofDecl(): OneofDescriptorProto = js.native
  def addOneofDecl(value: OneofDescriptorProto): OneofDescriptorProto = js.native
  def addOneofDecl(value: OneofDescriptorProto, index: scala.Double): OneofDescriptorProto = js.native
  def addReservedName(value: java.lang.String): java.lang.String = js.native
  def addReservedName(value: java.lang.String, index: scala.Double): java.lang.String = js.native
  def addReservedRange(): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange = js.native
  def addReservedRange(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange = js.native
  def addReservedRange(
    value: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange,
    index: scala.Double
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange = js.native
  def clearEnumTypeList(): scala.Unit = js.native
  def clearExtensionList(): scala.Unit = js.native
  def clearExtensionRangeList(): scala.Unit = js.native
  def clearFieldList(): scala.Unit = js.native
  def clearName(): scala.Unit = js.native
  def clearNestedTypeList(): scala.Unit = js.native
  def clearOneofDeclList(): scala.Unit = js.native
  def clearOptions(): scala.Unit = js.native
  def clearReservedNameList(): scala.Unit = js.native
  def clearReservedRangeList(): scala.Unit = js.native
  def getEnumTypeList(): js.Array[EnumDescriptorProto] = js.native
  def getExtensionList(): js.Array[FieldDescriptorProto] = js.native
  def getExtensionRangeList(): js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange
  ] = js.native
  def getFieldList(): js.Array[FieldDescriptorProto] = js.native
  def getName(): js.UndefOr[java.lang.String] = js.native
  def getNestedTypeList(): js.Array[DescriptorProto] = js.native
  def getOneofDeclList(): js.Array[OneofDescriptorProto] = js.native
  def getOptions(): js.UndefOr[MessageOptions] = js.native
  def getReservedNameList(): js.Array[java.lang.String] = js.native
  def getReservedRangeList(): js.Array[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange
  ] = js.native
  def hasName(): scala.Boolean = js.native
  def hasOptions(): scala.Boolean = js.native
  def setEnumTypeList(value: js.Array[EnumDescriptorProto]): scala.Unit = js.native
  def setExtensionList(value: js.Array[FieldDescriptorProto]): scala.Unit = js.native
  def setExtensionRangeList(
    value: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ExtensionRange
    ]
  ): scala.Unit = js.native
  def setFieldList(value: js.Array[FieldDescriptorProto]): scala.Unit = js.native
  def setName(value: java.lang.String): scala.Unit = js.native
  def setNestedTypeList(value: js.Array[DescriptorProto]): scala.Unit = js.native
  def setOneofDeclList(value: js.Array[OneofDescriptorProto]): scala.Unit = js.native
  def setOptions(): scala.Unit = js.native
  def setOptions(value: MessageOptions): scala.Unit = js.native
  def setReservedNameList(value: js.Array[java.lang.String]): scala.Unit = js.native
  def setReservedRangeList(
    value: js.Array[
      googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.ReservedRange
    ]
  ): scala.Unit = js.native
}

/* static members */
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto")
@js.native
object DescriptorProto extends js.Object {
  var extensions: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  var extensionsBinary: org.scalablytyped.runtime.NumberDictionary[
    googleDashProtobufLib.googleDashProtobufMod.ExtensionFieldBinaryInfo[googleDashProtobufLib.googleDashProtobufMod.Message]
  ] = js.native
  def deserializeBinary(bytes: stdLib.Uint8Array): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProto = js.native
  def deserializeBinaryFromReader(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProto,
    reader: googleDashProtobufLib.googleDashProtobufMod.BinaryReader
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProto = js.native
  def serializeBinaryToWriter(
    message: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProto,
    writer: googleDashProtobufLib.googleDashProtobufMod.BinaryWriter
  ): scala.Unit = js.native
  def toObject(
    includeInstance: scala.Boolean,
    msg: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProto
  ): googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.DescriptorProtoNs.AsObject = js.native
}

