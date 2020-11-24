package typings.googleProtobuf.descriptorPbMod

import typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
class UninterpretedOption_ () extends Message {
  
  def addName(): NamePart = js.native
  def addName(value: js.UndefOr[scala.Nothing], index: Double): NamePart = js.native
  def addName(value: NamePart): NamePart = js.native
  def addName(value: NamePart, index: Double): NamePart = js.native
  
  def clearAggregateValue(): UninterpretedOption = js.native
  
  def clearDoubleValue(): UninterpretedOption = js.native
  
  def clearIdentifierValue(): UninterpretedOption = js.native
  
  def clearNameList(): UninterpretedOption = js.native
  
  def clearNegativeIntValue(): UninterpretedOption = js.native
  
  def clearPositiveIntValue(): UninterpretedOption = js.native
  
  def clearStringValue(): UninterpretedOption = js.native
  
  def getAggregateValue(): js.UndefOr[String] = js.native
  
  def getDoubleValue(): js.UndefOr[Double] = js.native
  
  def getIdentifierValue(): js.UndefOr[String] = js.native
  
  def getNameList(): js.Array[NamePart] = js.native
  
  def getNegativeIntValue(): js.UndefOr[Double] = js.native
  
  def getPositiveIntValue(): js.UndefOr[Double] = js.native
  
  def getStringValue(): Uint8Array | String = js.native
  
  def getStringValue_asB64(): String = js.native
  
  def getStringValue_asU8(): Uint8Array = js.native
  
  def hasAggregateValue(): Boolean = js.native
  
  def hasDoubleValue(): Boolean = js.native
  
  def hasIdentifierValue(): Boolean = js.native
  
  def hasNegativeIntValue(): Boolean = js.native
  
  def hasPositiveIntValue(): Boolean = js.native
  
  def hasStringValue(): Boolean = js.native
  
  def setAggregateValue(value: String): UninterpretedOption = js.native
  
  def setDoubleValue(value: Double): UninterpretedOption = js.native
  
  def setIdentifierValue(value: String): UninterpretedOption = js.native
  
  def setNameList(value: js.Array[NamePart]): UninterpretedOption = js.native
  
  def setNegativeIntValue(value: Double): UninterpretedOption = js.native
  
  def setPositiveIntValue(value: Double): UninterpretedOption = js.native
  
  def setStringValue(value: String): UninterpretedOption = js.native
  def setStringValue(value: Uint8Array): UninterpretedOption = js.native
}
