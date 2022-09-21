package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Action
import typings.devextreme.mod.DevExpress.common.PageLoadMode
import typings.devextreme.mod.DevExpress.common.ScrollbarMode
import typings.devextreme.mod.DevExpress.common.SelectAllMode
import typings.devextreme.mod.DevExpress.common.SingleMultipleAllOrNone
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxList.GroupRenderedEvent
import typings.devextreme.mod.DevExpress.ui.dxList.ItemClickEvent
import typings.devextreme.mod.DevExpress.ui.dxList.ItemContextMenuEvent
import typings.devextreme.mod.DevExpress.ui.dxList.ItemDeleteMode
import typings.devextreme.mod.DevExpress.ui.dxList.ItemDeletedEvent
import typings.devextreme.mod.DevExpress.ui.dxList.ItemDeletingEvent
import typings.devextreme.mod.DevExpress.ui.dxList.ItemHoldEvent
import typings.devextreme.mod.DevExpress.ui.dxList.ItemLike
import typings.devextreme.mod.DevExpress.ui.dxList.ItemReorderedEvent
import typings.devextreme.mod.DevExpress.ui.dxList.ItemSwipeEvent
import typings.devextreme.mod.DevExpress.ui.dxList.ListMenuMode
import typings.devextreme.mod.DevExpress.ui.dxList.PageLoadingEvent
import typings.devextreme.mod.DevExpress.ui.dxList.PullRefreshEvent
import typings.devextreme.mod.DevExpress.ui.dxList.ScrollEvent
import typings.devextreme.mod.DevExpress.ui.dxList.SelectAllValueChangedEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxListOptions[TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidgetOptions[dxList[TItem, TKey], TItem, TKey]
     with SearchBoxMixinOptions {
  
  /**
    * Specifies whether or not an end user can delete list items.
    */
  var allowItemDeleting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether to enable or disable the bounce-back effect.
    */
  var bounceEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not an end-user can collapse groups.
    */
  var collapsibleGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the data field whose values should be displayed. Defaults to &apos;text&apos; when the data source contains objects.
    */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ TItem, String])] = js.undefined
  
  /**
    * Specifies a custom template for group captions.
    */
  var groupTemplate: js.UndefOr[
    template | (js.Function3[
      /* groupData */ Any, 
      /* groupIndex */ Double, 
      /* groupElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies whether data items should be grouped.
    */
  var grouped: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not to show the loading panel when the DataSource bound to the UI component is loading data.
    */
  var indicateLoading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the way a user can delete items from the list.
    */
  var itemDeleteMode: js.UndefOr[ItemDeleteMode] = js.undefined
  
  /**
    * Configures item reordering using drag and drop gestures.
    */
  var itemDragging: js.UndefOr[dxSortableOptions] = js.undefined
  
  /**
    * Specifies the array of items for a context menu called for a list item.
    */
  var menuItems: js.UndefOr[js.Array[Action[TItem]]] = js.undefined
  
  /**
    * Specifies whether an item context menu is shown when a user holds or swipes an item.
    */
  var menuMode: js.UndefOr[ListMenuMode] = js.undefined
  
  /**
    * The text displayed on the button used to load the next page from the data source.
    */
  var nextButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed when a group element is rendered.
    */
  var onGroupRendered: js.UndefOr[js.Function1[/* e */ GroupRenderedEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a collection item is clicked or tapped.
    */
  @JSName("onItemClick")
  var onItemClick_dxListOptions: js.UndefOr[(js.Function1[/* e */ ItemClickEvent[TItem, TKey], Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a collection item is right-clicked or pressed.
    */
  @JSName("onItemContextMenu")
  var onItemContextMenu_dxListOptions: js.UndefOr[js.Function1[/* e */ ItemContextMenuEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after a list item is deleted from the data source.
    */
  var onItemDeleted: js.UndefOr[js.Function1[/* e */ ItemDeletedEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed before a collection item is deleted from the data source.
    */
  var onItemDeleting: js.UndefOr[js.Function1[/* e */ ItemDeletingEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a collection item has been held for a specified period.
    */
  @JSName("onItemHold")
  var onItemHold_dxListOptions: js.UndefOr[js.Function1[/* e */ ItemHoldEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after a list item is moved to another position.
    */
  var onItemReordered: js.UndefOr[js.Function1[/* e */ ItemReorderedEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a list item is swiped.
    */
  var onItemSwipe: js.UndefOr[js.Function1[/* e */ ItemSwipeEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed before the next page is loaded.
    */
  var onPageLoading: js.UndefOr[js.Function1[/* e */ PageLoadingEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when the &apos;pull to refresh&apos; gesture is performed. Supported on mobile devices only.
    */
  var onPullRefresh: js.UndefOr[js.Function1[/* e */ PullRefreshEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed on each scroll gesture.
    */
  var onScroll: js.UndefOr[js.Function1[/* e */ ScrollEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when the &apos;Select All&apos; check box value is changed. Applies only if the selectionMode is &apos;all&apos;.
    */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ SelectAllValueChangedEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * Specifies whether the next page is loaded when a user scrolls the UI component to the bottom or when the &apos;next&apos; button is clicked.
    */
  var pageLoadMode: js.UndefOr[PageLoadMode] = js.undefined
  
  /**
    * Specifies the text shown in the pullDown panel, which is displayed when the list is scrolled to the bottom.
    */
  var pageLoadingText: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value specifying whether or not the UI component supports the &apos;pull down to refresh&apos; gesture.
    */
  var pullRefreshEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the text displayed in the pullDown panel when the list is pulled below the refresh threshold.
    */
  var pulledDownText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text shown in the pullDown panel while the list is being pulled down to the refresh threshold.
    */
  var pullingDownText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text displayed in the pullDown panel while the list is being refreshed.
    */
  var refreshingText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to repaint only those elements whose data changed.
    */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying if the list is scrolled by content.
    */
  var scrollByContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can scroll the content with the scrollbar. Applies only if useNativeScrolling is false.
    */
  var scrollByThumb: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether to enable or disable list scrolling.
    */
  var scrollingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the mode in which all items are selected.
    */
  var selectAllMode: js.UndefOr[SelectAllMode] = js.undefined
  
  /**
    * Specifies the text displayed at the &apos;Select All&apos; check box.
    */
  var selectAllText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies item selection mode.
    */
  var selectionMode: js.UndefOr[SingleMultipleAllOrNone] = js.undefined
  
  /**
    * Specifies when the UI component shows the scrollbar.
    */
  var showScrollbar: js.UndefOr[ScrollbarMode] = js.undefined
  
  /**
    * Specifies whether or not to display controls used to select list items.
    */
  var showSelectionControls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the UI component uses native scrolling.
    */
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
}
object dxListOptions {
  
  inline def apply[TItem /* <: ItemLike */, TKey](): dxListOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxListOptions[TItem, TKey]]
  }
  
  extension [Self <: dxListOptions[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (dxListOptions[TItem, TKey])) {
    
    inline def setAllowItemDeleting(value: Boolean): Self = StObject.set(x, "allowItemDeleting", value.asInstanceOf[js.Any])
    
    inline def setAllowItemDeletingUndefined: Self = StObject.set(x, "allowItemDeleting", js.undefined)
    
    inline def setBounceEnabled(value: Boolean): Self = StObject.set(x, "bounceEnabled", value.asInstanceOf[js.Any])
    
    inline def setBounceEnabledUndefined: Self = StObject.set(x, "bounceEnabled", js.undefined)
    
    inline def setCollapsibleGroups(value: Boolean): Self = StObject.set(x, "collapsibleGroups", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleGroupsUndefined: Self = StObject.set(x, "collapsibleGroups", js.undefined)
    
    inline def setDisplayExpr(value: String | (js.Function1[/* item */ TItem, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* item */ TItem => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setGroupTemplate(
      value: template | (js.Function3[
          /* groupData */ Any, 
          /* groupIndex */ Double, 
          /* groupElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "groupTemplate", value.asInstanceOf[js.Any])
    
    inline def setGroupTemplateFunction3(
      value: (/* groupData */ Any, /* groupIndex */ Double, /* groupElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "groupTemplate", js.Any.fromFunction3(value))
    
    inline def setGroupTemplateUndefined: Self = StObject.set(x, "groupTemplate", js.undefined)
    
    inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
    
    inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
    
    inline def setIndicateLoading(value: Boolean): Self = StObject.set(x, "indicateLoading", value.asInstanceOf[js.Any])
    
    inline def setIndicateLoadingUndefined: Self = StObject.set(x, "indicateLoading", js.undefined)
    
    inline def setItemDeleteMode(value: ItemDeleteMode): Self = StObject.set(x, "itemDeleteMode", value.asInstanceOf[js.Any])
    
    inline def setItemDeleteModeUndefined: Self = StObject.set(x, "itemDeleteMode", js.undefined)
    
    inline def setItemDragging(value: dxSortableOptions): Self = StObject.set(x, "itemDragging", value.asInstanceOf[js.Any])
    
    inline def setItemDraggingUndefined: Self = StObject.set(x, "itemDragging", js.undefined)
    
    inline def setMenuItems(value: js.Array[Action[TItem]]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
    
    inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    
    inline def setMenuItemsVarargs(value: Action[TItem]*): Self = StObject.set(x, "menuItems", js.Array(value*))
    
    inline def setMenuMode(value: ListMenuMode): Self = StObject.set(x, "menuMode", value.asInstanceOf[js.Any])
    
    inline def setMenuModeUndefined: Self = StObject.set(x, "menuMode", js.undefined)
    
    inline def setNextButtonText(value: String): Self = StObject.set(x, "nextButtonText", value.asInstanceOf[js.Any])
    
    inline def setNextButtonTextUndefined: Self = StObject.set(x, "nextButtonText", js.undefined)
    
    inline def setOnGroupRendered(value: /* e */ GroupRenderedEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onGroupRendered", js.Any.fromFunction1(value))
    
    inline def setOnGroupRenderedUndefined: Self = StObject.set(x, "onGroupRendered", js.undefined)
    
    inline def setOnItemClick(value: (js.Function1[/* e */ ItemClickEvent[TItem, TKey], Unit]) | String): Self = StObject.set(x, "onItemClick", value.asInstanceOf[js.Any])
    
    inline def setOnItemClickFunction1(value: /* e */ ItemClickEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnItemContextMenu(value: /* e */ ItemContextMenuEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onItemContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnItemContextMenuUndefined: Self = StObject.set(x, "onItemContextMenu", js.undefined)
    
    inline def setOnItemDeleted(value: /* e */ ItemDeletedEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onItemDeleted", js.Any.fromFunction1(value))
    
    inline def setOnItemDeletedUndefined: Self = StObject.set(x, "onItemDeleted", js.undefined)
    
    inline def setOnItemDeleting(value: /* e */ ItemDeletingEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onItemDeleting", js.Any.fromFunction1(value))
    
    inline def setOnItemDeletingUndefined: Self = StObject.set(x, "onItemDeleting", js.undefined)
    
    inline def setOnItemHold(value: /* e */ ItemHoldEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onItemHold", js.Any.fromFunction1(value))
    
    inline def setOnItemHoldUndefined: Self = StObject.set(x, "onItemHold", js.undefined)
    
    inline def setOnItemReordered(value: /* e */ ItemReorderedEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onItemReordered", js.Any.fromFunction1(value))
    
    inline def setOnItemReorderedUndefined: Self = StObject.set(x, "onItemReordered", js.undefined)
    
    inline def setOnItemSwipe(value: /* e */ ItemSwipeEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onItemSwipe", js.Any.fromFunction1(value))
    
    inline def setOnItemSwipeUndefined: Self = StObject.set(x, "onItemSwipe", js.undefined)
    
    inline def setOnPageLoading(value: /* e */ PageLoadingEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onPageLoading", js.Any.fromFunction1(value))
    
    inline def setOnPageLoadingUndefined: Self = StObject.set(x, "onPageLoading", js.undefined)
    
    inline def setOnPullRefresh(value: /* e */ PullRefreshEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onPullRefresh", js.Any.fromFunction1(value))
    
    inline def setOnPullRefreshUndefined: Self = StObject.set(x, "onPullRefresh", js.undefined)
    
    inline def setOnScroll(value: /* e */ ScrollEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSelectAllValueChanged(value: /* e */ SelectAllValueChangedEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onSelectAllValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectAllValueChangedUndefined: Self = StObject.set(x, "onSelectAllValueChanged", js.undefined)
    
    inline def setPageLoadMode(value: PageLoadMode): Self = StObject.set(x, "pageLoadMode", value.asInstanceOf[js.Any])
    
    inline def setPageLoadModeUndefined: Self = StObject.set(x, "pageLoadMode", js.undefined)
    
    inline def setPageLoadingText(value: String): Self = StObject.set(x, "pageLoadingText", value.asInstanceOf[js.Any])
    
    inline def setPageLoadingTextUndefined: Self = StObject.set(x, "pageLoadingText", js.undefined)
    
    inline def setPullRefreshEnabled(value: Boolean): Self = StObject.set(x, "pullRefreshEnabled", value.asInstanceOf[js.Any])
    
    inline def setPullRefreshEnabledUndefined: Self = StObject.set(x, "pullRefreshEnabled", js.undefined)
    
    inline def setPulledDownText(value: String): Self = StObject.set(x, "pulledDownText", value.asInstanceOf[js.Any])
    
    inline def setPulledDownTextUndefined: Self = StObject.set(x, "pulledDownText", js.undefined)
    
    inline def setPullingDownText(value: String): Self = StObject.set(x, "pullingDownText", value.asInstanceOf[js.Any])
    
    inline def setPullingDownTextUndefined: Self = StObject.set(x, "pullingDownText", js.undefined)
    
    inline def setRefreshingText(value: String): Self = StObject.set(x, "refreshingText", value.asInstanceOf[js.Any])
    
    inline def setRefreshingTextUndefined: Self = StObject.set(x, "refreshingText", js.undefined)
    
    inline def setRepaintChangesOnly(value: Boolean): Self = StObject.set(x, "repaintChangesOnly", value.asInstanceOf[js.Any])
    
    inline def setRepaintChangesOnlyUndefined: Self = StObject.set(x, "repaintChangesOnly", js.undefined)
    
    inline def setScrollByContent(value: Boolean): Self = StObject.set(x, "scrollByContent", value.asInstanceOf[js.Any])
    
    inline def setScrollByContentUndefined: Self = StObject.set(x, "scrollByContent", js.undefined)
    
    inline def setScrollByThumb(value: Boolean): Self = StObject.set(x, "scrollByThumb", value.asInstanceOf[js.Any])
    
    inline def setScrollByThumbUndefined: Self = StObject.set(x, "scrollByThumb", js.undefined)
    
    inline def setScrollingEnabled(value: Boolean): Self = StObject.set(x, "scrollingEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollingEnabledUndefined: Self = StObject.set(x, "scrollingEnabled", js.undefined)
    
    inline def setSelectAllMode(value: SelectAllMode): Self = StObject.set(x, "selectAllMode", value.asInstanceOf[js.Any])
    
    inline def setSelectAllModeUndefined: Self = StObject.set(x, "selectAllMode", js.undefined)
    
    inline def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    inline def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
    
    inline def setSelectionMode(value: SingleMultipleAllOrNone): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setShowScrollbar(value: ScrollbarMode): Self = StObject.set(x, "showScrollbar", value.asInstanceOf[js.Any])
    
    inline def setShowScrollbarUndefined: Self = StObject.set(x, "showScrollbar", js.undefined)
    
    inline def setShowSelectionControls(value: Boolean): Self = StObject.set(x, "showSelectionControls", value.asInstanceOf[js.Any])
    
    inline def setShowSelectionControlsUndefined: Self = StObject.set(x, "showSelectionControls", js.undefined)
    
    inline def setUseNativeScrolling(value: Boolean): Self = StObject.set(x, "useNativeScrolling", value.asInstanceOf[js.Any])
    
    inline def setUseNativeScrollingUndefined: Self = StObject.set(x, "useNativeScrolling", js.undefined)
  }
}
