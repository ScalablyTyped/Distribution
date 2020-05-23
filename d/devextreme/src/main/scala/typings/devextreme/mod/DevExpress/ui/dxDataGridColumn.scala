package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowClearing
import typings.devextreme.anon.ColumnColumnIndex
import typings.devextreme.anon.GroupContinuedMessage
import typings.devextreme.anon.GroupInterval
import typings.devextreme.anon.OldValue
import typings.devextreme.anon.RowIndex
import typings.devextreme.anon.SearchMode
import typings.devextreme.devextremeStrings.Equalssign
import typings.devextreme.devextremeStrings.Greaterthansign
import typings.devextreme.devextremeStrings.GreaterthansignEqualssign
import typings.devextreme.devextremeStrings.Lessthansign
import typings.devextreme.devextremeStrings.LessthansignEqualssign
import typings.devextreme.devextremeStrings.LessthansignGreaterthansign
import typings.devextreme.devextremeStrings.`object`
import typings.devextreme.devextremeStrings.adaptive
import typings.devextreme.devextremeStrings.asc
import typings.devextreme.devextremeStrings.between
import typings.devextreme.devextremeStrings.boolean_
import typings.devextreme.devextremeStrings.buttons
import typings.devextreme.devextremeStrings.cancel
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.contains
import typings.devextreme.devextremeStrings.date
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.delete
import typings.devextreme.devextremeStrings.desc
import typings.devextreme.devextremeStrings.detailExpand
import typings.devextreme.devextremeStrings.edit
import typings.devextreme.devextremeStrings.endswith
import typings.devextreme.devextremeStrings.exclude
import typings.devextreme.devextremeStrings.groupExpand
import typings.devextreme.devextremeStrings.include
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.notcontains
import typings.devextreme.devextremeStrings.number
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.save
import typings.devextreme.devextremeStrings.selection
import typings.devextreme.devextremeStrings.startswith
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.devextremeStrings.undelete
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDataGridColumn extends GridBaseColumn {
  /** @name dxDataGridColumn.allowExporting */
  var allowExporting: js.UndefOr[Boolean] = js.undefined
  /** @name dxDataGridColumn.allowGrouping */
  var allowGrouping: js.UndefOr[Boolean] = js.undefined
  /** @name dxDataGridColumn.autoExpandGroup */
  var autoExpandGroup: js.UndefOr[Boolean] = js.undefined
  /** @name dxDataGridColumn.buttons */
  var buttons: js.UndefOr[js.Array[cancel | delete | edit | save | undelete | dxDataGridColumnButton]] = js.undefined
  /** @name dxDataGridColumn.calculateGroupValue */
  var calculateGroupValue: js.UndefOr[String | (js.Function1[/* rowData */ js.Any, _])] = js.undefined
  /** @name dxDataGridColumn.cellTemplate */
  var cellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ OldValue, _])
  ] = js.undefined
  /** @name dxDataGridColumn.columns */
  var columns: js.UndefOr[js.Array[dxDataGridColumn | String]] = js.undefined
  /** @name dxDataGridColumn.editCellTemplate */
  var editCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ RowIndex, _])
  ] = js.undefined
  /** @name dxDataGridColumn.groupCellTemplate */
  var groupCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ GroupContinuedMessage, _])
  ] = js.undefined
  /** @name dxDataGridColumn.groupIndex */
  var groupIndex: js.UndefOr[Double] = js.undefined
  /** @name dxDataGridColumn.headerCellTemplate */
  var headerCellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndex, _])
  ] = js.undefined
  /** @name dxDataGridColumn.showWhenGrouped */
  var showWhenGrouped: js.UndefOr[Boolean] = js.undefined
  /** @name dxDataGridColumn.type */
  var `type`: js.UndefOr[adaptive | buttons | detailExpand | groupExpand | selection] = js.undefined
}

