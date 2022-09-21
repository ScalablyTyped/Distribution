package typings.firebaseFirestore

import typings.firebaseFirestore.anon.SchemaVersion
import typings.firebaseFirestore.firestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.firestoreSrcUtilTypesMod.WindowLike
import typings.firebaseFirestore.srcAuthUserMod.User
import typings.firebaseFirestore.srcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.srcCoreListenSequenceMod.SequenceNumberSyncer
import typings.firebaseFirestore.srcCoreTypesMod.BatchId
import typings.firebaseFirestore.srcCoreTypesMod.TargetId
import typings.firebaseFirestore.srcLocalIndexeddbPersistenceMod.IndexedDbPersistence
import typings.firebaseFirestore.srcLocalLocalSerializerMod.LocalSerializer
import typings.firebaseFirestore.srcLocalLruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.srcLocalMemoryPersistenceMod.MemoryPersistence
import typings.firebaseFirestore.srcLocalSharedClientStateMod.ClientId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitLocalPersistenceTestHelpersMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/persistence_test_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/persistence_test_helpers", "INDEXEDDB_TEST_DATABASE_NAME")
  @js.native
  val INDEXEDDB_TEST_DATABASE_NAME: String = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/persistence_test_helpers", "JSON_SERIALIZER")
  @js.native
  val JSON_SERIALIZER: JsonProtoSerializer = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/persistence_test_helpers", "MOCK_SEQUENCE_NUMBER_SYNCER")
  @js.native
  val MOCK_SEQUENCE_NUMBER_SYNCER: SequenceNumberSyncer = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_APP_ID")
  @js.native
  val TEST_APP_ID: /* "test-app-id" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_DATABASE_ID")
  @js.native
  val TEST_DATABASE_ID: DatabaseId = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_PERSISTENCE_KEY")
  @js.native
  val TEST_PERSISTENCE_KEY: /* "[PersistenceTestHelpers]" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_PERSISTENCE_PREFIX")
  @js.native
  val TEST_PERSISTENCE_PREFIX: String = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_PROJECT")
  @js.native
  val TEST_PROJECT: /* "test-project" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/persistence_test_helpers", "TEST_SERIALIZER")
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
  inline def testIndexedDbPersistence(options: SchemaVersion): js.Promise[IndexedDbPersistence] = ^.asInstanceOf[js.Dynamic].applyDynamic("testIndexedDbPersistence")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IndexedDbPersistence]]
  inline def testIndexedDbPersistence(options: SchemaVersion, lruParams: LruParams): js.Promise[IndexedDbPersistence] = (^.asInstanceOf[js.Dynamic].applyDynamic("testIndexedDbPersistence")(options.asInstanceOf[js.Any], lruParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IndexedDbPersistence]]
  
  inline def testMemoryEagerPersistence(): js.Promise[MemoryPersistence] = ^.asInstanceOf[js.Dynamic].applyDynamic("testMemoryEagerPersistence")().asInstanceOf[js.Promise[MemoryPersistence]]
  
  inline def testMemoryLruPersistence(): js.Promise[MemoryPersistence] = ^.asInstanceOf[js.Dynamic].applyDynamic("testMemoryLruPersistence")().asInstanceOf[js.Promise[MemoryPersistence]]
  inline def testMemoryLruPersistence(params: LruParams): js.Promise[MemoryPersistence] = ^.asInstanceOf[js.Dynamic].applyDynamic("testMemoryLruPersistence")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MemoryPersistence]]
}
