package typings.firebaseFirestore

import typings.firebaseFirestore.anon.DontPurgeData
import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.indexeddbPersistenceMod.IndexedDbPersistence
import typings.firebaseFirestore.listenSequenceMod.SequenceNumberSyncer
import typings.firebaseFirestore.localSerializerMod.LocalSerializer
import typings.firebaseFirestore.lruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.memoryPersistenceMod.MemoryPersistence
import typings.firebaseFirestore.sharedClientStateMod.ClientId
import typings.firebaseFirestore.typesMod.BatchId
import typings.firebaseFirestore.typesMod.TargetId
import typings.firebaseFirestore.userMod.User
import typings.firebaseFirestore.utilTypesMod.WindowLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/persistence_test_helpers", JSImport.Namespace)
@js.native
object persistenceTestHelpersMod extends js.Object {
  val INDEXEDDB_TEST_DATABASE_NAME: String = js.native
  val MOCK_SEQUENCE_NUMBER_SYNCER: SequenceNumberSyncer = js.native
  val TEST_DATABASE_ID: DatabaseId = js.native
  val TEST_PERSISTENCE_KEY: /* "[PersistenceTestHelpers]" */ String = js.native
  val TEST_PERSISTENCE_PREFIX: String = js.native
  val TEST_SERIALIZER: LocalSerializer = js.native
  def clearTestPersistence(): js.Promise[Unit] = js.native
  def populateWebStorage(
    user: User,
    window: WindowLike,
    existingClientId: ClientId,
    existingMutationBatchIds: js.Array[BatchId],
    existingQueryTargetIds: js.Array[TargetId]
  ): js.Promise[Unit] = js.native
  def testIndexedDbPersistence(): js.Promise[IndexedDbPersistence] = js.native
  def testIndexedDbPersistence(options: DontPurgeData): js.Promise[IndexedDbPersistence] = js.native
  def testIndexedDbPersistence(options: DontPurgeData, lruParams: LruParams): js.Promise[IndexedDbPersistence] = js.native
  def testMemoryEagerPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(params: LruParams): js.Promise[MemoryPersistence] = js.native
}

