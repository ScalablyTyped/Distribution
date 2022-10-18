package typings.firebaseFirestore

import typings.firebaseFirestore.anon.SynchronizeTabs
import typings.firebaseFirestore.distPackagesFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreListenSequenceMod.SequenceNumberSyncer
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.BatchId
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbPersistenceMod.IndexedDbPersistence
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalLocalSerializerMod.LocalSerializer
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalLruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalMemoryPersistenceMod.MemoryPersistence
import typings.firebaseFirestore.distPackagesFirestoreSrcLocalSharedClientStateMod.ClientId
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilTypesMod.WindowLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreTestUnitLocalPersistenceTestHelpersMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/persistence_test_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/persistence_test_helpers", "INDEXEDDB_TEST_DATABASE_NAME")
  @js.native
  val INDEXEDDB_TEST_DATABASE_NAME: String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/persistence_test_helpers", "JSON_SERIALIZER")
  @js.native
  val JSON_SERIALIZER: JsonProtoSerializer = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/persistence_test_helpers", "MOCK_SEQUENCE_NUMBER_SYNCER")
  @js.native
  val MOCK_SEQUENCE_NUMBER_SYNCER: SequenceNumberSyncer = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_APP_ID")
  @js.native
  val TEST_APP_ID: /* "test-app-id" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_DATABASE_ID")
  @js.native
  val TEST_DATABASE_ID: DatabaseId = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_PERSISTENCE_KEY")
  @js.native
  val TEST_PERSISTENCE_KEY: /* "[PersistenceTestHelpers]" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_PERSISTENCE_PREFIX")
  @js.native
  val TEST_PERSISTENCE_PREFIX: String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_PROJECT")
  @js.native
  val TEST_PROJECT: /* "test-project" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_SERIALIZER")
  @js.native
  val TEST_SERIALIZER: LocalSerializer = js.native
  
  inline def clearTestPersistence(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTestPersistence")().asInstanceOf[js.Promise[Unit]]
  
  inline def populateWebStorage(
    user: User,
    window: WindowLike,
    existingClientId: ClientId,
    existingMutationBatchIds: js.Array[BatchId],
    existingQueryTargetIds: js.Array[TargetId]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("populateWebStorage")(user.asInstanceOf[js.Any], window.asInstanceOf[js.Any], existingClientId.asInstanceOf[js.Any], existingMutationBatchIds.asInstanceOf[js.Any], existingQueryTargetIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def testIndexedDbPersistence(): js.Promise[IndexedDbPersistence] = ^.asInstanceOf[js.Dynamic].applyDynamic("testIndexedDbPersistence")().asInstanceOf[js.Promise[IndexedDbPersistence]]
  inline def testIndexedDbPersistence(options: Unit, lruParams: LruParams): js.Promise[IndexedDbPersistence] = (^.asInstanceOf[js.Dynamic].applyDynamic("testIndexedDbPersistence")(options.asInstanceOf[js.Any], lruParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IndexedDbPersistence]]
  inline def testIndexedDbPersistence(options: SynchronizeTabs): js.Promise[IndexedDbPersistence] = ^.asInstanceOf[js.Dynamic].applyDynamic("testIndexedDbPersistence")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IndexedDbPersistence]]
  inline def testIndexedDbPersistence(options: SynchronizeTabs, lruParams: LruParams): js.Promise[IndexedDbPersistence] = (^.asInstanceOf[js.Dynamic].applyDynamic("testIndexedDbPersistence")(options.asInstanceOf[js.Any], lruParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IndexedDbPersistence]]
  
  inline def testMemoryEagerPersistence(): js.Promise[MemoryPersistence] = ^.asInstanceOf[js.Dynamic].applyDynamic("testMemoryEagerPersistence")().asInstanceOf[js.Promise[MemoryPersistence]]
  
  inline def testMemoryLruPersistence(): js.Promise[MemoryPersistence] = ^.asInstanceOf[js.Dynamic].applyDynamic("testMemoryLruPersistence")().asInstanceOf[js.Promise[MemoryPersistence]]
  inline def testMemoryLruPersistence(params: LruParams): js.Promise[MemoryPersistence] = ^.asInstanceOf[js.Dynamic].applyDynamic("testMemoryLruPersistence")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MemoryPersistence]]
}
