package typings.dojo.dojox.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_Layout.html
  *
  * Controls grid cell layout. Owned by grid and used internally.
  *
  * @param inGrid
  */
@JSGlobal("dojox.grid._Layout")
@js.native
class _Layout protected () extends js.Object {
  def this(inGrid: js.Any) = this()
  /**
    *
    */
  var cells: js.Array[_] = js.native
  /**
    *
    */
  var defaultWidth: String = js.native
  /**
    *
    */
  var structure: js.Object = js.native
  /**
    *
    * @param inRowIndex
    * @param inCellIndex
    * @param inDef
    */
  def addCellDef(inRowIndex: js.Any, inCellIndex: js.Any, inDef: js.Any): js.Any = js.native
  /**
    *
    * @param inRowIndex
    * @param inDef
    */
  def addRowDef(inRowIndex: js.Any, inDef: js.Any): js.Array[_] = js.native
  /**
    *
    * @param inDef
    */
  def addRowsDef(inDef: js.Any): js.Array[_] = js.native
  /**
    *
    * @param inDef
    */
  def addViewDef(inDef: js.Any): js.Object = js.native
  /**
    *
    * @param sourceViewIndex
    * @param destViewIndex
    * @param cellIndex
    * @param targetIndex
    * @param before
    */
  def moveColumn(
    sourceViewIndex: js.Any,
    destViewIndex: js.Any,
    cellIndex: js.Any,
    targetIndex: js.Any,
    before: js.Any
  ): Unit = js.native
  /**
    *
    * @param columnIndex
    * @param visible
    */
  def setColumnVisibility(columnIndex: js.Any, visible: js.Any): Boolean = js.native
  /**
    *
    * @param inStructure
    */
  def setStructure(inStructure: js.Any): Unit = js.native
}

