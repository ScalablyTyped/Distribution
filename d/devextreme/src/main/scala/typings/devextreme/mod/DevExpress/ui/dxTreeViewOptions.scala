package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StringDictionary
import typings.devextreme.mod.DevExpress.DOMComponent.OptionChangedEventInfo
import typings.devextreme.mod.DevExpress.common.DataStructure
import typings.devextreme.mod.DevExpress.common.ScrollDirection
import typings.devextreme.mod.DevExpress.common.SearchMode
import typings.devextreme.mod.DevExpress.common.SingleOrMultiple
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.ui.dxTextBox.Properties
import typings.devextreme.mod.DevExpress.ui.dxTreeView.Item
import typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemClickEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemCollapsedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemContextMenuEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemExpandedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemHoldEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemRenderedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemSelectionChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeView.Node
import typings.devextreme.mod.DevExpress.ui.dxTreeView.SelectAllValueChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeView.SelectionChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeView.TreeViewCheckBoxMode
import typings.devextreme.mod.DevExpress.ui.dxTreeView.TreeViewExpandEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent devextreme.devextreme.DevExpress.core.Skip<devextreme.devextreme.DevExpress.ui.HierarchicalCollectionWidgetOptions<devextreme.devextreme.DevExpress.ui.dxTreeView<TKey>, devextreme.devextreme.DevExpress.ui.dxTreeViewItem, TKey>, 'dataSource'> */
/* Inlined parent devextreme.devextreme.DevExpress.ui.SearchBoxMixinOptions */
trait dxTreeViewOptions[TKey] extends StObject {
  
  var accessKey: js.UndefOr[String] = js.undefined
  
  var activeStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not to animate item collapsing and expanding.
    */
  var animationEnabled: js.UndefOr[Boolean] = js.undefined
  
  var bindingOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Allows you to load nodes on demand.
    */
  var createChildren: js.UndefOr[js.Function1[/* parentNode */ Node[TKey], js.Thenable[Any] | js.Array[Any]]] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[(DataSourceLike[Item, TKey]) | Null] = js.undefined
  
