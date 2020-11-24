package typings.extjs.Ext.tab

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanel
  extends typings.extjs.Ext.panel.IPanel {
  
  /** [Config Option] (String/Number/Ext.Component) */
  var activeTab: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var deferredRender: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the item that is currently active inside this TabPanel
    * @returns Ext.Component The currently active item.
    */
  var getActiveTab: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Returns the Ext tab Bar currently used in this TabPanel
    * @returns Ext.tab.Bar The TabBar
    */
  var getTabBar: js.UndefOr[js.Function0[IBar]] = js.native
  
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var maxTabWidth: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minTabWidth: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var removePanelHeader: js.UndefOr[Boolean] = js.native
  
  /** [Method] Makes the given card active
    * @param card String/Number/Ext.Component The card to make active. Either an ID, index or the component itself.
    * @returns Ext.Component The resulting active child Component. The call may have been vetoed, or otherwise modified by an event listener.
    */
  var setActiveTab: js.UndefOr[js.Function1[/* card */ js.UndefOr[js.Any], IComponent]] = js.native
  
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] ("top"/"bottom"/"left"/"right") */
  var tabPosition: js.UndefOr[js.Any] = js.native
}
object IPanel {
  
  @scala.inline
  def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  
  @scala.inline
  implicit class IPanelOps[Self <: IPanel] (val x: Self) extends AnyVal {
    
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
    def setActiveTab(value: js.Any): Self = this.set("activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveTab: Self = this.set("activeTab", js.undefined)
    
    @scala.inline
    def setDeferredRender(value: Boolean): Self = this.set("deferredRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferredRender: Self = this.set("deferredRender", js.undefined)
    
    @scala.inline
    def setGetActiveTab(value: () => IComponent): Self = this.set("getActiveTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetActiveTab: Self = this.set("getActiveTab", js.undefined)
    
    @scala.inline
    def setGetTabBar(value: () => IBar): Self = this.set("getTabBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTabBar: Self = this.set("getTabBar", js.undefined)
    
    @scala.inline
    def setItemCls(value: String): Self = this.set("itemCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCls: Self = this.set("itemCls", js.undefined)
    
    @scala.inline
    def setMaxTabWidth(value: Double): Self = this.set("maxTabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTabWidth: Self = this.set("maxTabWidth", js.undefined)
    
    @scala.inline
    def setMinTabWidth(value: Double): Self = this.set("minTabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTabWidth: Self = this.set("minTabWidth", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    
    @scala.inline
    def setRemovePanelHeader(value: Boolean): Self = this.set("removePanelHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovePanelHeader: Self = this.set("removePanelHeader", js.undefined)
    
    @scala.inline
    def setSetActiveTab(value: /* card */ js.UndefOr[js.Any] => IComponent): Self = this.set("setActiveTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActiveTab: Self = this.set("setActiveTab", js.undefined)
    
    @scala.inline
    def setTabBar(value: js.Any): Self = this.set("tabBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBar: Self = this.set("tabBar", js.undefined)
    
    @scala.inline
    def setTabPosition(value: js.Any): Self = this.set("tabPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabPosition: Self = this.set("tabPosition", js.undefined)
  }
}
