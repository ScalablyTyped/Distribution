package typings.firebaseFirestore.modelFieldValueMod

import typings.firebaseFirestore.AnonMapValue
import typings.firebaseFirestore.mutationMod.FieldMask
import typings.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "ObjectValue")
@js.native
class ObjectValue protected () extends js.Object {
  def this(proto: AnonMapValue) = this()
  var extractFieldMask: js.Any = js.native
  val proto: AnonMapValue = js.native
  /**
    * Returns the value at the given path or null.
    *
    * @param path the path to search
    * @return The value at the path or if there it doesn't exist.
    */
  def field(path: FieldPath): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any) | Null = js.native
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
@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "ObjectValue")
@js.native
object ObjectValue extends js.Object {
  var EMPTY: ObjectValue = js.native
  /** Returns a new Builder instance that is based on an empty object. */
  def newBuilder(): ObjectValueBuilder = js.native
}

