package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Transaction holds a list of ChangedEvents collected during a transaction,
  * as the value of the read-only .changes property.
  */
@JSImport("go", "UndoManager")
@js.native
/**
  * The constructor produces an empty UndoManager with no transaction history.
  */
class UndoManager () extends StObject {
  
  /**
    * Make sure this UndoManager knows about a Model for which it may receive ChangedEvents when the given Model is changed.
    * @param {Model} model
    */
  def addModel(model: Model): Unit = js.native
  
  /**
    * This predicate returns true if you can call .redo.
    */
  def canRedo(): Boolean = js.native
  
  /**
    * This predicate returns true if you can call .undo.
    */
  def canUndo(): Boolean = js.native
  
  /**
    * Clear all of the Transactions and clear all other state, including any ongoing transaction without rolling back.
    */
  def clear(): Unit = js.native
  
  /**
    * Commit the current transaction started by a call to .startTransaction.
    * For convenience, this method is called by Model.commitTransaction and Diagram.commitTransaction.
    * If this call stops a top-level transaction,
    * we mark the .currentTransaction as complete (Transaction.isComplete),
    * we add the Transaction to the .history list,
    * and we return true.
    * Committing a transaction when there have been some undos without corresponding
    * redos will throw away the Transactions holding changes that happened
    * after the current state, before adding the new Transaction to the
    * .history list.
    * @param {string=} tname a short string describing the transaction, defaulting to the name given at the call to startTransaction
    */
  def commitTransaction(): Boolean = js.native
  def commitTransaction(tname: String): Boolean = js.native
  
  /**This read-only property returns the current Transaction for recording additional model change events.*/
  var currentTransaction: Transaction = js.native
  
  /**
    * Maybe record a ChangedEvent in the .currentTransaction.
    * This calls .skipsEvent to see if this should ignore the change.
    * If .skipsEvent returns false, this creates a copy of the ChangedEvent
    * and adds it to the .currentTransaction.
    * If there is no .currentTransaction, this first creates and remembers it.
    * This method always ignores all changes while performing
    * an .undo or .redo.
    * This method is also a no-op if .isEnabled is false.
    * @param {ChangedEvent} e a ChangedEvent.
    */
  def handleChanged(e: ChangedEvent): Unit = js.native
  
  /**This read-only property returns the index into .history for the current undoable Transaction.*/
  var hisotryIndex: Double = js.native
  
  /**This read-only property returns the whole history, a list of all of the Transactions, each representing a transaction with some number of ChangedEvents.*/
  var history: List[Transaction] = js.native
  
  /**Gets or sets whether this UndoManager records any changes.*/
  var isEnabled: Boolean = js.native
  
  /**This property is true after the first call to .startTransaction and before a corresponding call to .commitTransaction or .rollbackTransaction.*/
  var isInTransaction: Boolean = js.native
  
  /**This property is true during a call to .undo or .redo.*/
  var isUndoingRedoing: Boolean = js.native
  
  /**Gets or sets the maximum number of transactions that this undo manager will remember.*/
  var maxHistoryLength: Double = js.native
  
  /**This read-only property returns an iterator for all of the Models that this UndoManager is handling.*/
  var models: Iterator[Model] = js.native
  
  /**This read-only property returns a stack of ongoing transaction names.*/
  var nestedTransactionNames: List[String] = js.native
  
  /**
    * Re-perform this object change after an .undo.
    */
  def redo(): Unit = js.native
  
  /**
    * Inform this UndoManager that it will no longer be receiving ChangedEvents
    * when the given Model is changed.
    * The model will no longer receive notifications about transactions and undo or redo operations.
    * You should not call this method during a transaction.
    * If you call this method between transactions when there is a transaction history,
    * you should be careful that there are no ChangedEvents referring to that model in any Transactions.
    * @param {Model} model A Model that this UndoManager should no longer manage.
    */
  def removeModel(model: Model): Unit = js.native
  
  /**
    * Rollback the current transaction started by a call to .startTransaction, undoing any changes.
    */
  def rollbackTransaction(): Boolean = js.native
  
  /**
    * This predicate is called by .handleChanged to decide if a ChangedEvent
    * is not interesting enough to be remembered.
    * Transactional events (of change type ChangedEvent.Transaction) are always skipped.
    * Changed events for GraphObjects that are in Layer.isTemporary layers are also skipped.
    * Sometimes changed events do not even get to .handleChanged because
    * Model.skipsUndoManager or Diagram.skipsUndoManager is true.
    * @param {ChangedEvent} e the ChangedEvent received by .handleChanged.
    */
  def skipsEvent(e: ChangedEvent): Boolean = js.native
  
  /**
    * Begin a transaction, where the changes are held by a Transaction object
    * as the value of .currentTransaction.
    * You must call either .commitTransaction or .rollbackTransaction afterwards.
    * For convenience, this method is called by Model.startTransaction and Diagram.startTransaction.
    * Transactions can be nested.
    * Starting or ending a nested transaction will return false.
    * Nested transactions will share the same Transaction list of ChangedEvents.
    * Starting a transaction will not necessarily cause .currentTransaction to be non-null.
    * A Transaction object is usually only created by .handleChanged when a ChangedEvent first occurs.
    * @param {string=} tname a short string describing the transaction.
    */
  def startTransaction(): Boolean = js.native
  def startTransaction(tname: String): Boolean = js.native
  
  /**This read-only property returns the current transaction level.*/
  var transactionLevel: Double = js.native
  
  /**This read-only property returns the Transaction in the .history to be redone next.*/
  var transactionToRedo: Transaction = js.native
  
  /**This read-only property returns the Transaction in the .history to be undone next.*/
  var transactionToUndo: Transaction = js.native
  
  /**
    * Reverse the effects of this object change.
    */
  def undo(): Unit = js.native
}
