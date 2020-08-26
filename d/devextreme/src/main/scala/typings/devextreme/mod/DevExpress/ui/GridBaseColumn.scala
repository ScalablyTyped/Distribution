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
import typings.devextreme.devextremeStrings.anyof
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
import typings.devextreme.devextremeStrings.isblank
import typings.devextreme.devextremeStrings.isnotblank
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.noneof
import typings.devextreme.devextremeStrings.notcontains
import typings.devextreme.devextremeStrings.number
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.startswith
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBaseColumn extends js.Object {
  /** @name GridBaseColumn.alignment */
  var alignment: js.UndefOr[center | left | right] = js.native
  /** @name GridBaseColumn.allowEditing */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.allowFiltering */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.allowFixing */
  var allowFixing: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.allowHeaderFiltering */
  var allowHeaderFiltering: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.allowHiding */
  var allowHiding: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.allowReordering */
  var allowReordering: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.allowResizing */
  var allowResizing: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.allowSearch */
  var allowSearch: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.allowSorting */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.calculateCellValue */
  var calculateCellValue: js.UndefOr[js.Function1[/* rowData */ js.Any, _]] = js.native
  /** @name GridBaseColumn.calculateDisplayValue */
  var calculateDisplayValue: js.UndefOr[String | (js.Function1[/* rowData */ js.Any, _])] = js.native
  /** @name GridBaseColumn.calculateFilterExpression */
  var calculateFilterExpression: js.UndefOr[
    js.Function3[
      /* filterValue */ js.Any, 
      /* selectedFilterOperation */ String, 
      /* target */ String, 
      String | js.Array[_] | js.Function
    ]
  ] = js.native
  /** @name GridBaseColumn.calculateSortValue */
  var calculateSortValue: js.UndefOr[String | (js.Function1[/* rowData */ js.Any, _])] = js.native
  /** @name GridBaseColumn.caption */
  var caption: js.UndefOr[String] = js.native
  /** @name GridBaseColumn.cssClass */
  var cssClass: js.UndefOr[String] = js.native
  /** @name GridBaseColumn.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* cellInfo */ GroupInterval, String]] = js.native
  /** @name GridBaseColumn.dataField */
  var dataField: js.UndefOr[String] = js.native
  /** @name GridBaseColumn.dataType */
  var dataType: js.UndefOr[string_ | number | date | boolean_ | `object` | datetime] = js.native
  /** @name GridBaseColumn.editorOptions */
  var editorOptions: js.UndefOr[js.Any] = js.native
  /** @name GridBaseColumn.encodeHtml */
  var encodeHtml: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.falseText */
  var falseText: js.UndefOr[String] = js.native
  /** @name GridBaseColumn.filterOperations */
  var filterOperations: js.UndefOr[
    js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | anyof | noneof | String
    ]
  ] = js.native
  /** @name GridBaseColumn.filterType */
  var filterType: js.UndefOr[exclude | include] = js.native
  /** @name GridBaseColumn.filterValue */
  var filterValue: js.UndefOr[js.Any] = js.native
  /** @name GridBaseColumn.filterValues */
  var filterValues: js.UndefOr[js.Array[_]] = js.native
  /** @name GridBaseColumn.fixed */
  var fixed: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.fixedPosition */
  var fixedPosition: js.UndefOr[left | right] = js.native
  /** @name GridBaseColumn.formItem */
  var formItem: js.UndefOr[dxFormSimpleItem] = js.native
  /** @name GridBaseColumn.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  /** @name GridBaseColumn.headerFilter */
  var headerFilter: js.UndefOr[SearchMode] = js.native
  /** @name GridBaseColumn.hidingPriority */
  var hidingPriority: js.UndefOr[Double] = js.native
  /** @name GridBaseColumn.isBand */
  var isBand: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.lookup */
  var lookup: js.UndefOr[AllowClearing] = js.native
  /** @name GridBaseColumn.minWidth */
  var minWidth: js.UndefOr[Double] = js.native
  /** @name GridBaseColumn.name */
  var name: js.UndefOr[String] = js.native
  /** @name GridBaseColumn.ownerBand */
  var ownerBand: js.UndefOr[Double] = js.native
  /** @name GridBaseColumn.renderAsync */
  var renderAsync: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.selectedFilterOperation */
  var selectedFilterOperation: js.UndefOr[
    Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | Greaterthansign | GreaterthansignEqualssign | between | contains | endswith | notcontains | startswith
  ] = js.native
  /** @name GridBaseColumn.setCellValue */
  var setCellValue: js.UndefOr[
    js.Function3[
      /* newData */ js.Any, 
      /* value */ js.Any, 
      /* currentRowData */ js.Any, 
      Unit | Promise[Unit] | JQueryPromise[Unit]
    ]
  ] = js.native
  /** @name GridBaseColumn.showEditorAlways */
  var showEditorAlways: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.showInColumnChooser */
  var showInColumnChooser: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.sortIndex */
  var sortIndex: js.UndefOr[Double] = js.native
  /** @name GridBaseColumn.sortOrder */
  var sortOrder: js.UndefOr[asc | desc] = js.native
  /** @name GridBaseColumn.sortingMethod */
  var sortingMethod: js.UndefOr[js.Function2[/* value1 */ js.Any, /* value2 */ js.Any, Double]] = js.native
  /** @name GridBaseColumn.trueText */
  var trueText: js.UndefOr[String] = js.native
  /** @name GridBaseColumn.validationRules */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  /** @name GridBaseColumn.visible */
  var visible: js.UndefOr[Boolean] = js.native
  /** @name GridBaseColumn.visibleIndex */
  var visibleIndex: js.UndefOr[Double] = js.native
  /** @name GridBaseColumn.width */
  var width: js.UndefOr[Double | String] = js.native
}

