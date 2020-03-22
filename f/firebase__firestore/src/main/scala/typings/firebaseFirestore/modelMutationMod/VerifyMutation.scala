package typings.firebaseFirestore.modelMutationMod

import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/mutation", "VerifyMutation")
@js.native
class VerifyMutation protected () extends Mutation {
  def this(key: DocumentKey, precondition: Precondition) = this()
}

