package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcAuthUserMod.User
import typings.atFirebaseFirestore.distSrcCoreDatabaseUnderscoreInfoMod.DatabaseId
import typings.atFirebaseFirestore.distSrcCoreListenUnderscoreSequenceMod.SequenceNumberSyncer
import typings.atFirebaseFirestore.distSrcCoreTypesMod.BatchId
import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import typings.atFirebaseFirestore.distSrcLocalIndexeddbUnderscorePersistenceMod.IndexedDbPersistence
import typings.atFirebaseFirestore.distSrcLocalLocalUnderscoreSerializerMod.LocalSerializer
import typings.atFirebaseFirestore.distSrcLocalLruUnderscoreGarbageUnderscoreCollectorMod.LruParams
import typings.atFirebaseFirestore.distSrcLocalMemoryUnderscorePersistenceMod.MemoryPersistence
import typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateMod.ClientId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/persistence_test_helpers", JSImport.Namespace)
@js.native
object distTestUnitLocalPersistenceUnderscoreTestUnderscoreHelpersMod extends js.Object {
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
  def testIndexedDbPersistence(options: Anon_DontPurgeData): js.Promise[IndexedDbPersistence] = js.native
  def testIndexedDbPersistence(options: Anon_DontPurgeData, lruParams: LruParams): js.Promise[IndexedDbPersistence] = js.native
  def testMemoryEagerPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(params: LruParams): js.Promise[MemoryPersistence] = js.native
}

