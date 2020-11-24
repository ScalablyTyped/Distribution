package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.descriptorPbMod.FieldOptions.CType
import typings.googleProtobuf.descriptorPbMod.FieldOptions.JSType
import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions")
@js.native
class FieldOptions_ () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearCtype(): FieldOptions = js.native
  
  def clearDeprecated(): FieldOptions = js.native
  
  def clearJstype(): FieldOptions = js.native
  
  def clearLazy(): FieldOptions = js.native
  
  def clearPacked(): FieldOptions = js.native
  
  def clearUninterpretedOptionList(): FieldOptions = js.native
  
  def clearWeak(): FieldOptions = js.native
  
  def getCtype(): js.UndefOr[CType] = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getJstype(): js.UndefOr[JSType] = js.native
  
  def getLazy(): js.UndefOr[Boolean] = js.native
  
  def getPacked(): js.UndefOr[Boolean] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def getWeak(): js.UndefOr[Boolean] = js.native
  
  def hasCtype(): Boolean = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def hasJstype(): Boolean = js.native
  
  def hasLazy(): Boolean = js.native
  
  def hasPacked(): Boolean = js.native
  
  def hasWeak(): Boolean = js.native
  
  def setCtype(value: CType): FieldOptions = js.native
  
  def setDeprecated(value: Boolean): FieldOptions = js.native
  
  def setJstype(value: JSType): FieldOptions = js.native
  
  def setLazy(value: Boolean): FieldOptions = js.native
  
  def setPacked(value: Boolean): FieldOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): FieldOptions = js.native
  
  def setWeak(value: Boolean): FieldOptions = js.native
}
