package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.DataType
import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.SortOrder
import typings.devextreme.mod.DevExpress.common.charts.FilterOperation
import typings.devextreme.mod.DevExpress.common.charts.FilterType
import typings.devextreme.mod.DevExpress.common.charts.SelectedFilterOperation
import typings.devextreme.mod.DevExpress.common.grids.ColumnCustomizeTextArg
import typings.devextreme.mod.DevExpress.common.grids.ColumnHeaderFilter
import typings.devextreme.mod.DevExpress.core.DeepPartial
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnCellTemplateData
import typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnHeaderCellTemplateData
import typings.std.HTMLElement
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined devextreme.devextreme.DevExpress.core.Skip<devextreme.devextreme.DevExpress.ui.dxGanttColumnBlank<TRowData, TKey>, 'allowEditing' | 'allowFixing' | 'allowHiding' | 'allowReordering' | 'allowResizing' | 'allowSearch' | 'buttons' | 'columns' | 'editCellTemplate' | 'editorOptions' | 'fixed' | 'fixedPosition' | 'formItem' | 'hidingPriority' | 'isBand' | 'lookup' | 'name' | 'ownerBand' | 'renderAsync' | 'setCellValue' | 'showEditorAlways' | 'showInColumnChooser' | 'type' | 'validationRules'> */
trait dxGanttColumn[TRowData, TKey] extends StObject {
  
  var alignment: js.UndefOr[HorizontalAlignment] = js.undefined
  
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  
  var allowHeaderFiltering: js.UndefOr[Boolean] = js.undefined
  
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  
  var calculateCellValue: js.UndefOr[js.Function1[/* rowData */ TRowData, Any]] = js.undefined
  
  var calculateDisplayValue: js.UndefOr[String | (js.Function1[/* rowData */ TRowData, Any])] = js.undefined
  
  var calculateFilterExpression: js.UndefOr[
    js.Function3[
      /* filterValue */ Any, 
      /* selectedFilterOperation */ String, 
      /* target */ String, 
      String | js.Array[Any] | js.Function
    ]
  ] = js.undefined
  
  var calculateSortValue: js.UndefOr[String | (js.Function1[/* rowData */ TRowData, Any])] = js.undefined
  
  var caption: js.UndefOr[String] = js.undefined
  
  var cellTemplate: js.UndefOr[
    template | (js.Function2[
      /* cellElement */ DxElement_[HTMLElement], 
      /* cellInfo */ ColumnCellTemplateData[TRowData, TKey], 
      Any
    ])
  ] = js.undefined
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var customizeText: js.UndefOr[js.Function1[/* cellInfo */ ColumnCustomizeTextArg, String]] = js.undefined
  
  var dataField: js.UndefOr[String] = js.undefined
  
  var dataType: js.UndefOr[DataType] = js.undefined
  
  var defaultCalculateCellValue: js.UndefOr[js.Function1[/* rowData */ Any, Any]] = js.undefined
  
  var defaultCalculateFilterExpression: js.UndefOr[
    js.Function3[
      /* filterValue */ Any, 
      /* selectedFilterOperation */ String, 
      /* target */ String, 
      String | js.Array[Any] | js.Function
    ]
  ] = js.undefined
  
  var defaultSetCellValue: js.UndefOr[
    js.Function3[
      /* newData */ DeepPartial[Any], 
      /* value */ Any, 
      /* currentRowData */ Any, 
      Unit | PromiseLike[Unit]
    ]
  ] = js.undefined
  
  var encodeHtml: js.UndefOr[Boolean] = js.undefined
  
  var falseText: js.UndefOr[String] = js.undefined
  
  var filterOperations: js.UndefOr[js.Array[FilterOperation | String]] = js.undefined
  
  var filterType: js.UndefOr[FilterType] = js.undefined
  
  var filterValue: js.UndefOr[Any] = js.undefined
  
  var filterValues: js.UndefOr[js.Array[Any]] = js.undefined
  
  var format: js.UndefOr[Format] = js.undefined
  
  var headerCellTemplate: js.UndefOr[
    template | (js.Function2[
      /* columnHeader */ DxElement_[HTMLElement], 
      /* headerInfo */ ColumnHeaderCellTemplateData[TRowData, TKey], 
      Any
    ])
  ] = js.undefined
  
  var headerFilter: js.UndefOr[ColumnHeaderFilter] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var selectedFilterOperation: js.UndefOr[SelectedFilterOperation] = js.undefined
  
  var sortIndex: js.UndefOr[Double] = js.undefined
  
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  
  var sortingMethod: js.UndefOr[js.Function2[/* value1 */ Any, /* value2 */ Any, Double]] = js.undefined
  