object GridBaseColumn {
  @scala.inline
  def apply(): GridBaseColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseColumn]
  }
  @scala.inline
  implicit class GridBaseColumnOps[Self <: GridBaseColumn] (val x: Self) extends AnyVal {
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
    def setAlignment(value: center | left | right): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setAllowEditing(value: Boolean): Self = this.set("allowEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditing: Self = this.set("allowEditing", js.undefined)
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = this.set("allowFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFiltering: Self = this.set("allowFiltering", js.undefined)
    @scala.inline
    def setAllowFixing(value: Boolean): Self = this.set("allowFixing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFixing: Self = this.set("allowFixing", js.undefined)
    @scala.inline
    def setAllowHeaderFiltering(value: Boolean): Self = this.set("allowHeaderFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHeaderFiltering: Self = this.set("allowHeaderFiltering", js.undefined)
    @scala.inline
    def setAllowHiding(value: Boolean): Self = this.set("allowHiding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHiding: Self = this.set("allowHiding", js.undefined)
    @scala.inline
    def setAllowReordering(value: Boolean): Self = this.set("allowReordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowReordering: Self = this.set("allowReordering", js.undefined)
    @scala.inline
    def setAllowResizing(value: Boolean): Self = this.set("allowResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResizing: Self = this.set("allowResizing", js.undefined)
    @scala.inline
    def setAllowSearch(value: Boolean): Self = this.set("allowSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSearch: Self = this.set("allowSearch", js.undefined)
    @scala.inline
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    @scala.inline
    def setCalculateCellValue(value: /* rowData */ js.Any => _): Self = this.set("calculateCellValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCalculateCellValue: Self = this.set("calculateCellValue", js.undefined)
    @scala.inline
    def setCalculateDisplayValueFunction1(value: /* rowData */ js.Any => _): Self = this.set("calculateDisplayValue", js.Any.fromFunction1(value))
    @scala.inline
    def setCalculateDisplayValue(value: String | (js.Function1[/* rowData */ js.Any, _])): Self = this.set("calculateDisplayValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculateDisplayValue: Self = this.set("calculateDisplayValue", js.undefined)
    @scala.inline
    def setCalculateFilterExpression(
      value: (/* filterValue */ js.Any, /* selectedFilterOperation */ String, /* target */ String) => String | js.Array[_] | js.Function
    ): Self = this.set("calculateFilterExpression", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCalculateFilterExpression: Self = this.set("calculateFilterExpression", js.undefined)
    @scala.inline
    def setCalculateSortValueFunction1(value: /* rowData */ js.Any => _): Self = this.set("calculateSortValue", js.Any.fromFunction1(value))
    @scala.inline
    def setCalculateSortValue(value: String | (js.Function1[/* rowData */ js.Any, _])): Self = this.set("calculateSortValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculateSortValue: Self = this.set("calculateSortValue", js.undefined)
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setCustomizeText(value: /* cellInfo */ GroupInterval => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    @scala.inline
    def setDataField(value: String): Self = this.set("dataField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataField: Self = this.set("dataField", js.undefined)
    @scala.inline
    def setDataType(value: string_ | number | date | boolean_ | `object` | datetime): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setEditorOptions(value: js.Any): Self = this.set("editorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorOptions: Self = this.set("editorOptions", js.undefined)
    @scala.inline
    def setEncodeHtml(value: Boolean): Self = this.set("encodeHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodeHtml: Self = this.set("encodeHtml", js.undefined)
    @scala.inline
    def setFalseText(value: String): Self = this.set("falseText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFalseText: Self = this.set("falseText", js.undefined)
    @scala.inline
    def setFilterOperationsVarargs(
      value: (Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | anyof | noneof | String)*
    ): Self = this.set("filterOperations", js.Array(value :_*))
    @scala.inline
    def setFilterOperations(
      value: js.Array[
          Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | anyof | noneof | String
        ]
    ): Self = this.set("filterOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterOperations: Self = this.set("filterOperations", js.undefined)
    @scala.inline
    def setFilterType(value: exclude | include): Self = this.set("filterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    @scala.inline
    def setFilterValue(value: js.Any): Self = this.set("filterValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterValue: Self = this.set("filterValue", js.undefined)
    @scala.inline
    def setFilterValuesVarargs(value: js.Any*): Self = this.set("filterValues", js.Array(value :_*))
    @scala.inline
    def setFilterValues(value: js.Array[_]): Self = this.set("filterValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterValues: Self = this.set("filterValues", js.undefined)
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setFixedPosition(value: left | right): Self = this.set("fixedPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedPosition: Self = this.set("fixedPosition", js.undefined)
    @scala.inline
    def setFormItem(value: dxFormSimpleItem): Self = this.set("formItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormItem: Self = this.set("formItem", js.undefined)
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeaderFilter(value: SearchMode): Self = this.set("headerFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFilter: Self = this.set("headerFilter", js.undefined)
    @scala.inline
    def setHidingPriority(value: Double): Self = this.set("hidingPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidingPriority: Self = this.set("hidingPriority", js.undefined)
    @scala.inline
    def setIsBand(value: Boolean): Self = this.set("isBand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBand: Self = this.set("isBand", js.undefined)
    @scala.inline
    def setLookup(value: AllowClearing): Self = this.set("lookup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwnerBand(value: Double): Self = this.set("ownerBand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerBand: Self = this.set("ownerBand", js.undefined)
    @scala.inline
    def setRenderAsync(value: Boolean): Self = this.set("renderAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAsync: Self = this.set("renderAsync", js.undefined)
    @scala.inline
    def setSelectedFilterOperation(
      value: Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | Greaterthansign | GreaterthansignEqualssign | between | contains | endswith | notcontains | startswith
    ): Self = this.set("selectedFilterOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedFilterOperation: Self = this.set("selectedFilterOperation", js.undefined)
    @scala.inline
    def setSetCellValue(
      value: (/* newData */ js.Any, /* value */ js.Any, /* currentRowData */ js.Any) => Unit | Promise[Unit] | JQueryPromise[Unit]
    ): Self = this.set("setCellValue", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetCellValue: Self = this.set("setCellValue", js.undefined)
    @scala.inline
    def setShowEditorAlways(value: Boolean): Self = this.set("showEditorAlways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowEditorAlways: Self = this.set("showEditorAlways", js.undefined)
    @scala.inline
    def setShowInColumnChooser(value: Boolean): Self = this.set("showInColumnChooser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInColumnChooser: Self = this.set("showInColumnChooser", js.undefined)
    @scala.inline
    def setSortIndex(value: Double): Self = this.set("sortIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortIndex: Self = this.set("sortIndex", js.undefined)
    @scala.inline
    def setSortOrder(value: asc | desc): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setSortingMethod(value: (/* value1 */ js.Any, /* value2 */ js.Any) => Double): Self = this.set("sortingMethod", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSortingMethod: Self = this.set("sortingMethod", js.undefined)
    @scala.inline
    def setTrueText(value: String): Self = this.set("trueText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrueText: Self = this.set("trueText", js.undefined)
    @scala.inline
    def setValidationRulesVarargs(
      value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
    ): Self = this.set("validationRules", js.Array(value :_*))
    @scala.inline
    def setValidationRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleIndex: Self = this.set("visibleIndex", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

