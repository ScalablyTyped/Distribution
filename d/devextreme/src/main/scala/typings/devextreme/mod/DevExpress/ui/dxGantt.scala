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
import typings.devextreme.mod.DevExpress.core.utils.DxPromise
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.DxEvent
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnCellTemplateData
import typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnHeaderCellTemplateData
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Number
import typings.std.PointerEvent
import typings.std.PromiseLike
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxGantt
  extends StObject
     with Widget[dxGanttOptions] {
  
  /**
    * Assigns a resource to a task.
    */
  def assignResourceToTask(resourceKey: Any, taskKey: Any): Unit = js.native
  
  /**
    * Collapses all tasks.
    */
  def collapseAll(): Unit = js.native
  
  /**
    * Collapses a task.
    */
  def collapseTask(key: Any): Unit = js.native
  
  /**
    * Deletes a dependency.
    */
  def deleteDependency(key: Any): Unit = js.native
  
  /**
    * Deletes a resource.
    */
  def deleteResource(key: Any): Unit = js.native
  
  /**
    * Deletes a task.
    */
  def deleteTask(key: Any): Unit = js.native
  
  /**
    * Expands all tasks.
    */
  def expandAll(): Unit = js.native
  
  /**
    * Expands all tasks down to the specified hierarchical level.
    */
  def expandAllToLevel(level: Number): Unit = js.native
  
  /**
    * Expands a task.
    */
  def expandTask(key: Any): Unit = js.native
  
  /**
    * Expands a task&apos;s parent tasks.
    */
  def expandToTask(key: Any): Unit = js.native
  
  /**
    * Gets the dependency data.
    */
  def getDependencyData(key: Any): Any = js.native
  
  /**
    * Gets the resource assignment data.
    */
  def getResourceAssignmentData(key: Any): Any = js.native
  
  /**
    * Gets the resource data.
    */
  def getResourceData(key: Any): Any = js.native
  
  /**
    * Gets the task data.
    */
  def getTaskData(key: Any): Any = js.native
  
  /**
    * Gets resources assigned to a task.
    */
  def getTaskResources(key: Any): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible dependencies.
    */
  def getVisibleDependencyKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible resource assignments.
    */
  def getVisibleResourceAssignmentKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible resources.
    */
  def getVisibleResourceKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible tasks.
    */
  def getVisibleTaskKeys(): js.Array[Any] = js.native
  
  /**
    * Inserts a new dependency.
    */
  def insertDependency(data: Any): Unit = js.native
  
  /**
    * Inserts a new resource.
    */
  def insertResource(data: Any): Unit = js.native
  def insertResource(data: Any, taskKeys: js.Array[Any]): Unit = js.native
  
  /**
    * Inserts a new task.
    */
  def insertTask(data: Any): Unit = js.native
  
  /**
    * Reloads data and repaints the Gantt component.
    */
  def refresh(): DxPromise[Unit] = js.native
  
  def scrollToDate(date: String): Unit = js.native
  /**
    * Scrolls the Gantt chart to the specified date.
    */
  def scrollToDate(date: js.Date): Unit = js.native
  def scrollToDate(date: Number): Unit = js.native
  
  /**
    * Shows or hides dependencies between tasks.
    */
  def showDependencies(value: Boolean): Unit = js.native
  
  /**
    * Invokes the &apos;Resource Manager&apos; dialog.
    */
  def showResourceManagerDialog(): Unit = js.native
  
  /**
    * Shows or hides task resources.
    */
  def showResources(value: Boolean): Unit = js.native
  
  /**
    * Invokes the &apos;Task Details&apos; dialog.
    */
  def showTaskDetailsDialog(taskKey: Any): Unit = js.native
  
  /**
    * Removes all resources from the task.
    */
  def unassignAllResourcesFromTask(taskKey: Any): Unit = js.native
  
  /**
    * Removes a resource from the task.
    */
  def unassignResourceFromTask(resourceKey: Any, taskKey: Any): Unit = js.native
  
  /**
    * Updates the dimensions of the UI component contents.
    */
  def updateDimensions(): Unit = js.native
  
  /**
    * Updates the task data.
    */
  def updateTask(key: Any, data: Any): Unit = js.native
  
  /**
    * Zooms in the Gantt chart.
    */
  def zoomIn(): Unit = js.native
  
  /**
    * Zooms out the Gantt chart.
    */
  def zoomOut(): Unit = js.native
}
object dxGantt {
  
