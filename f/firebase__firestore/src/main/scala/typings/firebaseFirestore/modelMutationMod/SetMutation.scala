package typings.firebaseFirestore.modelMutationMod

import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.srcModelFieldValueMod.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/mutation", "SetMutation")
@js.native
class SetMutation protected () extends Mutation {
  def this(key: DocumentKey, value: ObjectValue, precondition: Precondition) = this()
  val value: ObjectValue = js.native
}

