package typings.firebaseFirestore.syncEngineMod

import typings.firebaseFirestore.datastoreMod.Datastore
import typings.firebaseFirestore.localStoreMod.MultiTabLocalStore
import typings.firebaseFirestore.remoteStoreMod.RemoteStore
import typings.firebaseFirestore.sharedClientStateMod.SharedClientState
import typings.firebaseFirestore.sharedClientStateSyncerMod.SharedClientStateSyncer
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/core/sync_engine", "MultiTabSyncEngine")
@js.native
class MultiTabSyncEngine protected ()
  extends SyncEngine
     with SharedClientStateSyncer {
  def this(
    localStore: MultiTabLocalStore,
    remoteStore: RemoteStore,
    datastore: Datastore,
    sharedClientState: SharedClientState,
    currentUser: User,
    maxConcurrentLimboResolutions: Double
  ) = this()
  var _isPrimaryClient: js.Any = js.native
  @JSName("localStore")
  var localStore_MultiTabSyncEngine: MultiTabLocalStore = js.native
  var resetLimboDocuments: js.Any = js.native
  /**
    * Reconcile the query views of the provided query targets with the state from
    * persistence. Raises snapshots for any changes that affect the local
    * client and returns the updated state of all target's query data.
    *
    * @param targets the list of targets with views that need to be recomputed
    * @param transitionToPrimary `true` iff the tab transitions from a secondary
    * tab to a primary tab
    */
  var synchronizeQueryViewsAndRaiseSnapshots: js.Any = js.native
  /**
    * Reconcile the list of synced documents in an existing view with those
    * from persistence.
    */
  var synchronizeViewAndComputeSnapshot: js.Any = js.native
  /**
    * Creates a `Query` object from the specified `Target`. There is no way to
    * obtain the original `Query`, so we synthesize a `Query` from the `Target`
    * object.
    *
    * The synthesized result might be different from the original `Query`, but
    * since the synthesized `Query` should return the same results as the
    * original one (only the presentation of results might differ), the potential
    * difference will not cause issues.
    */
  var synthesizeTargetToQuery: js.Any = js.native
  def applyPrimaryState(isPrimary: Boolean): js.Promise[Unit] = js.native
}