  /* Inlined devextreme.devextreme.DevExpress.ui.dxGanttColumn<TRowData, TKey> */
  trait Column[TRowData, TKey] extends StObject {
    
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
  object Column {
    
    inline def apply[TRowData, TKey](): Column[TRowData, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Column[TRowData, TKey]]
    }
    
    extension [Self <: Column[?, ?], TRowData, TKey](x: Self & (Column[TRowData, TKey])) {
      
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
  
  type ContentReadyEvent = EventInfo[dxGantt]
  
  type ContextMenuItem = dxGanttContextMenuItem
  
  trait ContextMenuPreparingEvent
    extends StObject
       with Cancelable {
    
    val component: js.UndefOr[dxGantt] = js.undefined
    
    val data: js.UndefOr[Any] = js.undefined
    
    val element: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val event: js.UndefOr[DxEvent[PointerEvent | MouseEvent | TouchEvent]] = js.undefined
    
    val items: js.UndefOr[js.Array[Any]] = js.undefined
    
    val targetKey: js.UndefOr[Any] = js.undefined
    
    val targetType: js.UndefOr[String] = js.undefined
  }
  object ContextMenuPreparingEvent {
    
    inline def apply(): ContextMenuPreparingEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuPreparingEvent]
    }
    
    extension [Self <: ContextMenuPreparingEvent](x: Self) {
      
      inline def setComponent(value: dxGantt): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTargetKey(value: Any): Self = StObject.set(x, "targetKey", value.asInstanceOf[js.Any])
      
      inline def setTargetKeyUndefined: Self = StObject.set(x, "targetKey", js.undefined)
      
      inline def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    }
  }
  
  trait CustomCommandEvent extends StObject {
    
    val component: js.UndefOr[dxGantt] = js.undefined
    
    val element: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val name: String
  }
  object CustomCommandEvent {
    
