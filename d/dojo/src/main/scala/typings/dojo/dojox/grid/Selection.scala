package typings.dojo.dojox.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/Selection.html
  *
  * Manages row selection for grid. Owned by grid and used internally
  * for selection. Override to implement custom selection.
  *
  * @param inGrid
  */
@JSGlobal("dojox.grid.Selection")
@js.native
class Selection protected () extends js.Object {
  def this(inGrid: js.Any) = this()
  /**
    *
    */
  var mode: String = js.native
  /**
    *
    */
  var rangeStartIndex: Double = js.native
  /**
    *
    */
  var selected: js.Object = js.native
  /**
    *
    */
  var selectedIndex: Double = js.native
  /**
    *
    */
  var updating: Double = js.native
  /**
    *
    * @param inIndex
    */
  def addToSelection(inIndex: js.Any): Unit = js.native
  /**
    *
    */
  def clear(): Unit = js.native
  /**
    *
    * @param inIndex
    * @param inCtrlKey
    * @param inShiftKey
    */
  def clickSelect(inIndex: js.Any, inCtrlKey: js.Any, inShiftKey: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def clickSelectEvent(e: js.Any): Unit = js.native
  /**
    *
    * @param inIndex
    */
  def deselect(inIndex: js.Any): Unit = js.native
  /**
    *
    * @param inExcept
    */
  def deselectAll(inExcept: js.Any): Unit = js.native
  /**
    *
    * @param inFrom
    * @param inTo
    */
  def deselectRange(inFrom: js.Any, inTo: js.Any): Unit = js.native
  /**
    *
    */
  def getFirstSelected(): Double = js.native
  /**
    *
    * @param inPrev
    */
  def getNextSelected(inPrev: js.Any): Double = js.native
  /**
    *
    */
  def getSelected(): js.Array[_] = js.native
  /**
    *
    */
  def getSelectedCount(): Double = js.native
  /**
    *
    * @param inIndex
    */
  def insert(inIndex: js.Any): Unit = js.native
  /**
    *
    * @param inIndex
    */
  def isSelected(inIndex: js.Any): js.Any = js.native
  /**
    *
    * @param inIndex
    */
  def onCanDeselect(inIndex: js.Any): js.Any = js.native
  /**
    *
    * @param inIndex
    */
  def onCanSelect(inIndex: js.Any): js.Any = js.native
  /**
    *
    */
  def onChanged(): Unit = js.native
  /**
    *
    */
  def onChanging(): Unit = js.native
  /**
    *
    * @param inIndex
    */
  def onDeselected(inIndex: js.Any): Unit = js.native
  /**
    *
    * @param inIndex
    */
  def onSelected(inIndex: js.Any): Unit = js.native
  /**
    *
    * @param inIndex
    */
  def remove(inIndex: js.Any): Unit = js.native
  /**
    *
    * @param inIndex
    */
  def select(inIndex: js.Any): Unit = js.native
  /**
    *
    * @param inFrom
    * @param inTo
    */
  def selectRange(inFrom: js.Any, inTo: js.Any): Unit = js.native
  /**
    *
    * @param mode
    */
  def setMode(mode: js.Any): Unit = js.native
  /**
    *
    * @param inIndex
    * @param inSelect
    */
  def setSelected(inIndex: js.Any, inSelect: js.Any): Unit = js.native
  /**
    *
    * @param inIndex
    */
  def toggleSelect(inIndex: js.Any): Unit = js.native
}

