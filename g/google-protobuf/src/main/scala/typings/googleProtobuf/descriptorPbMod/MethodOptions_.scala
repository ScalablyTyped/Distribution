package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.descriptorPbMod.MethodOptions.IdempotencyLevel
import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodOptions")
@js.native
class MethodOptions_ () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearDeprecated(): MethodOptions = js.native
  
  def clearIdempotencyLevel(): MethodOptions = js.native
  
  def clearUninterpretedOptionList(): MethodOptions = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getIdempotencyLevel(): js.UndefOr[IdempotencyLevel] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def hasIdempotencyLevel(): Boolean = js.native
  
  def setDeprecated(value: Boolean): MethodOptions = js.native
  
  def setIdempotencyLevel(value: IdempotencyLevel): MethodOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): MethodOptions = js.native
}
