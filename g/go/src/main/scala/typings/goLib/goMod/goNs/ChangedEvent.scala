package typings
package goLib.goMod.goNs

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
trait ChangedEvent extends js.Object {
  /**Gets or sets the nature of change that occurred.*/
  var change: EnumValue
  /**Gets or sets the Diagram that was modified.*/
  var diagram: Diagram
  /**This read-only property is true when this ChangeEvent is of type ChangedEvent.Transaction and represents the end of a transactional change.*/
  var isTransactionFinished: scala.Boolean
  /**Gets or sets the Model or TreeModel or GraphLinksModel that was modified.*/
  var model: Model
  /**This read-only property returns the name of the model change, reflecting a change to model data in addition to a change to the model itself.*/
  var modelChange: java.lang.String
  /**Gets or sets an optional value associated with the new value.*/
  var newParam: js.Any
  /**Gets or sets the next or current value that the property has.*/
  var newValue: js.Any
  /**Gets or sets the Object that was modified.*/
  var `object`: js.Any
  /**Gets or sets an optional value associated with the old value.*/
  var oldParam: js.Any
  /**Gets or sets the previous or old value that the property had.*/
  var oldValue: js.Any
  /**Gets or sets the name of the property change.*/
  var propertyName: PropertyAccessor
  /**
    * This predicate returns true if you can call redo().
    */
  def canRedo(): scala.Boolean
  /**
    * This predicate returns true if you can call undo().
    */
  def canUndo(): scala.Boolean
  /**
    * Forget any object references that this ChangedEvent may have.
    */
  def clear(): scala.Unit
  /**
    * Make a copy of this ChangedEvent.
    */
  def copy(): ChangedEvent
  /**
    * This is a convenient method to get the right parameter value, depending on the value of undo,
    * when implementing a state change as part of an undo or a redo.
    * @param {boolean} undo If true, returns the oldParam, otherwise returns the newParam.
    */
  def getParam(undo: scala.Boolean): js.Any
  /**
    * This is a convenient method to get the right value, depending on the value of undo,
    * when implementing a state change as part of an undo or a redo.
    * @param {boolean} undo If true, returns the oldValue, otherwise returns the newValue.
    */
  def getValue(undo: scala.Boolean): js.Any
  /**
    * Re-perform this object change after an undo().
    */
  def redo(): scala.Unit
  /**
    * Reverse the effects of this object change.
    */
  def undo(): scala.Unit
}

