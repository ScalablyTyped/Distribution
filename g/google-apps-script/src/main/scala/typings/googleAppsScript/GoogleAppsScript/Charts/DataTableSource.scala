package typings.googleAppsScript.GoogleAppsScript.Charts

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
@js.native
trait DataTableSource extends js.Object {
  def getDataTable(): DataTable = js.native
}

object DataTableSource {
  @scala.inline
  def apply(getDataTable: () => DataTable): DataTableSource = {
    val __obj = js.Dynamic.literal(getDataTable = js.Any.fromFunction0(getDataTable))
    __obj.asInstanceOf[DataTableSource]
  }
  @scala.inline
  implicit class DataTableSourceOps[Self <: DataTableSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetDataTable(value: () => DataTable): Self = this.set("getDataTable", js.Any.fromFunction0(value))
  }
  
}

