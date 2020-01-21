package typings.firebaseFirestore

import typings.firebaseFirestore.authUserMod.User
import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.coreListenSequenceMod.SequenceNumberSyncer
import typings.firebaseFirestore.coreTypesMod.BatchId
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.localIndexeddbPersistenceMod.IndexedDbPersistence
import typings.firebaseFirestore.localLocalSerializerMod.LocalSerializer
import typings.firebaseFirestore.localLruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.localMemoryPersistenceMod.MemoryPersistence
import typings.firebaseFirestore.localSharedClientStateMod.ClientId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/persistence_test_helpers", JSImport.Namespace)
@js.native
object localPersistenceTestHelpersMod extends js.Object {
  val INDEXEDDB_TEST_DATABASE_NAME: String = js.native
  val MOCK_SEQUENCE_NUMBER_SYNCER: SequenceNumberSyncer = js.native
  val TEST_DATABASE_ID: DatabaseId = js.native
  val TEST_PERSISTENCE_PREFIX: String = js.native
  val TEST_SERIALIZER: LocalSerializer = js.native
  def clearTestPersistence(): js.Promise[Unit] = js.native
  def clearWebStorage(): Unit = js.native
  def populateWebStorage(
    user: User,
    existingClientId: ClientId,
    existingMutationBatchIds: js.Array[BatchId],
    existingQueryTargetIds: js.Array[TargetId]
  ): js.Promise[Unit] = js.native
  def testIndexedDbPersistence(): js.Promise[IndexedDbPersistence] = js.native
  def testIndexedDbPersistence(options: AnonDontPurgeDataQueue): js.Promise[IndexedDbPersistence] = js.native
  def testIndexedDbPersistence(options: AnonDontPurgeDataQueue, lruParams: LruParams): js.Promise[IndexedDbPersistence] = js.native
  def testMemoryEagerPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(params: LruParams): js.Promise[MemoryPersistence] = js.native
}