    inline def apply(name: String): CustomCommandEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomCommandEvent]
    }
    
    extension [Self <: CustomCommandEvent](x: Self) {
      
      inline def setComponent(value: dxGantt): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyDeletedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object DependencyDeletedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): DependencyDeletedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyDeletedEvent]
    }
    
    extension [Self <: DependencyDeletedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyDeletingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object DependencyDeletingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): DependencyDeletingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyDeletingEvent]
    }
    
    extension [Self <: DependencyDeletingEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyInsertedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object DependencyInsertedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): DependencyInsertedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyInsertedEvent]
    }
    
    extension [Self <: DependencyInsertedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyInsertingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val values: Any
  }
  object DependencyInsertingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], values: Any): DependencyInsertingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyInsertingEvent]
    }
    
    extension [Self <: DependencyInsertingEvent](x: Self) {
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxGantt]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.all
    - typings.devextreme.devextremeStrings.visible
  */
  trait GanttPdfExportDateRange extends StObject
  object GanttPdfExportDateRange {
    
    inline def all: typings.devextreme.devextremeStrings.all = "all".asInstanceOf[typings.devextreme.devextremeStrings.all]
    
    inline def visible: typings.devextreme.devextremeStrings.visible = "visible".asInstanceOf[typings.devextreme.devextremeStrings.visible]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.all
    - typings.devextreme.devextremeStrings.treeList
    - typings.devextreme.devextremeStrings.chart
  */
  trait GanttPdfExportMode extends StObject
  object GanttPdfExportMode {
    
    inline def all: typings.devextreme.devextremeStrings.all = "all".asInstanceOf[typings.devextreme.devextremeStrings.all]
    
    inline def chart: typings.devextreme.devextremeStrings.chart = "chart".asInstanceOf[typings.devextreme.devextremeStrings.chart]
    
    inline def treeList: typings.devextreme.devextremeStrings.treeList = "treeList".asInstanceOf[typings.devextreme.devextremeStrings.treeList]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.undo
    - typings.devextreme.devextremeStrings.redo
    - typings.devextreme.devextremeStrings.expandAll
    - typings.devextreme.devextremeStrings.collapseAll
    - typings.devextreme.devextremeStrings.addTask
    - typings.devextreme.devextremeStrings.deleteTask
    - typings.devextreme.devextremeStrings.zoomIn
    - typings.devextreme.devextremeStrings.zoomOut
    - typings.devextreme.devextremeStrings.deleteDependency
    - typings.devextreme.devextremeStrings.taskDetails
    - typings.devextreme.devextremeStrings.resourceManager
  */
  trait GanttPredefinedContextMenuItem extends StObject
  object GanttPredefinedContextMenuItem {
    
    inline def addTask: typings.devextreme.devextremeStrings.addTask = "addTask".asInstanceOf[typings.devextreme.devextremeStrings.addTask]
    
    inline def collapseAll: typings.devextreme.devextremeStrings.collapseAll = "collapseAll".asInstanceOf[typings.devextreme.devextremeStrings.collapseAll]
    
    inline def deleteDependency: typings.devextreme.devextremeStrings.deleteDependency = "deleteDependency".asInstanceOf[typings.devextreme.devextremeStrings.deleteDependency]
    
    inline def deleteTask: typings.devextreme.devextremeStrings.deleteTask = "deleteTask".asInstanceOf[typings.devextreme.devextremeStrings.deleteTask]
    
    inline def expandAll: typings.devextreme.devextremeStrings.expandAll = "expandAll".asInstanceOf[typings.devextreme.devextremeStrings.expandAll]
    
    inline def redo: typings.devextreme.devextremeStrings.redo = "redo".asInstanceOf[typings.devextreme.devextremeStrings.redo]
    
    inline def resourceManager: typings.devextreme.devextremeStrings.resourceManager = "resourceManager".asInstanceOf[typings.devextreme.devextremeStrings.resourceManager]
    
    inline def taskDetails: typings.devextreme.devextremeStrings.taskDetails = "taskDetails".asInstanceOf[typings.devextreme.devextremeStrings.taskDetails]
    
    inline def undo: typings.devextreme.devextremeStrings.undo = "undo".asInstanceOf[typings.devextreme.devextremeStrings.undo]
    
    inline def zoomIn: typings.devextreme.devextremeStrings.zoomIn = "zoomIn".asInstanceOf[typings.devextreme.devextremeStrings.zoomIn]
    
    inline def zoomOut: typings.devextreme.devextremeStrings.zoomOut = "zoomOut".asInstanceOf[typings.devextreme.devextremeStrings.zoomOut]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.separator
    - typings.devextreme.devextremeStrings.undo
    - typings.devextreme.devextremeStrings.redo
    - typings.devextreme.devextremeStrings.expandAll
    - typings.devextreme.devextremeStrings.collapseAll
    - typings.devextreme.devextremeStrings.addTask
    - typings.devextreme.devextremeStrings.deleteTask
    - typings.devextreme.devextremeStrings.zoomIn
    - typings.devextreme.devextremeStrings.zoomOut
    - typings.devextreme.devextremeStrings.taskDetails
    - typings.devextreme.devextremeStrings.fullScreen
    - typings.devextreme.devextremeStrings.resourceManager
    - typings.devextreme.devextremeStrings.showResources
    - typings.devextreme.devextremeStrings.showDependencies
  */
  trait GanttPredefinedToolbarItem extends StObject
  object GanttPredefinedToolbarItem {
    
    inline def addTask: typings.devextreme.devextremeStrings.addTask = "addTask".asInstanceOf[typings.devextreme.devextremeStrings.addTask]
    
    inline def collapseAll: typings.devextreme.devextremeStrings.collapseAll = "collapseAll".asInstanceOf[typings.devextreme.devextremeStrings.collapseAll]
    
    inline def deleteTask: typings.devextreme.devextremeStrings.deleteTask = "deleteTask".asInstanceOf[typings.devextreme.devextremeStrings.deleteTask]
    
    inline def expandAll: typings.devextreme.devextremeStrings.expandAll = "expandAll".asInstanceOf[typings.devextreme.devextremeStrings.expandAll]
    
    inline def fullScreen: typings.devextreme.devextremeStrings.fullScreen = "fullScreen".asInstanceOf[typings.devextreme.devextremeStrings.fullScreen]
    
    inline def redo: typings.devextreme.devextremeStrings.redo = "redo".asInstanceOf[typings.devextreme.devextremeStrings.redo]
    
    inline def resourceManager: typings.devextreme.devextremeStrings.resourceManager = "resourceManager".asInstanceOf[typings.devextreme.devextremeStrings.resourceManager]
    
    inline def separator: typings.devextreme.devextremeStrings.separator = "separator".asInstanceOf[typings.devextreme.devextremeStrings.separator]
    
    inline def showDependencies: typings.devextreme.devextremeStrings.showDependencies = "showDependencies".asInstanceOf[typings.devextreme.devextremeStrings.showDependencies]
    
    inline def showResources: typings.devextreme.devextremeStrings.showResources = "showResources".asInstanceOf[typings.devextreme.devextremeStrings.showResources]
    
    inline def taskDetails: typings.devextreme.devextremeStrings.taskDetails = "taskDetails".asInstanceOf[typings.devextreme.devextremeStrings.taskDetails]
    
    inline def undo: typings.devextreme.devextremeStrings.undo = "undo".asInstanceOf[typings.devextreme.devextremeStrings.undo]
    
    inline def zoomIn: typings.devextreme.devextremeStrings.zoomIn = "zoomIn".asInstanceOf[typings.devextreme.devextremeStrings.zoomIn]
    
    inline def zoomOut: typings.devextreme.devextremeStrings.zoomOut = "zoomOut".asInstanceOf[typings.devextreme.devextremeStrings.zoomOut]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.minutes
    - typings.devextreme.devextremeStrings.hours
    - typings.devextreme.devextremeStrings.sixHours
    - typings.devextreme.devextremeStrings.days
    - typings.devextreme.devextremeStrings.weeks
    - typings.devextreme.devextremeStrings.months
    - typings.devextreme.devextremeStrings.quarters
    - typings.devextreme.devextremeStrings.years
    - typings.devextreme.devextremeStrings.fiveYears
  */
  trait GanttRenderScaleType extends StObject
  object GanttRenderScaleType {
    
    inline def days: typings.devextreme.devextremeStrings.days = "days".asInstanceOf[typings.devextreme.devextremeStrings.days]
    
    inline def fiveYears: typings.devextreme.devextremeStrings.fiveYears = "fiveYears".asInstanceOf[typings.devextreme.devextremeStrings.fiveYears]
    
    inline def hours: typings.devextreme.devextremeStrings.hours = "hours".asInstanceOf[typings.devextreme.devextremeStrings.hours]
    
    inline def minutes: typings.devextreme.devextremeStrings.minutes = "minutes".asInstanceOf[typings.devextreme.devextremeStrings.minutes]
    
    inline def months: typings.devextreme.devextremeStrings.months = "months".asInstanceOf[typings.devextreme.devextremeStrings.months]
    
    inline def quarters: typings.devextreme.devextremeStrings.quarters = "quarters".asInstanceOf[typings.devextreme.devextremeStrings.quarters]
    
    inline def sixHours: typings.devextreme.devextremeStrings.sixHours = "sixHours".asInstanceOf[typings.devextreme.devextremeStrings.sixHours]
    
    inline def weeks: typings.devextreme.devextremeStrings.weeks = "weeks".asInstanceOf[typings.devextreme.devextremeStrings.weeks]
    
    inline def years: typings.devextreme.devextremeStrings.years = "years".asInstanceOf[typings.devextreme.devextremeStrings.years]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.auto
    - typings.devextreme.devextremeStrings.minutes
    - typings.devextreme.devextremeStrings.hours
    - typings.devextreme.devextremeStrings.sixHours
    - typings.devextreme.devextremeStrings.days
    - typings.devextreme.devextremeStrings.weeks
    - typings.devextreme.devextremeStrings.months
    - typings.devextreme.devextremeStrings.quarters
    - typings.devextreme.devextremeStrings.years
  */
  trait GanttScaleType extends StObject
  object GanttScaleType {
    
    inline def auto: typings.devextreme.devextremeStrings.auto = "auto".asInstanceOf[typings.devextreme.devextremeStrings.auto]
    
    inline def days: typings.devextreme.devextremeStrings.days = "days".asInstanceOf[typings.devextreme.devextremeStrings.days]
    
    inline def hours: typings.devextreme.devextremeStrings.hours = "hours".asInstanceOf[typings.devextreme.devextremeStrings.hours]
    
    inline def minutes: typings.devextreme.devextremeStrings.minutes = "minutes".asInstanceOf[typings.devextreme.devextremeStrings.minutes]
    
    inline def months: typings.devextreme.devextremeStrings.months = "months".asInstanceOf[typings.devextreme.devextremeStrings.months]
    
    inline def quarters: typings.devextreme.devextremeStrings.quarters = "quarters".asInstanceOf[typings.devextreme.devextremeStrings.quarters]
    
    inline def sixHours: typings.devextreme.devextremeStrings.sixHours = "sixHours".asInstanceOf[typings.devextreme.devextremeStrings.sixHours]
    
    inline def weeks: typings.devextreme.devextremeStrings.weeks = "weeks".asInstanceOf[typings.devextreme.devextremeStrings.weeks]
    
    inline def years: typings.devextreme.devextremeStrings.years = "years".asInstanceOf[typings.devextreme.devextremeStrings.years]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.inside
    - typings.devextreme.devextremeStrings.outside
    - typings.devextreme.devextremeStrings.none
  */
  trait GanttTaskTitlePosition extends StObject
  object GanttTaskTitlePosition {
    
    inline def inside: typings.devextreme.devextremeStrings.inside = "inside".asInstanceOf[typings.devextreme.devextremeStrings.inside]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def outside: typings.devextreme.devextremeStrings.outside = "outside".asInstanceOf[typings.devextreme.devextremeStrings.outside]
  }
  
  type InitializedEvent = InitializedEventInfo[dxGantt]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxGantt]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  trait ProgressTooltipTemplateData extends StObject {
    
    val progress: Double
  }
  object ProgressTooltipTemplateData {
    
    inline def apply(progress: Double): ProgressTooltipTemplateData = {
      val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressTooltipTemplateData]
    }
    
    extension [Self <: ProgressTooltipTemplateData](x: Self) {
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  type Properties = dxGanttOptions
  
  trait ResourceAssignedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceAssignedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceAssignedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceAssignedEvent]
    }
    
    extension [Self <: ResourceAssignedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceAssigningEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val values: Any
  }
  object ResourceAssigningEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], values: Any): ResourceAssigningEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceAssigningEvent]
    }
    
    extension [Self <: ResourceAssigningEvent](x: Self) {
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceDeletedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceDeletedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceDeletedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceDeletedEvent]
    }
    
    extension [Self <: ResourceDeletedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceDeletingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceDeletingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceDeletingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceDeletingEvent]
    }
    
    extension [Self <: ResourceDeletingEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceInsertedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceInsertedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceInsertedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceInsertedEvent]
    }
    
    extension [Self <: ResourceInsertedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceInsertingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val values: Any
  }
  object ResourceInsertingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], values: Any): ResourceInsertingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceInsertingEvent]
    }
    
    extension [Self <: ResourceInsertingEvent](x: Self) {
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceManagerDialogShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val values: js.Array[Any]
  }
  object ResourceManagerDialogShowingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], values: js.Array[Any]): ResourceManagerDialogShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceManagerDialogShowingEvent]
    }
    
    extension [Self <: ResourceManagerDialogShowingEvent](x: Self) {
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait ResourceUnassignedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceUnassignedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceUnassignedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceUnassignedEvent]
    }
    
    extension [Self <: ResourceUnassignedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceUnassigningEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceUnassigningEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceUnassigningEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceUnassigningEvent]
    }
    
    extension [Self <: ResourceUnassigningEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScaleCellPreparedEvent
    extends StObject
       with InitializedEventInfo[dxGantt] {
    
    val endDate: js.Date
    
    val scaleElement: DxElement_[HTMLElement]
    
    val scaleIndex: Double
    
    val scaleType: GanttRenderScaleType
    
    val separatorElement: DxElement_[HTMLElement]
    
    val startDate: js.Date
  }
  object ScaleCellPreparedEvent {
    
    inline def apply(
      endDate: js.Date,
      scaleElement: DxElement_[HTMLElement],
      scaleIndex: Double,
      scaleType: GanttRenderScaleType,
      separatorElement: DxElement_[HTMLElement],
      startDate: js.Date
    ): ScaleCellPreparedEvent = {
      val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], scaleElement = scaleElement.asInstanceOf[js.Any], scaleIndex = scaleIndex.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any], separatorElement = separatorElement.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleCellPreparedEvent]
    }
    
    extension [Self <: ScaleCellPreparedEvent](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setScaleElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "scaleElement", value.asInstanceOf[js.Any])
      
      inline def setScaleIndex(value: Double): Self = StObject.set(x, "scaleIndex", value.asInstanceOf[js.Any])
      
      inline def setScaleType(value: GanttRenderScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
      
      inline def setSeparatorElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "separatorElement", value.asInstanceOf[js.Any])
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val selectedRowKey: js.UndefOr[Any] = js.undefined
  }
  object SelectionChangedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement]): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
    
    extension [Self <: SelectionChangedEvent](x: Self) {
      
      inline def setSelectedRowKey(value: Any): Self = StObject.set(x, "selectedRowKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowKeyUndefined: Self = StObject.set(x, "selectedRowKey", js.undefined)
    }
  }
  
  trait TaskClickEvent
    extends StObject
       with NativeEventInfo[dxGantt, PointerEvent | MouseEvent] {
    
    val data: js.UndefOr[Any] = js.undefined
    
    val key: js.UndefOr[Any] = js.undefined
  }
  object TaskClickEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement]): TaskClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskClickEvent]
    }
    
    extension [Self <: TaskClickEvent](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait TaskContentTemplateData extends StObject {
    
    val cellSize: Any
    
    val isMilestone: Boolean
    
    val taskData: Any
    
    val taskHTML: Any
    
    val taskPosition: Any
    
    val taskResources: js.Array[Any]
    
    val taskSize: Any
  }
  object TaskContentTemplateData {
    
    inline def apply(
      cellSize: Any,
      isMilestone: Boolean,
      taskData: Any,
      taskHTML: Any,
      taskPosition: Any,
      taskResources: js.Array[Any],
      taskSize: Any
    ): TaskContentTemplateData = {
      val __obj = js.Dynamic.literal(cellSize = cellSize.asInstanceOf[js.Any], isMilestone = isMilestone.asInstanceOf[js.Any], taskData = taskData.asInstanceOf[js.Any], taskHTML = taskHTML.asInstanceOf[js.Any], taskPosition = taskPosition.asInstanceOf[js.Any], taskResources = taskResources.asInstanceOf[js.Any], taskSize = taskSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskContentTemplateData]
    }
    
    extension [Self <: TaskContentTemplateData](x: Self) {
      
      inline def setCellSize(value: Any): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
      
      inline def setIsMilestone(value: Boolean): Self = StObject.set(x, "isMilestone", value.asInstanceOf[js.Any])
      
      inline def setTaskData(value: Any): Self = StObject.set(x, "taskData", value.asInstanceOf[js.Any])
      
      inline def setTaskHTML(value: Any): Self = StObject.set(x, "taskHTML", value.asInstanceOf[js.Any])
      
      inline def setTaskPosition(value: Any): Self = StObject.set(x, "taskPosition", value.asInstanceOf[js.Any])
      
      inline def setTaskResources(value: js.Array[Any]): Self = StObject.set(x, "taskResources", value.asInstanceOf[js.Any])
      
      inline def setTaskResourcesVarargs(value: Any*): Self = StObject.set(x, "taskResources", js.Array(value*))
      
      inline def setTaskSize(value: Any): Self = StObject.set(x, "taskSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskDblClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxGantt, PointerEvent | MouseEvent] {
    
    val data: js.UndefOr[Any] = js.undefined
    
    val key: js.UndefOr[Any] = js.undefined
  }
  object TaskDblClickEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement]): TaskDblClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskDblClickEvent]
    }
    
    extension [Self <: TaskDblClickEvent](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait TaskDeletedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object TaskDeletedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): TaskDeletedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskDeletedEvent]
    }
    
    extension [Self <: TaskDeletedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskDeletingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object TaskDeletingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): TaskDeletingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskDeletingEvent]
    }
    
    extension [Self <: TaskDeletingEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskEditDialogShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val hiddenFields: js.UndefOr[js.Array[String]] = js.undefined
    
    val key: Any
    
    val readOnlyFields: js.UndefOr[js.Array[String]] = js.undefined
    
    val values: Any
  }
  object TaskEditDialogShowingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): TaskEditDialogShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskEditDialogShowingEvent]
    }
    
    extension [Self <: TaskEditDialogShowingEvent](x: Self) {
      
      inline def setHiddenFields(value: js.Array[String]): Self = StObject.set(x, "hiddenFields", value.asInstanceOf[js.Any])
      
      inline def setHiddenFieldsUndefined: Self = StObject.set(x, "hiddenFields", js.undefined)
      
      inline def setHiddenFieldsVarargs(value: String*): Self = StObject.set(x, "hiddenFields", js.Array(value*))
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyFields(value: js.Array[String]): Self = StObject.set(x, "readOnlyFields", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyFieldsUndefined: Self = StObject.set(x, "readOnlyFields", js.undefined)
      
      inline def setReadOnlyFieldsVarargs(value: String*): Self = StObject.set(x, "readOnlyFields", js.Array(value*))
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskInsertedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: js.UndefOr[Any] = js.undefined
  }
  object TaskInsertedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any): TaskInsertedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskInsertedEvent]
    }
    
    extension [Self <: TaskInsertedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait TaskInsertingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val values: Any
  }
  object TaskInsertingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], values: Any): TaskInsertingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskInsertingEvent]
    }
    
    extension [Self <: TaskInsertingEvent](x: Self) {
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskMovingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val newValues: Any
    
    val values: Any
  }
  object TaskMovingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, newValues: Any, values: Any): TaskMovingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newValues = newValues.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskMovingEvent]
    }
    
    extension [Self <: TaskMovingEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNewValues(value: Any): Self = StObject.set(x, "newValues", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskUpdatedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object TaskUpdatedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): TaskUpdatedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskUpdatedEvent]
    }
    
    extension [Self <: TaskUpdatedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskUpdatingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val newValues: Any
    
    val values: Any
  }
  object TaskUpdatingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, newValues: Any, values: Any): TaskUpdatingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newValues = newValues.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskUpdatingEvent]
    }
    
    extension [Self <: TaskUpdatingEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNewValues(value: Any): Self = StObject.set(x, "newValues", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeTooltipTemplateData extends StObject {
    
    val end: js.Date
    
    val start: js.Date
  }
  object TimeTooltipTemplateData {
    
    inline def apply(end: js.Date, start: js.Date): TimeTooltipTemplateData = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTooltipTemplateData]
    }
    
    extension [Self <: TimeTooltipTemplateData](x: Self) {
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  type ToolbarItem = dxGanttToolbarItem
}
