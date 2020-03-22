package typings.firebaseFirestore.modelMutationMod

import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/mutation", "DeleteMutation")
@js.native
class DeleteMutation protected () extends Mutation {
  def this(key: DocumentKey, precondition: Precondition) = this()
}

