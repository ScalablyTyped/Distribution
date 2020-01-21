package typings.firebaseFirestore.srcModelFieldValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/field_value", "FieldValue")
@js.native
abstract class FieldValue () extends js.Object {
  val typeOrder: TypeOrder = js.native
  def compareTo(other: FieldValue): Double = js.native
  def defaultCompareTo(other: FieldValue): Double = js.native
  def isEqual(other: FieldValue): Boolean = js.native
  def value(): FieldType = js.native
  def value(options: FieldValueOptions): FieldType = js.native
}

