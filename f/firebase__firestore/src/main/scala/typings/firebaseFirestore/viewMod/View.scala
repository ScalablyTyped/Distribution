package typings.firebaseFirestore.viewMod

import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typings.firebaseFirestore.localStoreMod.QueryResult
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.remoteEventMod.TargetChange
import typings.firebaseFirestore.typesMod.OnlineState
import typings.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/view", "View")
@js.native
class View protected () extends js.Object {
  def this(query: Query, /** Documents included in the remote target */
  _syncedDocuments: DocumentKeySet_) = this()
  /** Documents included in the remote target */
  var _syncedDocuments: js.Any = js.native
  /**
    * Updates syncedDocuments, current, and limbo docs based on the given change.
    * Returns the list of changes to which docs are in limbo.
    */
  var applyTargetChange: js.Any = js.native
  /**
    * A flag whether the view is current with the backend. A view is considered
    * current after it has seen the current flag from the backend and did not
    * lose consistency within the watch stream (e.g. because of an existence
    * filter mismatch).
    */
  var current: js.Any = js.native
  var documentSet: js.Any = js.native
  /** Documents in the view but not in the remote target */
  var limboDocuments: js.Any = js.native
  /** Document Keys that have local changes */
  var mutatedKeys: js.Any = js.native
  var query: js.Any = js.native
  /**
    * Returns whether the doc for the given key should be in limbo.
    */
  var shouldBeInLimbo: js.Any = js.native
  var shouldWaitForSyncedDocument: js.Any = js.native
  var syncState: js.Any = js.native
  var updateLimboDocuments: js.Any = js.native
  /**
    * Updates the view with the given ViewDocumentChanges and optionally updates
    * limbo docs and sync state from the provided target change.
    * @param docChanges The set of changes to make to the view's docs.
    * @param updateLimboDocuments Whether to update limbo documents based on this
    *        change.
    * @param targetChange A target change to apply for computing limbo docs and
    *        sync state.
    * @return A new ViewChange with the given docs, changes, and sync state.
    */
  def applyChanges(docChanges: ViewDocumentChanges, updateLimboDocuments: Boolean): ViewChange = js.native
  def applyChanges(docChanges: ViewDocumentChanges, updateLimboDocuments: Boolean, targetChange: TargetChange): ViewChange = js.native
  /**
    * Applies an OnlineState change to the view, potentially generating a
    * ViewChange if the view's syncState changes as a result.
    */
  def applyOnlineStateChange(onlineState: OnlineState): ViewChange = js.native
  /**
    * Iterates over a set of doc changes, applies the query limit, and computes
    * what the new results should be, what the changes were, and whether we may
    * need to go back to the local cache for more results. Does not make any
    * changes to the view.
    * @param docChanges The doc changes to apply to this view.
    * @param previousChanges If this is being called with a refill, then start
    *        with this set of docs and changes instead of the current view.
    * @return a new set of docs, changes, and refill flag.
    */
  def computeDocChanges(docChanges: MaybeDocumentMap_): ViewDocumentChanges = js.native
  def computeDocChanges(docChanges: MaybeDocumentMap_, previousChanges: ViewDocumentChanges): ViewDocumentChanges = js.native
  /**
    * Returns a view snapshot as if this query was just listened to. Contains
    * a document add for every existing document and the `fromCache` and
    * `hasPendingWrites` status of the already established view.
    */
  def computeInitialSnapshot(): ViewSnapshot = js.native
  /**
    * The set of remote documents that the server has told us belongs to the target associated with
    * this view.
    */
  def syncedDocuments(): DocumentKeySet_ = js.native
  /**
    * Update the in-memory state of the current view with the state read from
    * persistence.
    *
    * We update the query view whenever a client's primary status changes:
    * - When a client transitions from primary to secondary, it can miss
    *   LocalStorage updates and its query views may temporarily not be
    *   synchronized with the state on disk.
    * - For secondary to primary transitions, the client needs to update the list
    *   of `syncedDocuments` since secondary clients update their query views
    *   based purely on synthesized RemoteEvents.
    *
    * @param queryResult.documents - The documents that match the query according
    * to the LocalStore.
    * @param queryResult.remoteKeys - The keys of the documents that match the
    * query according to the backend.
    *
    * @return The ViewChange that resulted from this synchronization.
    */
  def synchronizeWithPersistedState(queryResult: QueryResult): ViewChange = js.native
}

