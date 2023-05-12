package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.common.DataType
import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.HorizontalEdge
import typings.devextreme.mod.DevExpress.common.SortOrder
import typings.devextreme.mod.DevExpress.common.ValidationRule
import typings.devextreme.mod.DevExpress.core.DeepPartial
import typings.devextreme.mod.DevExpress.ui.Format
import typings.devextreme.mod.DevExpress.ui.dxForm.SimpleItem
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnBase[TRowData] extends StObject {
  
  /**
    * Aligns the content of the column.
    */
  var alignment: js.UndefOr[HorizontalAlignment] = js.undefined
  
  /**
    * Specifies whether a user can edit values in the column at runtime. By default, inherits the value of the editing.allowUpdating property.
    */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether data can be filtered by this column. Applies only if filterRow.visible is true.
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can fix the column at runtime. Applies only if columnFixing.enabled is true.
    */
  var allowFixing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the header filter can be used to filter data by this column. Applies only if headerFilter.visible is true. By default, inherits the value of the allowFiltering property.
    */
  var allowHeaderFiltering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can hide the column using the column chooser at runtime. Applies only if columnChooser.enabled is true.
    */
  var allowHiding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether this column can be used in column reordering at runtime. Applies only if allowColumnReordering is true.
    */
  var allowReordering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can resize the column at runtime. Applies only if allowColumnResizing is true.
    */
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether this column can be searched. Applies only if searchPanel.visible is true. Inherits the value of the allowFiltering property by default.
    */
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can sort rows by this column at runtime. Applies only if sorting.mode differs from &apos;none&apos;.
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Calculates custom cell values. Use this function to create an unbound data column.
    */
  var calculateCellValue: js.UndefOr[js.ThisFunction1[/* this */ ColumnBase[Any], /* rowData */ TRowData, Any]] = js.undefined
  
  /**
    * Calculates custom display values for column cells. Requires specifying the dataField or calculateCellValue property. Used in lookup optimization.
    */
  var calculateDisplayValue: js.UndefOr[
    String | (js.ThisFunction1[/* this */ ColumnBase[Any], /* rowData */ TRowData, Any])
  ] = js.undefined
  
  /**
    * Specifies the column&apos;s custom rules to filter data.
    */
  var calculateFilterExpression: js.UndefOr[
    js.ThisFunction3[
      /* this */ ColumnBase[Any], 
      /* filterValue */ Any, 
      /* selectedFilterOperation */ String | Null, 
      /* target */ String, 
      String | js.Array[Any] | js.Function
    ]
  ] = js.undefined
  
  /**
    * Calculates custom values used to sort this column.
    */
  var calculateSortValue: js.UndefOr[
    String | (js.ThisFunction1[/* this */ ColumnBase[Any], /* rowData */ TRowData, Any])
  ] = js.undefined
  
  /**
    * Specifies a caption for the column.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a CSS class to be applied to the column.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Customizes the text displayed in column cells.
    */
  var customizeText: js.UndefOr[
    js.ThisFunction1[/* this */ ColumnBase[Any], /* cellInfo */ ColumnCustomizeTextArg, String]
  ] = js.undefined
  
  /**
    * Binds the column to a field of the dataSource.
    */
  var dataField: js.UndefOr[String] = js.undefined
  
  /**
    * Casts column values to a specific data type.
    */
  var dataType: js.UndefOr[DataType] = js.undefined
  
  var defaultCalculateCellValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['calculateCellValue'] */ js.Any
  ] = js.undefined
  
  var defaultCalculateFilterExpression: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['calculateFilterExpression'] */ js.Any
  ] = js.undefined
  
  var defaultSetCellValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['setCellValue'] */ js.Any
  ] = js.undefined
  
  /**
    * Configures the default UI component used for editing and filtering in the filter row.
    */
  var editorOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies whether HTML tags are displayed as plain text or applied to the values of the column.
    */
  var encodeHtml: js.UndefOr[Boolean] = js.undefined
  
  /**
    * In a boolean column, replaces all false items with a specified text. Applies only if showEditorAlways property is false.
    */
  var falseText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies available filter operations. Applies if allowFiltering is true and the filterRow and/or filterPanel are visible.
    */
  var filterOperations: js.UndefOr[js.Array[FilterOperation | String]] = js.undefined
  
  /**
    * Specifies whether a user changes the current filter by including (selecting) or excluding (clearing the selection of) values. Applies only if headerFilter.visible and allowHeaderFiltering are true.
    */
  var filterType: js.UndefOr[FilterType] = js.undefined
  
  /**
    * Specifies the column&apos;s filter value displayed in the filter row.
    */
  var filterValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies values selected in the column&apos;s header filter.
    */
  var filterValues: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Fixes the column.
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the UI component&apos;s edge to which the column is fixed. Applies only if columns[].fixed is true.
    */
  var fixedPosition: js.UndefOr[HorizontalEdge] = js.undefined
  
  /**
    * Configures the form item that the column produces in the editing state. Applies only if editing.mode is &apos;form&apos; or &apos;popup&apos;.
    */
  var formItem: js.UndefOr[SimpleItem] = js.undefined
  
  /**
    * Formats a value before it is displayed in a column cell.
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    * Specifies data settings for the header filter.
    */
  var headerFilter: js.UndefOr[ColumnHeaderFilter] = js.undefined
  
  /**
    * Specifies the order in which columns are hidden when the UI component adapts to the screen or container size. Ignored if allowColumnResizing is true and columnResizingMode is &apos;widget&apos;.
    */
  var hidingPriority: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the column organizes other columns into bands.
    */
  var isBand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies properties of a lookup column.
    */
  var lookup: js.UndefOr[ColumnLookup] = js.undefined
  
  /**
    * Specifies the minimum width of the column.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the column&apos;s unique identifier. If not set in code, this value is inherited from the dataField.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the band column that owns the current column. Accepts the index of the band column in the columns array.
    */
  var ownerBand: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether to render the column after other columns and elements. Use if column cells have a complex template. Requires the width property specified.
    */
  var renderAsync: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a filter operation that applies when users use the filter row to filter the column.
    */
  var selectedFilterOperation: js.UndefOr[SelectedFilterOperation] = js.undefined
  
  /**
    * Specifies a function to be invoked after the user has edited a cell value, but before it will be saved in the data source.
    */
  var setCellValue: js.UndefOr[
    js.ThisFunction3[
      /* this */ ColumnBase[Any], 
      /* newData */ DeepPartial[TRowData], 
      /* value */ Any, 
      /* currentRowData */ TRowData, 
      Unit | PromiseLike[Unit]
    ]
  ] = js.undefined
  
  /**
    * Specifies whether the column displays its values using editors.
    */
  var showEditorAlways: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the column chooser can contain the column header.
    */
  var showInColumnChooser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the index according to which columns participate in sorting.
    */
  var sortIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the sort order of column values.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  
  /**
    * Specifies a custom comparison function for sorting. Applies only when sorting is performed on the client.
    */
  var sortingMethod: js.UndefOr[
    js.ThisFunction2[/* this */ ColumnBase[Any], /* value1 */ Any, /* value2 */ Any, Double]
  ] = js.undefined
  
  /**
    * In a boolean column, replaces all true items with a specified text. Applies only if showEditorAlways property is false.
    */
  var trueText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies validation rules to be checked when cell values are updated.
    */
  var validationRules: js.UndefOr[js.Array[ValidationRule]] = js.undefined
  
  /**
    * Specifies whether the column is visible, that is, occupies space in the table.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the position of the column regarding other columns in the resulting UI component.
    */
  var visibleIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the column&apos;s width in pixels or as a percentage. Ignored if it is less than minWidth.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object ColumnBase {
  
  inline def apply[TRowData](): ColumnBase[TRowData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnBase[TRowData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnBase[?], TRowData] (val x: Self & ColumnBase[TRowData]) extends AnyVal {
    
    inline def setAlignment(value: HorizontalAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
    
    inline def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
    
    inline def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
    
    inline def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
    
    inline def setAllowFixing(value: Boolean): Self = StObject.set(x, "allowFixing", value.asInstanceOf[js.Any])
    
    inline def setAllowFixingUndefined: Self = StObject.set(x, "allowFixing", js.undefined)
    
    inline def setAllowHeaderFiltering(value: Boolean): Self = StObject.set(x, "allowHeaderFiltering", value.asInstanceOf[js.Any])
    
    inline def setAllowHeaderFilteringUndefined: Self = StObject.set(x, "allowHeaderFiltering", js.undefined)
    
    inline def setAllowHiding(value: Boolean): Self = StObject.set(x, "allowHiding", value.asInstanceOf[js.Any])
    
    inline def setAllowHidingUndefined: Self = StObject.set(x, "allowHiding", js.undefined)
    
    inline def setAllowReordering(value: Boolean): Self = StObject.set(x, "allowReordering", value.asInstanceOf[js.Any])
    
    inline def setAllowReorderingUndefined: Self = StObject.set(x, "allowReordering", js.undefined)
    
    inline def setAllowResizing(value: Boolean): Self = StObject.set(x, "allowResizing", value.asInstanceOf[js.Any])
    
    inline def setAllowResizingUndefined: Self = StObject.set(x, "allowResizing", js.undefined)
    
    inline def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    inline def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
    
    inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
    
    inline def setCalculateCellValue(value: js.ThisFunction1[/* this */ ColumnBase[Any], /* rowData */ TRowData, Any]): Self = StObject.set(x, "calculateCellValue", value.asInstanceOf[js.Any])
    
    inline def setCalculateCellValueUndefined: Self = StObject.set(x, "calculateCellValue", js.undefined)
    
    inline def setCalculateDisplayValue(value: String | (js.ThisFunction1[/* this */ ColumnBase[Any], /* rowData */ TRowData, Any])): Self = StObject.set(x, "calculateDisplayValue", value.asInstanceOf[js.Any])
    
    inline def setCalculateDisplayValueUndefined: Self = StObject.set(x, "calculateDisplayValue", js.undefined)
    
    inline def setCalculateFilterExpression(
      value: js.ThisFunction3[
          /* this */ ColumnBase[Any], 
          /* filterValue */ Any, 
          /* selectedFilterOperation */ String | Null, 
          /* target */ String, 
          String | js.Array[Any] | js.Function
        ]
    ): Self = StObject.set(x, "calculateFilterExpression", value.asInstanceOf[js.Any])
    
    inline def setCalculateFilterExpressionUndefined: Self = StObject.set(x, "calculateFilterExpression", js.undefined)
    
    inline def setCalculateSortValue(value: String | (js.ThisFunction1[/* this */ ColumnBase[Any], /* rowData */ TRowData, Any])): Self = StObject.set(x, "calculateSortValue", value.asInstanceOf[js.Any])
    
    inline def setCalculateSortValueUndefined: Self = StObject.set(x, "calculateSortValue", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setCustomizeText(value: js.ThisFunction1[/* this */ ColumnBase[Any], /* cellInfo */ ColumnCustomizeTextArg, String]): Self = StObject.set(x, "customizeText", value.asInstanceOf[js.Any])
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDefaultCalculateCellValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['calculateCellValue'] */ js.Any
    ): Self = StObject.set(x, "defaultCalculateCellValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultCalculateCellValueUndefined: Self = StObject.set(x, "defaultCalculateCellValue", js.undefined)
    
    inline def setDefaultCalculateFilterExpression(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['calculateFilterExpression'] */ js.Any
    ): Self = StObject.set(x, "defaultCalculateFilterExpression", value.asInstanceOf[js.Any])
    
    inline def setDefaultCalculateFilterExpressionUndefined: Self = StObject.set(x, "defaultCalculateFilterExpression", js.undefined)
    
    inline def setDefaultSetCellValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['setCellValue'] */ js.Any
    ): Self = StObject.set(x, "defaultSetCellValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultSetCellValueUndefined: Self = StObject.set(x, "defaultSetCellValue", js.undefined)
    
    inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
    
    inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
    
    inline def setEncodeHtml(value: Boolean): Self = StObject.set(x, "encodeHtml", value.asInstanceOf[js.Any])
    
    inline def setEncodeHtmlUndefined: Self = StObject.set(x, "encodeHtml", js.undefined)
    
    inline def setFalseText(value: String): Self = StObject.set(x, "falseText", value.asInstanceOf[js.Any])
    
    inline def setFalseTextUndefined: Self = StObject.set(x, "falseText", js.undefined)
    
    inline def setFilterOperations(value: js.Array[FilterOperation | String]): Self = StObject.set(x, "filterOperations", value.asInstanceOf[js.Any])
    
    inline def setFilterOperationsUndefined: Self = StObject.set(x, "filterOperations", js.undefined)
    
    inline def setFilterOperationsVarargs(value: (FilterOperation | String)*): Self = StObject.set(x, "filterOperations", js.Array(value*))
    
    inline def setFilterType(value: FilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    inline def setFilterValue(value: Any): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
    
    inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
    
    inline def setFilterValues(value: js.Array[Any]): Self = StObject.set(x, "filterValues", value.asInstanceOf[js.Any])
    
    inline def setFilterValuesUndefined: Self = StObject.set(x, "filterValues", js.undefined)
    
    inline def setFilterValuesVarargs(value: Any*): Self = StObject.set(x, "filterValues", js.Array(value*))
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedPosition(value: HorizontalEdge): Self = StObject.set(x, "fixedPosition", value.asInstanceOf[js.Any])
    
    inline def setFixedPositionUndefined: Self = StObject.set(x, "fixedPosition", js.undefined)
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setFormItem(value: SimpleItem): Self = StObject.set(x, "formItem", value.asInstanceOf[js.Any])
    
    inline def setFormItemUndefined: Self = StObject.set(x, "formItem", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeaderFilter(value: ColumnHeaderFilter): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
    
    inline def setHidingPriority(value: Double): Self = StObject.set(x, "hidingPriority", value.asInstanceOf[js.Any])
    
    inline def setHidingPriorityUndefined: Self = StObject.set(x, "hidingPriority", js.undefined)
    
    inline def setIsBand(value: Boolean): Self = StObject.set(x, "isBand", value.asInstanceOf[js.Any])
    
    inline def setIsBandUndefined: Self = StObject.set(x, "isBand", js.undefined)
    
    inline def setLookup(value: ColumnLookup): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
    
    inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwnerBand(value: Double): Self = StObject.set(x, "ownerBand", value.asInstanceOf[js.Any])
    
    inline def setOwnerBandUndefined: Self = StObject.set(x, "ownerBand", js.undefined)
    
    inline def setRenderAsync(value: Boolean): Self = StObject.set(x, "renderAsync", value.asInstanceOf[js.Any])
    
    inline def setRenderAsyncUndefined: Self = StObject.set(x, "renderAsync", js.undefined)
    
    inline def setSelectedFilterOperation(value: SelectedFilterOperation): Self = StObject.set(x, "selectedFilterOperation", value.asInstanceOf[js.Any])
    
    inline def setSelectedFilterOperationUndefined: Self = StObject.set(x, "selectedFilterOperation", js.undefined)
    
    inline def setSetCellValue(
      value: js.ThisFunction3[
          /* this */ ColumnBase[Any], 
          /* newData */ DeepPartial[TRowData], 
          /* value */ Any, 
          /* currentRowData */ TRowData, 
          Unit | PromiseLike[Unit]
        ]
    ): Self = StObject.set(x, "setCellValue", value.asInstanceOf[js.Any])
    
    inline def setSetCellValueUndefined: Self = StObject.set(x, "setCellValue", js.undefined)
    
    inline def setShowEditorAlways(value: Boolean): Self = StObject.set(x, "showEditorAlways", value.asInstanceOf[js.Any])
    
    inline def setShowEditorAlwaysUndefined: Self = StObject.set(x, "showEditorAlways", js.undefined)
    
    inline def setShowInColumnChooser(value: Boolean): Self = StObject.set(x, "showInColumnChooser", value.asInstanceOf[js.Any])
    
    inline def setShowInColumnChooserUndefined: Self = StObject.set(x, "showInColumnChooser", js.undefined)
    
    inline def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
    
    inline def setSortIndexUndefined: Self = StObject.set(x, "sortIndex", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setSortingMethod(value: js.ThisFunction2[/* this */ ColumnBase[Any], /* value1 */ Any, /* value2 */ Any, Double]): Self = StObject.set(x, "sortingMethod", value.asInstanceOf[js.Any])
    
    inline def setSortingMethodUndefined: Self = StObject.set(x, "sortingMethod", js.undefined)
    
    inline def setTrueText(value: String): Self = StObject.set(x, "trueText", value.asInstanceOf[js.Any])
    
    inline def setTrueTextUndefined: Self = StObject.set(x, "trueText", js.undefined)
    
    inline def setValidationRules(value: js.Array[ValidationRule]): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
    
    inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
    
    inline def setValidationRulesVarargs(value: ValidationRule*): Self = StObject.set(x, "validationRules", js.Array(value*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndexUndefined: Self = StObject.set(x, "visibleIndex", js.undefined)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
