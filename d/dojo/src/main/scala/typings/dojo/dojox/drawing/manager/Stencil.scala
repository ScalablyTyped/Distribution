package typings.dojo.dojox.drawing.manager

import typings.std.Event_
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/manager/Stencil.html
  *
  * The main class for tracking Stencils that are cretaed, added,
  * selected, or deleted. Also handles selections, multiple
  * selections, adding and removing from selections, and dragging
  * selections. It's this class that triggers the anchors to
  * appear on a Stencil and whther there are anchor on a multiple
  * select or not (currently not)
  *
  * @param options
  */
@JSGlobal("dojox.drawing.manager.Stencil")
@js.native
class Stencil protected () extends js.Object {
  def this(options: js.Any) = this()
  /**
    *
    */
  var throttleTime: Double = js.native
  /**
    * Deletes a stencil.
    * NOTE: supports limited undo.
    *
    * @param stencil
    */
  def deleteItem(stencil: js.Object): Unit = js.native
  /**
    *
    */
  def deselect(): Unit = js.native
  /**
    * Deselect passed stencil
    *
    * @param stencil
    */
  def deselectItem(stencil: js.Object): Unit = js.native
  /**
    * Collects all Stencil data and returns an
    * Array of objects.
    *
    */
  def exporter(): js.Array[_] = js.native
  /**
    * Returns the stencil most recently interacted
    * with whether it's last created or last selected
    *
    */
  def getRecentStencil(): js.Any = js.native
  /**
    * Returns number of selected (generally used
    * as truthy or falsey)
    *
    */
  def hasSelected(): Double = js.native
  /**
    * Returns if passed stencil is selected or not
    * based on internal collection, not on stencil
    * boolean
    *
    * @param stencil
    */
  def isSelected(stencil: js.Object): Boolean = js.native
  /**
    *
    */
  def listStencils(): js.Any = js.native
  /**
    * Event fire on mouseup off of an anchor point
    *
    */
  def onAnchorUp(): Unit = js.native
  /**
    * Moves selection based on keyboard arrow keys
    *
    * @param evt
    */
  def onArrow(evt: KeyboardEvent): Unit = js.native
  /**
    * Event fired at the beginning of a stencil drag
    *
    * @param obj
    */
  def onBeginDrag(obj: Event_): Unit = js.native
  /**
    * Event fired on deletion of a stencil
    *
    * @param noundo
    */
  def onDelete(noundo: Boolean): Unit = js.native
  /**
    * Event fired on deselection of a stencil
    *
    * @param stencil
    * @param keepObject
    */
  def onDeselect(stencil: js.Any, keepObject: js.Any): Unit = js.native
  /**
    * Event fired on mousedown on the canvas
    *
    * @param obj
    */
  def onDown(obj: Event_): Unit = js.native
  /**
    * Event fired at the end of a stencil drag
    *
    * @param obj
    */
  def onDragEnd(obj: Event_): Unit = js.native
  /**
    * Event to connect a textbox to
    * for label edits
    *
    * @param obj
    */
  def onLabelDoubleClick(obj: Event_): Unit = js.native
  /**
    * Event fired on mousedown of a stencil's label
    * Because it's an annotation the id will be the
    * master stencil.
    *
    * @param obj
    * @param evt
    */
  def onLabelDown(obj: Event_, evt: js.Any): Unit = js.native
  /**
    *
    * @param obj
    */
  def onLabelDrag(obj: Event_): Unit = js.native
  /**
    *
    * @param obj
    */
  def onLabelUp(obj: Event_): Unit = js.native
  /**
    * Event fired on selection of a stencil
    *
    * @param stencil
    */
  def onSelect(stencil: js.Object): Unit = js.native
  /**
    * Event fired on the double-click of a stencil
    *
    * @param obj
    */
  def onStencilDoubleClick(obj: Event_): Unit = js.native
  /**
    * Event fired on mousedown on a stencil
    *
    * @param obj
    * @param evt
    */
  def onStencilDown(obj: Event_, evt: js.Any): Unit = js.native
  /**
    * Event fired on every mousemove of a stencil drag
    *
    * @param obj
    */
  def onStencilDrag(obj: Event_): Unit = js.native
  /**
    * This restores the cursor.
    *
    * @param obj
    */
  def onStencilOut(obj: js.Any): Unit = js.native
  /**
    * This changes the cursor when hovering over
    * a selectable stencil.
    *
    * @param obj
    */
  def onStencilOver(obj: js.Any): Unit = js.native
  /**
    * Event fired on mouseup off of a stencil
    *
    * @param obj
    */
  def onStencilUp(obj: Event_): Unit = js.native
  /**
    * Key method for adding Stencils. Stencils
    * can be added to the canvas without adding
    * them to this, but they won't have selection
    * or drag ability.
    *
    * @param stencil
    */
  def register(stencil: js.Object): js.Any = js.native
  /**
    * Deletes all Stencils on the canvas.
    *
    */
  def removeAll(): Unit = js.native
  /**
    * Internal. Used for the prototype undo stack.
    * Saves selection position.
    *
    */
  def saveMoveState(): Unit = js.native
  /**
    * Internal. Used for the prototype undo stack.
    * Prevents an undo point on every mouse move.
    * Only does a point when the mouse hesitates.
    *
    */
  def saveThrottledState(): Unit = js.native
  /**
    * Selects all items
    *
    */
  def selectAll(): Unit = js.native
  /**
    * Method used to select a stencil.
    *
    * @param idOrItem
    */
  def selectItem(idOrItem: String): Unit = js.native
  /**
    * Method used to select a stencil.
    *
    * @param idOrItem
    */
  def selectItem(idOrItem: js.Object): Unit = js.native
  /**
    * Internal. Gets all selected stencils' coordinates
    * and determines how far left and up the selection
    * can go without going below zero
    *
    */
  def setConstraint(): Unit = js.native
  /**
    * Keeps track of the most recent stencil interacted
    * with, whether created or selected.
    *
    * @param stencil
    */
  def setRecentStencil(stencil: js.Any): Unit = js.native
  /**
    * Internal. Creates a new selection group
    * used to hold selected stencils.
    *
    */
  def setSelectionGroup(): Unit = js.native
  /**
    * Convenience function calls function within
    * all selected stencils
    *
    * @param func
    */
  def toSelected(func: String): Unit = js.native
  /**
    * Undeletes a stencil. Used in undo stack.
    *
    * @param stencils
    */
  def unDelete(stencils: js.Array[_]): Unit = js.native
  /**
    * Method for removing Stencils from the manager.
    * This doesn't delete them, only removes them from
    * the list.
    *
    * @param stencil
    */
  def unregister(stencil: js.Object): Unit = js.native
  /**
    * Convenience function calls function on
    * all selected stencils
    *
    * @param func
    */
  def withSelected(func: js.Function): Unit = js.native
  /**
    * Convenience function calls function on
    * all stencils
    *
    * @param func
    */
  def withStencils(func: js.Function): Unit = js.native
  /**
    * Convenience function calls function on
    * all stencils that are not selected
    *
    * @param func
    */
  def withUnselected(func: js.Function): Unit = js.native
}

