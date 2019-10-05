package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced._Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/NestedSorting.html
  *
  * Provides nested sorting feature
  * A flexible way to control multiple column sorting, including
  *
  * Set default sorting order
  * Disable sorting for certain columns
  * Set sorting order dynamically with JS API
  *
  */
@JSGlobal("dojox.grid.enhanced.plugins.NestedSorting")
@js.native
class NestedSorting () extends _Plugin {
  /**
    *
    */
  def clearSort(): Unit = js.native
  /**
    * Overwritten, see DataGrid.getSortProps()
    *
    */
  def getSortProps(): js.Any = js.native
  /**
    *
    */
  def initCookieHandler(): Unit = js.native
  /**
    *
    * @param cellIndex
    */
  def isAsc(cellIndex: js.Any): Boolean = js.native
  /**
    *
    * @param cellIndex
    */
  def isDesc(cellIndex: js.Any): Boolean = js.native
  /**
    *
    * @param cellIdx
    */
  def removeSortData(cellIdx: js.Any): Unit = js.native
  /**
    * Set sorting data for a column.
    *
    * @param cellIdx
    * @param attr
    * @param value
    */
  def setSortData(cellIdx: js.Any, attr: js.Any, value: js.Any): Unit = js.native
}

