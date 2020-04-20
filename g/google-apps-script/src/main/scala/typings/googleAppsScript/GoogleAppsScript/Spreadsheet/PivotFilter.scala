package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify pivot table filters.
  */
trait PivotFilter extends js.Object {
  def getFilterCriteria(): FilterCriteria
  def getPivotTable(): PivotTable
  def getSourceDataColumn(): Integer
  def remove(): Unit
  def setFilterCriteria(filterCriteria: FilterCriteria): PivotFilter
}

object PivotFilter {
  @scala.inline
  def apply(
    getFilterCriteria: () => FilterCriteria,
    getPivotTable: () => PivotTable,
    getSourceDataColumn: () => Integer,
    remove: () => Unit,
    setFilterCriteria: FilterCriteria => PivotFilter
  ): PivotFilter = {
    val __obj = js.Dynamic.literal(getFilterCriteria = js.Any.fromFunction0(getFilterCriteria), getPivotTable = js.Any.fromFunction0(getPivotTable), getSourceDataColumn = js.Any.fromFunction0(getSourceDataColumn), remove = js.Any.fromFunction0(remove), setFilterCriteria = js.Any.fromFunction1(setFilterCriteria))
    __obj.asInstanceOf[PivotFilter]
  }
}

