package typings.dojo.dojox.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_EditManager.html
  *
  * Controls grid cell editing process. Owned by grid and used internally for editing.
  *
  * @param inGrid The dojox.Grid this editor should be attached to
  */
@JSGlobal("dojox.grid._EditManager")
@js.native
class _EditManager protected () extends js.Object {
  def this(inGrid: _Grid) = this()
  /**
    *
    */
  var info: js.Object = js.native
  /**
    * Apply a grid edit
    *
    */
  @JSName("apply")
  def apply(): Unit = js.native
  /**
    *
    * @param inValue
    * @param inCell
    * @param inRowIndex
    */
  def applyCellEdit(inValue: js.Any, inCell: js.Any, inRowIndex: js.Any): Unit = js.native
  /**
    *
    */
  def applyRowEdit(): Unit = js.native
  /**
    * Cancel a grid edit
    *
    */
  def cancel(): Unit = js.native
  /**
    * Invoke editing when cell is focused
    *
    * @param inCell Grid cell object
    * @param inRowIndex Grid row index
    */
  def cellFocus(inCell: js.Any, inRowIndex: Double): Unit = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    * @param e
    */
  def dispatchEvent(e: js.Any): Double = js.native
  /**
    *
    */
  def editorApply(): Unit = js.native
  /**
    *
    */
  def editorCancel(): Unit = js.native
  /**
    *
    */
  def focusEditor(): Unit = js.native
  /**
    * Indicates if the given cell is being edited.
    *
    * @param inRowIndex Grid row index
    * @param inCellIndex Grid cell index
    */
  def isEditCell(inRowIndex: Double, inCellIndex: Double): js.Any = js.native
  /**
    * Indicates if the given row is being edited.
    *
    * @param inRowIndex Grid row index
    */
  def isEditRow(inRowIndex: Double): js.Any = js.native
  /**
    * Indicates editing state of the grid.
    *
    */
  def isEditing(): js.Any = js.native
  /**
    * Restores the grid editing state
    *
    * @param inView Grid view
    * @param inRowIndex Grid row index
    */
  def restore(inView: js.Object, inRowIndex: Double): Unit = js.native
  /**
    *
    * @param e
    */
  def rowClick(e: js.Any): Unit = js.native
  /**
    * Save the grid editing state
    *
    * @param inRowIndex Grid row index
    * @param inView Grid view
    */
  def save(inRowIndex: Double, inView: js.Object): Unit = js.native
  /**
    * Set the given cell to be edited
    *
    * @param inCell Grid cell object
    * @param inRowIndex Grid row index
    */
  def setEditCell(inCell: js.Object, inRowIndex: Double): Unit = js.native
  /**
    *
    * @param inCell
    * @param inRowIndex
    * @param inEditing
    */
  def start(inCell: js.Any, inRowIndex: js.Any, inEditing: js.Any): Unit = js.native
  /**
    *
    * @param inRow
    */
  def styleRow(inRow: js.Any): Unit = js.native
}

