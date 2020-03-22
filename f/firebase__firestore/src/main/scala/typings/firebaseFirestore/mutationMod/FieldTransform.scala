package typings.firebaseFirestore.mutationMod

import typings.firebaseFirestore.pathMod.FieldPath
import typings.firebaseFirestore.transformOperationMod.TransformOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/mutation", "FieldTransform")
@js.native
class FieldTransform protected () extends js.Object {
  def this(field: FieldPath, transform: TransformOperation) = this()
  val field: FieldPath = js.native
  val transform: TransformOperation = js.native
  def isEqual(other: FieldTransform): Boolean = js.native
}

