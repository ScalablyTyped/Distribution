package typings.googleProtobuf.typePbMod

import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.typePbMod.Field.Cardinality
import typings.googleProtobuf.typePbMod.Field.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Field")
@js.native
class Field_ () extends Message {
  def addOptions(): Option = js.native
  def addOptions(value: js.UndefOr[scala.Nothing], index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  def clearOptionsList(): Unit = js.native
  def getCardinality(): Cardinality = js.native
  def getDefaultValue(): String = js.native
  def getJsonName(): String = js.native
  def getKind(): Kind = js.native
  def getName(): String = js.native
  def getNumber(): Double = js.native
  def getOneofIndex(): Double = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def getPacked(): Boolean = js.native
  def getTypeUrl(): String = js.native
  def setCardinality(value: Cardinality): Unit = js.native
  def setDefaultValue(value: String): Unit = js.native
  def setJsonName(value: String): Unit = js.native
  def setKind(value: Kind): Unit = js.native
  def setName(value: String): Unit = js.native
  def setNumber(value: Double): Unit = js.native
  def setOneofIndex(value: Double): Unit = js.native
  def setOptionsList(value: js.Array[Option]): Unit = js.native
  def setPacked(value: Boolean): Unit = js.native
  def setTypeUrl(value: String): Unit = js.native
}

