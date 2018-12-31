package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Transaction holds a list of ChangedEvents collected during a transaction,
  * as the value of the read-only .changes property.
  */
@JSImport("go", "Transaction")
@js.native
/**
  * Construct an object holding an empty list of ChangedEvents and no .name.
  */
class Transaction ()
  extends goLib.goMod.goNs.Transaction {
  /**This read-only property returns the list of ChangedEvents.*/
  /* CompleteClass */
  override var changes: goLib.goMod.goNs.List[goLib.goMod.goNs.ChangedEvent] = js.native
  /**Gets or sets whether we can add more ChangedEvents to this list of changes.*/
  /* CompleteClass */
  override var isComplete: scala.Boolean = js.native
  /**Gets or sets the transaction name for this collection of changes.*/
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * This predicate returns true if you can call .redo, namely when .isComplete is true.
    */
  /* CompleteClass */
  override def canRedo(): scala.Boolean = js.native
  /**
    * This predicate returns true if you can call .undo, namely when .isComplete is true.
    */
  /* CompleteClass */
  override def canUndo(): scala.Boolean = js.native
  /**
    * Clear all of the saved changes.
    */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /**
    * Re-perform these changes after an .undo.
    */
  /* CompleteClass */
  override def redo(): scala.Unit = js.native
  /**
    * Undo all of the changes, in reverse order.
    */
  /* CompleteClass */
  override def undo(): scala.Unit = js.native
}

