package typings.firebaseFirestore

import typings.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.localIndexeddbPersistenceMod.IndexedDbLruDelegate
import typings.firebaseFirestore.localIndexeddbSchemaMod.DbTargetDocument
import typings.firebaseFirestore.localIndexeddbSchemaMod.DbTargetDocumentKey
import typings.firebaseFirestore.localLocalSerializerMod.LocalSerializer
import typings.firebaseFirestore.localLruGarbageCollectorMod.ActiveTargets
import typings.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.localSimpleDbMod.SimpleDbStore
import typings.firebaseFirestore.localSimpleDbMod.SimpleDbTransaction
import typings.firebaseFirestore.localTargetCacheMod.TargetCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/indexeddb_target_cache", JSImport.Namespace)
@js.native
object localIndexeddbTargetCacheMod extends js.Object {
  @js.native
  class IndexedDbTargetCache protected () extends TargetCache {
    def this(referenceDelegate: IndexedDbLruDelegate, serializer: LocalSerializer) = this()
    val referenceDelegate: js.Any = js.native
    var retrieveMetadata: js.Any = js.native
    var saveMetadata: js.Any = js.native
    var saveTargetData: js.Any = js.native
    var serializer: js.Any = js.native
    var targetIdGenerator: js.Any = js.native
    /**
      * In-place updates the provided metadata to account for values in the given
      * TargetData. Saving is done separately. Returns true if there were any
      * changes to the metadata.
      */
    var updateMetadataFromTargetData: js.Any = js.native
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

