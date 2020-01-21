package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ChangedEvent represents a change to an object, typically a GraphObject,
  * but also for model data, a Model, or a Diagram.
  * The most common case is for remembering the name of a property
  * and the before-and-after values for that property.
  * You can listen for changed events on the model using Model.addChangedListener
  * and on the Diagram using Diagram.addChangedListener.
  */
@JSImport("go", "ChangedEvent")
@js.native
/**
  * The ChangedEvent class constructor produces an empty ChangedEvent object.
  */
class ChangedEvent () extends js.Object {
  /**Gets or sets the nature of change that occurred.*/
  var change: EnumValue = js.native
  /**Gets or sets the Diagram that was modified.*/
  var diagram: Diagram = js.native
  /**This read-only property is true when this ChangeEvent is of type ChangedEvent.Transaction and represents the end of a transactional change.*/
  var isTransactionFinished: Boolean = js.native
  /**Gets or sets the Model or TreeModel or GraphLinksModel that was modified.*/
  var model: Model = js.native
  /**This read-only property returns the name of the model change, reflecting a change to model data in addition to a change to the model itself.*/
  var modelChange: String = js.native
  /**Gets or sets an optional value associated with the new value.*/
  var newParam: js.Any = js.native
  /**Gets or sets the next or current value that the property has.*/
  var newValue: js.Any = js.native
  /**Gets or sets the Object that was modified.*/
  var `object`: js.Any = js.native
  /**Gets or sets an optional value associated with the old value.*/
  var oldParam: js.Any = js.native
  /**Gets or sets the previous or old value that the property had.*/
  var oldValue: js.Any = js.native
  /**Gets or sets the name of the property change.*/
  var propertyName: PropertyAccessor = js.native
  /**
    * This predicate returns true if you can call redo().
    */
  def canRedo(): Boolean = js.native
  /**
    * This predicate returns true if you can call undo().
    */
  def canUndo(): Boolean = js.native
  /**
    * Forget any object references that this ChangedEvent may have.
    */
  def clear(): Unit = js.native
  /**
    * Make a copy of this ChangedEvent.
    */
  def copy(): ChangedEvent = js.native
  /**
    * This is a convenient method to get the right parameter value, depending on the value of undo,
    * when implementing a state change as part of an undo or a redo.
    * @param {boolean} undo If true, returns the oldParam, otherwise returns the newParam.
    */
  def getParam(undo: Boolean): js.Any = js.native
  /**
    * This is a convenient method to get the right value, depending on the value of undo,
    * when implementing a state change as part of an undo or a redo.
    * @param {boolean} undo If true, returns the oldValue, otherwise returns the newValue.
    */
  def getValue(undo: Boolean): js.Any = js.native
  /**
    * Re-perform this object change after an undo().
    */
  def redo(): Unit = js.native
  /**
    * Reverse the effects of this object change.
    */
  def undo(): Unit = js.native
}

/* static members */
@JSImport("go", "ChangedEvent")
@js.native
object ChangedEvent extends js.Object {
  /**For inserting into collections, and used as the value for ChangedEvent.change.*/
  var Insert: EnumValue = js.native
  /**For simple property changes, and used as the value for ChangedEvent.change.*/
  var Property: EnumValue = js.native
  /**For removing from collections, and used as the value for ChangedEvent.change.*/
  var Remove: EnumValue = js.native
  /**For informational events, such as transactions and undo/redo operations, and used as the value for ChangedEvent.change.*/
  var Transaction: EnumValue = js.native
}

