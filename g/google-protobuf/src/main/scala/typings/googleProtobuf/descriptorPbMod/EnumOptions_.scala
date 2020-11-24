package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions")
@js.native
class EnumOptions_ () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearAllowAlias(): EnumOptions = js.native
  
  def clearDeprecated(): EnumOptions = js.native
  
  def clearUninterpretedOptionList(): EnumOptions = js.native
  
  def getAllowAlias(): js.UndefOr[Boolean] = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def hasAllowAlias(): Boolean = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def setAllowAlias(value: Boolean): EnumOptions = js.native
  
  def setDeprecated(value: Boolean): EnumOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): EnumOptions = js.native
}
