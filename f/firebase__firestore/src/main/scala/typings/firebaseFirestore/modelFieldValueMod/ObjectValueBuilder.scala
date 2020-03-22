package typings.firebaseFirestore.modelFieldValueMod

import typings.firebaseFirestore.pathMod.FieldPath
import typings.firebaseFirestore.sortedMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "ObjectValueBuilder")
@js.native
class ObjectValueBuilder protected () extends js.Object {
  def this(internalValue: SortedMap[String, FieldValue]) = this()
  var internalValue: js.Any = js.native
  def build(): ObjectValue = js.native
  /**
    * Removes the field at the current path. If there is no field at the
    * specified path, nothing is changed.
    *
    * @param path The field path to remove
    * @return The current Builder instance.
    */
  def delete(path: FieldPath): ObjectValueBuilder = js.native
  /**
    * Sets the field to the provided value.
    *
    * @param path The field path to set.
    * @param value The value to set.
    * @return The current Builder instance.
    */
  def set(path: FieldPath, value: FieldValue): ObjectValueBuilder = js.native
}

