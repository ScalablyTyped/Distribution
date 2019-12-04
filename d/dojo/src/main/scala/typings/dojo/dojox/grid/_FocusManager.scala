package typings.dojo.dojox.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_FocusManager.html
  *
  * Controls grid cell focus. Owned by grid and used internally for focusing.
  * Note: grid cell actually receives keyboard input only when cell is being edited.
  *
  * @param inGrid
  */
@JSGlobal("dojox.grid._FocusManager")
@js.native
class _FocusManager protected () extends js.Object {
  def this(inGrid: js.Any) = this()
  /**
    *
    */
  var focusClass: String = js.native
  /**
    *
    */
  var focusView: js.Object = js.native
  /**
    *
    */
  var tabbingOut: Boolean = js.native
  /**
    *
    */
  def blurHeader(): Unit = js.native
  /**
    *
    * @param e
    * @param colIdx
    * @param delta
    */
  def colSizeAdjust(e: js.Any, colIdx: js.Any, delta: js.Any): Unit = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    * @param e
    */
  def doBlur(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doColHeaderBlur(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doColHeaderFocus(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doContextMenu(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doFocus(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doLastNodeBlur(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doLastNodeFocus(e: js.Any): Unit = js.native
  /**
    * find the first focusable grid cell
    *
    */
  def findAndFocusGridCell(): js.Any = js.native
  /**
    *
    * @param inSkipFocusCell
    */
  def focusGrid(inSkipFocusCell: js.Any): Unit = js.native
  /**
    *
    */
  def focusGridView(): Unit = js.native
  /**
    *
    */
  def focusHeader(): Unit = js.native
  /**
    * if one of the column headers currently has focus, return its index.
    *
    */
  def getHeaderIndex(): js.Any = js.native
  /**
    *
    */
  def initFocusView(): Unit = js.native
  /**
    *
    */
  def isFirstFocusCell(): Boolean = js.native
  /**
    * states if the given cell is focused
    *
    * @param inCell grid cell object
    * @param inRowIndex grid row index
    */
  def isFocusCell(inCell: js.Object, inRowIndex: Double): js.Any = js.native
  /**
    *
    */
  def isLastFocusCell(): Boolean = js.native
  /**
    * states whether currently navigating among column headers.
    *
    */
  def isNavHeader(): js.Any = js.native
  /**
    *
    */
  def isNoFocusCell(): Boolean = js.native
  /**
    * focus grid cell or  simulate focus to column header based on position relative to current focus
    *
    * @param inRowDelta vertical distance from current focus
    * @param inColDelta horizontal distance from current focus
    */
  def move(inRowDelta: Double, inColDelta: Double): Unit = js.native
  /**
    * focus next grid cell
    *
    */
  def next(): Unit = js.native
  /**
    *
    * @param e
    */
  def nextKey(e: js.Any): Unit = js.native
  /**
    * focus previous grid cell
    *
    */
  def previous(): Unit = js.native
  /**
    *
    * @param e
    */
  def previousKey(e: js.Any): Unit = js.native
  /**
    *
    */
  def scrollIntoView(): js.Any = js.native
  /**
    * focuses the given grid cell
    *
    * @param inCell grid cell object
    * @param inRowIndex grid row index
    */
  def setFocusCell(inCell: js.Object, inRowIndex: Double): Unit = js.native
  /**
    * focuses the given grid cell
    *
    * @param inRowIndex grid row index
    * @param inCellIndex grid cell index
    */
  def setFocusIndex(inRowIndex: Double, inCellIndex: Double): Unit = js.native
  /**
    *
    * @param inRow
    */
  def styleRow(inRow: js.Any): Unit = js.native
  /**
    *
    * @param inFocusNode
    */
  def tabOut(inFocusNode: js.Any): Unit = js.native
}

