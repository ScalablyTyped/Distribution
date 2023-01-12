package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ReferenceDelegate instance handles all of the hooks into the document-reference lifecycle. This
  * includes being added to a target, being removed from a target, being subject to mutation, and
  * being mutated by the user.
  *
  * Different implementations may do different things with each of these events. Not every
  * implementation needs to do something with every lifecycle hook.
  *
  * PORTING NOTE: since sequence numbers are attached to transactions in this
  * client, the ReferenceDelegate does not need to deal in transactional
  * semantics (onTransactionStarted/Committed()), nor does it need to track and
  * generate sequence numbers (getCurrentSequenceNumber()).
  */
trait ReferenceDelegate extends StObject {
  
  /** Notify the delegate that the given document was added to a target. */
  def addReference(
    txn: PersistenceTransaction,
    targetId: TargetId,
    doc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any
  ): PersistencePromise[Unit]
  
  /**
    * Notify the delegate that a document may no longer be part of any views or
    * have any mutations associated.
    */
  def markPotentiallyOrphaned(
    txn: PersistenceTransaction,
    doc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any
  ): PersistencePromise[Unit]
  
  /** Notify the delegate that the given document was removed from a target. */
  def removeReference(
    txn: PersistenceTransaction,
    targetId: TargetId,
    doc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any
  ): PersistencePromise[Unit]
  
  /**
    * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
    * actually delete the target and associated data.
    */
  def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit]
  
  /** Notify the delegate that a limbo document was updated. */
  def updateLimboDocument(
    txn: PersistenceTransaction,
    doc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any
  ): PersistencePromise[Unit]
}
object ReferenceDelegate {
  
  inline def apply(
    addReference: (PersistenceTransaction, TargetId, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[Unit],
    markPotentiallyOrphaned: (PersistenceTransaction, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[Unit],
    removeReference: (PersistenceTransaction, TargetId, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[Unit],
    removeTarget: (PersistenceTransaction, TargetData) => PersistencePromise[Unit],
    updateLimboDocument: (PersistenceTransaction, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[Unit]
  ): ReferenceDelegate = {
    val __obj = js.Dynamic.literal(addReference = js.Any.fromFunction3(addReference), markPotentiallyOrphaned = js.Any.fromFunction2(markPotentiallyOrphaned), removeReference = js.Any.fromFunction3(removeReference), removeTarget = js.Any.fromFunction2(removeTarget), updateLimboDocument = js.Any.fromFunction2(updateLimboDocument))
    __obj.asInstanceOf[ReferenceDelegate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceDelegate] (val x: Self) extends AnyVal {
    
    inline def setAddReference(
      value: (PersistenceTransaction, TargetId, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[Unit]
    ): Self = StObject.set(x, "addReference", js.Any.fromFunction3(value))
    
    inline def setMarkPotentiallyOrphaned(
      value: (PersistenceTransaction, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[Unit]
    ): Self = StObject.set(x, "markPotentiallyOrphaned", js.Any.fromFunction2(value))
    
    inline def setRemoveReference(
      value: (PersistenceTransaction, TargetId, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[Unit]
    ): Self = StObject.set(x, "removeReference", js.Any.fromFunction3(value))
    
    inline def setRemoveTarget(value: (PersistenceTransaction, TargetData) => PersistencePromise[Unit]): Self = StObject.set(x, "removeTarget", js.Any.fromFunction2(value))
    
    inline def setUpdateLimboDocument(
      value: (PersistenceTransaction, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[Unit]
    ): Self = StObject.set(x, "updateLimboDocument", js.Any.fromFunction2(value))
  }
}
