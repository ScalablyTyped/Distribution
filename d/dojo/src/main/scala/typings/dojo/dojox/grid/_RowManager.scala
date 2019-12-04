package typings.dojo.dojox.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_RowManager.html
  *
  *
  * @param inGrid
  */
@JSGlobal("dojox.grid._RowManager")
@js.native
class _RowManager protected () extends js.Object {
  def this(inGrid: js.Any) = this()
  /**
    *
    */
  var linesToEms: Double = js.native
  /**
    *
    */
  var overRow: Double = js.native
  /**
    *
    * @param inRow
    */
  def applyStyles(inRow: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def isOver(inRowIndex: js.Any): Boolean = js.native
  /**
    *
    * @param inRowIndex
    * @param inRowNode
    */
  def prepareStylingRow(inRowIndex: js.Any, inRowNode: js.Any): js.Object = js.native
  /**
    *
    * @param inRowIndex
    */
  def setOverRow(inRowIndex: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    * @param inRowNode
    */
  def styleRowNode(inRowIndex: js.Any, inRowNode: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def updateStyles(inRowIndex: js.Any): Unit = js.native
}

