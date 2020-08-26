package typings.gijgo.Types

import typings.gijgo.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridSettings[Entity] extends js.Object {
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
  implicit class GridSettingsOps[Self <: GridSettings[_], Entity] (val x: Self with GridSettings[Entity]) extends AnyVal {
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
    def setAutoGenerateColumns(value: Boolean): Self = this.set("autoGenerateColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGenerateColumns: Self = this.set("autoGenerateColumns", js.undefined)
    @scala.inline
    def setAutoLoad(value: Boolean): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    @scala.inline
    def setBeforeEmptyRowInsert(value: (/* e */ js.Any, /* $row */ JQuery) => _): Self = this.set("beforeEmptyRowInsert", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeEmptyRowInsert: Self = this.set("beforeEmptyRowInsert", js.undefined)
    @scala.inline
    def setBodyRowHeight(value: String): Self = this.set("bodyRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyRowHeight: Self = this.set("bodyRowHeight", js.undefined)
    @scala.inline
    def setCellDataBound(
      value: (/* e */ js.Any, /* $wrapper */ JQuery, /* id */ String, /* column */ GridColumn, /* record */ Entity) => _
    ): Self = this.set("cellDataBound", js.Any.fromFunction5(value))
    @scala.inline
    def deleteCellDataBound: Self = this.set("cellDataBound", js.undefined)
    @scala.inline
    def setCellDataChanged(
      value: (/* e */ js.Any, /* $cell */ JQuery, /* column */ GridColumn, /* record */ Entity, /* oldValue */ js.Any, /* newValue */ js.Any) => _
    ): Self = this.set("cellDataChanged", js.Any.fromFunction6(value))
    @scala.inline
    def deleteCellDataChanged: Self = this.set("cellDataChanged", js.undefined)
    @scala.inline
    def setColumnHide(value: (/* e */ js.Any, /* column */ GridColumn) => _): Self = this.set("columnHide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnHide: Self = this.set("columnHide", js.undefined)
    @scala.inline
    def setColumnReorder(value: Boolean): Self = this.set("columnReorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnReorder: Self = this.set("columnReorder", js.undefined)
    @scala.inline
    def setColumnShow(value: (/* e */ js.Any, /* column */ GridColumn) => _): Self = this.set("columnShow", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnShow: Self = this.set("columnShow", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: GridColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[GridColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDataBinding(value: (/* e */ js.Any, /* records */ js.Array[Entity]) => _): Self = this.set("dataBinding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    @scala.inline
    def setDataBound(value: (/* e */ js.Any, /* records */ js.Array[Entity], /* totalRecords */ Double) => _): Self = this.set("dataBound", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataFiltered(value: (/* e */ js.Any, /* records */ js.Array[Entity]) => _): Self = this.set("dataFiltered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataFiltered: Self = this.set("dataFiltered", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDefaultColumnSettings(value: GridColumn): Self = this.set("defaultColumnSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultColumnSettings: Self = this.set("defaultColumnSettings", js.undefined)
    @scala.inline
    def setDestroying(value: /* e */ js.Any => _): Self = this.set("destroying", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroying: Self = this.set("destroying", js.undefined)
    @scala.inline
    def setDetailCollapse(value: (/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String) => _): Self = this.set("detailCollapse", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDetailCollapse: Self = this.set("detailCollapse", js.undefined)
    @scala.inline
    def setDetailExpand(value: (/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String) => _): Self = this.set("detailExpand", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDetailExpand: Self = this.set("detailExpand", js.undefined)
    @scala.inline
    def setDetailTemplate(value: String): Self = this.set("detailTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailTemplate: Self = this.set("detailTemplate", js.undefined)
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setGrouping(value: GridGrouping): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    @scala.inline
    def setHeaderFilter(value: GridHeaderFilter): Self = this.set("headerFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFilter: Self = this.set("headerFilter", js.undefined)
    @scala.inline
    def setHeaderRowHeight(value: String): Self = this.set("headerRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRowHeight: Self = this.set("headerRowHeight", js.undefined)
    @scala.inline
    def setIcons(value: GridIcons): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setIconsLibrary(value: String): Self = this.set("iconsLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconsLibrary: Self = this.set("iconsLibrary", js.undefined)
    @scala.inline
    def setInitialized(value: /* e */ js.Any => _): Self = this.set("initialized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitialized: Self = this.set("initialized", js.undefined)
    @scala.inline
    def setInlineEditing(value: GridInlineEditing): Self = this.set("inlineEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineEditing: Self = this.set("inlineEditing", js.undefined)
    @scala.inline
    def setKeepExpandedRows(value: Boolean): Self = this.set("keepExpandedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepExpandedRows: Self = this.set("keepExpandedRows", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMapping(value: js.Any): Self = this.set("mapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setNotFoundText(value: String): Self = this.set("notFoundText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundText: Self = this.set("notFoundText", js.undefined)
    @scala.inline
    def setOptimisticPersistence(value: GridOptimisticPersistence): Self = this.set("optimisticPersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimisticPersistence: Self = this.set("optimisticPersistence", js.undefined)
    @scala.inline
    def setOrderNumberField(value: String): Self = this.set("orderNumberField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderNumberField: Self = this.set("orderNumberField", js.undefined)
    @scala.inline
    def setPageChanging(value: (/* e */ js.Any, /* newPage */ Double) => _): Self = this.set("pageChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deletePageChanging: Self = this.set("pageChanging", js.undefined)
    @scala.inline
    def setPageSizeChange(value: (/* e */ js.Any, /* newPage */ Double) => _): Self = this.set("pageSizeChange", js.Any.fromFunction2(value))
    @scala.inline
    def deletePageSizeChange: Self = this.set("pageSizeChange", js.undefined)
    @scala.inline
    def setPager(value: GridPager): Self = this.set("pager", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
    @scala.inline
    def setParamNames(value: GridParamNames): Self = this.set("paramNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamNames: Self = this.set("paramNames", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    @scala.inline
    def setResizableColumns(value: Boolean): Self = this.set("resizableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizableColumns: Self = this.set("resizableColumns", js.undefined)
    @scala.inline
    def setResize(value: (/* e */ js.Any, /* newWidth */ Double, /* oldWidth */ Double) => _): Self = this.set("resize", js.Any.fromFunction3(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setResizeCheckInterval(value: Double): Self = this.set("resizeCheckInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeCheckInterval: Self = this.set("resizeCheckInterval", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setRowDataBound(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self = this.set("rowDataBound", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRowDataBound: Self = this.set("rowDataBound", js.undefined)
    @scala.inline
    def setRowDataChanged(value: (/* e */ js.Any, /* id */ String, /* record */ Entity) => _): Self = this.set("rowDataChanged", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRowDataChanged: Self = this.set("rowDataChanged", js.undefined)
    @scala.inline
    def setRowRemoving(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self = this.set("rowRemoving", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRowRemoving: Self = this.set("rowRemoving", js.undefined)
    @scala.inline
    def setRowReorder(value: Boolean): Self = this.set("rowReorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowReorder: Self = this.set("rowReorder", js.undefined)
    @scala.inline
    def setRowReorderColumn(value: String): Self = this.set("rowReorderColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowReorderColumn: Self = this.set("rowReorderColumn", js.undefined)
    @scala.inline
    def setRowSelect(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self = this.set("rowSelect", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRowSelect: Self = this.set("rowSelect", js.undefined)
    @scala.inline
    def setRowUnselect(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self = this.set("rowUnselect", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRowUnselect: Self = this.set("rowUnselect", js.undefined)
    @scala.inline
    def setSelectionMethod(value: String): Self = this.set("selectionMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMethod: Self = this.set("selectionMethod", js.undefined)
    @scala.inline
    def setSelectionType(value: String): Self = this.set("selectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionType: Self = this.set("selectionType", js.undefined)
    @scala.inline
    def setShowHiddenColumnsAsDetails(value: Boolean): Self = this.set("showHiddenColumnsAsDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHiddenColumnsAsDetails: Self = this.set("showHiddenColumnsAsDetails", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToolbarTemplate(value: String): Self = this.set("toolbarTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarTemplate: Self = this.set("toolbarTemplate", js.undefined)
    @scala.inline
    def setUiLibrary(value: String): Self = this.set("uiLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUiLibrary: Self = this.set("uiLibrary", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

