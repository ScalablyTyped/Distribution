package typings.firebaseFirestore.remoteWatchChangeMod

import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.localTargetDataMod.TargetData
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.MaybeDocument
import typings.firebaseFirestore.remoteRemoteEventMod.RemoteEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/watch_change", "WatchChangeAggregator")
@js.native
class WatchChangeAggregator protected () extends js.Object {
  def this(metadataProvider: TargetMetadataProvider) = this()
  var ensureDocumentTargetMapping: js.Any = js.native
  var ensureTargetState: js.Any = js.native
  /**
    * Returns the current count of documents in the target. This includes both
    * the number of documents that the LocalStore considers to be part of the
    * target as well as any accumulated changes.
    */
  var getCurrentDocumentCountForTarget: js.Any = js.native
  var metadataProvider: js.Any = js.native
  /** A mapping of document keys to their set of target IDs. */
  var pendingDocumentTargetMapping: js.Any = js.native
  /** Keeps track of the documents to update since the last raised snapshot. */
  var pendingDocumentUpdates: js.Any = js.native
  /**
    * A list of targets with existence filter mismatches. These targets are
    * known to be inconsistent and their listens needs to be re-established by
    * RemoteStore.
    */
  var pendingTargetResets: js.Any = js.native
  /**
    * Resets the state of a Watch target to its initial state (e.g. sets
    * 'current' to false, clears the resume token and removes its target mapping
    * from all documents).
    */
  var resetTarget: js.Any = js.native
  /**
    * Returns whether the LocalStore considers the document to be part of the
    * specified target.
    */
  var targetContainsDocument: js.Any = js.native
  /** The internal state of all tracked targets. */
  var targetStates: js.Any = js.native
  /**
    * Adds the provided document to the internal list of document updates and
    * its document key to the given target's mapping.
    */
  def addDocumentToTarget(targetId: TargetId, document: MaybeDocument): Unit = js.native
  /**
    * Converts the currently accumulated state into a remote event at the
    * provided snapshot version. Resets the accumulated changes before returning.
    */
  def createRemoteEvent(snapshotVersion: SnapshotVersion): RemoteEvent = js.native
  /**
    * Iterates over all targetIds that the watch change applies to: either the
    * targetIds explicitly listed in the change or the targetIds of all currently
    * active targets.
    */
  def forEachTarget(targetChange: WatchTargetChange, fn: js.Function1[/* targetId */ TargetId, Unit]): Unit = js.native
  /**
    * Processes and adds the DocumentWatchChange to the current set of changes.
    */
  def handleDocumentChange(docChange: DocumentWatchChange): Unit = js.native
  /**
    * Handles existence filters and synthesizes deletes for filter mismatches.
    * Targets that are invalidated by filter mismatches are added to
    * `pendingTargetResets`.
    */
  def handleExistenceFilter(watchChange: ExistenceFilterChange): Unit = js.native
  /** Processes and adds the WatchTargetChange to the current set of changes. */
  def handleTargetChange(targetChange: WatchTargetChange): Unit = js.native
  /**
    * Verifies that the user is still interested in this target (by calling
    * `getTargetDataForTarget()`) and that we are not waiting for pending ADDs
    * from watch.
    */
  /* protected */ def isActiveTarget(targetId: TargetId): Boolean = js.native
  /**
    * Increment the number of acks needed from watch before we can consider the
    * server to be 'in-sync' with the client's active targets.
    */
  def recordPendingTargetRequest(targetId: TargetId): Unit = js.native
  def removeDocumentFromTarget(targetId: TargetId, key: DocumentKey): Unit = js.native
  /**
    * Removes the provided document from the target mapping. If the
    * document no longer matches the target, but the document's state is still
    * known (e.g. we know that the document was deleted or we received the change
    * that caused the filter mismatch), the new document can be provided
    * to update the remote document cache.
    */
  def removeDocumentFromTarget(targetId: TargetId, key: DocumentKey, updatedDocument: MaybeDocument): Unit = js.native
  def removeTarget(targetId: TargetId): Unit = js.native
  /**
    * Returns the TargetData for an active target (i.e. a target that the user
    * is still interested in that has no outstanding target change requests).
    */
  /* protected */ def targetDataForActiveTarget(targetId: TargetId): TargetData | Null = js.native
}

