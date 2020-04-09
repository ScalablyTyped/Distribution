package typings.firebaseFirestore.localMemoryPersistenceMod

import typings.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.localReferenceSetMod.ReferenceSet
import typings.firebaseFirestore.localTargetDataMod.TargetData
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.MaybeDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/memory_persistence", "MemoryEagerDelegate")
@js.native
class MemoryEagerDelegate protected () extends MemoryReferenceDelegate {
  def this(persistence: MemoryPersistence) = this()
  var _orphanedDocuments: js.Any = js.native
  var inMemoryPins: js.Any = js.native
  var isReferenced: js.Any = js.native
  val persistence: js.Any = js.native
  /** Notify the delegate that the given document was added to a target. */
  /* CompleteClass */
  override def addReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  /* CompleteClass */
  override def documentSize(doc: MaybeDocument): Double = js.native
  /* CompleteClass */
  override def onTransactionCommitted(txn: PersistenceTransaction): PersistencePromise[Unit] = js.native
  /* CompleteClass */
  override def onTransactionStarted(): Unit = js.native
  /* private */ def orphanedDocuments(): js.Any = js.native
  /** Notify the delegate that a document is no longer being mutated by the user. */
  /* CompleteClass */
  override def removeMutationReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
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
    * Registers a ReferenceSet of documents that should be considered 'referenced' and not eligible
    * for removal during garbage collection.
    */
  /* CompleteClass */
  override def setInMemoryPins(pins: ReferenceSet): Unit = js.native
  /** Notify the delegate that a limbo document was updated. */
  /* CompleteClass */
  override def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
}

