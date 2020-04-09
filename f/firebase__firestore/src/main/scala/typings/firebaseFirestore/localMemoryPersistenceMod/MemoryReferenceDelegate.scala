package typings.firebaseFirestore.localMemoryPersistenceMod

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

trait MemoryReferenceDelegate extends ReferenceDelegate {
  def documentSize(doc: MaybeDocument): Double
  def onTransactionCommitted(txn: PersistenceTransaction): PersistencePromise[Unit]
  def onTransactionStarted(): Unit
}

object MemoryReferenceDelegate {
  @scala.inline
  def apply(
    addReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    documentSize: MaybeDocument => Double,
    onTransactionCommitted: PersistenceTransaction => PersistencePromise[Unit],
    onTransactionStarted: () => Unit,
    removeMutationReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    removeReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    removeTarget: (PersistenceTransaction, TargetData) => PersistencePromise[Unit],
    setInMemoryPins: ReferenceSet => Unit,
    updateLimboDocument: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]
  ): MemoryReferenceDelegate = {
    val __obj = js.Dynamic.literal(addReference = js.Any.fromFunction2(addReference), documentSize = js.Any.fromFunction1(documentSize), onTransactionCommitted = js.Any.fromFunction1(onTransactionCommitted), onTransactionStarted = js.Any.fromFunction0(onTransactionStarted), removeMutationReference = js.Any.fromFunction2(removeMutationReference), removeReference = js.Any.fromFunction2(removeReference), removeTarget = js.Any.fromFunction2(removeTarget), setInMemoryPins = js.Any.fromFunction1(setInMemoryPins), updateLimboDocument = js.Any.fromFunction2(updateLimboDocument))
  
    __obj.asInstanceOf[MemoryReferenceDelegate]
  }
}

