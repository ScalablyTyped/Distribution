package typings.googleProtobuf.structPbMod

import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.structPbMod.Value.KindCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/struct_pb", "Value")
@js.native
class Value_ () extends Message {
  
  def clearBoolValue(): Value = js.native
  
  def clearListValue(): Value = js.native
  
  def clearNullValue(): Value = js.native
  
  def clearNumberValue(): Value = js.native
  
  def clearStringValue(): Value = js.native
  
  def clearStructValue(): Value = js.native
  
  def getBoolValue(): Boolean = js.native
  
  def getKindCase(): KindCase = js.native
  
  def getListValue(): js.UndefOr[ListValue] = js.native
  
  def getNullValue(): NullValue = js.native
  
  def getNumberValue(): Double = js.native
  
  def getStringValue(): String = js.native
  
  def getStructValue(): js.UndefOr[Struct] = js.native
  
  def hasBoolValue(): Boolean = js.native
  
  def hasListValue(): Boolean = js.native
  
  def hasNullValue(): Boolean = js.native
  
  def hasNumberValue(): Boolean = js.native
  
  def hasStringValue(): Boolean = js.native
  
  def hasStructValue(): Boolean = js.native
  
  def setBoolValue(value: Boolean): Value = js.native
  
  def setListValue(): Value = js.native
  def setListValue(value: ListValue): Value = js.native
  
  def setNullValue(value: NullValue): Value = js.native
  
  def setNumberValue(value: Double): Value = js.native
  
  def setStringValue(value: String): Value = js.native
  
  def setStructValue(): Value = js.native
  def setStructValue(value: Struct): Value = js.native
  
  def toJavaScript(): JavaScriptValue = js.native
}
