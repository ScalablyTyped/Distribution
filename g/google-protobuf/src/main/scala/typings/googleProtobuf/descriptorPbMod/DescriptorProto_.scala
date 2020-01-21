package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange
import typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange
import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto")
@js.native
class DescriptorProto_ () extends Message {
  def addEnumType(): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto, index: Double): EnumDescriptorProto = js.native
  def addExtension(): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto, index: Double): FieldDescriptorProto = js.native
  def addExtensionRange(): ExtensionRange = js.native
  def addExtensionRange(value: ExtensionRange): ExtensionRange = js.native
  def addExtensionRange(value: ExtensionRange, index: Double): ExtensionRange = js.native
  def addField(): FieldDescriptorProto = js.native
  def addField(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addField(value: FieldDescriptorProto, index: Double): FieldDescriptorProto = js.native
  def addNestedType(): DescriptorProto = js.native
  def addNestedType(value: DescriptorProto): DescriptorProto = js.native
  def addNestedType(value: DescriptorProto, index: Double): DescriptorProto = js.native
  def addOneofDecl(): OneofDescriptorProto = js.native
  def addOneofDecl(value: OneofDescriptorProto): OneofDescriptorProto = js.native
  def addOneofDecl(value: OneofDescriptorProto, index: Double): OneofDescriptorProto = js.native
  def addReservedName(value: String): String = js.native
  def addReservedName(value: String, index: Double): String = js.native
  def addReservedRange(): ReservedRange = js.native
  def addReservedRange(value: ReservedRange): ReservedRange = js.native
  def addReservedRange(value: ReservedRange, index: Double): ReservedRange = js.native
  def clearEnumTypeList(): Unit = js.native
  def clearExtensionList(): Unit = js.native
  def clearExtensionRangeList(): Unit = js.native
  def clearFieldList(): Unit = js.native
  def clearName(): Unit = js.native
  def clearNestedTypeList(): Unit = js.native
  def clearOneofDeclList(): Unit = js.native
  def clearOptions(): Unit = js.native
  def clearReservedNameList(): Unit = js.native
  def clearReservedRangeList(): Unit = js.native
  def getEnumTypeList(): js.Array[EnumDescriptorProto] = js.native
  def getExtensionList(): js.Array[FieldDescriptorProto] = js.native
  def getExtensionRangeList(): js.Array[ExtensionRange] = js.native
  def getFieldList(): js.Array[FieldDescriptorProto] = js.native
  def getName(): js.UndefOr[String] = js.native
  def getNestedTypeList(): js.Array[DescriptorProto] = js.native
  def getOneofDeclList(): js.Array[OneofDescriptorProto] = js.native
  def getOptions(): js.UndefOr[MessageOptions] = js.native
  def getReservedNameList(): js.Array[String] = js.native
  def getReservedRangeList(): js.Array[ReservedRange] = js.native
  def hasName(): Boolean = js.native
  def hasOptions(): Boolean = js.native
  def setEnumTypeList(value: js.Array[EnumDescriptorProto]): Unit = js.native
  def setExtensionList(value: js.Array[FieldDescriptorProto]): Unit = js.native
  def setExtensionRangeList(value: js.Array[ExtensionRange]): Unit = js.native
  def setFieldList(value: js.Array[FieldDescriptorProto]): Unit = js.native
  def setName(value: String): Unit = js.native
  def setNestedTypeList(value: js.Array[DescriptorProto]): Unit = js.native
  def setOneofDeclList(value: js.Array[OneofDescriptorProto]): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(value: MessageOptions): Unit = js.native
  def setReservedNameList(value: js.Array[String]): Unit = js.native
  def setReservedRangeList(value: js.Array[ReservedRange]): Unit = js.native
}

