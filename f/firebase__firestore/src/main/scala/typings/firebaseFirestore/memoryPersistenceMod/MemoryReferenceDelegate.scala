package typings.firebaseFirestore.memoryPersistenceMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.persistenceMod.PersistenceTransaction
import typings.firebaseFirestore.persistenceMod.ReferenceDelegate
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.targetDataMod.TargetData
import typings.firebaseFirestore.typesMod.TargetId
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
    addReference: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit],
    documentSize: MaybeDocument => Double,
    markPotentiallyOrphaned: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    onTransactionCommitted: PersistenceTransaction => PersistencePromise[Unit],
    onTransactionStarted: () => Unit,
    removeReference: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit],
    removeTarget: (PersistenceTransaction, TargetData) => PersistencePromise[Unit],
    updateLimboDocument: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]
  ): MemoryReferenceDelegate = {
    val __obj = js.Dynamic.literal(addReference = js.Any.fromFunction3(addReference), documentSize = js.Any.fromFunction1(documentSize), markPotentiallyOrphaned = js.Any.fromFunction2(markPotentiallyOrphaned), onTransactionCommitted = js.Any.fromFunction1(onTransactionCommitted), onTransactionStarted = js.Any.fromFunction0(onTransactionStarted), removeReference = js.Any.fromFunction3(removeReference), removeTarget = js.Any.fromFunction2(removeTarget), updateLimboDocument = js.Any.fromFunction2(updateLimboDocument))
    __obj.asInstanceOf[MemoryReferenceDelegate]
  }
}

