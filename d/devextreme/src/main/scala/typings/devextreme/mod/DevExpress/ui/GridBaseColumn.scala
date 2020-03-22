package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAllowClearing
import typings.devextreme.AnonGroupInterval
import typings.devextreme.AnonSearchMode
import typings.devextreme.devextremeStrings.Equalssign
import typings.devextreme.devextremeStrings.Greaterthansign
import typings.devextreme.devextremeStrings.GreaterthansignEqualssign
import typings.devextreme.devextremeStrings.Lessthansign
import typings.devextreme.devextremeStrings.LessthansignEqualssign
import typings.devextreme.devextremeStrings.LessthansignGreaterthansign
import typings.devextreme.devextremeStrings.`object`
import typings.devextreme.devextremeStrings.asc
import typings.devextreme.devextremeStrings.between
import typings.devextreme.devextremeStrings.boolean_
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.contains
import typings.devextreme.devextremeStrings.date
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.desc
import typings.devextreme.devextremeStrings.endswith
import typings.devextreme.devextremeStrings.exclude
import typings.devextreme.devextremeStrings.include
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.notcontains
import typings.devextreme.devextremeStrings.number
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.startswith
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBaseColumn extends js.Object {
  /** Aligns the content of the column. */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  /** Specifies whether a user can edit values in the column at runtime. By default, inherits the value of the editing.allowUpdating option. */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether data can be filtered by this column. Applies only if filterRow.visible is true. */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a user can fix the column at runtime. Applies only if columnFixing.enabled is true. */
  var allowFixing: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether the header filter can be used to filter data by this column. Applies only if headerFilter.visible is true. By default, inherits the value of the allowFiltering option. */
  var allowHeaderFiltering: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a user can hide the column using the column chooser at runtime. Applies only if columnChooser.enabled is true. */
  var allowHiding: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether this column can be used in column reordering at runtime. Applies only if allowColumnReordering is true. */
  var allowReordering: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a user can resize the column at runtime. Applies only if allowColumnResizing is true. */
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether this column can be searched. Applies only if searchPanel.visible is true. Inherits the value of the allowFiltering option by default. */
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a user can sort rows by this column at runtime. Applies only if sorting.mode differs from "none". */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Calculates custom cell values. Use this function to create an unbound data column. */
  var calculateCellValue: js.UndefOr[js.Function1[/* rowData */ js.Any, _]] = js.undefined
  /** Calculates custom display values for column cells. Requires specifying the dataField or calculateCellValue option. Used in lookup optimization. */
  var calculateDisplayValue: js.UndefOr[String | (js.Function1[/* rowData */ js.Any, _])] = js.undefined
  /** Specifies the column's custom filtering rules. */
  var calculateFilterExpression: js.UndefOr[
    js.Function3[
      /* filterValue */ js.Any, 
      /* selectedFilterOperation */ String, 
      /* target */ String, 
      String | js.Array[_] | js.Function
    ]
  ] = js.undefined
  /** Calculates custom values to be used in sorting. */
  var calculateSortValue: js.UndefOr[String | (js.Function1[/* rowData */ js.Any, _])] = js.undefined
  /** Specifies a caption for the column. */
  var caption: js.UndefOr[String] = js.undefined
  /** Specifies a CSS class to be applied to the column. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Customizes the text displayed in column cells. */
  var customizeText: js.UndefOr[js.Function1[/* cellInfo */ AnonGroupInterval, String]] = js.undefined
  /** Binds the column to a field of the dataSource. */
  var dataField: js.UndefOr[String] = js.undefined
  /** Casts column values to a specific data type. */
  var dataType: js.UndefOr[string_ | number | date | boolean_ | `object` | datetime] = js.undefined
  /** Configures the default widget used for editing and filtering in the filter row. */
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  /** Specifies whether HTML tags are displayed as plain text or applied to the values of the column. */
  var encodeHtml: js.UndefOr[Boolean] = js.undefined
  /** In a boolean column, replaces all false items with a specified text. Applies only if showEditorAlways option is false. */
  var falseText: js.UndefOr[String] = js.undefined
  /** Specifies a set of available filter operations. Applies only if filterRow.visible and allowFiltering are true. */
  var filterOperations: js.UndefOr[
    js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | notcontains | contains | startswith | endswith | between
    ]
  ] = js.undefined
  /** Specifies whether a user changes the current filter by including (selecting) or excluding (clearing the selection of) values. Applies only if headerFilter.visible and allowHeaderFiltering are true. */
  var filterType: js.UndefOr[exclude | include] = js.undefined
  /** Specifies the column's filter value displayed in the filter row. */
  var filterValue: js.UndefOr[js.Any] = js.undefined
  /** Specifies values selected in the column's header filter. */
  var filterValues: js.UndefOr[js.Array[_]] = js.undefined
  /** Fixes the column. */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /** Specifies the widget's edge to which the column is fixed. Applies only if columns[].fixed is true. */
  var fixedPosition: js.UndefOr[left | right] = js.undefined
  /** Configures the form item that the column produces in the editing state. Applies only if editing.mode is "form" or "popup". */
  var formItem: js.UndefOr[dxFormSimpleItem] = js.undefined
  /** Formats a value before it is displayed in a column cell. */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** Specifies data settings for the header filter. */
  var headerFilter: js.UndefOr[AnonSearchMode] = js.undefined
  /** Specifies the order in which columns are hidden when the widget adapts to the screen or container size. Ignored if allowColumnResizing is true and columnResizingMode is "widget". */
  var hidingPriority: js.UndefOr[Double] = js.undefined
  /** Specifies whether the column bands other columns or not. */
  var isBand: js.UndefOr[Boolean] = js.undefined
  /** Specifies options of a lookup column. */
  var lookup: js.UndefOr[AnonAllowClearing] = js.undefined
  /** Specifies the minimum width of the column. */
  var minWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the identifier of the column. */
  var name: js.UndefOr[String] = js.undefined
  /** Specifies the band column that owns the current column. Accepts the index of the band column in the columns array. */
  var ownerBand: js.UndefOr[Double] = js.undefined
  /** Specifies whether to render the column after other columns and elements. Use if column cells have a complex template. Requires the width option specified. */
  var renderAsync: js.UndefOr[Boolean] = js.undefined
  /** Specifies the column's filter operation displayed in the filter row. */
  var selectedFilterOperation: js.UndefOr[
    Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | Greaterthansign | GreaterthansignEqualssign | between | contains | endswith | notcontains | startswith
  ] = js.undefined
  /** Specifies a function to be invoked after the user has edited a cell value, but before it will be saved in the data source. */
  var setCellValue: js.UndefOr[
    js.Function3[
      /* newData */ js.Any, 
      /* value */ js.Any, 
      /* currentRowData */ js.Any, 
      Unit | Promise[Unit] | JQueryPromise[Unit]
    ]
  ] = js.undefined
  /** Specifies whether the column displays its values using editors. */
  var showEditorAlways: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether the column chooser can contain the column header. */
  var showInColumnChooser: js.UndefOr[Boolean] = js.undefined
  /** Specifies the index according to which columns participate in sorting. */
  var sortIndex: js.UndefOr[Double] = js.undefined
  /** Specifies the sort order of column values. */
  var sortOrder: js.UndefOr[asc | desc] = js.undefined
  /** Specifies a custom comparison function for sorting. Applies only when sorting is performed on the client. */
  var sortingMethod: js.UndefOr[js.Function2[/* value1 */ js.Any, /* value2 */ js.Any, Double]] = js.undefined
  /** In a boolean column, replaces all true items with a specified text. Applies only if showEditorAlways option is false. */
  var trueText: js.UndefOr[String] = js.undefined
  /** Specifies validation rules to be checked when cell values are updated. */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  /** Specifies whether the column is visible, that is, occupies space in the table. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the position of the column regarding other columns in the resulting widget. */
  var visibleIndex: js.UndefOr[Double] = js.undefined
  /** Specifies the column's width in pixels or as a percentage. Ignored if it is less than minWidth. */
  var width: js.UndefOr[Double | String] = js.undefined
}

