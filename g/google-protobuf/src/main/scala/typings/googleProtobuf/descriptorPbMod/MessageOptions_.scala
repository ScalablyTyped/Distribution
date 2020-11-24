package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions")
@js.native
class MessageOptions_ () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearDeprecated(): MessageOptions = js.native
  
  def clearMapEntry(): MessageOptions = js.native
  
  def clearMessageSetWireFormat(): MessageOptions = js.native
  
  def clearNoStandardDescriptorAccessor(): MessageOptions = js.native
  
  def clearUninterpretedOptionList(): MessageOptions = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getMapEntry(): js.UndefOr[Boolean] = js.native
  
  def getMessageSetWireFormat(): js.UndefOr[Boolean] = js.native
  
  def getNoStandardDescriptorAccessor(): js.UndefOr[Boolean] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def hasMapEntry(): Boolean = js.native
  
  def hasMessageSetWireFormat(): Boolean = js.native
  
  def hasNoStandardDescriptorAccessor(): Boolean = js.native
  
  def setDeprecated(value: Boolean): MessageOptions = js.native
  
  def setMapEntry(value: Boolean): MessageOptions = js.native
  
  def setMessageSetWireFormat(value: Boolean): MessageOptions = js.native
  
  def setNoStandardDescriptorAccessor(value: Boolean): MessageOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): MessageOptions = js.native
}
