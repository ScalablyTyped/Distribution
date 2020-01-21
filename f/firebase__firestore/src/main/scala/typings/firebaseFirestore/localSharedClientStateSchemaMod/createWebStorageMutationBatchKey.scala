package typings.firebaseFirestore.localSharedClientStateSchemaMod

import typings.firebaseFirestore.authUserMod.User
import typings.firebaseFirestore.coreTypesMod.BatchId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/shared_client_state_schema", "createWebStorageMutationBatchKey")
@js.native
object createWebStorageMutationBatchKey extends js.Object {
  def apply(persistenceKey: String, user: User, batchId: BatchId): String = js.native
}

