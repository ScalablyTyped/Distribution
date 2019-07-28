package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionFailureEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current sorted column field name.
    */
  var columnName: js.UndefOr[String] = js.undefined
  /** Returns the column sort direction.
    */
  var columnSortDirection: js.UndefOr[String] = js.undefined
  /** Returns current filtering object.
    */
  var currentFilterObject: js.UndefOr[js.Any] = js.undefined
  /** Returns current filtering column field name.
    */
  var currentFilteringColumn: js.UndefOr[String] = js.undefined
  /** Returns the current selected page number.
    */
  var currentPage: js.UndefOr[Double] = js.undefined
  /** Returns the record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the end row index of that current page.
    */
  var endIndex: js.UndefOr[Double] = js.undefined
  /** Returns the error return by server.
    */
  var error: js.UndefOr[js.Any] = js.undefined
  /** Returns filter details.
    */
  var filterCollection: js.UndefOr[js.Any] = js.undefined
  /** Returns the foreign key record object (JSON).
    */
  var foreignKeyData: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current action event type.
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
  /** Returns the selectedRow index.
    */
  var selectedRow: js.UndefOr[Double] = js.undefined
  /** Returns the start row index of the current page.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  /** Returns grid element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns selected row for delete.
    */
  var tr: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionFailureEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    columnName: String = null,
    columnSortDirection: String = null,
    currentFilterObject: js.Any = null,
    currentFilteringColumn: String = null,
    currentPage: Int | Double = null,
    data: js.Any = null,
    endIndex: Int | Double = null,
    error: js.Any = null,
    filterCollection: js.Any = null,
    foreignKeyData: js.Any = null,
    model: js.Any = null,
    originalEventType: String = null,
    previousPage: Int | Double = null,
    primaryKey: String = null,
    primaryKeyValue: String = null,
    requestType: String = null,
    row: js.Any = null,
    rowData: js.Any = null,
    rowIndex: Int | Double = null,
    selectedRow: Int | Double = null,
    startIndex: Int | Double = null,
    target: js.Any = null,
    tr: js.Any = null,
    `type`: String = null
  ): ActionFailureEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (columnSortDirection != null) __obj.updateDynamic("columnSortDirection")(columnSortDirection)
    if (currentFilterObject != null) __obj.updateDynamic("currentFilterObject")(currentFilterObject)
    if (currentFilteringColumn != null) __obj.updateDynamic("currentFilteringColumn")(currentFilteringColumn)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (filterCollection != null) __obj.updateDynamic("filterCollection")(filterCollection)
    if (foreignKeyData != null) __obj.updateDynamic("foreignKeyData")(foreignKeyData)
    if (model != null) __obj.updateDynamic("model")(model)
    if (originalEventType != null) __obj.updateDynamic("originalEventType")(originalEventType)
    if (previousPage != null) __obj.updateDynamic("previousPage")(previousPage.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (primaryKeyValue != null) __obj.updateDynamic("primaryKeyValue")(primaryKeyValue)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (selectedRow != null) __obj.updateDynamic("selectedRow")(selectedRow.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (tr != null) __obj.updateDynamic("tr")(tr)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionFailureEventArgs]
  }
}

