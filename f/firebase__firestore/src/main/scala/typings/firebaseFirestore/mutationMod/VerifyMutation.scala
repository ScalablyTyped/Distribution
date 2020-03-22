package typings.firebaseFirestore.mutationMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/mutation", "VerifyMutation")
@js.native
class VerifyMutation protected () extends Mutation {
  def this(key: DocumentKey, precondition: Precondition) = this()
}

