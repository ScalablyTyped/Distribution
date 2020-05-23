package typings.firebaseFirestore.sharedClientStateSchemaMod

import typings.firebaseFirestore.typesMod.BatchId
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/shared_client_state_schema", "createWebStorageMutationBatchKey")
@js.native
object createWebStorageMutationBatchKey extends js.Object {
  def apply(persistenceKey: String, user: User, batchId: BatchId): String = js.native
}

