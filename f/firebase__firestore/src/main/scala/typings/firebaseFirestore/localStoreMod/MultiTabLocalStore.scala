package typings.firebaseFirestore.localStoreMod

import typings.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typings.firebaseFirestore.indexeddbMutationQueueMod.IndexedDbMutationQueue
import typings.firebaseFirestore.indexeddbPersistenceMod.IndexedDbPersistence
import typings.firebaseFirestore.indexeddbRemoteDocumentCacheMod.IndexedDbRemoteDocumentCache
import typings.firebaseFirestore.indexeddbTargetCacheMod.IndexedDbTargetCache
import typings.firebaseFirestore.queryEngineMod.QueryEngine
import typings.firebaseFirestore.sharedClientStateMod.ClientId
import typings.firebaseFirestore.targetMod.Target
import typings.firebaseFirestore.typesMod.BatchId
import typings.firebaseFirestore.typesMod.TargetId
import typings.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/local_store", "MultiTabLocalStore")
@js.native
class MultiTabLocalStore protected () extends LocalStore {
  def this(persistence: IndexedDbPersistence, queryEngine: QueryEngine, initialUser: User) = this()
  @JSName("mutationQueue")
  var mutationQueue_MultiTabLocalStore: IndexedDbMutationQueue = js.native
  @JSName("persistence")
  var persistence_MultiTabLocalStore: IndexedDbPersistence = js.native
  @JSName("remoteDocuments")
  var remoteDocuments_MultiTabLocalStore: IndexedDbRemoteDocumentCache = js.native
  @JSName("targetCache")
  var targetCache_MultiTabLocalStore: IndexedDbTargetCache = js.native
  def getActiveClients(): js.Promise[js.Array[ClientId]] = js.native
  /**
    * Returns the set of documents that have been updated since the last call.
    * If this is the first call, returns the set of changes since client
    * initialization. Further invocations will return document changes since
    * the point of rejection.
    */
  def getNewDocumentChanges(): js.Promise[MaybeDocumentMap_] = js.native
  def getTarget(targetId: TargetId): js.Promise[Target | Null] = js.native
  /** Returns the local view of the documents affected by a mutation batch. */
  def lookupMutationDocuments(batchId: BatchId): js.Promise[MaybeDocumentMap_ | Null] = js.native
  def removeCachedMutationBatchMetadata(batchId: BatchId): Unit = js.native
  def setNetworkEnabled(networkEnabled: Boolean): Unit = js.native
  /**
    * Reads the newest document change from persistence and forwards the internal
    * synchronization marker so that calls to `getNewDocumentChanges()`
    * only return changes that happened after client initialization.
    */
  def synchronizeLastDocumentChangeReadTime(): js.Promise[Unit] = js.native
}

