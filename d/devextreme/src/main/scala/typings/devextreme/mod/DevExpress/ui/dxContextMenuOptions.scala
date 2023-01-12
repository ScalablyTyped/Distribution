package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StringDictionary
import typings.devextreme.anon.Delay
import typings.devextreme.anon.DelayName
import typings.devextreme.anon.Hide
import typings.devextreme.mod.DevExpress.DOMComponent.OptionChangedEventInfo
import typings.devextreme.mod.DevExpress.PositionConfig
import typings.devextreme.mod.DevExpress.common.SingleOrNone
import typings.devextreme.mod.DevExpress.common.SubmenuShowMode
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.events.DxEvent
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.ItemInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.CollectionWidget.SelectionChangedInfo
import typings.devextreme.mod.DevExpress.ui.dxContextMenu.ContextSubmenuDirection
import typings.devextreme.mod.DevExpress.ui.dxContextMenu.HiddenEvent
import typings.devextreme.mod.DevExpress.ui.dxContextMenu.HidingEvent
import typings.devextreme.mod.DevExpress.ui.dxContextMenu.Item
import typings.devextreme.mod.DevExpress.ui.dxContextMenu.PositioningEvent
import typings.devextreme.mod.DevExpress.ui.dxContextMenu.ShowingEvent
import typings.devextreme.mod.DevExpress.ui.dxContextMenu.ShownEvent
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent devextreme.devextreme.DevExpress.ui.dxMenuBaseOptions<devextreme.devextreme.DevExpress.ui.dxContextMenu<TKey>, devextreme.devextreme.DevExpress.ui.dxContextMenuItem, TKey> */
trait dxContextMenuOptions[TKey] extends StObject {
  
  var accessKey: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value specifying whether or not the UI component changes its state when interacting with a user.
    */
  var activeStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures UI component visibility animations. This object contains two fields: show and hide.
    */
  var animation: js.UndefOr[Hide] = js.undefined
  
