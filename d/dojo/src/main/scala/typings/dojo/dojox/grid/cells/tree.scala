package typings.dojo.dojox.grid.cells

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/tree.html
  *
  *
  */
trait tree extends js.Object {
  /**
    *
    * @param inItem
    * @param level
    * @param inRowIndexes
    */
  def formatAggregate(inItem: js.Any, level: js.Any, inRowIndexes: js.Any): js.Any
  /**
    *
    * @param inRowIndexes
    * @param inItem
    * @param level
    * @param summaryRow
    * @param toggleClass
    * @param cellClasses
    */
  def formatAtLevel(
    inRowIndexes: js.Any,
    inItem: js.Any,
    level: js.Any,
    summaryRow: js.Any,
    toggleClass: js.Any,
    cellClasses: js.Any
  ): String
  /**
    *
    * @param inRowIndexes
    * @param inItem
    */
  def formatIndexes(inRowIndexes: js.Any, inItem: js.Any): js.Any
  /**
    *
    * @param itemId
    */
  def getOpenState(itemId: js.Any): js.Any
}

object tree {
  @scala.inline
  def apply(
    formatAggregate: (js.Any, js.Any, js.Any) => js.Any,
    formatAtLevel: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => String,
    formatIndexes: (js.Any, js.Any) => js.Any,
    getOpenState: js.Any => js.Any
  ): tree = {
    val __obj = js.Dynamic.literal(formatAggregate = js.Any.fromFunction3(formatAggregate), formatAtLevel = js.Any.fromFunction6(formatAtLevel), formatIndexes = js.Any.fromFunction2(formatIndexes), getOpenState = js.Any.fromFunction1(getOpenState))
  
    __obj.asInstanceOf[tree]
  }
}

