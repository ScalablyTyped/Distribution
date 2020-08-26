package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionCompleteEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the current sorted column field name.
    */
  var columnName: js.UndefOr[String] = js.native
  /** Returns the column sort direction.
    */
  var columnSortDirection: js.UndefOr[String] = js.native
  /** Returns type of the column like number, string and so on.
    */
  var columnType: js.UndefOr[String] = js.native
  /** Returns current filtering object.
    */
  var currentFilterObject: js.UndefOr[js.Any] = js.native
  /** Returns current filtering column field name.
    */
  var currentFilteringColumn: js.UndefOr[String] = js.native
  /** Returns the current selected page number.
    */
  var currentPage: js.UndefOr[Double] = js.native
  /** Returns the record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns the dataSource.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Returns the end row index of that current page.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /** Returns filter details.
    */
  var filterCollection: js.UndefOr[js.Any] = js.native
  /** Returns the excel filter model.
    */
  var filtermodel: js.UndefOr[js.Any] = js.native
  /** Returns the foreign key record object (JSON).
    */
  var foreignKeyData: js.UndefOr[js.Any] = js.native
  /** Returns the customfilter option value.
    */
  var isCustomFilter: js.UndefOr[Boolean] = js.native
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns current action event type.
    */
  var originalEventType: js.UndefOr[String] = js.native
  /** Returns the previous selected page number.
    */
  var previousPage: js.UndefOr[Double] = js.native
  /** Returns primary key.
    */
  var primaryKey: js.UndefOr[String] = js.native
  /** Returns primary key value.
    */
  var primaryKeyValue: js.UndefOr[String] = js.native
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.native
  /** Returns current edited row.
    */
  var row: js.UndefOr[js.Any] = js.native
  /** Returns the record object (JSON).
    */
  var rowData: js.UndefOr[js.Any] = js.native
  /** Returns the edited row index.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /** Returns the selectedRow index.
    */
  var selectedRow: js.UndefOr[Double] = js.native
  /** Returns the start row index of the current page.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /** Returns grid element.
    */
  var target: js.UndefOr[js.Any] = js.native
  /** Returns selected row for delete.
    */
  var tr: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ActionCompleteEventArgs {
  @scala.inline
  def apply(): ActionCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionCompleteEventArgs]
  }
  @scala.inline
  implicit class ActionCompleteEventArgsOps[Self <: ActionCompleteEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    @scala.inline
    def setColumnSortDirection(value: String): Self = this.set("columnSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSortDirection: Self = this.set("columnSortDirection", js.undefined)
    @scala.inline
    def setColumnType(value: String): Self = this.set("columnType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnType: Self = this.set("columnType", js.undefined)
    @scala.inline
    def setCurrentFilterObject(value: js.Any): Self = this.set("currentFilterObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentFilterObject: Self = this.set("currentFilterObject", js.undefined)
    @scala.inline
    def setCurrentFilteringColumn(value: String): Self = this.set("currentFilteringColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentFilteringColumn: Self = this.set("currentFilteringColumn", js.undefined)
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    @scala.inline
    def setFilterCollection(value: js.Any): Self = this.set("filterCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterCollection: Self = this.set("filterCollection", js.undefined)
    @scala.inline
    def setFiltermodel(value: js.Any): Self = this.set("filtermodel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltermodel: Self = this.set("filtermodel", js.undefined)
    @scala.inline
    def setForeignKeyData(value: js.Any): Self = this.set("foreignKeyData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForeignKeyData: Self = this.set("foreignKeyData", js.undefined)
    @scala.inline
    def setIsCustomFilter(value: Boolean): Self = this.set("isCustomFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCustomFilter: Self = this.set("isCustomFilter", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setOriginalEventType(value: String): Self = this.set("originalEventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEventType: Self = this.set("originalEventType", js.undefined)
    @scala.inline
    def setPreviousPage(value: Double): Self = this.set("previousPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousPage: Self = this.set("previousPage", js.undefined)
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    @scala.inline
    def setPrimaryKeyValue(value: String): Self = this.set("primaryKeyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKeyValue: Self = this.set("primaryKeyValue", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    @scala.inline
    def setRow(value: js.Any): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setSelectedRow(value: Double): Self = this.set("selectedRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRow: Self = this.set("selectedRow", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTr(value: js.Any): Self = this.set("tr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTr: Self = this.set("tr", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

