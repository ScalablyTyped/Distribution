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

