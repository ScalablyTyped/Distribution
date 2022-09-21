package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.SlideOutMenuPosition
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxSlideOut.ItemLike
import typings.devextreme.mod.DevExpress.ui.dxSlideOut.MenuGroupRenderedEvent
import typings.devextreme.mod.DevExpress.ui.dxSlideOut.MenuItemRenderedEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSlideOutOptions[TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidgetOptions[dxSlideOut[TItem, TKey], TItem, TKey] {
  
  /**
    * Specifies a custom template for the UI component content. Rendered only once - when the UI component is created.
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function1[/* container */ DxElement_[HTMLElement], String | UserDefinedElement[Element]])
  ] = js.undefined
  
  /**
    * Specifies a custom template for group captions.
    */
  var menuGroupTemplate: js.UndefOr[
    template | (js.Function3[
      /* groupData */ Any, 
      /* groupIndex */ Double, 
      /* groupElement */ Any, 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to display a grouped menu.
    */
  var menuGrouped: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a custom template for menu items.
    */
  var menuItemTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ TItem, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the current menu position.
    */
  var menuPosition: js.UndefOr[SlideOutMenuPosition] = js.undefined
  
  /**
    * Specifies whether or not the slide-out menu is displayed.
    */
  var menuVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is executed when a group menu item is rendered.
    */
  var onMenuGroupRendered: js.UndefOr[js.Function1[/* e */ MenuGroupRenderedEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a regular menu item is rendered.
    */
  var onMenuItemRendered: js.UndefOr[js.Function1[/* e */ MenuItemRenderedEvent[TItem, TKey], Unit]] = js.undefined
  
  /**
    * Indicates whether the menu can be shown/hidden by swiping the UI component&apos;s main panel.
    */
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
}
object dxSlideOutOptions {
  
  inline def apply[TItem /* <: ItemLike */, TKey](): dxSlideOutOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSlideOutOptions[TItem, TKey]]
  }
  
  extension [Self <: dxSlideOutOptions[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (dxSlideOutOptions[TItem, TKey])) {
    
    inline def setContentTemplate(
      value: template | (js.Function1[/* container */ DxElement_[HTMLElement], String | UserDefinedElement[Element]])
    ): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateFunction1(value: /* container */ DxElement_[HTMLElement] => String | UserDefinedElement[Element]): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction1(value))
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setMenuGroupTemplate(
      value: template | (js.Function3[
          /* groupData */ Any, 
          /* groupIndex */ Double, 
          /* groupElement */ Any, 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "menuGroupTemplate", value.asInstanceOf[js.Any])
    
    inline def setMenuGroupTemplateFunction3(
      value: (/* groupData */ Any, /* groupIndex */ Double, /* groupElement */ Any) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "menuGroupTemplate", js.Any.fromFunction3(value))
    
    inline def setMenuGroupTemplateUndefined: Self = StObject.set(x, "menuGroupTemplate", js.undefined)
    
    inline def setMenuGrouped(value: Boolean): Self = StObject.set(x, "menuGrouped", value.asInstanceOf[js.Any])
    
    inline def setMenuGroupedUndefined: Self = StObject.set(x, "menuGrouped", js.undefined)
    
    inline def setMenuItemTemplate(
      value: template | (js.Function3[
          /* itemData */ TItem, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "menuItemTemplate", value.asInstanceOf[js.Any])
    
    inline def setMenuItemTemplateFunction3(
      value: (/* itemData */ TItem, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "menuItemTemplate", js.Any.fromFunction3(value))
    
    inline def setMenuItemTemplateUndefined: Self = StObject.set(x, "menuItemTemplate", js.undefined)
    
    inline def setMenuPosition(value: SlideOutMenuPosition): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
    
    inline def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
    
    inline def setMenuVisible(value: Boolean): Self = StObject.set(x, "menuVisible", value.asInstanceOf[js.Any])
    
    inline def setMenuVisibleUndefined: Self = StObject.set(x, "menuVisible", js.undefined)
    
    inline def setOnMenuGroupRendered(value: /* e */ MenuGroupRenderedEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onMenuGroupRendered", js.Any.fromFunction1(value))
    
    inline def setOnMenuGroupRenderedUndefined: Self = StObject.set(x, "onMenuGroupRendered", js.undefined)
    
    inline def setOnMenuItemRendered(value: /* e */ MenuItemRenderedEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onMenuItemRendered", js.Any.fromFunction1(value))
    
    inline def setOnMenuItemRenderedUndefined: Self = StObject.set(x, "onMenuItemRendered", js.undefined)
    
    inline def setSwipeEnabled(value: Boolean): Self = StObject.set(x, "swipeEnabled", value.asInstanceOf[js.Any])
    
    inline def setSwipeEnabledUndefined: Self = StObject.set(x, "swipeEnabled", js.undefined)
  }
}
