package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ChangedEvent represents a change to an object, typically a GraphObject,
  * but also for model data, a Model, or a Diagram.
  * The most common case is for remembering the name of a property
  * and the before-and-after values for that property.
  * You can listen for changed events on the model using Model.addChangedListener
  * and on the Diagram using Diagram.addChangedListener.
  */
@JSGlobal("go.ChangedEvent")
@js.native
/**
  * The ChangedEvent class constructor produces an empty ChangedEvent object.
  */
open class ChangedEvent ()
  extends typings.go.mod.ChangedEvent
object ChangedEvent {
  
  @JSGlobal("go.ChangedEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /**For inserting into collections, and used as the value for ChangedEvent.change.*/
  /* static member */
  @JSGlobal("go.ChangedEvent.Insert")
  @js.native
  def Insert: typings.go.mod.EnumValue = js.native
  inline def Insert_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Insert")(x.asInstanceOf[js.Any])
  
  /**For simple property changes, and used as the value for ChangedEvent.change.*/
  /* static member */
  @JSGlobal("go.ChangedEvent.Property")
  @js.native
  def Property: typings.go.mod.EnumValue = js.native
  inline def Property_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Property")(x.asInstanceOf[js.Any])
  
  /**For removing from collections, and used as the value for ChangedEvent.change.*/
  /* static member */
  @JSGlobal("go.ChangedEvent.Remove")
  @js.native
  def Remove: typings.go.mod.EnumValue = js.native
  inline def Remove_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Remove")(x.asInstanceOf[js.Any])
  
  /**For informational events, such as transactions and undo/redo operations, and used as the value for ChangedEvent.change.*/
  /* static member */
  @JSGlobal("go.ChangedEvent.Transaction")
  @js.native
  def Transaction: typings.go.mod.EnumValue = js.native
  inline def Transaction_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transaction")(x.asInstanceOf[js.Any])
}
