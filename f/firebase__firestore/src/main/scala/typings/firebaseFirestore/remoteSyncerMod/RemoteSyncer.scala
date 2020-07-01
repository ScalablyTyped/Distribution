package typings.firebaseFirestore.remoteSyncerMod

import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.errorMod.FirestoreError
import typings.firebaseFirestore.mutationBatchMod.MutationBatchResult
import typings.firebaseFirestore.remoteEventMod.RemoteEvent
import typings.firebaseFirestore.typesMod.BatchId
import typings.firebaseFirestore.typesMod.TargetId
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteSyncer extends js.Object {
  /**
    * Applies one remote event to the sync engine, notifying any views of the
    * changes, and releasing any pending mutation batches that would become
    * visible because of the snapshot version the remote event contains.
    */
  def applyRemoteEvent(remoteEvent: RemoteEvent): js.Promise[Unit]
  /**
    * Applies the result of a successful write of a mutation batch to the sync
    * engine, emitting snapshots in any views that the mutation applies to, and
    * removing the batch from the mutation queue.
    */
  def applySuccessfulWrite(result: MutationBatchResult): js.Promise[Unit]
  /**
    * Returns the set of remote document keys for the given target ID. This list
    * includes the documents that were assigned to the target when we received
    * the last snapshot.
    */
  def getRemoteKeysForTarget(targetId: TargetId): DocumentKeySet_
  /**
    * Updates all local state to match the pending mutations for the given user.
    * May be called repeatedly for the same user.
    */
  def handleCredentialChange(user: User): js.Promise[Unit]
  /**
    * Rejects the batch, removing the batch from the mutation queue, recomputing
    * the local view of any documents affected by the batch and then, emitting
    * snapshots with the reverted value.
    */
  def rejectFailedWrite(batchId: BatchId, error: FirestoreError): js.Promise[Unit]
  /**
    * Rejects the listen for the given targetID. This can be triggered by the
    * backend for any active target.
    *
    * @param targetId The targetID corresponds to one previously initiated by the
    * user as part of TargetData passed to listen() on RemoteStore.
    * @param error A description of the condition that has forced the rejection.
    * Nearly always this will be an indication that the user is no longer
    * authorized to see the data matching the target.
    */
  def rejectListen(targetId: TargetId, error: FirestoreError): js.Promise[Unit]
}

object RemoteSyncer {
  @scala.inline
  def apply(
    applyRemoteEvent: RemoteEvent => js.Promise[Unit],
    applySuccessfulWrite: MutationBatchResult => js.Promise[Unit],
    getRemoteKeysForTarget: TargetId => DocumentKeySet_,
    handleCredentialChange: User => js.Promise[Unit],
    rejectFailedWrite: (BatchId, FirestoreError) => js.Promise[Unit],
    rejectListen: (TargetId, FirestoreError) => js.Promise[Unit]
  ): RemoteSyncer = {
    val __obj = js.Dynamic.literal(applyRemoteEvent = js.Any.fromFunction1(applyRemoteEvent), applySuccessfulWrite = js.Any.fromFunction1(applySuccessfulWrite), getRemoteKeysForTarget = js.Any.fromFunction1(getRemoteKeysForTarget), handleCredentialChange = js.Any.fromFunction1(handleCredentialChange), rejectFailedWrite = js.Any.fromFunction2(rejectFailedWrite), rejectListen = js.Any.fromFunction2(rejectListen))
    __obj.asInstanceOf[RemoteSyncer]
  }
}

