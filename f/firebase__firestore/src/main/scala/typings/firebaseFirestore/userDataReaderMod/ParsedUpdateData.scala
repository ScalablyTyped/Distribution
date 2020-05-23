package typings.firebaseFirestore.userDataReaderMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.mutationMod.FieldMask
import typings.firebaseFirestore.mutationMod.FieldTransform
import typings.firebaseFirestore.mutationMod.Mutation
import typings.firebaseFirestore.mutationMod.Precondition
import typings.firebaseFirestore.objectValueMod.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/user_data_reader", "ParsedUpdateData")
@js.native
class ParsedUpdateData protected () extends js.Object {
  def this(data: ObjectValue, fieldMask: FieldMask, fieldTransforms: js.Array[FieldTransform]) = this()
  val data: ObjectValue = js.native
  val fieldMask: FieldMask = js.native
  val fieldTransforms: js.Array[FieldTransform] = js.native
  def toMutations(key: DocumentKey, precondition: Precondition): js.Array[Mutation] = js.native
}

