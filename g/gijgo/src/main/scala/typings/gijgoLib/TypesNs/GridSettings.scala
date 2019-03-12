package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSettings[Entity] extends js.Object {
  //Configuration options
  var autoGenerateColumns: js.UndefOr[scala.Boolean] = js.undefined
  var autoLoad: js.UndefOr[scala.Boolean] = js.undefined
  //Events
  var beforeEmptyRowInsert: js.UndefOr[js.Function2[/* e */ js.Any, /* $row */ gijgoLib.JQuery, _]] = js.undefined
  var bodyRowHeight: js.UndefOr[java.lang.String] = js.undefined
  var cellDataBound: js.UndefOr[
    js.Function5[
      /* e */ js.Any, 
      /* $wrapper */ gijgoLib.JQuery, 
      /* id */ java.lang.String, 
      /* column */ GridColumn, 
      /* record */ Entity, 
      _
    ]
  ] = js.undefined
  var cellDataChanged: js.UndefOr[
    js.Function6[
      /* e */ js.Any, 
      /* $cell */ gijgoLib.JQuery, 
      /* column */ GridColumn, 
      /* record */ Entity, 
      /* oldValue */ js.Any, 
      /* newValue */ js.Any, 
      _
    ]
  ] = js.undefined
  var columnHide: js.UndefOr[js.Function2[/* e */ js.Any, /* column */ GridColumn, _]] = js.undefined
  var columnReorder: js.UndefOr[scala.Boolean] = js.undefined
  var columnShow: js.UndefOr[js.Function2[/* e */ js.Any, /* column */ GridColumn, _]] = js.undefined
  var columns: js.UndefOr[js.Array[GridColumn]] = js.undefined
  var dataBinding: js.UndefOr[js.Function2[/* e */ js.Any, /* records */ js.Array[Entity], _]] = js.undefined
  var dataBound: js.UndefOr[
    js.Function3[/* e */ js.Any, /* records */ js.Array[Entity], /* totalRecords */ scala.Double, _]
  ] = js.undefined
  var dataFiltered: js.UndefOr[js.Function2[/* e */ js.Any, /* records */ js.Array[Entity], _]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var defaultColumnSettings: js.UndefOr[GridColumn] = js.undefined
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var detailCollapse: js.UndefOr[
    js.Function3[/* e */ js.Any, /* detailWrapper */ gijgoLib.JQuery, /* id */ java.lang.String, _]
  ] = js.undefined
  var detailExpand: js.UndefOr[
    js.Function3[/* e */ js.Any, /* detailWrapper */ gijgoLib.JQuery, /* id */ java.lang.String, _]
  ] = js.undefined
  var detailTemplate: js.UndefOr[java.lang.String] = js.undefined
  var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  var grouping: js.UndefOr[GridGrouping] = js.undefined
  var headerFilter: js.UndefOr[GridHeaderFilter] = js.undefined
  var headerRowHeight: js.UndefOr[java.lang.String] = js.undefined
  var icons: js.UndefOr[GridIcons] = js.undefined
  var iconsLibrary: js.UndefOr[java.lang.String] = js.undefined
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var inlineEditing: js.UndefOr[GridInlineEditing] = js.undefined
  var keepExpandedRows: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var mapping: js.UndefOr[js.Any] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var notFoundText: js.UndefOr[java.lang.String] = js.undefined
  var optimisticPersistence: js.UndefOr[GridOptimisticPersistence] = js.undefined
  var orderNumberField: js.UndefOr[java.lang.String] = js.undefined
  var pageChanging: js.UndefOr[js.Function2[/* e */ js.Any, /* newPage */ scala.Double, _]] = js.undefined
  var pageSizeChange: js.UndefOr[js.Function2[/* e */ js.Any, /* newPage */ scala.Double, _]] = js.undefined
  var pager: js.UndefOr[GridPager] = js.undefined
  var paramNames: js.UndefOr[GridParamNames] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  var resizableColumns: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[
    js.Function3[/* e */ js.Any, /* newWidth */ scala.Double, /* oldWidth */ scala.Double, _]
  ] = js.undefined
  var resizeCheckInterval: js.UndefOr[scala.Double] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var rowDataBound: js.UndefOr[
    js.Function4[
      /* e */ js.Any, 
      /* $row */ gijgoLib.JQuery, 
      /* id */ java.lang.String, 
      /* record */ Entity, 
      _
    ]
  ] = js.undefined
  var rowDataChanged: js.UndefOr[js.Function3[/* e */ js.Any, /* id */ java.lang.String, /* record */ Entity, _]] = js.undefined
  var rowRemoving: js.UndefOr[
    js.Function4[
      /* e */ js.Any, 
      /* $row */ gijgoLib.JQuery, 
      /* id */ java.lang.String, 
      /* record */ Entity, 
      _
    ]
  ] = js.undefined
  var rowReorder: js.UndefOr[scala.Boolean] = js.undefined
  var rowReorderColumn: js.UndefOr[java.lang.String] = js.undefined
  var rowSelect: js.UndefOr[
    js.Function4[
      /* e */ js.Any, 
      /* $row */ gijgoLib.JQuery, 
      /* id */ java.lang.String, 
      /* record */ Entity, 
      _
    ]
  ] = js.undefined
  var rowUnselect: js.UndefOr[
    js.Function4[
      /* e */ js.Any, 
      /* $row */ gijgoLib.JQuery, 
      /* id */ java.lang.String, 
      /* record */ Entity, 
      _
    ]
  ] = js.undefined
  var selectionMethod: js.UndefOr[java.lang.String] = js.undefined
  var selectionType: js.UndefOr[java.lang.String] = js.undefined
  var showHiddenColumnsAsDetails: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var toolbarTemplate: js.UndefOr[java.lang.String] = js.undefined
  var uiLibrary: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object GridSettings {
  @scala.inline
  def apply[Entity](
    autoGenerateColumns: js.UndefOr[scala.Boolean] = js.undefined,
    autoLoad: js.UndefOr[scala.Boolean] = js.undefined,
    beforeEmptyRowInsert: (/* e */ js.Any, /* $row */ gijgoLib.JQuery) => _ = null,
    bodyRowHeight: java.lang.String = null,
    cellDataBound: (/* e */ js.Any, /* $wrapper */ gijgoLib.JQuery, /* id */ java.lang.String, /* column */ GridColumn, /* record */ Entity) => _ = null,
    cellDataChanged: (/* e */ js.Any, /* $cell */ gijgoLib.JQuery, /* column */ GridColumn, /* record */ Entity, /* oldValue */ js.Any, /* newValue */ js.Any) => _ = null,
    columnHide: (/* e */ js.Any, /* column */ GridColumn) => _ = null,
    columnReorder: js.UndefOr[scala.Boolean] = js.undefined,
    columnShow: (/* e */ js.Any, /* column */ GridColumn) => _ = null,
    columns: js.Array[GridColumn] = null,
    dataBinding: (/* e */ js.Any, /* records */ js.Array[Entity]) => _ = null,
    dataBound: (/* e */ js.Any, /* records */ js.Array[Entity], /* totalRecords */ scala.Double) => _ = null,
    dataFiltered: (/* e */ js.Any, /* records */ js.Array[Entity]) => _ = null,
    dataSource: js.Any = null,
    defaultColumnSettings: GridColumn = null,
    destroying: /* e */ js.Any => _ = null,
    detailCollapse: (/* e */ js.Any, /* detailWrapper */ gijgoLib.JQuery, /* id */ java.lang.String) => _ = null,
    detailExpand: (/* e */ js.Any, /* detailWrapper */ gijgoLib.JQuery, /* id */ java.lang.String) => _ = null,
    detailTemplate: java.lang.String = null,
    fixedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    fontSize: java.lang.String = null,
    grouping: GridGrouping = null,
    headerFilter: GridHeaderFilter = null,
    headerRowHeight: java.lang.String = null,
    icons: GridIcons = null,
    iconsLibrary: java.lang.String = null,
    initialized: /* e */ js.Any => _ = null,
    inlineEditing: GridInlineEditing = null,
    keepExpandedRows: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    mapping: js.Any = null,
    minWidth: scala.Int | scala.Double = null,
    notFoundText: java.lang.String = null,
    optimisticPersistence: GridOptimisticPersistence = null,
    orderNumberField: java.lang.String = null,
    pageChanging: (/* e */ js.Any, /* newPage */ scala.Double) => _ = null,
    pageSizeChange: (/* e */ js.Any, /* newPage */ scala.Double) => _ = null,
    pager: GridPager = null,
    paramNames: GridParamNames = null,
    params: js.Any = null,
    primaryKey: java.lang.String = null,
    resizableColumns: js.UndefOr[scala.Boolean] = js.undefined,
    resize: (/* e */ js.Any, /* newWidth */ scala.Double, /* oldWidth */ scala.Double) => _ = null,
    resizeCheckInterval: scala.Int | scala.Double = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    rowDataBound: (/* e */ js.Any, /* $row */ gijgoLib.JQuery, /* id */ java.lang.String, /* record */ Entity) => _ = null,
    rowDataChanged: (/* e */ js.Any, /* id */ java.lang.String, /* record */ Entity) => _ = null,
    rowRemoving: (/* e */ js.Any, /* $row */ gijgoLib.JQuery, /* id */ java.lang.String, /* record */ Entity) => _ = null,
    rowReorder: js.UndefOr[scala.Boolean] = js.undefined,
    rowReorderColumn: java.lang.String = null,
    rowSelect: (/* e */ js.Any, /* $row */ gijgoLib.JQuery, /* id */ java.lang.String, /* record */ Entity) => _ = null,
    rowUnselect: (/* e */ js.Any, /* $row */ gijgoLib.JQuery, /* id */ java.lang.String, /* record */ Entity) => _ = null,
    selectionMethod: java.lang.String = null,
    selectionType: java.lang.String = null,
    showHiddenColumnsAsDetails: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    toolbarTemplate: java.lang.String = null,
    uiLibrary: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): GridSettings[Entity] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoGenerateColumns)) __obj.updateDynamic("autoGenerateColumns")(autoGenerateColumns)
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad)
    if (beforeEmptyRowInsert != null) __obj.updateDynamic("beforeEmptyRowInsert")(js.Any.fromFunction2(beforeEmptyRowInsert))
    if (bodyRowHeight != null) __obj.updateDynamic("bodyRowHeight")(bodyRowHeight)
    if (cellDataBound != null) __obj.updateDynamic("cellDataBound")(js.Any.fromFunction5(cellDataBound))
    if (cellDataChanged != null) __obj.updateDynamic("cellDataChanged")(js.Any.fromFunction6(cellDataChanged))
    if (columnHide != null) __obj.updateDynamic("columnHide")(js.Any.fromFunction2(columnHide))
    if (!js.isUndefined(columnReorder)) __obj.updateDynamic("columnReorder")(columnReorder)
    if (columnShow != null) __obj.updateDynamic("columnShow")(js.Any.fromFunction2(columnShow))
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction2(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction3(dataBound))
    if (dataFiltered != null) __obj.updateDynamic("dataFiltered")(js.Any.fromFunction2(dataFiltered))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (defaultColumnSettings != null) __obj.updateDynamic("defaultColumnSettings")(defaultColumnSettings)
    if (destroying != null) __obj.updateDynamic("destroying")(js.Any.fromFunction1(destroying))
    if (detailCollapse != null) __obj.updateDynamic("detailCollapse")(js.Any.fromFunction3(detailCollapse))
    if (detailExpand != null) __obj.updateDynamic("detailExpand")(js.Any.fromFunction3(detailExpand))
    if (detailTemplate != null) __obj.updateDynamic("detailTemplate")(detailTemplate)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (grouping != null) __obj.updateDynamic("grouping")(grouping)
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter)
    if (headerRowHeight != null) __obj.updateDynamic("headerRowHeight")(headerRowHeight)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary)
    if (initialized != null) __obj.updateDynamic("initialized")(js.Any.fromFunction1(initialized))
    if (inlineEditing != null) __obj.updateDynamic("inlineEditing")(inlineEditing)
    if (!js.isUndefined(keepExpandedRows)) __obj.updateDynamic("keepExpandedRows")(keepExpandedRows)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (notFoundText != null) __obj.updateDynamic("notFoundText")(notFoundText)
    if (optimisticPersistence != null) __obj.updateDynamic("optimisticPersistence")(optimisticPersistence)
    if (orderNumberField != null) __obj.updateDynamic("orderNumberField")(orderNumberField)
    if (pageChanging != null) __obj.updateDynamic("pageChanging")(js.Any.fromFunction2(pageChanging))
    if (pageSizeChange != null) __obj.updateDynamic("pageSizeChange")(js.Any.fromFunction2(pageSizeChange))
    if (pager != null) __obj.updateDynamic("pager")(pager)
    if (paramNames != null) __obj.updateDynamic("paramNames")(paramNames)
    if (params != null) __obj.updateDynamic("params")(params)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns)
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction3(resize))
    if (resizeCheckInterval != null) __obj.updateDynamic("resizeCheckInterval")(resizeCheckInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (rowDataBound != null) __obj.updateDynamic("rowDataBound")(js.Any.fromFunction4(rowDataBound))
    if (rowDataChanged != null) __obj.updateDynamic("rowDataChanged")(js.Any.fromFunction3(rowDataChanged))
    if (rowRemoving != null) __obj.updateDynamic("rowRemoving")(js.Any.fromFunction4(rowRemoving))
    if (!js.isUndefined(rowReorder)) __obj.updateDynamic("rowReorder")(rowReorder)
    if (rowReorderColumn != null) __obj.updateDynamic("rowReorderColumn")(rowReorderColumn)
    if (rowSelect != null) __obj.updateDynamic("rowSelect")(js.Any.fromFunction4(rowSelect))
    if (rowUnselect != null) __obj.updateDynamic("rowUnselect")(js.Any.fromFunction4(rowUnselect))
    if (selectionMethod != null) __obj.updateDynamic("selectionMethod")(selectionMethod)
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType)
    if (!js.isUndefined(showHiddenColumnsAsDetails)) __obj.updateDynamic("showHiddenColumnsAsDetails")(showHiddenColumnsAsDetails)
    if (title != null) __obj.updateDynamic("title")(title)
    if (toolbarTemplate != null) __obj.updateDynamic("toolbarTemplate")(toolbarTemplate)
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridSettings[Entity]]
  }
}

