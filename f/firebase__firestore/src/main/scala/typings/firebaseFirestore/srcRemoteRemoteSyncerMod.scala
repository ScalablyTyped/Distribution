package typings.firebaseFirestore

import typings.firebaseFirestore.srcAuthUserMod.User
import typings.firebaseFirestore.srcCoreTypesMod.BatchId
import typings.firebaseFirestore.srcCoreTypesMod.TargetId
import typings.firebaseFirestore.srcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.srcModelMutationBatchMod.MutationBatchResult
import typings.firebaseFirestore.srcRemoteRemoteEventMod.RemoteEvent
import typings.firebaseFirestore.srcUtilErrorMod.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRemoteRemoteSyncerMod {
  
  trait RemoteSyncer extends StObject {
    
    /**
      * Applies one remote event to the sync engine, notifying any views of the
      * changes, and releasing any pending mutation batches that would become
      * visible because of the snapshot version the remote event contains.
      */
    var applyRemoteEvent: js.UndefOr[js.Function1[/* remoteEvent */ RemoteEvent, js.Promise[Unit]]] = js.undefined
    
    /**
      * Applies the result of a successful write of a mutation batch to the sync
      * engine, emitting snapshots in any views that the mutation applies to, and
      * removing the batch from the mutation queue.
      */
    var applySuccessfulWrite: js.UndefOr[js.Function1[/* result */ MutationBatchResult, js.Promise[Unit]]] = js.undefined
    
    /**
      * Returns the set of remote document keys for the given target ID. This list
      * includes the documents that were assigned to the target when we received
      * the last snapshot.
      */
    var getRemoteKeysForTarget: js.UndefOr[js.Function1[/* targetId */ TargetId, DocumentKeySet_]] = js.undefined
    
    /**
      * Updates all local state to match the pending mutations for the given user.
      * May be called repeatedly for the same user.
      */
    var handleCredentialChange: js.UndefOr[js.Function1[/* user */ User, js.Promise[Unit]]] = js.undefined
    
    /**
      * Rejects the batch, removing the batch from the mutation queue, recomputing
      * the local view of any documents affected by the batch and then, emitting
      * snapshots with the reverted value.
      */
    var rejectFailedWrite: js.UndefOr[
        js.Function2[/* batchId */ BatchId, /* error */ FirestoreError, js.Promise[Unit]]
      ] = js.undefined
    
    /**
      * Rejects the listen for the given targetID. This can be triggered by the
      * backend for any active target.
      *
      * @param targetId - The targetID corresponds to one previously initiated by
      * the user as part of TargetData passed to listen() on RemoteStore.
      * @param error - A description of the condition that has forced the rejection.
      * Nearly always this will be an indication that the user is no longer
      * authorized to see the data matching the target.
      */
    var rejectListen: js.UndefOr[
        js.Function2[/* targetId */ TargetId, /* error */ FirestoreError, js.Promise[Unit]]
      ] = js.undefined
  }
  object RemoteSyncer {
    
    inline def apply(): RemoteSyncer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteSyncer]
    }
    
    extension [Self <: RemoteSyncer](x: Self) {
      
      inline def setApplyRemoteEvent(value: /* remoteEvent */ RemoteEvent => js.Promise[Unit]): Self = StObject.set(x, "applyRemoteEvent", js.Any.fromFunction1(value))
      
      inline def setApplyRemoteEventUndefined: Self = StObject.set(x, "applyRemoteEvent", js.undefined)
      
      inline def setApplySuccessfulWrite(value: /* result */ MutationBatchResult => js.Promise[Unit]): Self = StObject.set(x, "applySuccessfulWrite", js.Any.fromFunction1(value))
      
      inline def setApplySuccessfulWriteUndefined: Self = StObject.set(x, "applySuccessfulWrite", js.undefined)
      
      inline def setGetRemoteKeysForTarget(value: /* targetId */ TargetId => DocumentKeySet_): Self = StObject.set(x, "getRemoteKeysForTarget", js.Any.fromFunction1(value))
      
      inline def setGetRemoteKeysForTargetUndefined: Self = StObject.set(x, "getRemoteKeysForTarget", js.undefined)
      
      inline def setHandleCredentialChange(value: /* user */ User => js.Promise[Unit]): Self = StObject.set(x, "handleCredentialChange", js.Any.fromFunction1(value))
      
      inline def setHandleCredentialChangeUndefined: Self = StObject.set(x, "handleCredentialChange", js.undefined)
      
      inline def setRejectFailedWrite(value: (/* batchId */ BatchId, /* error */ FirestoreError) => js.Promise[Unit]): Self = StObject.set(x, "rejectFailedWrite", js.Any.fromFunction2(value))
      
      inline def setRejectFailedWriteUndefined: Self = StObject.set(x, "rejectFailedWrite", js.undefined)
      
      inline def setRejectListen(value: (/* targetId */ TargetId, /* error */ FirestoreError) => js.Promise[Unit]): Self = StObject.set(x, "rejectListen", js.Any.fromFunction2(value))
      
      inline def setRejectListenUndefined: Self = StObject.set(x, "rejectListen", js.undefined)
    }
  }
}
