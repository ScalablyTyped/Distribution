package typings.firebaseFirestore.lruGarbageCollectorMod

import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.targetDataMod.TargetData
import typings.firebaseFirestore.typesMod.ListenSequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LruDelegate extends js.Object {
  val garbageCollector: LruGarbageCollector
  /**
    * Enumerates sequence numbers for documents not associated with a target.
    * Note that this may include duplicate sequence numbers.
    */
  def forEachOrphanedDocumentSequenceNumber(txn: PersistenceTransaction, f: js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]): PersistencePromise[Unit]
  /** Enumerates all the targets in the TargetCache. */
  def forEachTarget(txn: PersistenceTransaction, f: js.Function1[/* target */ TargetData, Unit]): PersistencePromise[Unit]
  def getCacheSize(txn: PersistenceTransaction): PersistencePromise[Double]
  def getSequenceNumberCount(txn: PersistenceTransaction): PersistencePromise[Double]
  /**
    * Removes all unreferenced documents from the cache that have a sequence number less than or
    * equal to the given `upperBound`.
    *
    * @return the number of documents removed.
    */
  def removeOrphanedDocuments(txn: PersistenceTransaction, upperBound: ListenSequenceNumber): PersistencePromise[Double]
  /**
    * Removes all targets that have a sequence number less than or equal to `upperBound`, and are not
    * present in the `activeTargetIds` set.
    *
    * @return the number of targets removed.
    */
  def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double]
}

object LruDelegate {
  @scala.inline
  def apply(
    forEachOrphanedDocumentSequenceNumber: (PersistenceTransaction, js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) => PersistencePromise[Unit],
    forEachTarget: (PersistenceTransaction, js.Function1[/* target */ TargetData, Unit]) => PersistencePromise[Unit],
    garbageCollector: LruGarbageCollector,
    getCacheSize: PersistenceTransaction => PersistencePromise[Double],
    getSequenceNumberCount: PersistenceTransaction => PersistencePromise[Double],
    removeOrphanedDocuments: (PersistenceTransaction, ListenSequenceNumber) => PersistencePromise[Double],
    removeTargets: (PersistenceTransaction, ListenSequenceNumber, ActiveTargets) => PersistencePromise[Double]
  ): LruDelegate = {
    val __obj = js.Dynamic.literal(forEachOrphanedDocumentSequenceNumber = js.Any.fromFunction2(forEachOrphanedDocumentSequenceNumber), forEachTarget = js.Any.fromFunction2(forEachTarget), garbageCollector = garbageCollector.asInstanceOf[js.Any], getCacheSize = js.Any.fromFunction1(getCacheSize), getSequenceNumberCount = js.Any.fromFunction1(getSequenceNumberCount), removeOrphanedDocuments = js.Any.fromFunction2(removeOrphanedDocuments), removeTargets = js.Any.fromFunction3(removeTargets))
  
    __obj.asInstanceOf[LruDelegate]
  }
}

