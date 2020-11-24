package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentElementModelValue
import typings.devextreme.anon.ElementItemElement
import typings.devextreme.anon.ItemDataItemElementItemIndex
import typings.devextreme.anon.ItemElementItemIndexModel
import typings.devextreme.anon.ModelNode
import typings.devextreme.anon.`16`
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.click
import typings.devextreme.devextremeStrings.dblclick_
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.plain
import typings.devextreme.devextremeStrings.selectAll
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.devextremeStrings.tree
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeViewOptions
  extends HierarchicalCollectionWidgetOptions[dxTreeView]
     with SearchBoxMixinOptions[dxTreeView] {
  
  /**
    * [descr:dxTreeView.Options.animationEnabled]
    */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeView.Options.createChildren]
    */
  var createChildren: js.UndefOr[
    js.Function1[/* parentNode */ dxTreeViewNode, Promise[_] | JQueryPromise[_] | js.Array[_]]
  ] = js.native
  
  /**
    * [descr:dxTreeView.Options.dataSource]
    */
  @JSName("dataSource")
  var dataSource_dxTreeViewOptions: js.UndefOr[String | js.Array[dxTreeViewItem] | DataSource | DataSourceOptions] = js.native
  
  /**
    * [descr:dxTreeView.Options.dataStructure]
    */
  var dataStructure: js.UndefOr[plain | tree] = js.native
  
  /**
    * [descr:dxTreeView.Options.expandAllEnabled]
    */
  var expandAllEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeView.Options.expandEvent]
    */
  var expandEvent: js.UndefOr[dblclick_ | click] = js.native
  
  /**
    * [descr:dxTreeView.Options.expandNodesRecursive]
    */
  var expandNodesRecursive: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeView.Options.expandedExpr]
    */
  var expandedExpr: js.UndefOr[String | js.Function] = js.native
  
  /**
    * [descr:dxTreeView.Options.hasItemsExpr]
    */
  var hasItemsExpr: js.UndefOr[String | js.Function] = js.native
  
  /**
    * [descr:dxTreeView.Options.items]
    */
  @JSName("items")
  var items_dxTreeViewOptions: js.UndefOr[js.Array[dxTreeViewItem]] = js.native
  
  /**
    * [descr:dxTreeView.Options.onItemClick]
    */
  @JSName("onItemClick")
  var onItemClick_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ ModelNode, _]] = js.native
  
  /**
    * [descr:dxTreeView.Options.onItemCollapsed]
    */
  var onItemCollapsed: js.UndefOr[js.Function1[/* e */ ItemDataItemElementItemIndex, _]] = js.native
  
  /**
    * [descr:dxTreeView.Options.onItemContextMenu]
    */
  @JSName("onItemContextMenu")
  var onItemContextMenu_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ ModelNode, _]] = js.native
  
  /**
    * [descr:dxTreeView.Options.onItemExpanded]
    */
  var onItemExpanded: js.UndefOr[js.Function1[/* e */ ItemDataItemElementItemIndex, _]] = js.native
  
  /**
    * [descr:dxTreeView.Options.onItemHold]
    */
  @JSName("onItemHold")
  var onItemHold_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ ItemDataItemElementItemIndex, _]] = js.native
  
  /**
    * [descr:dxTreeView.Options.onItemRendered]
    */
  @JSName("onItemRendered")
  var onItemRendered_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ ItemElementItemIndexModel, _]] = js.native
  
  /**
    * [descr:dxTreeView.Options.onItemSelectionChanged]
    */
  var onItemSelectionChanged: js.UndefOr[js.Function1[/* e */ ElementItemElement, _]] = js.native
  
  /**
    * [descr:dxTreeView.Options.onSelectAllValueChanged]
    */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ ComponentElementModelValue, _]] = js.native
  
  /**
    * [descr:dxTreeView.Options.onSelectionChanged]
    */
  @JSName("onSelectionChanged")
  var onSelectionChanged_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ `16`, _]] = js.native
  
  /**
    * [descr:dxTreeView.Options.parentIdExpr]
    */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.native
  
  /**
    * [descr:dxTreeView.Options.rootValue]
    */
  var rootValue: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxTreeView.Options.scrollDirection]
    */
  var scrollDirection: js.UndefOr[both | horizontal | vertical] = js.native
  
  /**
    * [descr:dxTreeView.Options.selectAllText]
    */
  var selectAllText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxTreeView.Options.selectByClick]
    */
  var selectByClick: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeView.Options.selectNodesRecursive]
    */
  var selectNodesRecursive: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxTreeView.Options.selectionMode]
    */
  var selectionMode: js.UndefOr[multiple | single_] = js.native
  
  /**
    * [descr:dxTreeView.Options.showCheckBoxesMode]
    */
  var showCheckBoxesMode: js.UndefOr[none | normal | selectAll] = js.native
  
  /**
    * [descr:dxTreeView.Options.virtualModeEnabled]
    */
  var virtualModeEnabled: js.UndefOr[Boolean] = js.native
}
object dxTreeViewOptions {
  
