package typings.firebaseFirestore.persistenceMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typings.firebaseFirestore.targetDataMod.TargetData
import typings.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceDelegate extends js.Object {
  /** Notify the delegate that the given document was added to a target. */
  def addReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit]
  /**
    * Notify the delegate that a document may no longer be part of any views or
    * have any mutations associated.
    */
  def markPotentiallyOrphaned(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
  /** Notify the delegate that the given document was removed from a target. */
  def removeReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit]
  /**
    * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
    * actually delete the target and associated data.
    */
  def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit]
  /** Notify the delegate that a limbo document was updated. */
  def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
}

object ReferenceDelegate {
  @scala.inline
  def apply(
    addReference: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit],
    markPotentiallyOrphaned: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    removeReference: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit],
    removeTarget: (PersistenceTransaction, TargetData) => PersistencePromise[Unit],
    updateLimboDocument: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]
  ): ReferenceDelegate = {
    val __obj = js.Dynamic.literal(addReference = js.Any.fromFunction3(addReference), markPotentiallyOrphaned = js.Any.fromFunction2(markPotentiallyOrphaned), removeReference = js.Any.fromFunction3(removeReference), removeTarget = js.Any.fromFunction2(removeTarget), updateLimboDocument = js.Any.fromFunction2(updateLimboDocument))
    __obj.asInstanceOf[ReferenceDelegate]
  }
}

