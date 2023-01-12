package typings.extjs.Ext.layout.container

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxoverflow {
  
  trait IMenu
    extends StObject
       with IBase {
    
    /** [Property] (Array) */
    var menuItems: js.UndefOr[Array] = js.undefined
    
    /** [Property] (String) */
    var noItemsMenuText: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var triggerButtonCls: js.UndefOr[String] = js.undefined
  }
  object IMenu {
    
    inline def apply(): IMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMenu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMenu] (val x: Self) extends AnyVal {
      
      inline def setMenuItems(value: Array): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
      
      inline def setNoItemsMenuText(value: String): Self = StObject.set(x, "noItemsMenuText", value.asInstanceOf[js.Any])
      
      inline def setNoItemsMenuTextUndefined: Self = StObject.set(x, "noItemsMenuText", js.undefined)
      
      inline def setTriggerButtonCls(value: String): Self = StObject.set(x, "triggerButtonCls", value.asInstanceOf[js.Any])
      
      inline def setTriggerButtonClsUndefined: Self = StObject.set(x, "triggerButtonCls", js.undefined)
    }
  }
  
  type INone = IBase
  
  trait IScroller
    extends StObject
       with IObservable {
    
    /** [Config Option] (String) */
    var afterCtCls: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var afterScrollerCls: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var animateScroll: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var beforeCtCls: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (String) */
    var beforeScrollerCls: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the current scroll position of the innerCt element
      * @returns Number The current scroll position
      */
    var getScrollPosition: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Config Option] (Number) */
    var scrollDuration: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var scrollIncrement: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var scrollRepeatInterval: js.UndefOr[Double] = js.undefined
    
    /** [Method] Scrolls to the given component
      * @param item String/Number/Ext.Component The item to scroll to. Can be a numerical index, component id or a reference to the component itself.
      * @param animate Boolean True to animate the scrolling
      */
    var scrollToItem: js.UndefOr[
        js.Function2[/* item */ js.UndefOr[Any], /* animate */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Config Option] (String) */
    var scrollerCls: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Number) */
    var wheelIncrement: js.UndefOr[Double] = js.undefined
  }
  object IScroller {
    
    inline def apply(): IScroller = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScroller]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScroller] (val x: Self) extends AnyVal {
      
      inline def setAfterCtCls(value: String): Self = StObject.set(x, "afterCtCls", value.asInstanceOf[js.Any])
      
      inline def setAfterCtClsUndefined: Self = StObject.set(x, "afterCtCls", js.undefined)
      
      inline def setAfterScrollerCls(value: String): Self = StObject.set(x, "afterScrollerCls", value.asInstanceOf[js.Any])
      
      inline def setAfterScrollerClsUndefined: Self = StObject.set(x, "afterScrollerCls", js.undefined)
      
      inline def setAnimateScroll(value: Boolean): Self = StObject.set(x, "animateScroll", value.asInstanceOf[js.Any])
      
      inline def setAnimateScrollUndefined: Self = StObject.set(x, "animateScroll", js.undefined)
      
      inline def setBeforeCtCls(value: String): Self = StObject.set(x, "beforeCtCls", value.asInstanceOf[js.Any])
      
      inline def setBeforeCtClsUndefined: Self = StObject.set(x, "beforeCtCls", js.undefined)
      
      inline def setBeforeScrollerCls(value: String): Self = StObject.set(x, "beforeScrollerCls", value.asInstanceOf[js.Any])
      
      inline def setBeforeScrollerClsUndefined: Self = StObject.set(x, "beforeScrollerCls", js.undefined)
      
      inline def setGetScrollPosition(value: () => Double): Self = StObject.set(x, "getScrollPosition", js.Any.fromFunction0(value))
      
      inline def setGetScrollPositionUndefined: Self = StObject.set(x, "getScrollPosition", js.undefined)
      
      inline def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
      inline def setScrollDurationUndefined: Self = StObject.set(x, "scrollDuration", js.undefined)
      
      inline def setScrollIncrement(value: Double): Self = StObject.set(x, "scrollIncrement", value.asInstanceOf[js.Any])
      
      inline def setScrollIncrementUndefined: Self = StObject.set(x, "scrollIncrement", js.undefined)
      
      inline def setScrollRepeatInterval(value: Double): Self = StObject.set(x, "scrollRepeatInterval", value.asInstanceOf[js.Any])
      
      inline def setScrollRepeatIntervalUndefined: Self = StObject.set(x, "scrollRepeatInterval", js.undefined)
      
      inline def setScrollToItem(value: (/* item */ js.UndefOr[Any], /* animate */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "scrollToItem", js.Any.fromFunction2(value))
      
      inline def setScrollToItemUndefined: Self = StObject.set(x, "scrollToItem", js.undefined)
      
      inline def setScrollerCls(value: String): Self = StObject.set(x, "scrollerCls", value.asInstanceOf[js.Any])
      
      inline def setScrollerClsUndefined: Self = StObject.set(x, "scrollerCls", js.undefined)
      
      inline def setWheelIncrement(value: Double): Self = StObject.set(x, "wheelIncrement", value.asInstanceOf[js.Any])
      
      inline def setWheelIncrementUndefined: Self = StObject.set(x, "wheelIncrement", js.undefined)
    }
  }
}