  @scala.inline
  def apply(): dxTreeViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeViewOptions]
  }
  
  @scala.inline
  implicit class dxTreeViewOptionsOps[Self <: dxTreeViewOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimationEnabled(value: Boolean): Self = this.set("animationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEnabled: Self = this.set("animationEnabled", js.undefined)
    
    @scala.inline
    def setCreateChildren(value: /* parentNode */ dxTreeViewNode => Promise[_] | JQueryPromise[_] | js.Array[_]): Self = this.set("createChildren", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateChildren: Self = this.set("createChildren", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: dxTreeViewItem*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | js.Array[dxTreeViewItem] | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataStructure(value: plain | tree): Self = this.set("dataStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataStructure: Self = this.set("dataStructure", js.undefined)
    
    @scala.inline
    def setExpandAllEnabled(value: Boolean): Self = this.set("expandAllEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandAllEnabled: Self = this.set("expandAllEnabled", js.undefined)
    
    @scala.inline
    def setExpandEvent(value: dblclick_ | click): Self = this.set("expandEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandEvent: Self = this.set("expandEvent", js.undefined)
    
    @scala.inline
    def setExpandNodesRecursive(value: Boolean): Self = this.set("expandNodesRecursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandNodesRecursive: Self = this.set("expandNodesRecursive", js.undefined)
    
    @scala.inline
    def setExpandedExpr(value: String | js.Function): Self = this.set("expandedExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedExpr: Self = this.set("expandedExpr", js.undefined)
    
    @scala.inline
    def setHasItemsExpr(value: String | js.Function): Self = this.set("hasItemsExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasItemsExpr: Self = this.set("hasItemsExpr", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: dxTreeViewItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[dxTreeViewItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOnItemClick(value: /* e */ ModelNode => _): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    
    @scala.inline
    def setOnItemCollapsed(value: /* e */ ItemDataItemElementItemIndex => _): Self = this.set("onItemCollapsed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemCollapsed: Self = this.set("onItemCollapsed", js.undefined)
    
    @scala.inline
    def setOnItemContextMenu(value: /* e */ ModelNode => _): Self = this.set("onItemContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemContextMenu: Self = this.set("onItemContextMenu", js.undefined)
    
    @scala.inline
    def setOnItemExpanded(value: /* e */ ItemDataItemElementItemIndex => _): Self = this.set("onItemExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemExpanded: Self = this.set("onItemExpanded", js.undefined)
    
    @scala.inline
    def setOnItemHold(value: /* e */ ItemDataItemElementItemIndex => _): Self = this.set("onItemHold", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemHold: Self = this.set("onItemHold", js.undefined)
    
    @scala.inline
    def setOnItemRendered(value: /* e */ ItemElementItemIndexModel => _): Self = this.set("onItemRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemRendered: Self = this.set("onItemRendered", js.undefined)
    
    @scala.inline
    def setOnItemSelectionChanged(value: /* e */ ElementItemElement => _): Self = this.set("onItemSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemSelectionChanged: Self = this.set("onItemSelectionChanged", js.undefined)
    
    @scala.inline
    def setOnSelectAllValueChanged(value: /* e */ ComponentElementModelValue => _): Self = this.set("onSelectAllValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectAllValueChanged: Self = this.set("onSelectAllValueChanged", js.undefined)
    
    @scala.inline
    def setOnSelectionChanged(value: /* e */ `16` => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    
    @scala.inline
    def setParentIdExpr(value: String | js.Function): Self = this.set("parentIdExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentIdExpr: Self = this.set("parentIdExpr", js.undefined)
    
    @scala.inline
    def setRootValue(value: js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    
    @scala.inline
    def setScrollDirection(value: both | horizontal | vertical): Self = this.set("scrollDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollDirection: Self = this.set("scrollDirection", js.undefined)
    
    @scala.inline
    def setSelectAllText(value: String): Self = this.set("selectAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAllText: Self = this.set("selectAllText", js.undefined)
    
    @scala.inline
    def setSelectByClick(value: Boolean): Self = this.set("selectByClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectByClick: Self = this.set("selectByClick", js.undefined)
    
    @scala.inline
    def setSelectNodesRecursive(value: Boolean): Self = this.set("selectNodesRecursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectNodesRecursive: Self = this.set("selectNodesRecursive", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: multiple | single_): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setShowCheckBoxesMode(value: none | normal | selectAll): Self = this.set("showCheckBoxesMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCheckBoxesMode: Self = this.set("showCheckBoxesMode", js.undefined)
    
    @scala.inline
    def setVirtualModeEnabled(value: Boolean): Self = this.set("virtualModeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualModeEnabled: Self = this.set("virtualModeEnabled", js.undefined)
  }
}
