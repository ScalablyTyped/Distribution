package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.descriptorPbMod.EnumDescriptorProto.EnumReservedRange
import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumDescriptorProto")
@js.native
class EnumDescriptorProto_ () extends Message {
  
  def addReservedName(value: String): String = js.native
  def addReservedName(value: String, index: Double): String = js.native
  
  def addReservedRange(): EnumReservedRange = js.native
  def addReservedRange(value: js.UndefOr[scala.Nothing], index: Double): EnumReservedRange = js.native
  def addReservedRange(value: EnumReservedRange): EnumReservedRange = js.native
  def addReservedRange(value: EnumReservedRange, index: Double): EnumReservedRange = js.native
  
  def addValue(): EnumValueDescriptorProto = js.native
  def addValue(value: js.UndefOr[scala.Nothing], index: Double): EnumValueDescriptorProto = js.native
  def addValue(value: EnumValueDescriptorProto): EnumValueDescriptorProto = js.native
  def addValue(value: EnumValueDescriptorProto, index: Double): EnumValueDescriptorProto = js.native
  
  def clearName(): EnumDescriptorProto = js.native
  
  def clearOptions(): EnumDescriptorProto = js.native
  
  def clearReservedNameList(): EnumDescriptorProto = js.native
  
  def clearReservedRangeList(): EnumDescriptorProto = js.native
  
  def clearValueList(): EnumDescriptorProto = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getOptions(): js.UndefOr[EnumOptions] = js.native
  
  def getReservedNameList(): js.Array[String] = js.native
  
  def getReservedRangeList(): js.Array[EnumReservedRange] = js.native
  
  def getValueList(): js.Array[EnumValueDescriptorProto] = js.native
  
  def hasName(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def setName(value: String): EnumDescriptorProto = js.native
  
  def setOptions(): EnumDescriptorProto = js.native
  def setOptions(value: EnumOptions): EnumDescriptorProto = js.native
  
  def setReservedNameList(value: js.Array[String]): EnumDescriptorProto = js.native
  
  def setReservedRangeList(value: js.Array[EnumReservedRange]): EnumDescriptorProto = js.native
  
  def setValueList(value: js.Array[EnumValueDescriptorProto]): EnumDescriptorProto = js.native
}
