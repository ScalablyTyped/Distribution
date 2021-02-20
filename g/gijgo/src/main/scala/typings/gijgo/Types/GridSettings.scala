package typings.gijgo.Types

import typings.gijgo.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridSettings[Entity] extends StObject {
  
  //Configuration options
  var autoGenerateColumns: js.UndefOr[Boolean] = js.native
  
  var autoLoad: js.UndefOr[Boolean] = js.native
  
  //Events
  var beforeEmptyRowInsert: js.UndefOr[js.Function2[/* e */ js.Any, /* $row */ JQuery, _]] = js.native
  
  var bodyRowHeight: js.UndefOr[String] = js.native
  
  var cellDataBound: js.UndefOr[
    js.Function5[
      /* e */ js.Any, 
      /* $wrapper */ JQuery, 
      /* id */ String, 
      /* column */ GridColumn, 
      /* record */ Entity, 
      _
    ]
  ] = js.native
  
  var cellDataChanged: js.UndefOr[
    js.Function6[
      /* e */ js.Any, 
      /* $cell */ JQuery, 
      /* column */ GridColumn, 
      /* record */ Entity, 
      /* oldValue */ js.Any, 
      /* newValue */ js.Any, 
      _
    ]
  ] = js.native
  
  var columnHide: js.UndefOr[js.Function2[/* e */ js.Any, /* column */ GridColumn, _]] = js.native
  
  var columnReorder: js.UndefOr[Boolean] = js.native
  
  var columnShow: js.UndefOr[js.Function2[/* e */ js.Any, /* column */ GridColumn, _]] = js.native
  
  var columns: js.UndefOr[js.Array[GridColumn]] = js.native
  
  var dataBinding: js.UndefOr[js.Function2[/* e */ js.Any, /* records */ js.Array[Entity], _]] = js.native
  
  var dataBound: js.UndefOr[
    js.Function3[/* e */ js.Any, /* records */ js.Array[Entity], /* totalRecords */ Double, _]
  ] = js.native
  
  var dataFiltered: js.UndefOr[js.Function2[/* e */ js.Any, /* records */ js.Array[Entity], _]] = js.native
  
  var dataSource: js.UndefOr[js.Any] = js.native
  
  var defaultColumnSettings: js.UndefOr[GridColumn] = js.native
  
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var detailCollapse: js.UndefOr[js.Function3[/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String, _]] = js.native
  
  var detailExpand: js.UndefOr[js.Function3[/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String, _]] = js.native
  
  var detailTemplate: js.UndefOr[String] = js.native
  
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  var fontSize: js.UndefOr[String] = js.native
  
  var grouping: js.UndefOr[GridGrouping] = js.native
  
  var headerFilter: js.UndefOr[GridHeaderFilter] = js.native
  
  var headerRowHeight: js.UndefOr[String] = js.native
  
  var icons: js.UndefOr[GridIcons] = js.native
  
  var iconsLibrary: js.UndefOr[String] = js.native
  
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var inlineEditing: js.UndefOr[GridInlineEditing] = js.native
  
  var keepExpandedRows: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var mapping: js.UndefOr[js.Any] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var notFoundText: js.UndefOr[String] = js.native
  
  var optimisticPersistence: js.UndefOr[GridOptimisticPersistence] = js.native
  
  var orderNumberField: js.UndefOr[String] = js.native
  
  var pageChanging: js.UndefOr[js.Function2[/* e */ js.Any, /* newPage */ Double, _]] = js.native
  
  var pageSizeChange: js.UndefOr[js.Function2[/* e */ js.Any, /* newPage */ Double, _]] = js.native
  
  var pager: js.UndefOr[GridPager] = js.native
  
  var paramNames: js.UndefOr[GridParamNames] = js.native
  
  var params: js.UndefOr[js.Any] = js.native
  
  var primaryKey: js.UndefOr[String] = js.native
  
  var resizableColumns: js.UndefOr[Boolean] = js.native
  
  var resize: js.UndefOr[js.Function3[/* e */ js.Any, /* newWidth */ Double, /* oldWidth */ Double, _]] = js.native
  
  var resizeCheckInterval: js.UndefOr[Double] = js.native
  
  var responsive: js.UndefOr[Boolean] = js.native
  
  var rowDataBound: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.native
  
  var rowDataChanged: js.UndefOr[js.Function3[/* e */ js.Any, /* id */ String, /* record */ Entity, _]] = js.native
  
  var rowRemoving: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.native
  
  var rowReorder: js.UndefOr[Boolean] = js.native
  
  var rowReorderColumn: js.UndefOr[String] = js.native
  
  var rowSelect: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.native
  
  var rowUnselect: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.native
  
  var selectionMethod: js.UndefOr[String] = js.native
  
  var selectionType: js.UndefOr[String] = js.native
  
  var showHiddenColumnsAsDetails: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var toolbarTemplate: js.UndefOr[String] = js.native
  
  var uiLibrary: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object GridSettings {
  
  @scala.inline
  def apply[Entity](): GridSettings[Entity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSettings[Entity]]
  }
  
  @scala.inline
  implicit class GridSettingsMutableBuilder[Self <: GridSettings[_], Entity] (val x: Self with GridSettings[Entity]) extends AnyVal {
    
    @scala.inline
    def setAutoGenerateColumns(value: Boolean): Self = StObject.set(x, "autoGenerateColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGenerateColumnsUndefined: Self = StObject.set(x, "autoGenerateColumns", js.undefined)
    
    @scala.inline
    def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    @scala.inline
    def setBeforeEmptyRowInsert(value: (/* e */ js.Any, /* $row */ JQuery) => _): Self = StObject.set(x, "beforeEmptyRowInsert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeEmptyRowInsertUndefined: Self = StObject.set(x, "beforeEmptyRowInsert", js.undefined)
    
    @scala.inline
    def setBodyRowHeight(value: String): Self = StObject.set(x, "bodyRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyRowHeightUndefined: Self = StObject.set(x, "bodyRowHeight", js.undefined)
    
    @scala.inline
    def setCellDataBound(
      value: (/* e */ js.Any, /* $wrapper */ JQuery, /* id */ String, /* column */ GridColumn, /* record */ Entity) => _
    ): Self = StObject.set(x, "cellDataBound", js.Any.fromFunction5(value))
    
    @scala.inline
    def setCellDataBoundUndefined: Self = StObject.set(x, "cellDataBound", js.undefined)
    
    @scala.inline
    def setCellDataChanged(
      value: (/* e */ js.Any, /* $cell */ JQuery, /* column */ GridColumn, /* record */ Entity, /* oldValue */ js.Any, /* newValue */ js.Any) => _
    ): Self = StObject.set(x, "cellDataChanged", js.Any.fromFunction6(value))
    
    @scala.inline
    def setCellDataChangedUndefined: Self = StObject.set(x, "cellDataChanged", js.undefined)
    
    @scala.inline
    def setColumnHide(value: (/* e */ js.Any, /* column */ GridColumn) => _): Self = StObject.set(x, "columnHide", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnHideUndefined: Self = StObject.set(x, "columnHide", js.undefined)
    
    @scala.inline
    def setColumnReorder(value: Boolean): Self = StObject.set(x, "columnReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnReorderUndefined: Self = StObject.set(x, "columnReorder", js.undefined)
    
    @scala.inline
    def setColumnShow(value: (/* e */ js.Any, /* column */ GridColumn) => _): Self = StObject.set(x, "columnShow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnShowUndefined: Self = StObject.set(x, "columnShow", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[GridColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: GridColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDataBinding(value: (/* e */ js.Any, /* records */ js.Array[Entity]) => _): Self = StObject.set(x, "dataBinding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: (/* e */ js.Any, /* records */ js.Array[Entity], /* totalRecords */ Double) => _): Self = StObject.set(x, "dataBound", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataFiltered(value: (/* e */ js.Any, /* records */ js.Array[Entity]) => _): Self = StObject.set(x, "dataFiltered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataFilteredUndefined: Self = StObject.set(x, "dataFiltered", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDefaultColumnSettings(value: GridColumn): Self = StObject.set(x, "defaultColumnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultColumnSettingsUndefined: Self = StObject.set(x, "defaultColumnSettings", js.undefined)
    
    @scala.inline
    def setDestroying(value: /* e */ js.Any => _): Self = StObject.set(x, "destroying", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyingUndefined: Self = StObject.set(x, "destroying", js.undefined)
    
    @scala.inline
    def setDetailCollapse(value: (/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String) => _): Self = StObject.set(x, "detailCollapse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDetailCollapseUndefined: Self = StObject.set(x, "detailCollapse", js.undefined)
    
    @scala.inline
    def setDetailExpand(value: (/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String) => _): Self = StObject.set(x, "detailExpand", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDetailExpandUndefined: Self = StObject.set(x, "detailExpand", js.undefined)
    
    @scala.inline
    def setDetailTemplate(value: String): Self = StObject.set(x, "detailTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailTemplateUndefined: Self = StObject.set(x, "detailTemplate", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setGrouping(value: GridGrouping): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    @scala.inline
    def setHeaderFilter(value: GridHeaderFilter): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
    
    @scala.inline
    def setHeaderRowHeight(value: String): Self = StObject.set(x, "headerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowHeightUndefined: Self = StObject.set(x, "headerRowHeight", js.undefined)
    
    @scala.inline
    def setIcons(value: GridIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setInitialized(value: /* e */ js.Any => _): Self = StObject.set(x, "initialized", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
    
    @scala.inline
    def setInlineEditing(value: GridInlineEditing): Self = StObject.set(x, "inlineEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineEditingUndefined: Self = StObject.set(x, "inlineEditing", js.undefined)
    
    @scala.inline
    def setKeepExpandedRows(value: Boolean): Self = StObject.set(x, "keepExpandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepExpandedRowsUndefined: Self = StObject.set(x, "keepExpandedRows", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMapping(value: js.Any): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setNotFoundText(value: String): Self = StObject.set(x, "notFoundText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundTextUndefined: Self = StObject.set(x, "notFoundText", js.undefined)
    
    @scala.inline
    def setOptimisticPersistence(value: GridOptimisticPersistence): Self = StObject.set(x, "optimisticPersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimisticPersistenceUndefined: Self = StObject.set(x, "optimisticPersistence", js.undefined)
    
    @scala.inline
    def setOrderNumberField(value: String): Self = StObject.set(x, "orderNumberField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNumberFieldUndefined: Self = StObject.set(x, "orderNumberField", js.undefined)
    
    @scala.inline
    def setPageChanging(value: (/* e */ js.Any, /* newPage */ Double) => _): Self = StObject.set(x, "pageChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPageChangingUndefined: Self = StObject.set(x, "pageChanging", js.undefined)
    
    @scala.inline
    def setPageSizeChange(value: (/* e */ js.Any, /* newPage */ Double) => _): Self = StObject.set(x, "pageSizeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPageSizeChangeUndefined: Self = StObject.set(x, "pageSizeChange", js.undefined)
    
    @scala.inline
    def setPager(value: GridPager): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    @scala.inline
    def setParamNames(value: GridParamNames): Self = StObject.set(x, "paramNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamNamesUndefined: Self = StObject.set(x, "paramNames", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    @scala.inline
    def setResizableColumns(value: Boolean): Self = StObject.set(x, "resizableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableColumnsUndefined: Self = StObject.set(x, "resizableColumns", js.undefined)
    
    @scala.inline
    def setResize(value: (/* e */ js.Any, /* newWidth */ Double, /* oldWidth */ Double) => _): Self = StObject.set(x, "resize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResizeCheckInterval(value: Double): Self = StObject.set(x, "resizeCheckInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeCheckIntervalUndefined: Self = StObject.set(x, "resizeCheckInterval", js.undefined)
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setRowDataBound(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self = StObject.set(x, "rowDataBound", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRowDataBoundUndefined: Self = StObject.set(x, "rowDataBound", js.undefined)
    
    @scala.inline
    def setRowDataChanged(value: (/* e */ js.Any, /* id */ String, /* record */ Entity) => _): Self = StObject.set(x, "rowDataChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRowDataChangedUndefined: Self = StObject.set(x, "rowDataChanged", js.undefined)
    
    @scala.inline
    def setRowRemoving(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self = StObject.set(x, "rowRemoving", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRowRemovingUndefined: Self = StObject.set(x, "rowRemoving", js.undefined)
    
    @scala.inline
    def setRowReorder(value: Boolean): Self = StObject.set(x, "rowReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowReorderColumn(value: String): Self = StObject.set(x, "rowReorderColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowReorderColumnUndefined: Self = StObject.set(x, "rowReorderColumn", js.undefined)
    
    @scala.inline
    def setRowReorderUndefined: Self = StObject.set(x, "rowReorder", js.undefined)
    
    @scala.inline
    def setRowSelect(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self = StObject.set(x, "rowSelect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRowSelectUndefined: Self = StObject.set(x, "rowSelect", js.undefined)
    
    @scala.inline
    def setRowUnselect(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self = StObject.set(x, "rowUnselect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRowUnselectUndefined: Self = StObject.set(x, "rowUnselect", js.undefined)
    
    @scala.inline
    def setSelectionMethod(value: String): Self = StObject.set(x, "selectionMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMethodUndefined: Self = StObject.set(x, "selectionMethod", js.undefined)
    
    @scala.inline
    def setSelectionType(value: String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
    
    @scala.inline
    def setShowHiddenColumnsAsDetails(value: Boolean): Self = StObject.set(x, "showHiddenColumnsAsDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHiddenColumnsAsDetailsUndefined: Self = StObject.set(x, "showHiddenColumnsAsDetails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToolbarTemplate(value: String): Self = StObject.set(x, "toolbarTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarTemplateUndefined: Self = StObject.set(x, "toolbarTemplate", js.undefined)
    
    @scala.inline
    def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
