package typings.firebaseFirestore.persistenceMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.referenceSetMod.ReferenceSet
import typings.firebaseFirestore.targetDataMod.TargetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceDelegate extends js.Object {
  /** Notify the delegate that the given document was added to a target. */
  def addReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
  /** Notify the delegate that a document is no longer being mutated by the user. */
  def removeMutationReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
  /** Notify the delegate that the given document was removed from a target. */
  def removeReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
  /**
    * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
    * actually delete the target and associated data.
    */
  def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit]
  /**
    * Registers a ReferenceSet of documents that should be considered 'referenced' and not eligible
    * for removal during garbage collection.
    */
  def setInMemoryPins(pins: ReferenceSet): Unit
  /** Notify the delegate that a limbo document was updated. */
  def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
}

object ReferenceDelegate {
  @scala.inline
  def apply(
    addReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    removeMutationReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    removeReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    removeTarget: (PersistenceTransaction, TargetData) => PersistencePromise[Unit],
    setInMemoryPins: ReferenceSet => Unit,
    updateLimboDocument: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]
  ): ReferenceDelegate = {
    val __obj = js.Dynamic.literal(addReference = js.Any.fromFunction2(addReference), removeMutationReference = js.Any.fromFunction2(removeMutationReference), removeReference = js.Any.fromFunction2(removeReference), removeTarget = js.Any.fromFunction2(removeTarget), setInMemoryPins = js.Any.fromFunction1(setInMemoryPins), updateLimboDocument = js.Any.fromFunction2(updateLimboDocument))
  
    __obj.asInstanceOf[ReferenceDelegate]
  }
}

