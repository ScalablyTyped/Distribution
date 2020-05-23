package typings.extjs.Ext.menu

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ trait IItem extends IComponent {
  /** [Property] (Boolean) */
  var activated: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var canActivate: js.UndefOr[Boolean] = js.undefined
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
    * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
    */
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Number) */
  var clickHideDelay: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var destroyMenu: js.UndefOr[Boolean] = js.undefined
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
    */
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var href: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.menu.Menu/Object) */
  var menu: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var menuAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var menuExpandDelay: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var menuHideDelay: js.UndefOr[Double] = js.undefined
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_IItem: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IItem: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Ext.menu.Menu) */
  var parentMenu: js.UndefOr[IMenu] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
    * @returns Ext.Component[] Components which matched the selector
    */
  var query: js.UndefOr[js.Function1[js.UndefOr[String], Array]] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed function
    * @param fn Function The matcher function. It will be called with a single argument, the component being tested.
    * @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
    * @returns Ext.Component[] Components matched by the passed function
    */
  var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Finds a component at any level under this container matching the id itemId
    * @param id String The id to find
    * @returns Ext.Component The matching id, null if not found
    */
  var queryById: js.UndefOr[js.Function1[js.UndefOr[String], IComponent]] = js.undefined
  /** [Method] Sets the click handler of this item
    * @param fn Function The handler function
    * @param scope Object The scope of the handler function
    */
  var setHandler: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the icon on this item
    * @param icon String The new icon
    */
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the iconCls of this item
    * @param iconCls String The CSS class to set to iconCls
    */
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Set a child menu for this item
    * @param menu Ext.menu.Menu/Object A menu, or menu configuration. null may be passed to remove the menu.
    * @param destroyMenu Boolean True to destroy any existing menu. False to prevent destruction. If not specified, the destroyMenu configuration will be used.
    */
  var setMenu: js.UndefOr[
    js.Function2[/* menu */ js.UndefOr[js.Any], /* destroyMenu */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Sets the text of this item
    * @param text String The text
    */
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the tooltip for this menu item
    * @param tooltip String/Object This may be:  String : A string to be used as innerHTML (html tags are accepted) to show in a tooltip Object : A configuration object for Ext.tip.QuickTipManager.register.
    * @returns Ext.menu.Item this
    */
  var setTooltip: js.UndefOr[js.Function1[/* tooltip */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.undefined
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[String] = js.undefined
}

object IItem {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    activated: js.UndefOr[Boolean] = js.undefined,
    activeCls: String = null,
    canActivate: js.UndefOr[Boolean] = js.undefined,
    child: js.UndefOr[js.Any] => _ = null,
    clickHideDelay: js.UndefOr[Double] = js.undefined,
    destroyMenu: js.UndefOr[Boolean] = js.undefined,
    down: js.UndefOr[js.Any] => _ = null,
    glyph: js.Any = null,
    handler: js.Any = null,
    hideOnClick: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    hrefTarget: String = null,
    icon: String = null,
    iconCls: String = null,
    menu: js.Any = null,
    menuAlign: String = null,
    menuExpandDelay: js.UndefOr[Double] = js.undefined,
    menuHideDelay: js.UndefOr[Double] = js.undefined,
    onRemoved: () => Unit = null,
    onRender: () => Unit = null,
    parentMenu: IMenu = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    query: js.UndefOr[String] => Array = null,
    queryBy: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array = null,
    queryById: js.UndefOr[String] => IComponent = null,
    setHandler: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    setIcon: /* icon */ js.UndefOr[String] => Unit = null,
    setIconCls: /* iconCls */ js.UndefOr[String] => Unit = null,
    setMenu: (/* menu */ js.UndefOr[js.Any], /* destroyMenu */ js.UndefOr[Boolean]) => Unit = null,
    setText: /* text */ js.UndefOr[String] => Unit = null,
    setTooltip: /* tooltip */ js.UndefOr[js.Any] => IItem = null,
    text: String = null,
    tooltip: js.Any = null,
    tooltipType: String = null
  ): IItem = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(activated)) __obj.updateDynamic("activated")(activated.get.asInstanceOf[js.Any])
    if (activeCls != null) __obj.updateDynamic("activeCls")(activeCls.asInstanceOf[js.Any])
    if (!js.isUndefined(canActivate)) __obj.updateDynamic("canActivate")(canActivate.get.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction1(child))
    if (!js.isUndefined(clickHideDelay)) __obj.updateDynamic("clickHideDelay")(clickHideDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyMenu)) __obj.updateDynamic("destroyMenu")(destroyMenu.get.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1(down))
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefTarget != null) __obj.updateDynamic("hrefTarget")(hrefTarget.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuAlign != null) __obj.updateDynamic("menuAlign")(menuAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(menuExpandDelay)) __obj.updateDynamic("menuExpandDelay")(menuExpandDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(menuHideDelay)) __obj.updateDynamic("menuHideDelay")(menuHideDelay.get.asInstanceOf[js.Any])
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(js.Any.fromFunction0(onRemoved))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1(query))
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2(queryBy))
    if (queryById != null) __obj.updateDynamic("queryById")(js.Any.fromFunction1(queryById))
    if (setHandler != null) __obj.updateDynamic("setHandler")(js.Any.fromFunction2(setHandler))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1(setIcon))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1(setIconCls))
    if (setMenu != null) __obj.updateDynamic("setMenu")(js.Any.fromFunction2(setMenu))
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction1(setText))
    if (setTooltip != null) __obj.updateDynamic("setTooltip")(js.Any.fromFunction1(setTooltip))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipType != null) __obj.updateDynamic("tooltipType")(tooltipType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem]
  }
}

