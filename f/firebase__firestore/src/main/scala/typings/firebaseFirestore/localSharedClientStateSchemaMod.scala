package typings.firebaseFirestore

import typings.firebaseFirestore.anon.Code
import typings.firebaseFirestore.authUserMod.User
import typings.firebaseFirestore.coreTypesMod.BatchId
import typings.firebaseFirestore.coreTypesMod.MutationBatchState
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.localSharedClientStateMod.ClientId
import typings.firebaseFirestore.localSharedClientStateSyncerMod.QueryTargetState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localSharedClientStateSchemaMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state_schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state_schema", "BUNDLE_LOADED_KEY_PREFIX")
  @js.native
  val BUNDLE_LOADED_KEY_PREFIX: /* "firestore_bundle_loaded_v2" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state_schema", "CLIENT_STATE_KEY_PREFIX")
  @js.native
  val CLIENT_STATE_KEY_PREFIX: /* "firestore_clients" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state_schema", "MUTATION_BATCH_KEY_PREFIX")
  @js.native
  val MUTATION_BATCH_KEY_PREFIX: /* "firestore_mutations" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state_schema", "ONLINE_STATE_KEY_PREFIX")
  @js.native
  val ONLINE_STATE_KEY_PREFIX: /* "firestore_online_state" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state_schema", "QUERY_TARGET_KEY_PREFIX")
  @js.native
  val QUERY_TARGET_KEY_PREFIX: /* "firestore_targets" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/shared_client_state_schema", "SEQUENCE_NUMBER_KEY_PREFIX")
  @js.native
  val SEQUENCE_NUMBER_KEY_PREFIX: /* "firestore_sequence_number" */ String = js.native
  
  inline def createBundleLoadedKey(persistenceKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createBundleLoadedKey")(persistenceKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createWebStorageClientStateKey(persistenceKey: String, clientId: ClientId): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebStorageClientStateKey")(persistenceKey.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createWebStorageMutationBatchKey(persistenceKey: String, user: User, batchId: BatchId): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebStorageMutationBatchKey")(persistenceKey.asInstanceOf[js.Any], user.asInstanceOf[js.Any], batchId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createWebStorageOnlineStateKey(persistenceKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebStorageOnlineStateKey")(persistenceKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createWebStorageQueryTargetMetadataKey(persistenceKey: String, targetId: TargetId): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebStorageQueryTargetMetadataKey")(persistenceKey.asInstanceOf[js.Any], targetId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createWebStorageSequenceNumberKey(persistenceKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebStorageSequenceNumberKey")(persistenceKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ClientStateSchema extends StObject {
    
    var activeTargetIds: js.Array[Double]
    
    var updateTimeMs: Double
  }
  object ClientStateSchema {
    
    inline def apply(activeTargetIds: js.Array[Double], updateTimeMs: Double): ClientStateSchema = {
      val __obj = js.Dynamic.literal(activeTargetIds = activeTargetIds.asInstanceOf[js.Any], updateTimeMs = updateTimeMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientStateSchema]
    }
    
    extension [Self <: ClientStateSchema](x: Self) {
      
      inline def setActiveTargetIds(value: js.Array[Double]): Self = StObject.set(x, "activeTargetIds", value.asInstanceOf[js.Any])
      
      inline def setActiveTargetIdsVarargs(value: Double*): Self = StObject.set(x, "activeTargetIds", js.Array(value*))
      
      inline def setUpdateTimeMs(value: Double): Self = StObject.set(x, "updateTimeMs", value.asInstanceOf[js.Any])
    }
  }
  
  trait MutationMetadataSchema extends StObject {
    
    var error: js.UndefOr[Code] = js.undefined
    
    var state: MutationBatchState
    
    var updateTimeMs: Double
  }
  object MutationMetadataSchema {
    
    inline def apply(state: MutationBatchState, updateTimeMs: Double): MutationMetadataSchema = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], updateTimeMs = updateTimeMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutationMetadataSchema]
    }
    
    extension [Self <: MutationMetadataSchema](x: Self) {
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setState(value: MutationBatchState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUpdateTimeMs(value: Double): Self = StObject.set(x, "updateTimeMs", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryTargetStateSchema extends StObject {
    
    var error: js.UndefOr[Code] = js.undefined
    
    var state: QueryTargetState
    
    var updateTimeMs: Double
  }
  object QueryTargetStateSchema {
    
    inline def apply(state: QueryTargetState, updateTimeMs: Double): QueryTargetStateSchema = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], updateTimeMs = updateTimeMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryTargetStateSchema]
    }
    
    extension [Self <: QueryTargetStateSchema](x: Self) {
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setState(value: QueryTargetState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUpdateTimeMs(value: Double): Self = StObject.set(x, "updateTimeMs", value.asInstanceOf[js.Any])
    }
  }
  
  trait SharedOnlineStateSchema extends StObject {
    
    /**
      * The clientId of the client that wrote this onlineState value. Tracked so
      * that on startup, clients can check if this client is still active when
      * determining whether to apply this value or not.
      */
    val clientId: String
    
    val onlineState: String
  }
  object SharedOnlineStateSchema {
    
    inline def apply(clientId: String, onlineState: String): SharedOnlineStateSchema = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], onlineState = onlineState.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedOnlineStateSchema]
    }
    
    extension [Self <: SharedOnlineStateSchema](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setOnlineState(value: String): Self = StObject.set(x, "onlineState", value.asInstanceOf[js.Any])
    }
  }
}
