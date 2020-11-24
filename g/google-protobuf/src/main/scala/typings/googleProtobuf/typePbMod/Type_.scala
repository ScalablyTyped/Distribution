package typings.googleProtobuf.typePbMod

import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.sourceContextPbMod.SourceContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/type_pb", "Type")
@js.native
class Type_ () extends Message {
  
  def addFields(): Field = js.native
  def addFields(value: js.UndefOr[scala.Nothing], index: Double): Field = js.native
  def addFields(value: Field): Field = js.native
  def addFields(value: Field, index: Double): Field = js.native
  
  def addOneofs(value: String): String = js.native
  def addOneofs(value: String, index: Double): String = js.native
  
  def addOptions(): Option = js.native
  def addOptions(value: js.UndefOr[scala.Nothing], index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  
  def clearFieldsList(): Type = js.native
  
  def clearOneofsList(): Type = js.native
  
  def clearOptionsList(): Type = js.native
  
  def clearSourceContext(): Type = js.native
  
  def getFieldsList(): js.Array[Field] = js.native
  
  def getName(): String = js.native
  
  def getOneofsList(): js.Array[String] = js.native
  
  def getOptionsList(): js.Array[Option] = js.native
  
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  
  def getSyntax(): Syntax = js.native
  
  def hasSourceContext(): Boolean = js.native
  
  def setFieldsList(value: js.Array[Field]): Type = js.native
  
  def setName(value: String): Type = js.native
  
  def setOneofsList(value: js.Array[String]): Type = js.native
  
  def setOptionsList(value: js.Array[Option]): Type = js.native
  
  def setSourceContext(): Type = js.native
  def setSourceContext(value: SourceContext): Type = js.native
  
  def setSyntax(value: Syntax): Type = js.native
}