object dxDataGridColumn {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    allowExporting: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowFixing: js.UndefOr[Boolean] = js.undefined,
    allowGrouping: js.UndefOr[Boolean] = js.undefined,
    allowHeaderFiltering: js.UndefOr[Boolean] = js.undefined,
    allowHiding: js.UndefOr[Boolean] = js.undefined,
    allowReordering: js.UndefOr[Boolean] = js.undefined,
    allowResizing: js.UndefOr[Boolean] = js.undefined,
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    autoExpandGroup: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[cancel | delete | edit | save | undelete | dxDataGridColumnButton] = null,
    calculateCellValue: /* rowData */ js.Any => _ = null,
    calculateDisplayValue: String | (js.Function1[/* rowData */ js.Any, _]) = null,
    calculateFilterExpression: (/* filterValue */ js.Any, /* selectedFilterOperation */ String, /* target */ String) => String | js.Array[_] | js.Function = null,
    calculateGroupValue: String | (js.Function1[/* rowData */ js.Any, _]) = null,
    calculateSortValue: String | (js.Function1[/* rowData */ js.Any, _]) = null,
    caption: String = null,
    cellTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ OldValue, _]) = null,
    columns: js.Array[dxDataGridColumn | String] = null,
    cssClass: String = null,
    customizeText: /* cellInfo */ GroupInterval => String = null,
    dataField: String = null,
    dataType: string_ | number | date | boolean_ | `object` | datetime = null,
    editCellTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ RowIndex, _]) = null,
    editorOptions: js.Any = null,
    encodeHtml: js.UndefOr[Boolean] = js.undefined,
    falseText: String = null,
    filterOperations: js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | notcontains | contains | startswith | endswith | between
    ] = null,
    filterType: exclude | include = null,
    filterValue: js.Any = null,
    filterValues: js.Array[_] = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    fixedPosition: left | right = null,
    formItem: dxFormSimpleItem = null,
    format: format = null,
    groupCellTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ GroupContinuedMessage, _]) = null,
    groupIndex: js.UndefOr[Double] = js.undefined,
    headerCellTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndex, _]) = null,
    headerFilter: SearchMode = null,
    hidingPriority: js.UndefOr[Double] = js.undefined,
    isBand: js.UndefOr[Boolean] = js.undefined,
    lookup: AllowClearing = null,
    minWidth: js.UndefOr[Double] = js.undefined,
    name: String = null,
    ownerBand: js.UndefOr[Double] = js.undefined,
    renderAsync: js.UndefOr[Boolean] = js.undefined,
    selectedFilterOperation: Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | Greaterthansign | GreaterthansignEqualssign | between | contains | endswith | notcontains | startswith = null,
    setCellValue: (/* newData */ js.Any, /* value */ js.Any, /* currentRowData */ js.Any) => Unit | Promise[Unit] | JQueryPromise[Unit] = null,
    showEditorAlways: js.UndefOr[Boolean] = js.undefined,
    showInColumnChooser: js.UndefOr[Boolean] = js.undefined,
    showWhenGrouped: js.UndefOr[Boolean] = js.undefined,
    sortIndex: js.UndefOr[Double] = js.undefined,
    sortOrder: asc | desc = null,
    sortingMethod: (/* value1 */ js.Any, /* value2 */ js.Any) => Double = null,
    trueText: String = null,
    `type`: adaptive | buttons | detailExpand | groupExpand | selection = null,
    validationRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: js.UndefOr[Double] = js.undefined,
    width: Double | String = null
  ): dxDataGridColumn = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExporting)) __obj.updateDynamic("allowExporting")(allowExporting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFixing)) __obj.updateDynamic("allowFixing")(allowFixing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowGrouping)) __obj.updateDynamic("allowGrouping")(allowGrouping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHeaderFiltering)) __obj.updateDynamic("allowHeaderFiltering")(allowHeaderFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHiding)) __obj.updateDynamic("allowHiding")(allowHiding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReordering)) __obj.updateDynamic("allowReordering")(allowReordering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoExpandGroup)) __obj.updateDynamic("autoExpandGroup")(autoExpandGroup.get.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (calculateCellValue != null) __obj.updateDynamic("calculateCellValue")(js.Any.fromFunction1(calculateCellValue))
    if (calculateDisplayValue != null) __obj.updateDynamic("calculateDisplayValue")(calculateDisplayValue.asInstanceOf[js.Any])
    if (calculateFilterExpression != null) __obj.updateDynamic("calculateFilterExpression")(js.Any.fromFunction3(calculateFilterExpression))
    if (calculateGroupValue != null) __obj.updateDynamic("calculateGroupValue")(calculateGroupValue.asInstanceOf[js.Any])
    if (calculateSortValue != null) __obj.updateDynamic("calculateSortValue")(calculateSortValue.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (cellTemplate != null) __obj.updateDynamic("cellTemplate")(cellTemplate.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (editCellTemplate != null) __obj.updateDynamic("editCellTemplate")(editCellTemplate.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeHtml)) __obj.updateDynamic("encodeHtml")(encodeHtml.get.asInstanceOf[js.Any])
    if (falseText != null) __obj.updateDynamic("falseText")(falseText.asInstanceOf[js.Any])
    if (filterOperations != null) __obj.updateDynamic("filterOperations")(filterOperations.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (filterValues != null) __obj.updateDynamic("filterValues")(filterValues.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.get.asInstanceOf[js.Any])
    if (fixedPosition != null) __obj.updateDynamic("fixedPosition")(fixedPosition.asInstanceOf[js.Any])
    if (formItem != null) __obj.updateDynamic("formItem")(formItem.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (groupCellTemplate != null) __obj.updateDynamic("groupCellTemplate")(groupCellTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(groupIndex)) __obj.updateDynamic("groupIndex")(groupIndex.get.asInstanceOf[js.Any])
    if (headerCellTemplate != null) __obj.updateDynamic("headerCellTemplate")(headerCellTemplate.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(hidingPriority)) __obj.updateDynamic("hidingPriority")(hidingPriority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isBand)) __obj.updateDynamic("isBand")(isBand.get.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(ownerBand)) __obj.updateDynamic("ownerBand")(ownerBand.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAsync)) __obj.updateDynamic("renderAsync")(renderAsync.get.asInstanceOf[js.Any])
    if (selectedFilterOperation != null) __obj.updateDynamic("selectedFilterOperation")(selectedFilterOperation.asInstanceOf[js.Any])
    if (setCellValue != null) __obj.updateDynamic("setCellValue")(js.Any.fromFunction3(setCellValue))
    if (!js.isUndefined(showEditorAlways)) __obj.updateDynamic("showEditorAlways")(showEditorAlways.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInColumnChooser)) __obj.updateDynamic("showInColumnChooser")(showInColumnChooser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWhenGrouped)) __obj.updateDynamic("showWhenGrouped")(showWhenGrouped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sortIndex)) __obj.updateDynamic("sortIndex")(sortIndex.get.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sortingMethod != null) __obj.updateDynamic("sortingMethod")(js.Any.fromFunction2(sortingMethod))
    if (trueText != null) __obj.updateDynamic("trueText")(trueText.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleIndex)) __obj.updateDynamic("visibleIndex")(visibleIndex.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDataGridColumn]
  }
}

