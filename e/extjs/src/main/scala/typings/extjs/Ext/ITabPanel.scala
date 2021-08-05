package typings.extjs.Ext

import typings.extjs.Ext.tab.IBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITabPanel
  extends StObject
     with typings.extjs.Ext.panel.IPanel {
  
  /** [Config Option] (String/Number/Ext.Component) */
  var activeTab: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var deferredRender: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the item that is currently active inside this TabPanel
    * @returns Ext.Component The currently active item.
    */
  var getActiveTab: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Returns the Ext tab Bar currently used in this TabPanel
    * @returns Ext.tab.Bar The TabBar
    */
  var getTabBar: js.UndefOr[js.Function0[IBar]] = js.undefined
  
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Number) */
  var maxTabWidth: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minTabWidth: js.UndefOr[Double] = js.undefined
  
  /** [Method] Makes sure we have a Tab for each item added to the TabPanel
    * @param item Object
    * @param index Object
    */
  @JSName("onAdd")
  var onAdd_ITabPanel: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var removePanelHeader: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Makes the given card active
    * @param card String/Number/Ext.Component The card to make active. Either an ID, index or the component itself.
    * @returns Ext.Component The resulting active child Component. The call may have been vetoed, or otherwise modified by an event listener.
    */
  var setActiveTab: js.UndefOr[js.Function1[/* card */ js.UndefOr[js.Any], IComponent]] = js.undefined
  
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] ("top"/"bottom"/"left"/"right") */
  var tabPosition: js.UndefOr[js.Any] = js.undefined
}
object ITabPanel {
  
  inline def apply(): ITabPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabPanel]
  }
  
  extension [Self <: ITabPanel](x: Self) {
    
    inline def setActiveTab(value: js.Any): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
    
    inline def setDeferredRender(value: Boolean): Self = StObject.set(x, "deferredRender", value.asInstanceOf[js.Any])
    
    inline def setDeferredRenderUndefined: Self = StObject.set(x, "deferredRender", js.undefined)
    
    inline def setGetActiveTab(value: () => IComponent): Self = StObject.set(x, "getActiveTab", js.Any.fromFunction0(value))
    
    inline def setGetActiveTabUndefined: Self = StObject.set(x, "getActiveTab", js.undefined)
    
    inline def setGetTabBar(value: () => IBar): Self = StObject.set(x, "getTabBar", js.Any.fromFunction0(value))
    
    inline def setGetTabBarUndefined: Self = StObject.set(x, "getTabBar", js.undefined)
    
    inline def setItemCls(value: java.lang.String): Self = StObject.set(x, "itemCls", value.asInstanceOf[js.Any])
    
    inline def setItemClsUndefined: Self = StObject.set(x, "itemCls", js.undefined)
    
    inline def setMaxTabWidth(value: Double): Self = StObject.set(x, "maxTabWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxTabWidthUndefined: Self = StObject.set(x, "maxTabWidth", js.undefined)
    
    inline def setMinTabWidth(value: Double): Self = StObject.set(x, "minTabWidth", value.asInstanceOf[js.Any])
    
    inline def setMinTabWidthUndefined: Self = StObject.set(x, "minTabWidth", js.undefined)
    
    inline def setOnAdd(value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    
    inline def setRemovePanelHeader(value: Boolean): Self = StObject.set(x, "removePanelHeader", value.asInstanceOf[js.Any])
    
    inline def setRemovePanelHeaderUndefined: Self = StObject.set(x, "removePanelHeader", js.undefined)
    
    inline def setSetActiveTab(value: /* card */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "setActiveTab", js.Any.fromFunction1(value))
    
    inline def setSetActiveTabUndefined: Self = StObject.set(x, "setActiveTab", js.undefined)
    
    inline def setTabBar(value: js.Any): Self = StObject.set(x, "tabBar", value.asInstanceOf[js.Any])
    
    inline def setTabBarUndefined: Self = StObject.set(x, "tabBar", js.undefined)
    
    inline def setTabPosition(value: js.Any): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
    
    inline def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
  }
}
