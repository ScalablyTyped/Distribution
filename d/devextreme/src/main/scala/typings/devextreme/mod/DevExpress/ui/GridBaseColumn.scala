package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowClearing
import typings.devextreme.anon.GroupInterval
import typings.devextreme.anon.SearchMode
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
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBaseColumn extends js.Object {
  /** @name GridBaseColumn.alignment */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  /** @name GridBaseColumn.allowEditing */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.allowFiltering */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.allowFixing */
  var allowFixing: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.allowHeaderFiltering */
  var allowHeaderFiltering: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.allowHiding */
  var allowHiding: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.allowReordering */
  var allowReordering: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.allowResizing */
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.allowSearch */
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.allowSorting */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.calculateCellValue */
  var calculateCellValue: js.UndefOr[js.Function1[/* rowData */ js.Any, _]] = js.undefined
  /** @name GridBaseColumn.calculateDisplayValue */
  var calculateDisplayValue: js.UndefOr[String | (js.Function1[/* rowData */ js.Any, _])] = js.undefined
  /** @name GridBaseColumn.calculateFilterExpression */
  var calculateFilterExpression: js.UndefOr[
    js.Function3[
      /* filterValue */ js.Any, 
      /* selectedFilterOperation */ String, 
      /* target */ String, 
      String | js.Array[_] | js.Function
    ]
  ] = js.undefined
  /** @name GridBaseColumn.calculateSortValue */
  var calculateSortValue: js.UndefOr[String | (js.Function1[/* rowData */ js.Any, _])] = js.undefined
  /** @name GridBaseColumn.caption */
  var caption: js.UndefOr[String] = js.undefined
  /** @name GridBaseColumn.cssClass */
  var cssClass: js.UndefOr[String] = js.undefined
  /** @name GridBaseColumn.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* cellInfo */ GroupInterval, String]] = js.undefined
  /** @name GridBaseColumn.dataField */
  var dataField: js.UndefOr[String] = js.undefined
  /** @name GridBaseColumn.dataType */
  var dataType: js.UndefOr[string_ | number | date | boolean_ | `object` | datetime] = js.undefined
  /** @name GridBaseColumn.editorOptions */
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  /** @name GridBaseColumn.encodeHtml */
  var encodeHtml: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.falseText */
  var falseText: js.UndefOr[String] = js.undefined
  /** @name GridBaseColumn.filterOperations */
  var filterOperations: js.UndefOr[
    js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | notcontains | contains | startswith | endswith | between
    ]
  ] = js.undefined
  /** @name GridBaseColumn.filterType */
  var filterType: js.UndefOr[exclude | include] = js.undefined
  /** @name GridBaseColumn.filterValue */
  var filterValue: js.UndefOr[js.Any] = js.undefined
  /** @name GridBaseColumn.filterValues */
  var filterValues: js.UndefOr[js.Array[_]] = js.undefined
  /** @name GridBaseColumn.fixed */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.fixedPosition */
  var fixedPosition: js.UndefOr[left | right] = js.undefined
  /** @name GridBaseColumn.formItem */
  var formItem: js.UndefOr[dxFormSimpleItem] = js.undefined
  /** @name GridBaseColumn.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** @name GridBaseColumn.headerFilter */
  var headerFilter: js.UndefOr[SearchMode] = js.undefined
  /** @name GridBaseColumn.hidingPriority */
  var hidingPriority: js.UndefOr[Double] = js.undefined
  /** @name GridBaseColumn.isBand */
  var isBand: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.lookup */
  var lookup: js.UndefOr[AllowClearing] = js.undefined
  /** @name GridBaseColumn.minWidth */
  var minWidth: js.UndefOr[Double] = js.undefined
  /** @name GridBaseColumn.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name GridBaseColumn.ownerBand */
  var ownerBand: js.UndefOr[Double] = js.undefined
  /** @name GridBaseColumn.renderAsync */
  var renderAsync: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.selectedFilterOperation */
  var selectedFilterOperation: js.UndefOr[
    Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | Greaterthansign | GreaterthansignEqualssign | between | contains | endswith | notcontains | startswith
  ] = js.undefined
  /** @name GridBaseColumn.setCellValue */
  var setCellValue: js.UndefOr[
    js.Function3[
      /* newData */ js.Any, 
      /* value */ js.Any, 
      /* currentRowData */ js.Any, 
      Unit | Promise[Unit] | JQueryPromise[Unit]
    ]
  ] = js.undefined
  /** @name GridBaseColumn.showEditorAlways */
  var showEditorAlways: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.showInColumnChooser */
  var showInColumnChooser: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.sortIndex */
  var sortIndex: js.UndefOr[Double] = js.undefined
  /** @name GridBaseColumn.sortOrder */
  var sortOrder: js.UndefOr[asc | desc] = js.undefined
  /** @name GridBaseColumn.sortingMethod */
  var sortingMethod: js.UndefOr[js.Function2[/* value1 */ js.Any, /* value2 */ js.Any, Double]] = js.undefined
  /** @name GridBaseColumn.trueText */
  var trueText: js.UndefOr[String] = js.undefined
  /** @name GridBaseColumn.validationRules */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  /** @name GridBaseColumn.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name GridBaseColumn.visibleIndex */
  var visibleIndex: js.UndefOr[Double] = js.undefined
  /** @name GridBaseColumn.width */
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
    customizeText: /* cellInfo */ GroupInterval => String = null,
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
    sortIndex: js.UndefOr[Double] = js.undefined,
    sortOrder: asc | desc = null,
    sortingMethod: (/* value1 */ js.Any, /* value2 */ js.Any) => Double = null,
    trueText: String = null,
    validationRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: js.UndefOr[Double] = js.undefined,
    width: Double | String = null
  ): GridBaseColumn = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFixing)) __obj.updateDynamic("allowFixing")(allowFixing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHeaderFiltering)) __obj.updateDynamic("allowHeaderFiltering")(allowHeaderFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHiding)) __obj.updateDynamic("allowHiding")(allowHiding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReordering)) __obj.updateDynamic("allowReordering")(allowReordering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(sortIndex)) __obj.updateDynamic("sortIndex")(sortIndex.get.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sortingMethod != null) __obj.updateDynamic("sortingMethod")(js.Any.fromFunction2(sortingMethod))
    if (trueText != null) __obj.updateDynamic("trueText")(trueText.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleIndex)) __obj.updateDynamic("visibleIndex")(visibleIndex.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBaseColumn]
  }
}