object GridBaseColumn {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowFixing: js.UndefOr[Boolean] = js.undefined,
    allowHeaderFiltering: js.UndefOr[Boolean] = js.undefined,
    allowHiding: js.UndefOr[Boolean] = js.undefined,
    allowReordering: js.UndefOr[Boolean] = js.undefined,
    allowResizing: js.UndefOr[Boolean] = js.undefined,
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    calculateCellValue: /* rowData */ js.Any => _ = null,
    calculateDisplayValue: String | (js.Function1[/* rowData */ js.Any, _]) = null,
    calculateFilterExpression: (/* filterValue */ js.Any, /* selectedFilterOperation */ String, /* target */ String) => String | js.Array[_] | js.Function = null,
    calculateSortValue: String | (js.Function1[/* rowData */ js.Any, _]) = null,
    caption: String = null,
    cssClass: String = null,
    customizeText: /* cellInfo */ AnonGroupInterval => String = null,
    dataField: String = null,
    dataType: string_ | number | date | boolean_ | `object` | datetime = null,
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
    headerFilter: AnonSearchMode = null,
    hidingPriority: Int | Double = null,
    isBand: js.UndefOr[Boolean] = js.undefined,
    lookup: AnonAllowClearing = null,
    minWidth: Int | Double = null,
    name: String = null,
    ownerBand: Int | Double = null,
    renderAsync: js.UndefOr[Boolean] = js.undefined,
    selectedFilterOperation: Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | Greaterthansign | GreaterthansignEqualssign | between | contains | endswith | notcontains | startswith = null,
    setCellValue: (/* newData */ js.Any, /* value */ js.Any, /* currentRowData */ js.Any) => Unit | Promise[Unit] | JQueryPromise[Unit] = null,
    showEditorAlways: js.UndefOr[Boolean] = js.undefined,
    showInColumnChooser: js.UndefOr[Boolean] = js.undefined,
    sortIndex: Int | Double = null,
    sortOrder: asc | desc = null,
    sortingMethod: (/* value1 */ js.Any, /* value2 */ js.Any) => Double = null,
    trueText: String = null,
    validationRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: Int | Double = null,
    width: Double | String = null
  ): GridBaseColumn = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFixing)) __obj.updateDynamic("allowFixing")(allowFixing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHeaderFiltering)) __obj.updateDynamic("allowHeaderFiltering")(allowHeaderFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHiding)) __obj.updateDynamic("allowHiding")(allowHiding.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReordering)) __obj.updateDynamic("allowReordering")(allowReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (calculateCellValue != null) __obj.updateDynamic("calculateCellValue")(js.Any.fromFunction1(calculateCellValue))
    if (calculateDisplayValue != null) __obj.updateDynamic("calculateDisplayValue")(calculateDisplayValue.asInstanceOf[js.Any])
    if (calculateFilterExpression != null) __obj.updateDynamic("calculateFilterExpression")(js.Any.fromFunction3(calculateFilterExpression))
    if (calculateSortValue != null) __obj.updateDynamic("calculateSortValue")(calculateSortValue.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeHtml)) __obj.updateDynamic("encodeHtml")(encodeHtml.asInstanceOf[js.Any])
    if (falseText != null) __obj.updateDynamic("falseText")(falseText.asInstanceOf[js.Any])
    if (filterOperations != null) __obj.updateDynamic("filterOperations")(filterOperations.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (filterValues != null) __obj.updateDynamic("filterValues")(filterValues.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (fixedPosition != null) __obj.updateDynamic("fixedPosition")(fixedPosition.asInstanceOf[js.Any])
    if (formItem != null) __obj.updateDynamic("formItem")(formItem.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (hidingPriority != null) __obj.updateDynamic("hidingPriority")(hidingPriority.asInstanceOf[js.Any])
    if (!js.isUndefined(isBand)) __obj.updateDynamic("isBand")(isBand.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerBand != null) __obj.updateDynamic("ownerBand")(ownerBand.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAsync)) __obj.updateDynamic("renderAsync")(renderAsync.asInstanceOf[js.Any])
    if (selectedFilterOperation != null) __obj.updateDynamic("selectedFilterOperation")(selectedFilterOperation.asInstanceOf[js.Any])
    if (setCellValue != null) __obj.updateDynamic("setCellValue")(js.Any.fromFunction3(setCellValue))
    if (!js.isUndefined(showEditorAlways)) __obj.updateDynamic("showEditorAlways")(showEditorAlways.asInstanceOf[js.Any])
    if (!js.isUndefined(showInColumnChooser)) __obj.updateDynamic("showInColumnChooser")(showInColumnChooser.asInstanceOf[js.Any])
    if (sortIndex != null) __obj.updateDynamic("sortIndex")(sortIndex.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sortingMethod != null) __obj.updateDynamic("sortingMethod")(js.Any.fromFunction2(sortingMethod))
    if (trueText != null) __obj.updateDynamic("trueText")(trueText.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visibleIndex != null) __obj.updateDynamic("visibleIndex")(visibleIndex.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBaseColumn]
  }
}

