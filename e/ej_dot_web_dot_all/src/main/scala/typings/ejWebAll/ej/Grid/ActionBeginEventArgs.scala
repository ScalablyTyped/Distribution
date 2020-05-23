package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBeginEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current grouped column field name.
    */
  var columnName: js.UndefOr[String] = js.undefined
  /** Returns the column sort direction.
    */
  var columnSortDirection: js.UndefOr[String] = js.undefined
  /** Returns type of the column like number, string and so on.
    */
  var columnType: js.UndefOr[String] = js.undefined
  /** Returns current filtering object.
    */
  var currentFilterObject: js.UndefOr[js.Any] = js.undefined
  /** Returns current filtering column field name.
    */
  var currentFilteringColumn: js.UndefOr[js.Any] = js.undefined
  /** Returns the current selected page number.
    */
  var currentPage: js.UndefOr[Double] = js.undefined
  /** Returns the record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the dataSource.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Returns the end row index of that current page.
    */
  var endIndex: js.UndefOr[Double] = js.undefined
  /** Returns filter details.
    */
  var filterCollection: js.UndefOr[js.Any] = js.undefined
  /** Returns the excel filter model.
    */
  var filtermodel: js.UndefOr[js.Any] = js.undefined
  /** Returns the foreign key record object (JSON).
    */
  var foreignKeyData: js.UndefOr[js.Any] = js.undefined
  /** Returns the customfilter option value.
    */
  var isCustomFilter: js.UndefOr[Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the current action event type.
    */
  var originalEventType: js.UndefOr[String] = js.undefined
  /** Returns the previous selected page number.
    */
  var previousPage: js.UndefOr[Double] = js.undefined
  /** Returns primary key.
    */
  var primaryKey: js.UndefOr[String] = js.undefined
  /** Returns primary key value.
    */
  var primaryKeyValue: js.UndefOr[String] = js.undefined
  /** Returns the query manager.
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns current edited row.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns the record object (JSON).
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the edited row index.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the selected row index.
    */
  var selectedRow: js.UndefOr[Double] = js.undefined
  /** Returns the start row index of that current page.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  /** Returns selected row for delete.
    */
  var tr: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionBeginEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    columnName: String = null,
    columnSortDirection: String = null,
    columnType: String = null,
    currentFilterObject: js.Any = null,
    currentFilteringColumn: js.Any = null,
    currentPage: js.UndefOr[Double] = js.undefined,
    data: js.Any = null,
    dataSource: js.Any = null,
    endIndex: js.UndefOr[Double] = js.undefined,
    filterCollection: js.Any = null,
    filtermodel: js.Any = null,
    foreignKeyData: js.Any = null,
    isCustomFilter: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    originalEventType: String = null,
    previousPage: js.UndefOr[Double] = js.undefined,
    primaryKey: String = null,
    primaryKeyValue: String = null,
    query: js.Any = null,
    requestType: String = null,
    row: js.Any = null,
    rowData: js.Any = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    selectedRow: js.UndefOr[Double] = js.undefined,
    startIndex: js.UndefOr[Double] = js.undefined,
    tr: js.Any = null,
    `type`: String = null
  ): ActionBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (columnSortDirection != null) __obj.updateDynamic("columnSortDirection")(columnSortDirection.asInstanceOf[js.Any])
    if (columnType != null) __obj.updateDynamic("columnType")(columnType.asInstanceOf[js.Any])
    if (currentFilterObject != null) __obj.updateDynamic("currentFilterObject")(currentFilterObject.asInstanceOf[js.Any])
    if (currentFilteringColumn != null) __obj.updateDynamic("currentFilteringColumn")(currentFilteringColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(currentPage)) __obj.updateDynamic("currentPage")(currentPage.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(endIndex)) __obj.updateDynamic("endIndex")(endIndex.get.asInstanceOf[js.Any])
    if (filterCollection != null) __obj.updateDynamic("filterCollection")(filterCollection.asInstanceOf[js.Any])
    if (filtermodel != null) __obj.updateDynamic("filtermodel")(filtermodel.asInstanceOf[js.Any])
    if (foreignKeyData != null) __obj.updateDynamic("foreignKeyData")(foreignKeyData.asInstanceOf[js.Any])
    if (!js.isUndefined(isCustomFilter)) __obj.updateDynamic("isCustomFilter")(isCustomFilter.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (originalEventType != null) __obj.updateDynamic("originalEventType")(originalEventType.asInstanceOf[js.Any])
    if (!js.isUndefined(previousPage)) __obj.updateDynamic("previousPage")(previousPage.get.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (primaryKeyValue != null) __obj.updateDynamic("primaryKeyValue")(primaryKeyValue.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedRow)) __obj.updateDynamic("selectedRow")(selectedRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBeginEventArgs]
  }
}