  /**
    * Notifies the UI component of the used data structure.
    */
  var dataStructure: js.UndefOr[DataStructure] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var disabledExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ dxTreeViewItem, String])] = js.undefined
  
  var elementAttr: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Specifies whether or not a user can expand all tree view items by the &apos;*&apos; hot key.
    */
  var expandAllEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the event on which to expand/collapse a node.
    */
  var expandEvent: js.UndefOr[TreeViewExpandEvent] = js.undefined
  
  /**
    * Specifies whether or not all parent nodes of an initially expanded node are displayed expanded.
    */
  var expandNodesRecursive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies which data source field specifies whether an item is expanded.
    */
  var expandedExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var focusStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of the data source item field whose value defines whether or not the corresponding node includes child nodes.
    */
  var hasItemsExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var hoverStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  var itemHoldTimeout: js.UndefOr[Double] = js.undefined
  
  var itemTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ dxTreeViewItem, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * An array of items displayed by the UI component.
    */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var itemsExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var noDataText: js.UndefOr[String] = js.undefined
  
  var onContentReady: js.UndefOr[js.Function1[/* e */ EventInfo[dxTreeView[TKey]], Unit]] = js.undefined
  
  var onDisposing: js.UndefOr[js.Function1[/* e */ EventInfo[dxTreeView[TKey]], Unit]] = js.undefined
  
  var onInitialized: js.UndefOr[js.Function1[/* e */ InitializedEventInfo[dxTreeView[TKey]], Unit]] = js.undefined
  
  /**
    * A function that is executed when a collection item is clicked or tapped.
    */
  var onItemClick: js.UndefOr[js.Function1[/* e */ ItemClickEvent[TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a tree view item is collapsed.
    */
  var onItemCollapsed: js.UndefOr[js.Function1[/* e */ ItemCollapsedEvent[TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a collection item is right-clicked or pressed.
    */
  var onItemContextMenu: js.UndefOr[js.Function1[/* e */ ItemContextMenuEvent[TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a tree view item is expanded.
    */
  var onItemExpanded: js.UndefOr[js.Function1[/* e */ ItemExpandedEvent[TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a collection item has been held for a specified period.
    */
  var onItemHold: js.UndefOr[js.Function1[/* e */ ItemHoldEvent[TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after a collection item is rendered.
    */
  var onItemRendered: js.UndefOr[js.Function1[/* e */ ItemRenderedEvent[TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a single TreeView item is selected or selection is canceled.
    */
  var onItemSelectionChanged: js.UndefOr[js.Function1[/* e */ ItemSelectionChangedEvent[TKey], Unit]] = js.undefined
  
  var onOptionChanged: js.UndefOr[js.Function1[/* e */ OptionChangedEventInfo[dxTreeView[TKey]], Unit]] = js.undefined
  
  /**
    * A function that is executed when the &apos;Select All&apos; check box value is changed. Applies only if showCheckBoxesMode is &apos;selectAll&apos; and selectionMode is &apos;multiple&apos;.
    */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ SelectAllValueChangedEvent[TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a TreeView item is selected or selection is canceled.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectionChangedEvent[TKey], Unit]] = js.undefined
  
  /**
    * Specifies the name of the data source item field for holding the parent key of the corresponding node.
    */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the parent ID value of the root item.
    */
  var rootValue: js.UndefOr[Any] = js.undefined
  
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string value specifying available scrolling directions.
    */
  var scrollDirection: js.UndefOr[ScrollDirection] = js.undefined
  
  /**
    * Configures the search panel.
    */
  var searchEditorOptions: js.UndefOr[Properties] = js.undefined
  
  /**
    * Specifies whether the search panel is visible.
    */
  var searchEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a data object&apos;s field name or an expression whose value is compared to the search string.
    */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  
  /**
    * Specifies a comparison operation used to search UI component items.
    */
  var searchMode: js.UndefOr[SearchMode] = js.undefined
  
  /**
    * Specifies a delay in milliseconds between when a user finishes typing, and the search is executed.
    */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the current search string.
    */
  var searchValue: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text displayed at the &apos;Select All&apos; check box.
    */
  var selectAllText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether an item becomes selected if a user clicks it.
    */
  var selectByClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether all child nodes should be selected when their parent node is selected. Applies only if the selectionMode is &apos;multiple&apos;.
    */
  var selectNodesRecursive: js.UndefOr[Boolean] = js.undefined
  
  var selectedExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var selectedIndex: js.UndefOr[Double] = js.undefined
  
  var selectedItem: js.UndefOr[dxTreeViewItem] = js.undefined
  
  var selectedItemKeys: js.UndefOr[js.Array[TKey]] = js.undefined
  
  var selectedItems: js.UndefOr[js.Array[dxTreeViewItem]] = js.undefined
  
  /**
    * Specifies item selection mode. Applies only if selection is enabled.
    */
  var selectionMode: js.UndefOr[SingleOrMultiple] = js.undefined
  
  /**
    * Specifies the checkbox display mode.
    */
  var showCheckBoxesMode: js.UndefOr[TreeViewCheckBoxMode] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether or not the UI component uses native scrolling.
    */
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables the virtual mode in which nodes are loaded on demand. Use it to enhance the performance on large datasets.
    */
  var virtualModeEnabled: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
}
object dxTreeViewOptions {
  
  inline def apply[TKey](): dxTreeViewOptions[TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeViewOptions[TKey]]
  }
  
  extension [Self <: dxTreeViewOptions[?], TKey](x: Self & dxTreeViewOptions[TKey]) {
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setActiveStateEnabled(value: Boolean): Self = StObject.set(x, "activeStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setActiveStateEnabledUndefined: Self = StObject.set(x, "activeStateEnabled", js.undefined)
    
    inline def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
    
    inline def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
    
    inline def setBindingOptions(value: StringDictionary[Any]): Self = StObject.set(x, "bindingOptions", value.asInstanceOf[js.Any])
    
    inline def setBindingOptionsUndefined: Self = StObject.set(x, "bindingOptions", js.undefined)
    
    inline def setCreateChildren(value: /* parentNode */ Node[TKey] => js.Thenable[Any] | js.Array[Any]): Self = StObject.set(x, "createChildren", js.Any.fromFunction1(value))
    
    inline def setCreateChildrenUndefined: Self = StObject.set(x, "createChildren", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Item, TKey]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Item*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDataStructure(value: DataStructure): Self = StObject.set(x, "dataStructure", value.asInstanceOf[js.Any])
    
    inline def setDataStructureUndefined: Self = StObject.set(x, "dataStructure", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledExpr(value: String | js.Function): Self = StObject.set(x, "disabledExpr", value.asInstanceOf[js.Any])
    
    inline def setDisabledExprUndefined: Self = StObject.set(x, "disabledExpr", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayExpr(value: String | (js.Function1[/* item */ dxTreeViewItem, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* item */ dxTreeViewItem => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setElementAttr(value: StringDictionary[Any]): Self = StObject.set(x, "elementAttr", value.asInstanceOf[js.Any])
    
    inline def setElementAttrUndefined: Self = StObject.set(x, "elementAttr", js.undefined)
    
    inline def setExpandAllEnabled(value: Boolean): Self = StObject.set(x, "expandAllEnabled", value.asInstanceOf[js.Any])
    
    inline def setExpandAllEnabledUndefined: Self = StObject.set(x, "expandAllEnabled", js.undefined)
    
    inline def setExpandEvent(value: TreeViewExpandEvent): Self = StObject.set(x, "expandEvent", value.asInstanceOf[js.Any])
    
    inline def setExpandEventUndefined: Self = StObject.set(x, "expandEvent", js.undefined)
    
    inline def setExpandNodesRecursive(value: Boolean): Self = StObject.set(x, "expandNodesRecursive", value.asInstanceOf[js.Any])
    
    inline def setExpandNodesRecursiveUndefined: Self = StObject.set(x, "expandNodesRecursive", js.undefined)
    
    inline def setExpandedExpr(value: String | js.Function): Self = StObject.set(x, "expandedExpr", value.asInstanceOf[js.Any])
    
    inline def setExpandedExprUndefined: Self = StObject.set(x, "expandedExpr", js.undefined)
    
    inline def setFocusStateEnabled(value: Boolean): Self = StObject.set(x, "focusStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setFocusStateEnabledUndefined: Self = StObject.set(x, "focusStateEnabled", js.undefined)
    
    inline def setHasItemsExpr(value: String | js.Function): Self = StObject.set(x, "hasItemsExpr", value.asInstanceOf[js.Any])
    
    inline def setHasItemsExprUndefined: Self = StObject.set(x, "hasItemsExpr", js.undefined)
    
    inline def setHeight(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightFunction0(value: () => Double | String): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setHoverStateEnabled(value: Boolean): Self = StObject.set(x, "hoverStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverStateEnabledUndefined: Self = StObject.set(x, "hoverStateEnabled", js.undefined)
    
    inline def setItemHoldTimeout(value: Double): Self = StObject.set(x, "itemHoldTimeout", value.asInstanceOf[js.Any])
    
    inline def setItemHoldTimeoutUndefined: Self = StObject.set(x, "itemHoldTimeout", js.undefined)
    
    inline def setItemTemplate(
      value: template | (js.Function3[
          /* itemData */ dxTreeViewItem, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
    
    inline def setItemTemplateFunction3(
      value: (/* itemData */ dxTreeViewItem, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction3(value))
    
    inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsExpr(value: String | js.Function): Self = StObject.set(x, "itemsExpr", value.asInstanceOf[js.Any])
    
    inline def setItemsExprUndefined: Self = StObject.set(x, "itemsExpr", js.undefined)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setNoDataText(value: String): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
    
    inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
    
    inline def setOnContentReady(value: /* e */ EventInfo[dxTreeView[TKey]] => Unit): Self = StObject.set(x, "onContentReady", js.Any.fromFunction1(value))
    
    inline def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
    
    inline def setOnDisposing(value: /* e */ EventInfo[dxTreeView[TKey]] => Unit): Self = StObject.set(x, "onDisposing", js.Any.fromFunction1(value))
    
    inline def setOnDisposingUndefined: Self = StObject.set(x, "onDisposing", js.undefined)
    
    inline def setOnInitialized(value: /* e */ InitializedEventInfo[dxTreeView[TKey]] => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
    
    inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    inline def setOnItemClick(value: /* e */ ItemClickEvent[TKey] => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnItemCollapsed(value: /* e */ ItemCollapsedEvent[TKey] => Unit): Self = StObject.set(x, "onItemCollapsed", js.Any.fromFunction1(value))
    
    inline def setOnItemCollapsedUndefined: Self = StObject.set(x, "onItemCollapsed", js.undefined)
    
    inline def setOnItemContextMenu(value: /* e */ ItemContextMenuEvent[TKey] => Unit): Self = StObject.set(x, "onItemContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnItemContextMenuUndefined: Self = StObject.set(x, "onItemContextMenu", js.undefined)
    
    inline def setOnItemExpanded(value: /* e */ ItemExpandedEvent[TKey] => Unit): Self = StObject.set(x, "onItemExpanded", js.Any.fromFunction1(value))
    
    inline def setOnItemExpandedUndefined: Self = StObject.set(x, "onItemExpanded", js.undefined)
    
    inline def setOnItemHold(value: /* e */ ItemHoldEvent[TKey] => Unit): Self = StObject.set(x, "onItemHold", js.Any.fromFunction1(value))
    
    inline def setOnItemHoldUndefined: Self = StObject.set(x, "onItemHold", js.undefined)
    
    inline def setOnItemRendered(value: /* e */ ItemRenderedEvent[TKey] => Unit): Self = StObject.set(x, "onItemRendered", js.Any.fromFunction1(value))
    
    inline def setOnItemRenderedUndefined: Self = StObject.set(x, "onItemRendered", js.undefined)
    
    inline def setOnItemSelectionChanged(value: /* e */ ItemSelectionChangedEvent[TKey] => Unit): Self = StObject.set(x, "onItemSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnItemSelectionChangedUndefined: Self = StObject.set(x, "onItemSelectionChanged", js.undefined)
    
    inline def setOnOptionChanged(value: /* e */ OptionChangedEventInfo[dxTreeView[TKey]] => Unit): Self = StObject.set(x, "onOptionChanged", js.Any.fromFunction1(value))
    
    inline def setOnOptionChangedUndefined: Self = StObject.set(x, "onOptionChanged", js.undefined)
    
    inline def setOnSelectAllValueChanged(value: /* e */ SelectAllValueChangedEvent[TKey] => Unit): Self = StObject.set(x, "onSelectAllValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectAllValueChangedUndefined: Self = StObject.set(x, "onSelectAllValueChanged", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ SelectionChangedEvent[TKey] => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setParentIdExpr(value: String | js.Function): Self = StObject.set(x, "parentIdExpr", value.asInstanceOf[js.Any])
    
    inline def setParentIdExprUndefined: Self = StObject.set(x, "parentIdExpr", js.undefined)
    
    inline def setRootValue(value: Any): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
    
    inline def setRootValueUndefined: Self = StObject.set(x, "rootValue", js.undefined)
    
    inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
    
    inline def setRtlEnabledUndefined: Self = StObject.set(x, "rtlEnabled", js.undefined)
    
    inline def setScrollDirection(value: ScrollDirection): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
    
    inline def setScrollDirectionUndefined: Self = StObject.set(x, "scrollDirection", js.undefined)
    
    inline def setSearchEditorOptions(value: Properties): Self = StObject.set(x, "searchEditorOptions", value.asInstanceOf[js.Any])
    
    inline def setSearchEditorOptionsUndefined: Self = StObject.set(x, "searchEditorOptions", js.undefined)
    
    inline def setSearchEnabled(value: Boolean): Self = StObject.set(x, "searchEnabled", value.asInstanceOf[js.Any])
    
    inline def setSearchEnabledUndefined: Self = StObject.set(x, "searchEnabled", js.undefined)
    
    inline def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = StObject.set(x, "searchExpr", value.asInstanceOf[js.Any])
    
    inline def setSearchExprUndefined: Self = StObject.set(x, "searchExpr", js.undefined)
    
    inline def setSearchExprVarargs(value: (String | js.Function)*): Self = StObject.set(x, "searchExpr", js.Array(value*))
    
    inline def setSearchMode(value: SearchMode): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    inline def setSearchModeUndefined: Self = StObject.set(x, "searchMode", js.undefined)
    
    inline def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    inline def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    inline def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
    
    inline def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
    
    inline def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    inline def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
    
    inline def setSelectByClick(value: Boolean): Self = StObject.set(x, "selectByClick", value.asInstanceOf[js.Any])
    
    inline def setSelectByClickUndefined: Self = StObject.set(x, "selectByClick", js.undefined)
    
    inline def setSelectNodesRecursive(value: Boolean): Self = StObject.set(x, "selectNodesRecursive", value.asInstanceOf[js.Any])
    
    inline def setSelectNodesRecursiveUndefined: Self = StObject.set(x, "selectNodesRecursive", js.undefined)
    
    inline def setSelectedExpr(value: String | js.Function): Self = StObject.set(x, "selectedExpr", value.asInstanceOf[js.Any])
    
    inline def setSelectedExprUndefined: Self = StObject.set(x, "selectedExpr", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setSelectedItem(value: dxTreeViewItem): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKeys(value: js.Array[TKey]): Self = StObject.set(x, "selectedItemKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKeysUndefined: Self = StObject.set(x, "selectedItemKeys", js.undefined)
    
    inline def setSelectedItemKeysVarargs(value: TKey*): Self = StObject.set(x, "selectedItemKeys", js.Array(value*))
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setSelectedItems(value: js.Array[dxTreeViewItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: dxTreeViewItem*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setSelectionMode(value: SingleOrMultiple): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setShowCheckBoxesMode(value: TreeViewCheckBoxMode): Self = StObject.set(x, "showCheckBoxesMode", value.asInstanceOf[js.Any])
    
    inline def setShowCheckBoxesModeUndefined: Self = StObject.set(x, "showCheckBoxesMode", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setUseNativeScrolling(value: Boolean): Self = StObject.set(x, "useNativeScrolling", value.asInstanceOf[js.Any])
    
    inline def setUseNativeScrollingUndefined: Self = StObject.set(x, "useNativeScrolling", js.undefined)
    
    inline def setVirtualModeEnabled(value: Boolean): Self = StObject.set(x, "virtualModeEnabled", value.asInstanceOf[js.Any])
    
    inline def setVirtualModeEnabledUndefined: Self = StObject.set(x, "virtualModeEnabled", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthFunction0(value: () => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
