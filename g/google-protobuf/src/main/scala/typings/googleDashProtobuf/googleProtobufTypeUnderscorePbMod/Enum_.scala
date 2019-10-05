package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.googleDashProtobuf.googleProtobufSourceUnderscoreContextUnderscorePbMod.SourceContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Enum")
@js.native
class Enum_ () extends Message {
  def addEnumvalue(): EnumValue = js.native
  def addEnumvalue(value: EnumValue): EnumValue = js.native
  def addEnumvalue(value: EnumValue, index: Double): EnumValue = js.native
  def addOptions(): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  def clearEnumvalueList(): Unit = js.native
  def clearOptionsList(): Unit = js.native
  def clearSourceContext(): Unit = js.native
  def getEnumvalueList(): js.Array[EnumValue] = js.native
  def getName(): String = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  def getSyntax(): Syntax = js.native
  def hasSourceContext(): Boolean = js.native
  def setEnumvalueList(value: js.Array[EnumValue]): Unit = js.native
  def setName(value: String): Unit = js.native
  def setOptionsList(value: js.Array[Option]): Unit = js.native
  def setSourceContext(): Unit = js.native
  def setSourceContext(value: SourceContext): Unit = js.native
  def setSyntax(value: Syntax): Unit = js.native
}

