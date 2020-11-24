package typings.googleProtobuf.typePbMod

import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.sourceContextPbMod.SourceContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/type_pb", "Enum")
@js.native
class Enum_ () extends Message {
  
  def addEnumvalue(): EnumValue = js.native
  def addEnumvalue(value: js.UndefOr[scala.Nothing], index: Double): EnumValue = js.native
  def addEnumvalue(value: EnumValue): EnumValue = js.native
  def addEnumvalue(value: EnumValue, index: Double): EnumValue = js.native
  
  def addOptions(): Option = js.native
  def addOptions(value: js.UndefOr[scala.Nothing], index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  
  def clearEnumvalueList(): Enum = js.native
  
  def clearOptionsList(): Enum = js.native
  
  def clearSourceContext(): Enum = js.native
  
  def getEnumvalueList(): js.Array[EnumValue] = js.native
  
  def getName(): String = js.native
  
  def getOptionsList(): js.Array[Option] = js.native
  
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  
  def getSyntax(): Syntax = js.native
  
  def hasSourceContext(): Boolean = js.native
  
  def setEnumvalueList(value: js.Array[EnumValue]): Enum = js.native
  
  def setName(value: String): Enum = js.native
  
  def setOptionsList(value: js.Array[Option]): Enum = js.native
  
  def setSourceContext(): Enum = js.native
  def setSourceContext(value: SourceContext): Enum = js.native
  
  def setSyntax(value: Syntax): Enum = js.native
}
