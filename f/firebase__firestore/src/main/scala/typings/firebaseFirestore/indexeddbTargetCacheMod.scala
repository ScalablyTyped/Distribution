package typings.firebaseFirestore

import typings.firebaseFirestore.indexeddbPersistenceMod.IndexedDbLruDelegate
import typings.firebaseFirestore.indexeddbSchemaMod.DbTargetDocument
import typings.firebaseFirestore.indexeddbSchemaMod.DbTargetDocumentKey
import typings.firebaseFirestore.localSerializerMod.LocalSerializer
import typings.firebaseFirestore.lruGarbageCollectorMod.ActiveTargets
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.simpleDbMod.SimpleDbStore
import typings.firebaseFirestore.simpleDbMod.SimpleDbTransaction
import typings.firebaseFirestore.targetCacheMod.TargetCache
import typings.firebaseFirestore.targetDataMod.TargetData
import typings.firebaseFirestore.typesMod.ListenSequenceNumber
import typings.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_target_cache", JSImport.Namespace)
@js.native
object indexeddbTargetCacheMod extends js.Object {
  @js.native
  class IndexedDbTargetCache protected () extends TargetCache {
    def this(referenceDelegate: IndexedDbLruDelegate, serializer: LocalSerializer) = this()
    val referenceDelegate: js.Any = js.native
    var retrieveMetadata: js.Any = js.native
    var saveMetadata: js.Any = js.native
    var saveTargetData: js.Any = js.native
    var serializer: js.Any = js.native
    /**
      * In-place updates the provided metadata to account for values in the given
      * TargetData. Saving is done separately. Returns true if there were any
      * changes to the metadata.
      */
    var updateMetadataFromTargetData: js.Any = js.native
    /**
      * Looks up a TargetData entry by target ID.
      *
      * @param targetId The target ID of the TargetData entry to look up.
      * @return The cached TargetData entry, or null if the cache has no entry for
      * the target.
      */
    def getTargetDataForTarget(transaction: PersistenceTransaction, targetId: TargetId): PersistencePromise[TargetData | Null] = js.native
    /**
      * Drops any targets with sequence number less than or equal to the upper bound, excepting those
      * present in `activeTargetIds`. Document associations for the removed targets are also removed.
      * Returns the number of targets removed.
      */
    def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double] = js.native
  }
  
  def documentTargetStore(txn: PersistenceTransaction): SimpleDbStore[DbTargetDocumentKey, DbTargetDocument] = js.native
  def getHighestListenSequenceNumber(txn: SimpleDbTransaction): PersistencePromise[ListenSequenceNumber] = js.native
}

