package typings.firebaseFirestore.localLruGarbageCollectorMod

import typings.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/lru_garbage_collector", "LruGarbageCollector")
@js.native
class LruGarbageCollector protected () extends js.Object {
  def this(delegate: LruDelegate, params: LruParams) = this()
  val delegate: js.Any = js.native
  val params: LruParams = js.native
  var runGarbageCollection: js.Any = js.native
  /** Given a percentile of target to collect, returns the number of targets to collect. */
  def calculateTargetCount(txn: PersistenceTransaction, percentile: Double): PersistencePromise[Double] = js.native
  def collect(txn: PersistenceTransaction, activeTargetIds: ActiveTargets): PersistencePromise[LruResults] = js.native
  def getCacheSize(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
  /** Returns the nth sequence number, counting in order from the smallest. */
  def nthSequenceNumber(txn: PersistenceTransaction, n: Double): PersistencePromise[ListenSequenceNumber] = js.native
  /**
    * Removes documents that have a sequence number equal to or less than the upper bound and are not
    * otherwise pinned.
    */
  def removeOrphanedDocuments(txn: PersistenceTransaction, upperBound: ListenSequenceNumber): PersistencePromise[Double] = js.native
  /**
    * Removes targets with a sequence number equal to or less than the given upper bound, and removes
    * document associations with those targets.
    */
  def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double] = js.native
}

