package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.SlideOutMenuPosition
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.template
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSlideOutViewOptions
  extends StObject
     with WidgetOptions[dxSlideOutView] {
  
  /**
    * Specifies a custom template for the UI component content.
    */
  var contentTemplate: js.UndefOr[template | (js.Function1[/* contentElement */ DxElement_[HTMLElement], Any])] = js.undefined
  
  /**
    * Specifies the current menu position.
    */
  var menuPosition: js.UndefOr[SlideOutMenuPosition] = js.undefined
  
  /**
    * Specifies a custom template for the menu content.
    */
  var menuTemplate: js.UndefOr[template | (js.Function1[/* menuElement */ DxElement_[HTMLElement], Any])] = js.undefined
  
  /**
    * Specifies whether or not the menu panel is visible.
    */
  var menuVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the menu is shown when a user swipes the UI component content.
    */
  var swipeEnabled: js.UndefOr[Boolean] = js.undefined
}
object dxSlideOutViewOptions {
  
  inline def apply(): dxSlideOutViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSlideOutViewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxSlideOutViewOptions] (val x: Self) extends AnyVal {
    
    inline def setContentTemplate(value: template | (js.Function1[/* contentElement */ DxElement_[HTMLElement], Any])): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateFunction1(value: /* contentElement */ DxElement_[HTMLElement] => Any): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction1(value))
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setMenuPosition(value: SlideOutMenuPosition): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
    
    inline def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
    
    inline def setMenuTemplate(value: template | (js.Function1[/* menuElement */ DxElement_[HTMLElement], Any])): Self = StObject.set(x, "menuTemplate", value.asInstanceOf[js.Any])
    
    inline def setMenuTemplateFunction1(value: /* menuElement */ DxElement_[HTMLElement] => Any): Self = StObject.set(x, "menuTemplate", js.Any.fromFunction1(value))
    
    inline def setMenuTemplateUndefined: Self = StObject.set(x, "menuTemplate", js.undefined)
    
    inline def setMenuVisible(value: Boolean): Self = StObject.set(x, "menuVisible", value.asInstanceOf[js.Any])
    
    inline def setMenuVisibleUndefined: Self = StObject.set(x, "menuVisible", js.undefined)
    
    inline def setSwipeEnabled(value: Boolean): Self = StObject.set(x, "swipeEnabled", value.asInstanceOf[js.Any])
    
    inline def setSwipeEnabledUndefined: Self = StObject.set(x, "swipeEnabled", js.undefined)
  }
}
