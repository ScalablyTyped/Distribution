package typings.firebaseFirestore.srcModelFieldValueMod

import typings.firebaseFirestore.AnonMapValueMapValue
import typings.firebaseFirestore.firestoreProtoApiMod.Value
import typings.firebaseFirestore.modelMutationMod.FieldMask
import typings.firebaseFirestore.modelPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/field_value", "ObjectValue")
@js.native
class ObjectValue protected () extends js.Object {
  def this(proto: AnonMapValueMapValue) = this()
  var extractFieldMask: js.Any = js.native
  val proto: AnonMapValueMapValue = js.native
  /**
    * Returns the value at the given path or null.
    *
    * @param path the path to search
    * @return The value at the path or if there it doesn't exist.
    */
  def field(path: FieldPath): Value | Null = js.native
  /**
    * Returns a FieldMask built from all FieldPaths starting from this
    * ObjectValue, including paths from nested objects.
    */
  def fieldMask(): FieldMask = js.native
  def isEqual(other: ObjectValue): Boolean = js.native
  /** Creates a ObjectValueBuilder instance that is based on the current value. */
  def toBuilder(): ObjectValueBuilder = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/model/field_value", "ObjectValue")
@js.native
object ObjectValue extends js.Object {
  var EMPTY: ObjectValue = js.native
  /** Returns a new Builder instance that is based on an empty object. */
  def newBuilder(): ObjectValueBuilder = js.native
}

