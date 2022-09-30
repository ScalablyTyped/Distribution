package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Transaction holds a list of ChangedEvents collected during a transaction,
  * as the value of the read-only .changes property.
  */
@JSImport("go", "Transaction")
@js.native
/**
  * Construct an object holding an empty list of ChangedEvents and no .name.
  */
open class Transaction () extends StObject {
  
  /**
    * This predicate returns true if you can call .redo, namely when .isComplete is true.
    */
  def canRedo(): Boolean = js.native
  
  /**
    * This predicate returns true if you can call .undo, namely when .isComplete is true.
    */
  def canUndo(): Boolean = js.native
  
  /**This read-only property returns the list of ChangedEvents.*/
  var changes: typings.go.mod.List[ChangedEvent] = js.native
  
  /**
    * Clear all of the saved changes.
    */
  def clear(): Unit = js.native
  
  /**Gets or sets whether we can add more ChangedEvents to this list of changes.*/
  var isComplete: Boolean = js.native
  
  /**Gets or sets the transaction name for this collection of changes.*/
  var name: String = js.native
  
  /**
    * Re-perform these changes after an .undo.
    */
  def redo(): Unit = js.native
  
  /**
    * Undo all of the changes, in reverse order.
    */
  def undo(): Unit = js.native
}
