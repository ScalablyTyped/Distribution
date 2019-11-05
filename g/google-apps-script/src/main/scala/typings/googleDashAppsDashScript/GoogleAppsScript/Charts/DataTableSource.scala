package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for objects that can represent their data as a DataTable.
  * Implementing classes
  *
  * NameBrief description
  *
  * DataTableA Data Table to be used in charts.
  *
  * RangeAccess and modify spreadsheet ranges.
  */
trait DataTableSource extends js.Object {
  def getDataTable(): DataTable
}

object DataTableSource {
  @scala.inline
  def apply(getDataTable: () => DataTable): DataTableSource = {
    val __obj = js.Dynamic.literal(getDataTable = js.Any.fromFunction0(getDataTable))
  
    __obj.asInstanceOf[DataTableSource]
  }
}

