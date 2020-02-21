package typings.firebaseFirestore.modelFieldValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "FieldValue")
@js.native
abstract class FieldValue () extends js.Object {
  val typeOrder: TypeOrder = js.native
  /**
    * Returns an approximate (and wildly inaccurate) in-memory size for the field
    * value.
    *
    * The memory size takes into account only the actual user data as it resides
    * in memory and ignores object overhead.
    */
  def approximateByteSize(): Double = js.native
  def compareTo(other: FieldValue): Double = js.native
  def defaultCompareTo(other: FieldValue): Double = js.native
  def isEqual(other: FieldValue): Boolean = js.native
  def value(): FieldType = js.native
  def value(options: FieldValueOptions): FieldType = js.native
}