  var trueText: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var visibleIndex: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object dxGanttColumn {
  
  inline def apply[TRowData, TKey](): dxGanttColumn[TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttColumn[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxGanttColumn[?, ?], TRowData, TKey] (val x: Self & (dxGanttColumn[TRowData, TKey])) extends AnyVal {
    
    inline def setAlignment(value: HorizontalAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
    
    inline def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
    
    inline def setAllowHeaderFiltering(value: Boolean): Self = StObject.set(x, "allowHeaderFiltering", value.asInstanceOf[js.Any])
    
    inline def setAllowHeaderFilteringUndefined: Self = StObject.set(x, "allowHeaderFiltering", js.undefined)
    
    inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
    
    inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
    
    inline def setCalculateCellValue(value: /* rowData */ TRowData => Any): Self = StObject.set(x, "calculateCellValue", js.Any.fromFunction1(value))
    
    inline def setCalculateCellValueUndefined: Self = StObject.set(x, "calculateCellValue", js.undefined)
    
    inline def setCalculateDisplayValue(value: String | (js.Function1[/* rowData */ TRowData, Any])): Self = StObject.set(x, "calculateDisplayValue", value.asInstanceOf[js.Any])
    
    inline def setCalculateDisplayValueFunction1(value: /* rowData */ TRowData => Any): Self = StObject.set(x, "calculateDisplayValue", js.Any.fromFunction1(value))
    
    inline def setCalculateDisplayValueUndefined: Self = StObject.set(x, "calculateDisplayValue", js.undefined)
    
    inline def setCalculateFilterExpression(
      value: (/* filterValue */ Any, /* selectedFilterOperation */ String, /* target */ String) => String | js.Array[Any] | js.Function
    ): Self = StObject.set(x, "calculateFilterExpression", js.Any.fromFunction3(value))
    
    inline def setCalculateFilterExpressionUndefined: Self = StObject.set(x, "calculateFilterExpression", js.undefined)
    
    inline def setCalculateSortValue(value: String | (js.Function1[/* rowData */ TRowData, Any])): Self = StObject.set(x, "calculateSortValue", value.asInstanceOf[js.Any])
    
    inline def setCalculateSortValueFunction1(value: /* rowData */ TRowData => Any): Self = StObject.set(x, "calculateSortValue", js.Any.fromFunction1(value))
    
    inline def setCalculateSortValueUndefined: Self = StObject.set(x, "calculateSortValue", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCellTemplate(
      value: template | (js.Function2[
          /* cellElement */ DxElement_[HTMLElement], 
          /* cellInfo */ ColumnCellTemplateData[TRowData, TKey], 
          Any
        ])
    ): Self = StObject.set(x, "cellTemplate", value.asInstanceOf[js.Any])
    
    inline def setCellTemplateFunction2(
      value: (/* cellElement */ DxElement_[HTMLElement], /* cellInfo */ ColumnCellTemplateData[TRowData, TKey]) => Any
    ): Self = StObject.set(x, "cellTemplate", js.Any.fromFunction2(value))
    
    inline def setCellTemplateUndefined: Self = StObject.set(x, "cellTemplate", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setCustomizeText(value: /* cellInfo */ ColumnCustomizeTextArg => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDefaultCalculateCellValue(value: /* rowData */ Any => Any): Self = StObject.set(x, "defaultCalculateCellValue", js.Any.fromFunction1(value))
    
    inline def setDefaultCalculateCellValueUndefined: Self = StObject.set(x, "defaultCalculateCellValue", js.undefined)
    
    inline def setDefaultCalculateFilterExpression(
      value: (/* filterValue */ Any, /* selectedFilterOperation */ String, /* target */ String) => String | js.Array[Any] | js.Function
    ): Self = StObject.set(x, "defaultCalculateFilterExpression", js.Any.fromFunction3(value))
    
    inline def setDefaultCalculateFilterExpressionUndefined: Self = StObject.set(x, "defaultCalculateFilterExpression", js.undefined)
    
    inline def setDefaultSetCellValue(
      value: (/* newData */ DeepPartial[Any], /* value */ Any, /* currentRowData */ Any) => Unit | PromiseLike[Unit]
    ): Self = StObject.set(x, "defaultSetCellValue", js.Any.fromFunction3(value))
    
    inline def setDefaultSetCellValueUndefined: Self = StObject.set(x, "defaultSetCellValue", js.undefined)
    
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
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeaderCellTemplate(
      value: template | (js.Function2[
          /* columnHeader */ DxElement_[HTMLElement], 
          /* headerInfo */ ColumnHeaderCellTemplateData[TRowData, TKey], 
          Any
        ])
    ): Self = StObject.set(x, "headerCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderCellTemplateFunction2(
      value: (/* columnHeader */ DxElement_[HTMLElement], /* headerInfo */ ColumnHeaderCellTemplateData[TRowData, TKey]) => Any
    ): Self = StObject.set(x, "headerCellTemplate", js.Any.fromFunction2(value))
    
    inline def setHeaderCellTemplateUndefined: Self = StObject.set(x, "headerCellTemplate", js.undefined)
    
    inline def setHeaderFilter(value: ColumnHeaderFilter): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setSelectedFilterOperation(value: SelectedFilterOperation): Self = StObject.set(x, "selectedFilterOperation", value.asInstanceOf[js.Any])
    
    inline def setSelectedFilterOperationUndefined: Self = StObject.set(x, "selectedFilterOperation", js.undefined)
    
    inline def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
    
    inline def setSortIndexUndefined: Self = StObject.set(x, "sortIndex", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setSortingMethod(value: (/* value1 */ Any, /* value2 */ Any) => Double): Self = StObject.set(x, "sortingMethod", js.Any.fromFunction2(value))
    
    inline def setSortingMethodUndefined: Self = StObject.set(x, "sortingMethod", js.undefined)
    
    inline def setTrueText(value: String): Self = StObject.set(x, "trueText", value.asInstanceOf[js.Any])
    
    inline def setTrueTextUndefined: Self = StObject.set(x, "trueText", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndexUndefined: Self = StObject.set(x, "visibleIndex", js.undefined)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
