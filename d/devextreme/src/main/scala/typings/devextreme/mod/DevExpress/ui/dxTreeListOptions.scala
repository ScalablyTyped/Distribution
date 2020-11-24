package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.CancelColumnComponent
import typings.devextreme.anon.CellElementColumn
import typings.devextreme.anon.ColumnIndexComponent
import typings.devextreme.anon.ColumnsComponent
import typings.devextreme.anon.DataDisplayValue
import typings.devextreme.anon.EventType
import typings.devextreme.anon.Grouping
import typings.devextreme.anon.IsHighlighted
import typings.devextreme.anon.Level
import typings.devextreme.anon.ModelRow
import typings.devextreme.anon.Node
import typings.devextreme.anon.ParentType
import typings.devextreme.anon.PrevRowIndex
import typings.devextreme.anon.ReadOnly
import typings.devextreme.anon.Root
import typings.devextreme.anon.RowRowElement
import typings.devextreme.anon.Target
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.fullBranch
import typings.devextreme.devextremeStrings.matchOnly
import typings.devextreme.devextremeStrings.plain
import typings.devextreme.devextremeStrings.tree
import typings.devextreme.devextremeStrings.withAncestors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeListOptions extends GridBaseOptions[dxTreeList] {
  
  /**
    * [descr:dxTreeList.Options.autoExpandAll]
    */
  var autoExpandAll: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeList.Options.columns]
    */
  @JSName("columns")
  var columns_dxTreeListOptions: js.UndefOr[js.Array[dxTreeListColumn | String]] = js.native
  
  /**
    * [descr:dxTreeList.Options.customizeColumns]
    */
  var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[dxTreeListColumn], _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.dataStructure]
    */
  var dataStructure: js.UndefOr[plain | tree] = js.native
  
  /**
    * [descr:dxTreeList.Options.editing]
    */
  @JSName("editing")
  var editing_dxTreeListOptions: js.UndefOr[dxTreeListEditing] = js.native
  
  /**
    * [descr:dxTreeList.Options.expandNodesOnFiltering]
    */
  var expandNodesOnFiltering: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeList.Options.expandedRowKeys]
    */
  var expandedRowKeys: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:dxTreeList.Options.filterMode]
    */
  var filterMode: js.UndefOr[fullBranch | withAncestors | matchOnly] = js.native
  
  /**
    * [descr:dxTreeList.Options.hasItemsExpr]
    */
  var hasItemsExpr: js.UndefOr[String | js.Function] = js.native
  
  /**
    * [descr:dxTreeList.Options.itemsExpr]
    */
  var itemsExpr: js.UndefOr[String | js.Function] = js.native
  
  /**
    * [descr:dxTreeList.Options.keyExpr]
    */
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  
  /**
    * [descr:dxTreeList.Options.onCellClick]
    */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ CellElementColumn, _]) | String] = js.native
  
  /**
    * [descr:dxTreeList.Options.onCellDblClick]
    */
  var onCellDblClick: js.UndefOr[js.Function1[/* e */ ColumnIndexComponent, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onCellHoverChanged]
    */
  var onCellHoverChanged: js.UndefOr[js.Function1[/* e */ EventType, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onCellPrepared]
    */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ DataDisplayValue, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onContextMenuPreparing]
    */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ Target, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onEditingStart]
    */
  var onEditingStart: js.UndefOr[js.Function1[/* e */ CancelColumnComponent, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onEditorPrepared]
    */
  var onEditorPrepared: js.UndefOr[js.Function1[/* options */ ParentType, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onEditorPreparing]
    */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ ReadOnly, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onFocusedCellChanged]
    */
  var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ ModelRow, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onFocusedCellChanging]
    */
  var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ IsHighlighted, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onFocusedRowChanged]
    */
  var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ RowRowElement, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onFocusedRowChanging]
    */
  var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ PrevRowIndex, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onNodesInitialized]
    */
  var onNodesInitialized: js.UndefOr[js.Function1[/* e */ Root, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onRowClick]
    */
  var onRowClick: js.UndefOr[(js.Function1[/* e */ Level, _]) | String] = js.native
  
  /**
    * [descr:dxTreeList.Options.onRowDblClick]
    */
  var onRowDblClick: js.UndefOr[js.Function1[/* e */ ColumnsComponent, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.onRowPrepared]
    */
  var onRowPrepared: js.UndefOr[js.Function1[/* e */ Node, _]] = js.native
  
  /**
    * [descr:dxTreeList.Options.paging]
    */
  @JSName("paging")
  var paging_dxTreeListOptions: js.UndefOr[dxTreeListPaging] = js.native
  
  /**
    * [descr:dxTreeList.Options.parentIdExpr]
    */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.native
  
  /**
    * [descr:dxTreeList.Options.remoteOperations]
    */
  var remoteOperations: js.UndefOr[Grouping | auto] = js.native
  
  /**
    * [descr:dxTreeList.Options.rootValue]
    */
  var rootValue: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxTreeList.Options.scrolling]
    */
  @JSName("scrolling")
  var scrolling_dxTreeListOptions: js.UndefOr[dxTreeListScrolling] = js.native
  
  /**
    * [descr:dxTreeList.Options.selection]
    */
  @JSName("selection")
  var selection_dxTreeListOptions: js.UndefOr[dxTreeListSelection] = js.native
}
object dxTreeListOptions {
  
