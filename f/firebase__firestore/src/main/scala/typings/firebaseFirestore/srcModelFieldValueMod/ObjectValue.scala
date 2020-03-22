package typings.firebaseFirestore.srcModelFieldValueMod

import typings.firebaseFirestore.modelMutationMod.FieldMask
import typings.firebaseFirestore.modelPathMod.FieldPath
import typings.firebaseFirestore.utilSortedMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/field_value", "ObjectValue")
@js.native
class ObjectValue protected () extends FieldValue {
  def this(internalValue: SortedMap[String, FieldValue]) = this()
  val internalValue: SortedMap[String, FieldValue] = js.native
  def contains(path: FieldPath): Boolean = js.native
  def field(path: FieldPath): FieldValue | Null = js.native
  /**
    * Returns a FieldMask built from all FieldPaths starting from this ObjectValue,
    * including paths from nested objects.
    */
  def fieldMask(): FieldMask = js.native
  def forEach(action: js.Function2[/* key */ String, /* value */ FieldValue, Unit]): Unit = js.native
  /** Creates a ObjectValueBuilder instance that is based on the current value. */
  def toBuilder(): ObjectValueBuilder = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/model/field_value", "ObjectValue")
@js.native
object ObjectValue extends js.Object {
  var EMPTY: ObjectValue = js.native
  /** Returns a new ObjectValueBuilder instance that is based on an empty object. */
  def newBuilder(): ObjectValueBuilder = js.native
}

