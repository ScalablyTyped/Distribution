package typings.firebaseFirestore.localSharedClientStateMod

import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.localSharedClientStateSyncerMod.QueryTargetState
import typings.firebaseFirestore.utilErrorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/shared_client_state", "QueryTargetMetadata")
@js.native
class QueryTargetMetadata protected () extends js.Object {
  def this(targetId: TargetId, state: QueryTargetState) = this()
  def this(targetId: TargetId, state: QueryTargetState, error: FirestoreError) = this()
  val error: js.UndefOr[FirestoreError] = js.native
  val state: QueryTargetState = js.native
  val targetId: TargetId = js.native
  def toWebStorageJSON(): String = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/local/shared_client_state", "QueryTargetMetadata")
@js.native
object QueryTargetMetadata extends js.Object {
  /**
    * Parses a QueryTargetMetadata from its JSON representation in WebStorage.
    * Logs a warning and returns null if the format of the data is not valid.
    */
  def fromWebStorageEntry(targetId: TargetId, value: String): QueryTargetMetadata | Null = js.native
}

