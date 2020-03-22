package typings.firebaseFirestore.mutationMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/mutation", "DeleteMutation")
@js.native
class DeleteMutation protected () extends Mutation {
  def this(key: DocumentKey, precondition: Precondition) = this()
}

