package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange
import typings.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange
import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto")
@js.native
class DescriptorProto_ () extends Message {
  
  def addEnumType(): EnumDescriptorProto = js.native
  def addEnumType(value: js.UndefOr[scala.Nothing], index: Double): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto, index: Double): EnumDescriptorProto = js.native
  
  def addExtension(): FieldDescriptorProto = js.native
  def addExtension(value: js.UndefOr[scala.Nothing], index: Double): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto, index: Double): FieldDescriptorProto = js.native
  
  def addExtensionRange(): ExtensionRange = js.native
  def addExtensionRange(value: js.UndefOr[scala.Nothing], index: Double): ExtensionRange = js.native
  def addExtensionRange(value: ExtensionRange): ExtensionRange = js.native
  def addExtensionRange(value: ExtensionRange, index: Double): ExtensionRange = js.native
  
  def addField(): FieldDescriptorProto = js.native
  def addField(value: js.UndefOr[scala.Nothing], index: Double): FieldDescriptorProto = js.native
  def addField(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addField(value: FieldDescriptorProto, index: Double): FieldDescriptorProto = js.native
  
  def addNestedType(): DescriptorProto = js.native
  def addNestedType(value: js.UndefOr[scala.Nothing], index: Double): DescriptorProto = js.native
  def addNestedType(value: DescriptorProto): DescriptorProto = js.native
  def addNestedType(value: DescriptorProto, index: Double): DescriptorProto = js.native
  
  def addOneofDecl(): OneofDescriptorProto = js.native
  def addOneofDecl(value: js.UndefOr[scala.Nothing], index: Double): OneofDescriptorProto = js.native
  def addOneofDecl(value: OneofDescriptorProto): OneofDescriptorProto = js.native
  def addOneofDecl(value: OneofDescriptorProto, index: Double): OneofDescriptorProto = js.native
  
  def addReservedName(value: String): String = js.native
  def addReservedName(value: String, index: Double): String = js.native
  
  def addReservedRange(): ReservedRange = js.native
  def addReservedRange(value: js.UndefOr[scala.Nothing], index: Double): ReservedRange = js.native
  def addReservedRange(value: ReservedRange): ReservedRange = js.native
  def addReservedRange(value: ReservedRange, index: Double): ReservedRange = js.native
  
  def clearEnumTypeList(): DescriptorProto = js.native
  
  def clearExtensionList(): DescriptorProto = js.native
  
  def clearExtensionRangeList(): DescriptorProto = js.native
  
  def clearFieldList(): DescriptorProto = js.native
  
  def clearName(): DescriptorProto = js.native
  
  def clearNestedTypeList(): DescriptorProto = js.native
  
  def clearOneofDeclList(): DescriptorProto = js.native
  
  def clearOptions(): DescriptorProto = js.native
  
  def clearReservedNameList(): DescriptorProto = js.native
  
  def clearReservedRangeList(): DescriptorProto = js.native
  
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
  
  def setEnumTypeList(value: js.Array[EnumDescriptorProto]): DescriptorProto = js.native
  
  def setExtensionList(value: js.Array[FieldDescriptorProto]): DescriptorProto = js.native
  
  def setExtensionRangeList(value: js.Array[ExtensionRange]): DescriptorProto = js.native
  
  def setFieldList(value: js.Array[FieldDescriptorProto]): DescriptorProto = js.native
  
  def setName(value: String): DescriptorProto = js.native
  
  def setNestedTypeList(value: js.Array[DescriptorProto]): DescriptorProto = js.native
  
  def setOneofDeclList(value: js.Array[OneofDescriptorProto]): DescriptorProto = js.native
  
  def setOptions(): DescriptorProto = js.native
  def setOptions(value: MessageOptions): DescriptorProto = js.native
  
  def setReservedNameList(value: js.Array[String]): DescriptorProto = js.native
  
  def setReservedRangeList(value: js.Array[ReservedRange]): DescriptorProto = js.native
}
