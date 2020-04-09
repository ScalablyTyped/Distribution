package typings.firebaseFirestore.localMemoryPersistenceMod

import typings.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.localLruGarbageCollectorMod.ActiveTargets
import typings.firebaseFirestore.localLruGarbageCollectorMod.LruDelegate
import typings.firebaseFirestore.localLruGarbageCollectorMod.LruGarbageCollector
import typings.firebaseFirestore.localLruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typings.firebaseFirestore.localPersistenceMod.ReferenceDelegate
import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.localReferenceSetMod.ReferenceSet
import typings.firebaseFirestore.localTargetDataMod.TargetData
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.MaybeDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/memory_persistence", "MemoryLruDelegate")
@js.native
class MemoryLruDelegate protected ()
  extends ReferenceDelegate
     with LruDelegate {
  def this(persistence: MemoryPersistence, lruParams: LruParams) = this()
  /* CompleteClass */
  override val garbageCollector: LruGarbageCollector = js.native
  var inMemoryPins: js.Any = js.native
  var isPinned: js.Any = js.native
  var orphanedDocumentCount: js.Any = js.native
  var orphanedSequenceNumbers: js.Any = js.native
  val persistence: js.Any = js.native
  /** Notify the delegate that the given document was added to a target. */
  /* CompleteClass */
  override def addReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  def documentSize(maybeDoc: MaybeDocument): Double = js.native
  /**
    * Enumerates sequence numbers for documents not associated with a target.
    * Note that this may include duplicate sequence numbers.
    */
  /* CompleteClass */
  override def forEachOrphanedDocumentSequenceNumber(txn: PersistenceTransaction, f: js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]): PersistencePromise[Unit] = js.native
  /** Enumerates all the targets in the TargetCache. */
  /* CompleteClass */
  override def forEachTarget(txn: PersistenceTransaction, f: js.Function1[/* target */ TargetData, Unit]): PersistencePromise[Unit] = js.native
  /* CompleteClass */
  override def getCacheSize(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
  /* CompleteClass */
  override def getSequenceNumberCount(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
  def onTransactionCommitted(txn: PersistenceTransaction): PersistencePromise[Unit] = js.native
  def onTransactionStarted(): Unit = js.native
  /** Notify the delegate that a document is no longer being mutated by the user. */
  /* CompleteClass */
  override def removeMutationReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  /**
    * Removes all unreferenced documents from the cache that have a sequence number less than or
    * equal to the given `upperBound`.
    *
    * @return the number of documents removed.
    */
  /* CompleteClass */
  override def removeOrphanedDocuments(txn: PersistenceTransaction, upperBound: ListenSequenceNumber): PersistencePromise[Double] = js.native
  /** Notify the delegate that the given document was removed from a target. */
  /* CompleteClass */
  override def removeReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  /**
    * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
    * actually delete the target and associated data.
    */
  /* CompleteClass */
  override def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit] = js.native
  /**
    * Removes all targets that have a sequence number less than or equal to `upperBound`, and are not
    * present in the `activeTargetIds` set.
    *
    * @return the number of targets removed.
    */
  /* CompleteClass */
  override def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double] = js.native
  /**
    * Registers a ReferenceSet of documents that should be considered 'referenced' and not eligible
    * for removal during garbage collection.
    */
  /* CompleteClass */
  override def setInMemoryPins(pins: ReferenceSet): Unit = js.native
  /** Notify the delegate that a limbo document was updated. */
  /* CompleteClass */
  override def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
}

