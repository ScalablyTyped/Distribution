package typings.dojo.dojox.grid.enhanced.plugins.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/FilterDefDialog.html
  *
  * Create the filter definition UI.
  *
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins.filter.FilterDefDialog")
@js.native
class FilterDefDialog protected () extends js.Object {
  def this(args: js.Any) = this()
  /**
    *
    */
  var curColIdx: Double = js.native
  /**
    *
    */
  var plugin: js.Object = js.native
  /**
    * Add cnt criteria boxes to the filter definition pane.
    * Check overflow if necessary.
    *
    * @param cnt
    */
  def addCriteriaBoxes(cnt: Double): Unit = js.native
  /**
    *
    */
  def canFilter(): Boolean = js.native
  /**
    * Clear filter definition.
    *
    * @param noRefresh
    */
  def clearFilter(noRefresh: js.Any): Unit = js.native
  /**
    * Close the filter definition dialog.
    *
    */
  def closeDialog(): Unit = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    * @param v
    */
  def getColumnLabelByValue(v: js.Any): js.Any = js.native
  /**
    *
    * @param colIndex
    */
  def getColumnType(colIndex: Double): js.Any = js.native
  /**
    *
    * @param type
    * @param c
    */
  def getConditionLabelByValue(`type`: js.Any, c: js.Any): js.Any = js.native
  /**
    * Get the idx-th criteria.
    *
    * @param idx
    */
  def getCriteria(idx: Double): js.Any = js.native
  /**
    *
    * @param value
    * @param colIdx
    * @param type
    * @param condition
    */
  def getExprForColumn(value: js.Any, colIdx: js.Any, `type`: js.Any, condition: js.Any): js.Object = js.native
  /**
    *
    * @param rule
    */
  def getExprForCriteria(rule: js.Any): js.Any = js.native
  /**
    *
    */
  def getFilter(): js.Object = js.native
  /**
    * Triggered when the "Cancel" buttton is clicked.
    *
    * @param e
    */
  def onCancel(e: js.Any): Unit = js.native
  /**
    * Triggered when the "Clear" button is clicked.
    *
    * @param e
    */
  def onClearFilter(e: js.Any): Unit = js.native
  /**
    * Triggered when the "Filter" button is clicked.
    *
    * @param e
    */
  def onFilter(e: js.Any): Unit = js.native
  /**
    *
    * @param sourceViewIndex
    * @param destViewIndex
    * @param cellIndex
    * @param targetIndex
    * @param before
    */
  def onMoveColumn(
    sourceViewIndex: js.Any,
    destViewIndex: js.Any,
    cellIndex: js.Any,
    targetIndex: js.Any,
    before: js.Any
  ): Unit = js.native
  /**
    * Triggered when the rendering of the filter definition dialog is completely finished.
    *
    * @param cbox Current visible criteria box
    */
  def onRendered(cbox: js.Any): Unit = js.native
  /**
    * Remove criteria boxes from the filter definition pane.
    *
    * @param cnt
    * @param isIdx               Optional
    */
  def removeCriteriaBoxes(cnt: js.Array[Double], isIdx: Boolean): Unit = js.native
  /**
    * Remove criteria boxes from the filter definition pane.
    *
    * @param cnt
    * @param isIdx               Optional
    */
  def removeCriteriaBoxes(cnt: js.Object, isIdx: Boolean): Unit = js.native
  /**
    * Remove criteria boxes from the filter definition pane.
    *
    * @param cnt
    * @param isIdx               Optional
    */
  def removeCriteriaBoxes(cnt: Double, isIdx: Boolean): Unit = js.native
  /**
    *
    * @param rules
    * @param ruleRelation
    */
  def setFilter(rules: js.Any, ruleRelation: js.Any): Unit = js.native
  /**
    * Show the filter defintion dialog.
    *
    * @param colIndex
    */
  def showDialog(colIndex: Double): Unit = js.native
}

