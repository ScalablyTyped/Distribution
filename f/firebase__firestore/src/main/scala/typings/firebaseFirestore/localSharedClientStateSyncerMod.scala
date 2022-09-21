package typings.firebaseFirestore

import typings.firebaseFirestore.coreTypesMod.BatchId
import typings.firebaseFirestore.coreTypesMod.MutationBatchState
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.firebaseFirestoreStrings.current_
import typings.firebaseFirestore.localSharedClientStateMod.ClientId
import typings.firebaseFirestore.utilErrorMod.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localSharedClientStateSyncerMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.`not-current`
    - typings.firebaseFirestore.firebaseFirestoreStrings.current_
    - typings.firebaseFirestore.firebaseFirestoreStrings.rejected
  */
  trait QueryTargetState extends StObject
  object QueryTargetState {
    
    inline def current: current_ = "current".asInstanceOf[current_]
    
    inline def `not-current`: typings.firebaseFirestore.firebaseFirestoreStrings.`not-current` = "not-current".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`not-current`]
    
    inline def rejected: typings.firebaseFirestore.firebaseFirestoreStrings.rejected = "rejected".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.rejected]
  }
  
  @js.native
  trait SharedClientStateSyncer extends StObject {
    
    /** Adds or removes Watch targets for queries from different tabs. */
    def applyActiveTargetsChange(added: js.Array[TargetId], removed: js.Array[TargetId]): js.Promise[Unit] = js.native
    
    /** Applies a mutation state to an existing batch.  */
    def applyBatchState(batchId: BatchId, state: MutationBatchState): js.Promise[Unit] = js.native
    def applyBatchState(batchId: BatchId, state: MutationBatchState, error: FirestoreError): js.Promise[Unit] = js.native
    
    /** Applies a query target change from a different tab. */
    def applyTargetState(targetId: TargetId, state: QueryTargetState): js.Promise[Unit] = js.native
    def applyTargetState(targetId: TargetId, state: QueryTargetState, error: FirestoreError): js.Promise[Unit] = js.native
    
    /** Returns the IDs of the clients that are currently active. */
    def getActiveClients(): js.Promise[js.Array[ClientId]] = js.native
    
    /**
      * Retrieves newly changed documents from remote document cache and raises
      * snapshots if needed.
      */
    def synchronizeWithChangedDocuments(collectionGroup: String): js.Promise[Unit] = js.native
  }
}
