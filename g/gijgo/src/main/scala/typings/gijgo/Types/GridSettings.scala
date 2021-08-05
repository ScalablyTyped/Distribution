package typings.gijgo.Types

import typings.gijgo.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridSettings[Entity] extends StObject {
  
  //Configuration options
  var autoGenerateColumns: js.UndefOr[Boolean] = js.undefined
  
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  
  //Events
  var beforeEmptyRowInsert: js.UndefOr[js.Function2[/* e */ js.Any, /* $row */ JQuery, js.Any]] = js.undefined
  
  var bodyRowHeight: js.UndefOr[String] = js.undefined
  
  var cellDataBound: js.UndefOr[
    js.Function5[
      /* e */ js.Any, 
      /* $wrapper */ JQuery, 
      /* id */ String, 
      /* column */ GridColumn, 
      /* record */ Entity, 
      js.Any
    ]
  ] = js.undefined
  
  var cellDataChanged: js.UndefOr[
    js.Function6[
      /* e */ js.Any, 
      /* $cell */ JQuery, 
      /* column */ GridColumn, 
      /* record */ Entity, 
      /* oldValue */ js.Any, 
      /* newValue */ js.Any, 
      js.Any
    ]
  ] = js.undefined
  
  var columnHide: js.UndefOr[js.Function2[/* e */ js.Any, /* column */ GridColumn, js.Any]] = js.undefined
  
  var columnReorder: js.UndefOr[Boolean] = js.undefined
  
  var columnShow: js.UndefOr[js.Function2[/* e */ js.Any, /* column */ GridColumn, js.Any]] = js.undefined
  
  var columns: js.UndefOr[js.Array[GridColumn]] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function2[/* e */ js.Any, /* records */ js.Array[Entity], js.Any]] = js.undefined
  
  var dataBound: js.UndefOr[
    js.Function3[/* e */ js.Any, /* records */ js.Array[Entity], /* totalRecords */ Double, js.Any]
  ] = js.undefined
  
  var dataFiltered: js.UndefOr[js.Function2[/* e */ js.Any, /* records */ js.Array[Entity], js.Any]] = js.undefined
  
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  var defaultColumnSettings: js.UndefOr[GridColumn] = js.undefined
  
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var detailCollapse: js.UndefOr[
    js.Function3[/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String, js.Any]
  ] = js.undefined
  
  var detailExpand: js.UndefOr[
    js.Function3[/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String, js.Any]
  ] = js.undefined
  
  var detailTemplate: js.UndefOr[String] = js.undefined
  
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  
  var fontSize: js.UndefOr[String] = js.undefined
  
  var grouping: js.UndefOr[GridGrouping] = js.undefined
  
  var headerFilter: js.UndefOr[GridHeaderFilter] = js.undefined
  
  var headerRowHeight: js.UndefOr[String] = js.undefined
  
  var icons: js.UndefOr[GridIcons] = js.undefined
  
  var iconsLibrary: js.UndefOr[String] = js.undefined
  
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var inlineEditing: js.UndefOr[GridInlineEditing] = js.undefined
  
  var keepExpandedRows: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var mapping: js.UndefOr[js.Any] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var notFoundText: js.UndefOr[String] = js.undefined
  
  var optimisticPersistence: js.UndefOr[GridOptimisticPersistence] = js.undefined
  
  var orderNumberField: js.UndefOr[String] = js.undefined
  
  var pageChanging: js.UndefOr[js.Function2[/* e */ js.Any, /* newPage */ Double, js.Any]] = js.undefined
  
  var pageSizeChange: js.UndefOr[js.Function2[/* e */ js.Any, /* newPage */ Double, js.Any]] = js.undefined
  
  var pager: js.UndefOr[GridPager] = js.undefined
  
  var paramNames: js.UndefOr[GridParamNames] = js.undefined
  
  var params: js.UndefOr[js.Any] = js.undefined
  
  var primaryKey: js.UndefOr[String] = js.undefined
  
  var resizableColumns: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[
    js.Function3[/* e */ js.Any, /* newWidth */ Double, /* oldWidth */ Double, js.Any]
  ] = js.undefined
  
  var resizeCheckInterval: js.UndefOr[Double] = js.undefined
  
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  var rowDataBound: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, js.Any]
  ] = js.undefined
  
  var rowDataChanged: js.UndefOr[js.Function3[/* e */ js.Any, /* id */ String, /* record */ Entity, js.Any]] = js.undefined
  
  var rowRemoving: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, js.Any]
  ] = js.undefined
  
  var rowReorder: js.UndefOr[Boolean] = js.undefined
  
  var rowReorderColumn: js.UndefOr[String] = js.undefined
  
  var rowSelect: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, js.Any]
  ] = js.undefined
  
  var rowUnselect: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, js.Any]
  ] = js.undefined
  
  var selectionMethod: js.UndefOr[String] = js.undefined
  
  var selectionType: js.UndefOr[String] = js.undefined
  
  var showHiddenColumnsAsDetails: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var toolbarTemplate: js.UndefOr[String] = js.undefined
  
  var uiLibrary: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object GridSettings {
  
  inline def apply[Entity](): GridSettings[Entity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSettings[Entity]]
  }
  
  extension [Self <: GridSettings[?], Entity](x: Self & GridSettings[Entity]) {
    
    inline def setAutoGenerateColumns(value: Boolean): Self = StObject.set(x, "autoGenerateColumns", value.asInstanceOf[js.Any])
    
    inline def setAutoGenerateColumnsUndefined: Self = StObject.set(x, "autoGenerateColumns", js.undefined)
    
    inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    inline def setBeforeEmptyRowInsert(value: (/* e */ js.Any, /* $row */ JQuery) => js.Any): Self = StObject.set(x, "beforeEmptyRowInsert", js.Any.fromFunction2(value))
    
    inline def setBeforeEmptyRowInsertUndefined: Self = StObject.set(x, "beforeEmptyRowInsert", js.undefined)
    
    inline def setBodyRowHeight(value: String): Self = StObject.set(x, "bodyRowHeight", value.asInstanceOf[js.Any])
    
    inline def setBodyRowHeightUndefined: Self = StObject.set(x, "bodyRowHeight", js.undefined)
    
    inline def setCellDataBound(
      value: (/* e */ js.Any, /* $wrapper */ JQuery, /* id */ String, /* column */ GridColumn, /* record */ Entity) => js.Any
    ): Self = StObject.set(x, "cellDataBound", js.Any.fromFunction5(value))
    
    inline def setCellDataBoundUndefined: Self = StObject.set(x, "cellDataBound", js.undefined)
    
    inline def setCellDataChanged(
      value: (/* e */ js.Any, /* $cell */ JQuery, /* column */ GridColumn, /* record */ Entity, /* oldValue */ js.Any, /* newValue */ js.Any) => js.Any
    ): Self = StObject.set(x, "cellDataChanged", js.Any.fromFunction6(value))
    
    inline def setCellDataChangedUndefined: Self = StObject.set(x, "cellDataChanged", js.undefined)
    
    inline def setColumnHide(value: (/* e */ js.Any, /* column */ GridColumn) => js.Any): Self = StObject.set(x, "columnHide", js.Any.fromFunction2(value))
    
    inline def setColumnHideUndefined: Self = StObject.set(x, "columnHide", js.undefined)
    
    inline def setColumnReorder(value: Boolean): Self = StObject.set(x, "columnReorder", value.asInstanceOf[js.Any])
    
    inline def setColumnReorderUndefined: Self = StObject.set(x, "columnReorder", js.undefined)
    
    inline def setColumnShow(value: (/* e */ js.Any, /* column */ GridColumn) => js.Any): Self = StObject.set(x, "columnShow", js.Any.fromFunction2(value))
    
    inline def setColumnShowUndefined: Self = StObject.set(x, "columnShow", js.undefined)
    
    inline def setColumns(value: js.Array[GridColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: GridColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setDataBinding(value: (/* e */ js.Any, /* records */ js.Array[Entity]) => js.Any): Self = StObject.set(x, "dataBinding", js.Any.fromFunction2(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: (/* e */ js.Any, /* records */ js.Array[Entity], /* totalRecords */ Double) => js.Any): Self = StObject.set(x, "dataBound", js.Any.fromFunction3(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataFiltered(value: (/* e */ js.Any, /* records */ js.Array[Entity]) => js.Any): Self = StObject.set(x, "dataFiltered", js.Any.fromFunction2(value))
    
    inline def setDataFilteredUndefined: Self = StObject.set(x, "dataFiltered", js.undefined)
    
    inline def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDefaultColumnSettings(value: GridColumn): Self = StObject.set(x, "defaultColumnSettings", value.asInstanceOf[js.Any])
    
    inline def setDefaultColumnSettingsUndefined: Self = StObject.set(x, "defaultColumnSettings", js.undefined)
    
    inline def setDestroying(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "destroying", js.Any.fromFunction1(value))
    
    inline def setDestroyingUndefined: Self = StObject.set(x, "destroying", js.undefined)
    
    inline def setDetailCollapse(value: (/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String) => js.Any): Self = StObject.set(x, "detailCollapse", js.Any.fromFunction3(value))
    
    inline def setDetailCollapseUndefined: Self = StObject.set(x, "detailCollapse", js.undefined)
    
    inline def setDetailExpand(value: (/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String) => js.Any): Self = StObject.set(x, "detailExpand", js.Any.fromFunction3(value))
    
    inline def setDetailExpandUndefined: Self = StObject.set(x, "detailExpand", js.undefined)
    
    inline def setDetailTemplate(value: String): Self = StObject.set(x, "detailTemplate", value.asInstanceOf[js.Any])
    
    inline def setDetailTemplateUndefined: Self = StObject.set(x, "detailTemplate", js.undefined)
    
    inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setGrouping(value: GridGrouping): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setHeaderFilter(value: GridHeaderFilter): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
    
    inline def setHeaderRowHeight(value: String): Self = StObject.set(x, "headerRowHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowHeightUndefined: Self = StObject.set(x, "headerRowHeight", js.undefined)
    
    inline def setIcons(value: GridIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    inline def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setInitialized(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "initialized", js.Any.fromFunction1(value))
    
    inline def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
    
    inline def setInlineEditing(value: GridInlineEditing): Self = StObject.set(x, "inlineEditing", value.asInstanceOf[js.Any])
    
    inline def setInlineEditingUndefined: Self = StObject.set(x, "inlineEditing", js.undefined)
    
    inline def setKeepExpandedRows(value: Boolean): Self = StObject.set(x, "keepExpandedRows", value.asInstanceOf[js.Any])
    
    inline def setKeepExpandedRowsUndefined: Self = StObject.set(x, "keepExpandedRows", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMapping(value: js.Any): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setNotFoundText(value: String): Self = StObject.set(x, "notFoundText", value.asInstanceOf[js.Any])
    
    inline def setNotFoundTextUndefined: Self = StObject.set(x, "notFoundText", js.undefined)
    
    inline def setOptimisticPersistence(value: GridOptimisticPersistence): Self = StObject.set(x, "optimisticPersistence", value.asInstanceOf[js.Any])
    
    inline def setOptimisticPersistenceUndefined: Self = StObject.set(x, "optimisticPersistence", js.undefined)
    
    inline def setOrderNumberField(value: String): Self = StObject.set(x, "orderNumberField", value.asInstanceOf[js.Any])
    
    inline def setOrderNumberFieldUndefined: Self = StObject.set(x, "orderNumberField", js.undefined)
    
    inline def setPageChanging(value: (/* e */ js.Any, /* newPage */ Double) => js.Any): Self = StObject.set(x, "pageChanging", js.Any.fromFunction2(value))
    
    inline def setPageChangingUndefined: Self = StObject.set(x, "pageChanging", js.undefined)
    
    inline def setPageSizeChange(value: (/* e */ js.Any, /* newPage */ Double) => js.Any): Self = StObject.set(x, "pageSizeChange", js.Any.fromFunction2(value))
    
    inline def setPageSizeChangeUndefined: Self = StObject.set(x, "pageSizeChange", js.undefined)
    
    inline def setPager(value: GridPager): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    inline def setParamNames(value: GridParamNames): Self = StObject.set(x, "paramNames", value.asInstanceOf[js.Any])
    
    inline def setParamNamesUndefined: Self = StObject.set(x, "paramNames", js.undefined)
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setResizableColumns(value: Boolean): Self = StObject.set(x, "resizableColumns", value.asInstanceOf[js.Any])
    
    inline def setResizableColumnsUndefined: Self = StObject.set(x, "resizableColumns", js.undefined)
    
    inline def setResize(value: (/* e */ js.Any, /* newWidth */ Double, /* oldWidth */ Double) => js.Any): Self = StObject.set(x, "resize", js.Any.fromFunction3(value))
    
    inline def setResizeCheckInterval(value: Double): Self = StObject.set(x, "resizeCheckInterval", value.asInstanceOf[js.Any])
    
    inline def setResizeCheckIntervalUndefined: Self = StObject.set(x, "resizeCheckInterval", js.undefined)
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setRowDataBound(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => js.Any): Self = StObject.set(x, "rowDataBound", js.Any.fromFunction4(value))
    
    inline def setRowDataBoundUndefined: Self = StObject.set(x, "rowDataBound", js.undefined)
    
    inline def setRowDataChanged(value: (/* e */ js.Any, /* id */ String, /* record */ Entity) => js.Any): Self = StObject.set(x, "rowDataChanged", js.Any.fromFunction3(value))
    
    inline def setRowDataChangedUndefined: Self = StObject.set(x, "rowDataChanged", js.undefined)
    
    inline def setRowRemoving(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => js.Any): Self = StObject.set(x, "rowRemoving", js.Any.fromFunction4(value))
    
    inline def setRowRemovingUndefined: Self = StObject.set(x, "rowRemoving", js.undefined)
    
    inline def setRowReorder(value: Boolean): Self = StObject.set(x, "rowReorder", value.asInstanceOf[js.Any])
    
    inline def setRowReorderColumn(value: String): Self = StObject.set(x, "rowReorderColumn", value.asInstanceOf[js.Any])
    
    inline def setRowReorderColumnUndefined: Self = StObject.set(x, "rowReorderColumn", js.undefined)
    
    inline def setRowReorderUndefined: Self = StObject.set(x, "rowReorder", js.undefined)
    
    inline def setRowSelect(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => js.Any): Self = StObject.set(x, "rowSelect", js.Any.fromFunction4(value))
    
    inline def setRowSelectUndefined: Self = StObject.set(x, "rowSelect", js.undefined)
    
    inline def setRowUnselect(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => js.Any): Self = StObject.set(x, "rowUnselect", js.Any.fromFunction4(value))
    
    inline def setRowUnselectUndefined: Self = StObject.set(x, "rowUnselect", js.undefined)
    
    inline def setSelectionMethod(value: String): Self = StObject.set(x, "selectionMethod", value.asInstanceOf[js.Any])
    
    inline def setSelectionMethodUndefined: Self = StObject.set(x, "selectionMethod", js.undefined)
    
    inline def setSelectionType(value: String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
    
    inline def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
    
    inline def setShowHiddenColumnsAsDetails(value: Boolean): Self = StObject.set(x, "showHiddenColumnsAsDetails", value.asInstanceOf[js.Any])
    
    inline def setShowHiddenColumnsAsDetailsUndefined: Self = StObject.set(x, "showHiddenColumnsAsDetails", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToolbarTemplate(value: String): Self = StObject.set(x, "toolbarTemplate", value.asInstanceOf[js.Any])
    
    inline def setToolbarTemplateUndefined: Self = StObject.set(x, "toolbarTemplate", js.undefined)
    
    inline def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    inline def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
