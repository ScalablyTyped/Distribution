package typings.firebaseFirestore.srcModelFieldValueMod

import typings.firebaseFirestore.firestoreProtoApiMod.Value
import typings.firebaseFirestore.modelPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/field_value", "ObjectValueBuilder")
@js.native
class ObjectValueBuilder protected () extends js.Object {
  /**
    * @param baseObject The object to mutate.
    */
  def this(baseObject: ObjectValue) = this()
  /**
    * Applies any overlays from `currentOverlays` that exist at `currentPath`
    * and returns the merged data at `currentPath` (or null if there were no
    * changes).
    *
    * @param currentPath The path at the current nesting level. Can be set to
    * FieldValue.EMPTY_PATH to represent the root.
    * @param currentOverlays The overlays at the current nesting level in the
    * same format as `overlayMap`.
    * @return The merged data at `currentPath` or null if no modifications
    * were applied.
    */
  var applyOverlay: js.Any = js.native
  val baseObject: js.Any = js.native
  /** A map that contains the accumulated changes in this builder. */
  var overlayMap: js.Any = js.native
  /**
    * Adds `value` to the overlay map at `path`. Creates nested map entries if
    * needed.
    */
  var setOverlay: js.Any = js.native
  /** Returns an ObjectValue with all mutations applied. */
  def build(): ObjectValue = js.native
  /**
    * Removes the field at the specified path. If there is no field at the
    * specified path, nothing is changed.
    *
    * @param path The field path to remove.
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
  def set(path: FieldPath, value: Value): ObjectValueBuilder = js.native
}

