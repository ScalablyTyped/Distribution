package typings.googleProtobuf.typePbMod

import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.sourceContextPbMod.SourceContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Type")
@js.native
class Type_ () extends Message {
  def addFields(): Field = js.native
  def addFields(value: Field): Field = js.native
  def addFields(value: Field, index: Double): Field = js.native
  def addOneofs(value: String): String = js.native
  def addOneofs(value: String, index: Double): String = js.native
  def addOptions(): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  def clearFieldsList(): Unit = js.native
  def clearOneofsList(): Unit = js.native
  def clearOptionsList(): Unit = js.native
  def clearSourceContext(): Unit = js.native
  def getFieldsList(): js.Array[Field] = js.native
  def getName(): String = js.native
  def getOneofsList(): js.Array[String] = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  def getSyntax(): Syntax = js.native
  def hasSourceContext(): Boolean = js.native
  def setFieldsList(value: js.Array[Field]): Unit = js.native
  def setName(value: String): Unit = js.native
  def setOneofsList(value: js.Array[String]): Unit = js.native
  def setOptionsList(value: js.Array[Option]): Unit = js.native
  def setSourceContext(): Unit = js.native
  def setSourceContext(value: SourceContext): Unit = js.native
  def setSyntax(value: Syntax): Unit = js.native
}