  @scala.inline
  def apply(): dxTreeListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListOptions]
  }
  
  @scala.inline
  implicit class dxTreeListOptionsOps[Self <: dxTreeListOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoExpandAll(value: Boolean): Self = this.set("autoExpandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoExpandAll: Self = this.set("autoExpandAll", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (dxTreeListColumn | String)*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[dxTreeListColumn | String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCustomizeColumns(value: /* columns */ js.Array[dxTreeListColumn] => _): Self = this.set("customizeColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeColumns: Self = this.set("customizeColumns", js.undefined)
    
    @scala.inline
    def setDataStructure(value: plain | tree): Self = this.set("dataStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataStructure: Self = this.set("dataStructure", js.undefined)
    
    @scala.inline
    def setEditing(value: dxTreeListEditing): Self = this.set("editing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditing: Self = this.set("editing", js.undefined)
    
    @scala.inline
    def setExpandNodesOnFiltering(value: Boolean): Self = this.set("expandNodesOnFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandNodesOnFiltering: Self = this.set("expandNodesOnFiltering", js.undefined)
    
    @scala.inline
    def setExpandedRowKeysVarargs(value: js.Any*): Self = this.set("expandedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setExpandedRowKeys(value: js.Array[_]): Self = this.set("expandedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedRowKeys: Self = this.set("expandedRowKeys", js.undefined)
    
    @scala.inline
    def setFilterMode(value: fullBranch | withAncestors | matchOnly): Self = this.set("filterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterMode: Self = this.set("filterMode", js.undefined)
    
    @scala.inline
    def setHasItemsExpr(value: String | js.Function): Self = this.set("hasItemsExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasItemsExpr: Self = this.set("hasItemsExpr", js.undefined)
    
    @scala.inline
    def setItemsExpr(value: String | js.Function): Self = this.set("itemsExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsExpr: Self = this.set("itemsExpr", js.undefined)
    
    @scala.inline
    def setKeyExpr(value: String | js.Function): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
    
    @scala.inline
    def setOnCellClickFunction1(value: /* e */ CellElementColumn => _): Self = this.set("onCellClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCellClick(value: (js.Function1[/* e */ CellElementColumn, _]) | String): Self = this.set("onCellClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    
    @scala.inline
    def setOnCellDblClick(value: /* e */ ColumnIndexComponent => _): Self = this.set("onCellDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCellDblClick: Self = this.set("onCellDblClick", js.undefined)
    
    @scala.inline
    def setOnCellHoverChanged(value: /* e */ EventType => _): Self = this.set("onCellHoverChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCellHoverChanged: Self = this.set("onCellHoverChanged", js.undefined)
    
    @scala.inline
    def setOnCellPrepared(value: /* e */ DataDisplayValue => _): Self = this.set("onCellPrepared", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCellPrepared: Self = this.set("onCellPrepared", js.undefined)
    
    @scala.inline
    def setOnContextMenuPreparing(value: /* e */ Target => _): Self = this.set("onContextMenuPreparing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenuPreparing: Self = this.set("onContextMenuPreparing", js.undefined)
    
    @scala.inline
    def setOnEditingStart(value: /* e */ CancelColumnComponent => _): Self = this.set("onEditingStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEditingStart: Self = this.set("onEditingStart", js.undefined)
    
    @scala.inline
    def setOnEditorPrepared(value: /* options */ ParentType => _): Self = this.set("onEditorPrepared", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEditorPrepared: Self = this.set("onEditorPrepared", js.undefined)
    
    @scala.inline
    def setOnEditorPreparing(value: /* e */ ReadOnly => _): Self = this.set("onEditorPreparing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEditorPreparing: Self = this.set("onEditorPreparing", js.undefined)
    
    @scala.inline
    def setOnFocusedCellChanged(value: /* e */ ModelRow => _): Self = this.set("onFocusedCellChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocusedCellChanged: Self = this.set("onFocusedCellChanged", js.undefined)
    
    @scala.inline
    def setOnFocusedCellChanging(value: /* e */ IsHighlighted => _): Self = this.set("onFocusedCellChanging", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocusedCellChanging: Self = this.set("onFocusedCellChanging", js.undefined)
    
    @scala.inline
    def setOnFocusedRowChanged(value: /* e */ RowRowElement => _): Self = this.set("onFocusedRowChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocusedRowChanged: Self = this.set("onFocusedRowChanged", js.undefined)
    
    @scala.inline
    def setOnFocusedRowChanging(value: /* e */ PrevRowIndex => _): Self = this.set("onFocusedRowChanging", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocusedRowChanging: Self = this.set("onFocusedRowChanging", js.undefined)
    
    @scala.inline
    def setOnNodesInitialized(value: /* e */ Root => _): Self = this.set("onNodesInitialized", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNodesInitialized: Self = this.set("onNodesInitialized", js.undefined)
    
    @scala.inline
    def setOnRowClickFunction1(value: /* e */ Level => _): Self = this.set("onRowClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowClick(value: (js.Function1[/* e */ Level, _]) | String): Self = this.set("onRowClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    
    @scala.inline
    def setOnRowDblClick(value: /* e */ ColumnsComponent => _): Self = this.set("onRowDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowDblClick: Self = this.set("onRowDblClick", js.undefined)
    
    @scala.inline
    def setOnRowPrepared(value: /* e */ Node => _): Self = this.set("onRowPrepared", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowPrepared: Self = this.set("onRowPrepared", js.undefined)
    
    @scala.inline
    def setPaging(value: dxTreeListPaging): Self = this.set("paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    
    @scala.inline
    def setParentIdExpr(value: String | js.Function): Self = this.set("parentIdExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentIdExpr: Self = this.set("parentIdExpr", js.undefined)
    
    @scala.inline
    def setRemoteOperations(value: Grouping | auto): Self = this.set("remoteOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteOperations: Self = this.set("remoteOperations", js.undefined)
    
    @scala.inline
    def setRootValue(value: js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    
    @scala.inline
    def setScrolling(value: dxTreeListScrolling): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    
    @scala.inline
    def setSelection(value: dxTreeListSelection): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
  }
}
