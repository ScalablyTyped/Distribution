package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueDescriptorProto")
@js.native
class EnumValueDescriptorProto_ () extends Message {
  
  def clearName(): EnumValueDescriptorProto = js.native
  
  def clearNumber(): EnumValueDescriptorProto = js.native
  
  def clearOptions(): EnumValueDescriptorProto = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getNumber(): js.UndefOr[Double] = js.native
  
  def getOptions(): js.UndefOr[EnumValueOptions] = js.native
  
  def hasName(): Boolean = js.native
  
  def hasNumber(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def setName(value: String): EnumValueDescriptorProto = js.native
  
  def setNumber(value: Double): EnumValueDescriptorProto = js.native
  
  def setOptions(): EnumValueDescriptorProto = js.native
  def setOptions(value: EnumValueOptions): EnumValueDescriptorProto = js.native
}
