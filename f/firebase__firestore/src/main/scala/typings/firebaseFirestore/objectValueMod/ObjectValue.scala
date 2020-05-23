package typings.firebaseFirestore.objectValueMod

import typings.firebaseFirestore.anon.MapValue
import typings.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/model/object_value", "ObjectValue")
@js.native
class ObjectValue protected () extends js.Object {
  def this(proto: MapValue) = this()
  val proto: MapValue = js.native
  /**
    * Returns the value at the given path or null.
    *
    * @param path the path to search
    * @return The value at the path or if there it doesn't exist.
    */
  def field(path: FieldPath): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any) | Null = js.native
  def isEqual(other: ObjectValue): Boolean = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/src/model/object_value", "ObjectValue")
@js.native
object ObjectValue extends js.Object {
  def empty(): ObjectValue = js.native
}

