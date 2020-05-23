package typings.firebaseFirestore.memoryPersistenceMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.targetDataMod.TargetData
import typings.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/memory_persistence", "MemoryEagerDelegate")
@js.native
class MemoryEagerDelegate protected () extends MemoryReferenceDelegate {
  /** The list of documents that are potentially GCed after each transaction. */
  var _orphanedDocuments: js.Any = js.native
  var isReferenced: js.Any = js.native
  /** Tracks all documents that are active in Query views. */
  var localViewReferences: js.Any = js.native
  val persistence: js.Any = js.native
  /** Notify the delegate that the given document was added to a target. */
  /* CompleteClass */
  override def addReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit] = js.native
  /* CompleteClass */
  override def documentSize(doc: MaybeDocument): Double = js.native
  /**
    * Notify the delegate that a document may no longer be part of any views or
    * have any mutations associated.
    */
  /* CompleteClass */
  override def markPotentiallyOrphaned(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  /* CompleteClass */
  override def onTransactionCommitted(txn: PersistenceTransaction): PersistencePromise[Unit] = js.native
  /* CompleteClass */
  override def onTransactionStarted(): Unit = js.native
  /* private */ def orphanedDocuments: js.Any = js.native
  /** Notify the delegate that the given document was removed from a target. */
  /* CompleteClass */
  override def removeReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit] = js.native
  /**
    * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
    * actually delete the target and associated data.
    */
  /* CompleteClass */
  override def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit] = js.native
  /** Notify the delegate that a limbo document was updated. */
  /* CompleteClass */
  override def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/src/local/memory_persistence", "MemoryEagerDelegate")
@js.native
object MemoryEagerDelegate extends js.Object {
  def factory(persistence: MemoryPersistence): MemoryEagerDelegate = js.native
}

