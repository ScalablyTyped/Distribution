package typings
package goLib.goMod

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
class ChangedEvent ()
  extends goLib.goMod.goNs.ChangedEvent {
  /**Gets or sets the nature of change that occurred.*/
  /* CompleteClass */
  override var change: goLib.goMod.goNs.EnumValue = js.native
  /**Gets or sets the Diagram that was modified.*/
  /* CompleteClass */
  override var diagram: goLib.goMod.goNs.Diagram = js.native
  /**This read-only property is true when this ChangeEvent is of type ChangedEvent.Transaction and represents the end of a transactional change.*/
  /* CompleteClass */
  override var isTransactionFinished: scala.Boolean = js.native
  /**Gets or sets the Model or TreeModel or GraphLinksModel that was modified.*/
  /* CompleteClass */
  override var model: goLib.goMod.goNs.Model = js.native
  /**This read-only property returns the name of the model change, reflecting a change to model data in addition to a change to the model itself.*/
  /* CompleteClass */
  override var modelChange: java.lang.String = js.native
  /**Gets or sets an optional value associated with the new value.*/
  /* CompleteClass */
  override var newParam: js.Any = js.native
  /**Gets or sets the next or current value that the property has.*/
  /* CompleteClass */
  override var newValue: js.Any = js.native
  /**Gets or sets the Object that was modified.*/
  /* CompleteClass */
  override var `object`: js.Any = js.native
  /**Gets or sets an optional value associated with the old value.*/
  /* CompleteClass */
  override var oldParam: js.Any = js.native
  /**Gets or sets the previous or old value that the property had.*/
  /* CompleteClass */
  override var oldValue: js.Any = js.native
  /**Gets or sets the name of the property change.*/
  /* CompleteClass */
  override var propertyName: goLib.goMod.goNs.PropertyAccessor = js.native
  /**
    * This predicate returns true if you can call redo().
    */
  /* CompleteClass */
  override def canRedo(): scala.Boolean = js.native
  /**
    * This predicate returns true if you can call undo().
    */
  /* CompleteClass */
  override def canUndo(): scala.Boolean = js.native
  /**
    * Forget any object references that this ChangedEvent may have.
    */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /**
    * Make a copy of this ChangedEvent.
    */
  /* CompleteClass */
  override def copy(): goLib.goMod.goNs.ChangedEvent = js.native
  /**
    * This is a convenient method to get the right parameter value, depending on the value of undo,
    * when implementing a state change as part of an undo or a redo.
    * @param {boolean} undo If true, returns the oldParam, otherwise returns the newParam.
    */
  /* CompleteClass */
  override def getParam(undo: scala.Boolean): js.Any = js.native
  /**
    * This is a convenient method to get the right value, depending on the value of undo,
    * when implementing a state change as part of an undo or a redo.
    * @param {boolean} undo If true, returns the oldValue, otherwise returns the newValue.
    */
  /* CompleteClass */
  override def getValue(undo: scala.Boolean): js.Any = js.native
  /**
    * Re-perform this object change after an undo().
    */
  /* CompleteClass */
  override def redo(): scala.Unit = js.native
  /**
    * Reverse the effects of this object change.
    */
  /* CompleteClass */
  override def undo(): scala.Unit = js.native
}

/* static members */
@JSImport("go", "ChangedEvent")
@js.native
object ChangedEvent extends js.Object {
  /**For inserting into collections, and used as the value for ChangedEvent.change.*/
  var Insert: goLib.goMod.goNs.EnumValue = js.native
  /**For simple property changes, and used as the value for ChangedEvent.change.*/
  var Property: goLib.goMod.goNs.EnumValue = js.native
  /**For removing from collections, and used as the value for ChangedEvent.change.*/
  var Remove: goLib.goMod.goNs.EnumValue = js.native
  /**For informational events, such as transactions and undo/redo operations, and used as the value for ChangedEvent.change.*/
  var Transaction: goLib.goMod.goNs.EnumValue = js.native
}

