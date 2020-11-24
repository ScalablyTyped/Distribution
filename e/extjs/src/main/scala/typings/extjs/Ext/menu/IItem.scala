package typings.extjs.Ext.menu

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ @js.native
trait IItem extends IComponent {
  
  /** [Property] (Boolean) */
  var activated: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var canActivate: js.UndefOr[Boolean] = js.native
  
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
    * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
    */
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  
  /** [Config Option] (Number) */
  var clickHideDelay: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var destroyMenu: js.UndefOr[Boolean] = js.native
  
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
    */
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var hideOnClick: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var href: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.menu.Menu/Object) */
  var menu: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var menuAlign: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var menuExpandDelay: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var menuHideDelay: js.UndefOr[Double] = js.native
  
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_IItem: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IItem: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Ext.menu.Menu) */
  var parentMenu: js.UndefOr[IMenu] = js.native
  
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.native
  
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
    * @returns Ext.Component[] Components which matched the selector
    */
  var query: js.UndefOr[js.Function1[js.UndefOr[String], Array]] = js.native
  
  /** [Method] Retrieves all descendant components which match the passed function
    * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
    * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
    * @returns Ext.Component[] Components matched by the passed function
    */
  var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Array]] = js.native
  
  /** [Method] Finds a component at any level under this container matching the id itemId
    * @param id String The id to find
    * @returns Ext.Component The matching id, null if not found
    */
  var queryById: js.UndefOr[js.Function1[js.UndefOr[String], IComponent]] = js.native
  
  /** [Method] Sets the click handler of this item
    * @param fn Function The handler function
    * @param scope Object The scope of the handler function
    */
  var setHandler: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the icon on this item
    * @param icon String The new icon
    */
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the iconCls of this item
    * @param iconCls String The CSS class to set to iconCls
    */
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Set a child menu for this item
    * @param menu Ext.menu.Menu/Object A menu, or menu configuration. null may be passed to remove the menu.
    * @param destroyMenu Boolean True to destroy any existing menu. False to prevent destruction. If not specified, the destroyMenu configuration will be used.
    */
  var setMenu: js.UndefOr[
    js.Function2[/* menu */ js.UndefOr[js.Any], /* destroyMenu */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Sets the text of this item
    * @param text String The text
    */
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the tooltip for this menu item
    * @param tooltip String/Object This may be:  String : A string to be used as innerHTML (html tags are accepted) to show in a tooltip Object : A configuration object for Ext.tip.QuickTipManager.register.
    * @returns Ext.menu.Item this
    */
  var setTooltip: js.UndefOr[js.Function1[/* tooltip */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
  
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[String] = js.native
}
object IItem {
  
  @scala.inline
  def apply(): IItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItem]
  }
  
  @scala.inline
  implicit class IItemOps[Self <: IItem] (val x: Self) extends AnyVal {
    
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
    def setActivated(value: Boolean): Self = this.set("activated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivated: Self = this.set("activated", js.undefined)
    
    @scala.inline
    def setActiveCls(value: String): Self = this.set("activeCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveCls: Self = this.set("activeCls", js.undefined)
    
    @scala.inline
    def setCanActivate(value: Boolean): Self = this.set("canActivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanActivate: Self = this.set("canActivate", js.undefined)
    
    @scala.inline
    def setChild(value: js.UndefOr[js.Any] => _): Self = this.set("child", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    
    @scala.inline
    def setClickHideDelay(value: Double): Self = this.set("clickHideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickHideDelay: Self = this.set("clickHideDelay", js.undefined)
    
    @scala.inline
    def setDestroyMenu(value: Boolean): Self = this.set("destroyMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyMenu: Self = this.set("destroyMenu", js.undefined)
    
    @scala.inline
    def setDown(value: js.UndefOr[js.Any] => _): Self = this.set("down", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    
    @scala.inline
    def setGlyph(value: js.Any): Self = this.set("glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyph: Self = this.set("glyph", js.undefined)
    
    @scala.inline
    def setHandler(value: js.Any): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setHideOnClick(value: Boolean): Self = this.set("hideOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnClick: Self = this.set("hideOnClick", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setHrefTarget(value: String): Self = this.set("hrefTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHrefTarget: Self = this.set("hrefTarget", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconCls(value: String): Self = this.set("iconCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconCls: Self = this.set("iconCls", js.undefined)
    
    @scala.inline
    def setMenu(value: js.Any): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setMenuAlign(value: String): Self = this.set("menuAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuAlign: Self = this.set("menuAlign", js.undefined)
    
    @scala.inline
    def setMenuExpandDelay(value: Double): Self = this.set("menuExpandDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuExpandDelay: Self = this.set("menuExpandDelay", js.undefined)
    
    @scala.inline
    def setMenuHideDelay(value: Double): Self = this.set("menuHideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuHideDelay: Self = this.set("menuHideDelay", js.undefined)
    
    @scala.inline
    def setOnRemoved(value: () => Unit): Self = this.set("onRemoved", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRemoved: Self = this.set("onRemoved", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    
    @scala.inline
    def setParentMenu(value: IMenu): Self = this.set("parentMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentMenu: Self = this.set("parentMenu", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    
    @scala.inline
    def setQuery(value: js.UndefOr[String] => Array): Self = this.set("query", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQueryBy(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array): Self = this.set("queryBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteQueryBy: Self = this.set("queryBy", js.undefined)
    
    @scala.inline
    def setQueryById(value: js.UndefOr[String] => IComponent): Self = this.set("queryById", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteQueryById: Self = this.set("queryById", js.undefined)
    
    @scala.inline
    def setSetHandler(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("setHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetHandler: Self = this.set("setHandler", js.undefined)
    
    @scala.inline
    def setSetIcon(value: /* icon */ js.UndefOr[String] => Unit): Self = this.set("setIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIcon: Self = this.set("setIcon", js.undefined)
    
    @scala.inline
    def setSetIconCls(value: /* iconCls */ js.UndefOr[String] => Unit): Self = this.set("setIconCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIconCls: Self = this.set("setIconCls", js.undefined)
    
    @scala.inline
    def setSetMenu(value: (/* menu */ js.UndefOr[js.Any], /* destroyMenu */ js.UndefOr[Boolean]) => Unit): Self = this.set("setMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetMenu: Self = this.set("setMenu", js.undefined)
    
    @scala.inline
    def setSetText(value: /* text */ js.UndefOr[String] => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetText: Self = this.set("setText", js.undefined)
    
    @scala.inline
    def setSetTooltip(value: /* tooltip */ js.UndefOr[js.Any] => IItem): Self = this.set("setTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTooltip: Self = this.set("setTooltip", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipType(value: String): Self = this.set("tooltipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipType: Self = this.set("tooltipType", js.undefined)
  }
}
