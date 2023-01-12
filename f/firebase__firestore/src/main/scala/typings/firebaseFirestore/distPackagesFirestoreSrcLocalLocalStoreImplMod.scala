package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreBundleMod.BundleConverter
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreBundleMod.BundledDocuments
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreBundleMod.NamedQuery
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Target
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.BatchId
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalLocalStoreMod.LocalStore
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalLocalViewChangesMod.LocalViewChanges
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalQueryEngineMod.QueryEngine
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalSharedClientStateMod.ClientId
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalTargetDataMod.TargetData
import typings.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distPackagesFirestoreSrcModelCollectionsMod.DocumentMap_
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distPackagesFirestoreSrcModelFieldIndexMod.FieldIndex
import typings.firebaseFirestore.distPackagesFirestoreSrcModelMutationBatchMod.MutationBatch
import typings.firebaseFirestore.distPackagesFirestoreSrcModelMutationBatchMod.MutationBatchResult
import typings.firebaseFirestore.distPackagesFirestoreSrcModelMutationMod.Mutation
import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.BundleMetadata
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteRemoteEventMod.RemoteEvent
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLocalLocalStoreImplMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/local_store_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/local_store_impl", "LOG_TAG")
  @js.native
  val LOG_TAG: /* "LocalStore" */ String = js.native
  
  inline def localStoreAcknowledgeBatch(localStore: LocalStore, batchResult: MutationBatchResult): js.Promise[DocumentMap_] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreAcknowledgeBatch")(localStore.asInstanceOf[js.Any], batchResult.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DocumentMap_]]
  
  inline def localStoreAllocateTarget(localStore: LocalStore, target: Target): js.Promise[TargetData] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreAllocateTarget")(localStore.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TargetData]]
  
  inline def localStoreApplyBundledDocuments(
    localStore: LocalStore,
    bundleConverter: BundleConverter,
    documents: BundledDocuments,
    bundleName: String
  ): js.Promise[DocumentMap_] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreApplyBundledDocuments")(localStore.asInstanceOf[js.Any], bundleConverter.asInstanceOf[js.Any], documents.asInstanceOf[js.Any], bundleName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DocumentMap_]]
  
  inline def localStoreApplyRemoteEventToLocalCache(localStore: LocalStore, remoteEvent: RemoteEvent): js.Promise[DocumentMap_] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreApplyRemoteEventToLocalCache")(localStore.asInstanceOf[js.Any], remoteEvent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DocumentMap_]]
  
  inline def localStoreConfigureFieldIndexes(localStore: LocalStore, newFieldIndexes: js.Array[FieldIndex]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreConfigureFieldIndexes")(localStore.asInstanceOf[js.Any], newFieldIndexes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def localStoreExecuteQuery(localStore: LocalStore, query: Query, usePreviousResults: Boolean): js.Promise[QueryResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreExecuteQuery")(localStore.asInstanceOf[js.Any], query.asInstanceOf[js.Any], usePreviousResults.asInstanceOf[js.Any])).asInstanceOf[js.Promise[QueryResult]]
  
  inline def localStoreGetActiveClients(localStore: LocalStore): js.Promise[js.Array[ClientId]] = ^.asInstanceOf[js.Dynamic].applyDynamic("localStoreGetActiveClients")(localStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ClientId]]]
  
  inline def localStoreGetCachedTarget(localStore: LocalStore, targetId: TargetId): js.Promise[Target | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreGetCachedTarget")(localStore.asInstanceOf[js.Any], targetId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Target | Null]]
  
  inline def localStoreGetHighestUnacknowledgedBatchId(localStore: LocalStore): js.Promise[BatchId] = ^.asInstanceOf[js.Dynamic].applyDynamic("localStoreGetHighestUnacknowledgedBatchId")(localStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BatchId]]
  
  inline def localStoreGetLastRemoteSnapshotVersion(localStore: LocalStore): js.Promise[SnapshotVersion] = ^.asInstanceOf[js.Dynamic].applyDynamic("localStoreGetLastRemoteSnapshotVersion")(localStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SnapshotVersion]]
  
  inline def localStoreGetNamedQuery(localStore: LocalStore, queryName: String): js.Promise[js.UndefOr[NamedQuery]] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreGetNamedQuery")(localStore.asInstanceOf[js.Any], queryName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[NamedQuery]]]
  
  inline def localStoreGetNewDocumentChanges(localStore: LocalStore, collectionGroup: String): js.Promise[DocumentMap_] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreGetNewDocumentChanges")(localStore.asInstanceOf[js.Any], collectionGroup.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DocumentMap_]]
  
  inline def localStoreGetNextMutationBatch(localStore: LocalStore): js.Promise[MutationBatch | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("localStoreGetNextMutationBatch")(localStore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MutationBatch | Null]]
  inline def localStoreGetNextMutationBatch(localStore: LocalStore, afterBatchId: BatchId): js.Promise[MutationBatch | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreGetNextMutationBatch")(localStore.asInstanceOf[js.Any], afterBatchId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MutationBatch | Null]]
  
  inline def localStoreGetTargetData(localStore: LocalStore, transaction: PersistenceTransaction, target: Target): PersistencePromise[TargetData | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreGetTargetData")(localStore.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PersistencePromise[TargetData | Null]]
  
  inline def localStoreHandleUserChange(localStore: LocalStore, user: User): js.Promise[UserChangeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreHandleUserChange")(localStore.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserChangeResult]]
  
  inline def localStoreHasNewerBundle(localStore: LocalStore, bundleMetadata: BundleMetadata): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreHasNewerBundle")(localStore.asInstanceOf[js.Any], bundleMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def localStoreLookupMutationDocuments(localStore: LocalStore, batchId: BatchId): js.Promise[DocumentMap_ | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreLookupMutationDocuments")(localStore.asInstanceOf[js.Any], batchId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DocumentMap_ | Null]]
  
  inline def localStoreNotifyLocalViewChanges(localStore: LocalStore, viewChanges: js.Array[LocalViewChanges]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreNotifyLocalViewChanges")(localStore.asInstanceOf[js.Any], viewChanges.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def localStoreReadDocument(localStore: LocalStore, key: DocumentKey): js.Promise[Document] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreReadDocument")(localStore.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document]]
  
  inline def localStoreRejectBatch(localStore: LocalStore, batchId: BatchId): js.Promise[DocumentMap_] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreRejectBatch")(localStore.asInstanceOf[js.Any], batchId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DocumentMap_]]
  
  inline def localStoreReleaseTarget(localStore: LocalStore, targetId: Double, keepPersistedTargetData: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreReleaseTarget")(localStore.asInstanceOf[js.Any], targetId.asInstanceOf[js.Any], keepPersistedTargetData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def localStoreRemoveCachedMutationBatchMetadata(localStore: LocalStore, batchId: BatchId): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreRemoveCachedMutationBatchMetadata")(localStore.asInstanceOf[js.Any], batchId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def localStoreSaveBundle(localStore: LocalStore, bundleMetadata: BundleMetadata): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreSaveBundle")(localStore.asInstanceOf[js.Any], bundleMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def localStoreSaveNamedQuery(
    localStore: LocalStore,
    query: typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.NamedQuery
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreSaveNamedQuery")(localStore.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def localStoreSaveNamedQuery(
    localStore: LocalStore,
    query: typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.NamedQuery,
    documents: DocumentKeySet_
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreSaveNamedQuery")(localStore.asInstanceOf[js.Any], query.asInstanceOf[js.Any], documents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def localStoreWriteLocally(localStore: LocalStore, mutations: js.Array[Mutation]): js.Promise[LocalWriteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("localStoreWriteLocally")(localStore.asInstanceOf[js.Any], mutations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LocalWriteResult]]
  
  inline def newLocalStore(
    /** Manages our in-memory or durable persistence. */
  persistence: Persistence,
    queryEngine: QueryEngine,
    initialUser: User,
    serializer: JsonProtoSerializer
  ): LocalStore = (^.asInstanceOf[js.Dynamic].applyDynamic("newLocalStore")(persistence.asInstanceOf[js.Any], queryEngine.asInstanceOf[js.Any], initialUser.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[LocalStore]
  
  trait LocalWriteResult extends StObject {
    
    var batchId: BatchId
    
    var changes: DocumentMap_
  }
  object LocalWriteResult {
    
    inline def apply(batchId: BatchId, changes: DocumentMap_): LocalWriteResult = {
      val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalWriteResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalWriteResult] (val x: Self) extends AnyVal {
      
      inline def setBatchId(value: BatchId): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
      
      inline def setChanges(value: DocumentMap_): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryResult extends StObject {
    
    val documents: DocumentMap_
    
    val remoteKeys: DocumentKeySet_
  }
  object QueryResult {
    
    inline def apply(documents: DocumentMap_, remoteKeys: DocumentKeySet_): QueryResult = {
      val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], remoteKeys = remoteKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryResult] (val x: Self) extends AnyVal {
      
      inline def setDocuments(value: DocumentMap_): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
      
      inline def setRemoteKeys(value: DocumentKeySet_): Self = StObject.set(x, "remoteKeys", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserChangeResult extends StObject {
    
    val addedBatchIds: js.Array[BatchId]
    
    val affectedDocuments: DocumentMap_
    
    val removedBatchIds: js.Array[BatchId]
  }
  object UserChangeResult {
    
    inline def apply(
      addedBatchIds: js.Array[BatchId],
      affectedDocuments: DocumentMap_,
      removedBatchIds: js.Array[BatchId]
    ): UserChangeResult = {
      val __obj = js.Dynamic.literal(addedBatchIds = addedBatchIds.asInstanceOf[js.Any], affectedDocuments = affectedDocuments.asInstanceOf[js.Any], removedBatchIds = removedBatchIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserChangeResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserChangeResult] (val x: Self) extends AnyVal {
      
      inline def setAddedBatchIds(value: js.Array[BatchId]): Self = StObject.set(x, "addedBatchIds", value.asInstanceOf[js.Any])
      
      inline def setAddedBatchIdsVarargs(value: BatchId*): Self = StObject.set(x, "addedBatchIds", js.Array(value*))
      
      inline def setAffectedDocuments(value: DocumentMap_): Self = StObject.set(x, "affectedDocuments", value.asInstanceOf[js.Any])
      
      inline def setRemovedBatchIds(value: js.Array[BatchId]): Self = StObject.set(x, "removedBatchIds", value.asInstanceOf[js.Any])
      
      inline def setRemovedBatchIdsVarargs(value: BatchId*): Self = StObject.set(x, "removedBatchIds", js.Array(value*))
    }
  }
}