  var bindingOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Specifies whether to close the UI component if a user clicks outside it.
    * @deprecated 
    */
  var closeOnOutsideClick: js.UndefOr[
    Boolean | (js.Function1[/* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent], Boolean])
  ] = js.undefined
  
  /**
    * Specifies the name of the CSS class to be applied to the root menu level and all submenus.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[(DataSourceLike[Item, TKey]) | Null] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var disabledExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ dxContextMenuItem, String])] = js.undefined
  
  var elementAttr: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var focusStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  /**
    * 
    */
  var hideOnOutsideClick: js.UndefOr[
    Boolean | (js.Function1[/* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent], Boolean])
  ] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var hoverStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  var itemHoldTimeout: js.UndefOr[Double] = js.undefined
  
  var itemTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ dxContextMenuItem, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Holds an array of menu items.
    */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var itemsExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var noDataText: js.UndefOr[String] = js.undefined
  
  var onContentReady: js.UndefOr[js.Function1[/* e */ EventInfo[dxContextMenu[TKey]], Unit]] = js.undefined
  
  var onDisposing: js.UndefOr[js.Function1[/* e */ EventInfo[dxContextMenu[TKey]], Unit]] = js.undefined
  
  /**
    * A function that is executed after the ContextMenu is hidden.
    */
  var onHidden: js.UndefOr[js.Function1[/* e */ HiddenEvent[TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed before the ContextMenu is hidden.
    */
  var onHiding: js.UndefOr[js.Function1[/* e */ HidingEvent[TKey], Unit]] = js.undefined
  
  var onInitialized: js.UndefOr[js.Function1[/* e */ InitializedEventInfo[dxContextMenu[TKey]], Unit]] = js.undefined
  
  var onItemClick: js.UndefOr[
    (js.Function1[
      /* e */ (NativeEventInfo[dxContextMenu[TKey], MouseEvent | PointerEvent]) & ItemInfo[dxContextMenuItem], 
      Unit
    ]) | String
  ] = js.undefined
  
  var onItemContextMenu: js.UndefOr[
    js.Function1[
      /* e */ (NativeEventInfo[dxContextMenu[TKey], MouseEvent | PointerEvent | TouchEvent]) & ItemInfo[dxContextMenuItem], 
      Unit
    ]
  ] = js.undefined
  
  var onItemHold: js.UndefOr[
    js.Function1[
      /* e */ (NativeEventInfo[dxContextMenu[TKey], MouseEvent | PointerEvent | TouchEvent]) & ItemInfo[dxContextMenuItem], 
      Unit
    ]
  ] = js.undefined
  
  var onItemRendered: js.UndefOr[
    js.Function1[/* e */ EventInfo[dxContextMenu[TKey]] & ItemInfo[dxContextMenuItem], Unit]
  ] = js.undefined
  
  var onOptionChanged: js.UndefOr[js.Function1[/* e */ OptionChangedEventInfo[dxContextMenu[TKey]], Unit]] = js.undefined
  
  /**
    * A function that is executed before the ContextMenu is positioned.
    */
  var onPositioning: js.UndefOr[js.Function1[/* e */ PositioningEvent[TKey], Unit]] = js.undefined
  
  var onSelectionChanged: js.UndefOr[
    js.Function1[
      /* e */ EventInfo[dxContextMenu[TKey]] & SelectionChangedInfo[dxContextMenuItem], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * A function that is executed before the ContextMenu is shown.
    */
  var onShowing: js.UndefOr[js.Function1[/* e */ ShowingEvent[TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after the ContextMenu is shown.
    */
  var onShown: js.UndefOr[js.Function1[/* e */ ShownEvent[TKey], Unit]] = js.undefined
  
  /**
    * An object defining UI component positioning properties.
    */
  var position: js.UndefOr[PositionConfig] = js.undefined
  
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not an item becomes selected if a user clicks it.
    */
  var selectByClick: js.UndefOr[Boolean] = js.undefined
  
  var selectedExpr: js.UndefOr[String | js.Function] = js.undefined
  
  var selectedIndex: js.UndefOr[Double] = js.undefined
  
  var selectedItem: js.UndefOr[dxContextMenuItem] = js.undefined
  
  var selectedItemKeys: js.UndefOr[js.Array[TKey]] = js.undefined
  
  var selectedItems: js.UndefOr[js.Array[dxContextMenuItem]] = js.undefined
  
  /**
    * Specifies the selection mode supported by the menu.
    */
  var selectionMode: js.UndefOr[SingleOrNone] = js.undefined
  
  /**
    * Specifies properties for displaying the UI component.
    */
  var showEvent: js.UndefOr[Delay | String] = js.undefined
  
  /**
    * Specifies properties of submenu showing and hiding.
    */
  var showSubmenuMode: js.UndefOr[DelayName | SubmenuShowMode] = js.undefined
  
  /**
    * Specifies the direction at which submenus are displayed.
    */
  var submenuDirection: js.UndefOr[ContextSubmenuDirection] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The target element associated with the context menu.
    */
  var target: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * A Boolean value specifying whether or not the UI component is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
}
object dxContextMenuOptions {
  
  inline def apply[TKey](): dxContextMenuOptions[TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxContextMenuOptions[TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxContextMenuOptions[?], TKey] (val x: Self & dxContextMenuOptions[TKey]) extends AnyVal {
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setActiveStateEnabled(value: Boolean): Self = StObject.set(x, "activeStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setActiveStateEnabledUndefined: Self = StObject.set(x, "activeStateEnabled", js.undefined)
    
    inline def setAnimation(value: Hide): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setBindingOptions(value: StringDictionary[Any]): Self = StObject.set(x, "bindingOptions", value.asInstanceOf[js.Any])
    
    inline def setBindingOptionsUndefined: Self = StObject.set(x, "bindingOptions", js.undefined)
    
    inline def setCloseOnOutsideClick(
      value: Boolean | (js.Function1[/* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent], Boolean])
    ): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnOutsideClickFunction1(value: /* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent] => Boolean): Self = StObject.set(x, "closeOnOutsideClick", js.Any.fromFunction1(value))
    
    inline def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Item, TKey]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Item*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledExpr(value: String | js.Function): Self = StObject.set(x, "disabledExpr", value.asInstanceOf[js.Any])
    
    inline def setDisabledExprUndefined: Self = StObject.set(x, "disabledExpr", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayExpr(value: String | (js.Function1[/* item */ dxContextMenuItem, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* item */ dxContextMenuItem => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setElementAttr(value: StringDictionary[Any]): Self = StObject.set(x, "elementAttr", value.asInstanceOf[js.Any])
    
    inline def setElementAttrUndefined: Self = StObject.set(x, "elementAttr", js.undefined)
    
    inline def setFocusStateEnabled(value: Boolean): Self = StObject.set(x, "focusStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setFocusStateEnabledUndefined: Self = StObject.set(x, "focusStateEnabled", js.undefined)
    
    inline def setHeight(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightFunction0(value: () => Double | String): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHideOnOutsideClick(
      value: Boolean | (js.Function1[/* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent], Boolean])
    ): Self = StObject.set(x, "hideOnOutsideClick", value.asInstanceOf[js.Any])
    
    inline def setHideOnOutsideClickFunction1(value: /* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent] => Boolean): Self = StObject.set(x, "hideOnOutsideClick", js.Any.fromFunction1(value))
    
    inline def setHideOnOutsideClickUndefined: Self = StObject.set(x, "hideOnOutsideClick", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setHoverStateEnabled(value: Boolean): Self = StObject.set(x, "hoverStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverStateEnabledUndefined: Self = StObject.set(x, "hoverStateEnabled", js.undefined)
    
    inline def setItemHoldTimeout(value: Double): Self = StObject.set(x, "itemHoldTimeout", value.asInstanceOf[js.Any])
    
    inline def setItemHoldTimeoutUndefined: Self = StObject.set(x, "itemHoldTimeout", js.undefined)
    
    inline def setItemTemplate(
      value: template | (js.Function3[
          /* itemData */ dxContextMenuItem, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
    
    inline def setItemTemplateFunction3(
      value: (/* itemData */ dxContextMenuItem, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
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
    
    inline def setOnContentReady(value: /* e */ EventInfo[dxContextMenu[TKey]] => Unit): Self = StObject.set(x, "onContentReady", js.Any.fromFunction1(value))
    
    inline def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
    
    inline def setOnDisposing(value: /* e */ EventInfo[dxContextMenu[TKey]] => Unit): Self = StObject.set(x, "onDisposing", js.Any.fromFunction1(value))
    
    inline def setOnDisposingUndefined: Self = StObject.set(x, "onDisposing", js.undefined)
    
    inline def setOnHidden(value: /* e */ HiddenEvent[TKey] => Unit): Self = StObject.set(x, "onHidden", js.Any.fromFunction1(value))
    
    inline def setOnHiddenUndefined: Self = StObject.set(x, "onHidden", js.undefined)
    
    inline def setOnHiding(value: /* e */ HidingEvent[TKey] => Unit): Self = StObject.set(x, "onHiding", js.Any.fromFunction1(value))
    
    inline def setOnHidingUndefined: Self = StObject.set(x, "onHiding", js.undefined)
    
    inline def setOnInitialized(value: /* e */ InitializedEventInfo[dxContextMenu[TKey]] => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
    
    inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    inline def setOnItemClick(
      value: (js.Function1[
          /* e */ (NativeEventInfo[dxContextMenu[TKey], MouseEvent | PointerEvent]) & ItemInfo[dxContextMenuItem], 
          Unit
        ]) | String
    ): Self = StObject.set(x, "onItemClick", value.asInstanceOf[js.Any])
    
    inline def setOnItemClickFunction1(
      value: /* e */ (NativeEventInfo[dxContextMenu[TKey], MouseEvent | PointerEvent]) & ItemInfo[dxContextMenuItem] => Unit
    ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnItemContextMenu(
      value: /* e */ (NativeEventInfo[dxContextMenu[TKey], MouseEvent | PointerEvent | TouchEvent]) & ItemInfo[dxContextMenuItem] => Unit
    ): Self = StObject.set(x, "onItemContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnItemContextMenuUndefined: Self = StObject.set(x, "onItemContextMenu", js.undefined)
    
    inline def setOnItemHold(
      value: /* e */ (NativeEventInfo[dxContextMenu[TKey], MouseEvent | PointerEvent | TouchEvent]) & ItemInfo[dxContextMenuItem] => Unit
    ): Self = StObject.set(x, "onItemHold", js.Any.fromFunction1(value))
    
    inline def setOnItemHoldUndefined: Self = StObject.set(x, "onItemHold", js.undefined)
    
    inline def setOnItemRendered(value: /* e */ EventInfo[dxContextMenu[TKey]] & ItemInfo[dxContextMenuItem] => Unit): Self = StObject.set(x, "onItemRendered", js.Any.fromFunction1(value))
    
    inline def setOnItemRenderedUndefined: Self = StObject.set(x, "onItemRendered", js.undefined)
    
    inline def setOnOptionChanged(value: /* e */ OptionChangedEventInfo[dxContextMenu[TKey]] => Unit): Self = StObject.set(x, "onOptionChanged", js.Any.fromFunction1(value))
    
    inline def setOnOptionChangedUndefined: Self = StObject.set(x, "onOptionChanged", js.undefined)
    
    inline def setOnPositioning(value: /* e */ PositioningEvent[TKey] => Unit): Self = StObject.set(x, "onPositioning", js.Any.fromFunction1(value))
    
    inline def setOnPositioningUndefined: Self = StObject.set(x, "onPositioning", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ EventInfo[dxContextMenu[TKey]] & SelectionChangedInfo[dxContextMenuItem] => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setOnShowing(value: /* e */ ShowingEvent[TKey] => Unit): Self = StObject.set(x, "onShowing", js.Any.fromFunction1(value))
    
    inline def setOnShowingUndefined: Self = StObject.set(x, "onShowing", js.undefined)
    
    inline def setOnShown(value: /* e */ ShownEvent[TKey] => Unit): Self = StObject.set(x, "onShown", js.Any.fromFunction1(value))
    
    inline def setOnShownUndefined: Self = StObject.set(x, "onShown", js.undefined)
    
    inline def setPosition(value: PositionConfig): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
    
    inline def setRtlEnabledUndefined: Self = StObject.set(x, "rtlEnabled", js.undefined)
    
    inline def setSelectByClick(value: Boolean): Self = StObject.set(x, "selectByClick", value.asInstanceOf[js.Any])
    
    inline def setSelectByClickUndefined: Self = StObject.set(x, "selectByClick", js.undefined)
    
    inline def setSelectedExpr(value: String | js.Function): Self = StObject.set(x, "selectedExpr", value.asInstanceOf[js.Any])
    
    inline def setSelectedExprUndefined: Self = StObject.set(x, "selectedExpr", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setSelectedItem(value: dxContextMenuItem): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKeys(value: js.Array[TKey]): Self = StObject.set(x, "selectedItemKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKeysUndefined: Self = StObject.set(x, "selectedItemKeys", js.undefined)
    
    inline def setSelectedItemKeysVarargs(value: TKey*): Self = StObject.set(x, "selectedItemKeys", js.Array(value*))
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setSelectedItems(value: js.Array[dxContextMenuItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: dxContextMenuItem*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setSelectionMode(value: SingleOrNone): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setShowEvent(value: Delay | String): Self = StObject.set(x, "showEvent", value.asInstanceOf[js.Any])
    
    inline def setShowEventUndefined: Self = StObject.set(x, "showEvent", js.undefined)
    
    inline def setShowSubmenuMode(value: DelayName | SubmenuShowMode): Self = StObject.set(x, "showSubmenuMode", value.asInstanceOf[js.Any])
    
    inline def setShowSubmenuModeUndefined: Self = StObject.set(x, "showSubmenuMode", js.undefined)
    
    inline def setSubmenuDirection(value: ContextSubmenuDirection): Self = StObject.set(x, "submenuDirection", value.asInstanceOf[js.Any])
    
    inline def setSubmenuDirectionUndefined: Self = StObject.set(x, "submenuDirection", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTarget(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthFunction0(value: () => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
