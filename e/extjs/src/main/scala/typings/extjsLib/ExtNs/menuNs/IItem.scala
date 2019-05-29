package typings
package extjsLib.ExtNs.menuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ trait IItem
  extends extjsLib.ExtNs.IComponent {
  /** [Property] (Boolean) */
  var activated: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var canActivate: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
  		*/
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Number) */
  var clickHideDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var destroyMenu: js.UndefOr[scala.Boolean] = js.undefined
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
  var hideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.menu.Menu/Object) */
  var menu: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var menuAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var menuExpandDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var menuHideDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_IItem: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IItem: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Ext.menu.Menu) */
  var parentMenu: js.UndefOr[IMenu] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
  		* @returns Ext.Component[] Components which matched the selector
  		*/
  var query: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed function
  		* @param fn Function The matcher function. It will be called with a single argument, the component being tested.
  		* @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
  		* @returns Ext.Component[] Components matched by the passed function
  		*/
  var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Finds a component at any level under this container matching the id itemId
  		* @param id String The id to find
  		* @returns Ext.Component The matching id, null if not found
  		*/
  var queryById: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Sets the click handler of this item
  		* @param fn Function The handler function
  		* @param scope Object The scope of the handler function
  		*/
  var setHandler: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the icon on this item
  		* @param icon String The new icon
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the iconCls of this item
  		* @param iconCls String The CSS class to set to iconCls
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Set a child menu for this item
  		* @param menu Ext.menu.Menu/Object A menu, or menu configuration. null may be passed to remove the menu.
  		* @param destroyMenu Boolean True to destroy any existing menu. False to prevent destruction. If not specified, the destroyMenu configuration will be used.
  		*/
  var setMenu: js.UndefOr[
    js.Function2[
      /* menu */ js.UndefOr[js.Any], 
      /* destroyMenu */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the text of this item
  		* @param text String The text
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the tooltip for this menu item
  		* @param tooltip String/Object This may be:  String : A string to be used as innerHTML (html tags are accepted) to show in a tooltip Object : A configuration object for Ext.tip.QuickTipManager.register.
  		* @returns Ext.menu.Item this
  		*/
  var setTooltip: js.UndefOr[js.Function1[/* tooltip */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[java.lang.String] = js.undefined
}

object IItem {
  @scala.inline
  def apply(
    IComponent: extjsLib.ExtNs.IComponent = null,
    IQueryable: extjsLib.ExtNs.IQueryable = null,
    activated: js.UndefOr[scala.Boolean] = js.undefined,
    activeCls: java.lang.String = null,
    canActivate: js.UndefOr[scala.Boolean] = js.undefined,
    child: /* selector */ js.UndefOr[js.Any] => _ = null,
    clickHideDelay: scala.Int | scala.Double = null,
    destroyMenu: js.UndefOr[scala.Boolean] = js.undefined,
    disabledCls: java.lang.String = null,
    down: /* selector */ js.UndefOr[js.Any] => _ = null,
    glyph: js.Any = null,
    handler: js.Any = null,
    hideOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    hrefTarget: java.lang.String = null,
    icon: java.lang.String = null,
    iconCls: java.lang.String = null,
    initComponent: () => scala.Unit = null,
    maskOnDisable: js.UndefOr[scala.Boolean] = js.undefined,
    menu: js.Any = null,
    menuAlign: java.lang.String = null,
    menuExpandDelay: scala.Int | scala.Double = null,
    menuHideDelay: scala.Int | scala.Double = null,
    onDestroy: () => scala.Unit = null,
    onRemoved: () => scala.Unit = null,
    onRender: () => scala.Unit = null,
    parentMenu: IMenu = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    query: /* selector */ js.UndefOr[java.lang.String] => extjsLib.ExtNs.Array = null,
    queryBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => extjsLib.ExtNs.Array = null,
    queryById: /* id */ js.UndefOr[java.lang.String] => extjsLib.ExtNs.IComponent = null,
    renderTpl: js.Any = null,
    setHandler: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    setIcon: /* icon */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setIconCls: /* iconCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setMenu: (/* menu */ js.UndefOr[js.Any], /* destroyMenu */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    setText: /* text */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setTooltip: /* tooltip */ js.UndefOr[js.Any] => IItem = null,
    text: java.lang.String = null,
    tooltip: js.Any = null,
    tooltipType: java.lang.String = null
  ): IItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    js.Dynamic.global.Object.assign(__obj, IQueryable)
    if (!js.isUndefined(activated)) __obj.updateDynamic("activated")(activated)
    if (activeCls != null) __obj.updateDynamic("activeCls")(activeCls)
    if (!js.isUndefined(canActivate)) __obj.updateDynamic("canActivate")(canActivate)
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction1(child))
    if (clickHideDelay != null) __obj.updateDynamic("clickHideDelay")(clickHideDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyMenu)) __obj.updateDynamic("destroyMenu")(destroyMenu)
    if (disabledCls != null) __obj.updateDynamic("disabledCls")(disabledCls)
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1(down))
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick)
    if (href != null) __obj.updateDynamic("href")(href)
    if (hrefTarget != null) __obj.updateDynamic("hrefTarget")(hrefTarget)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls)
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (!js.isUndefined(maskOnDisable)) __obj.updateDynamic("maskOnDisable")(maskOnDisable)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (menuAlign != null) __obj.updateDynamic("menuAlign")(menuAlign)
    if (menuExpandDelay != null) __obj.updateDynamic("menuExpandDelay")(menuExpandDelay.asInstanceOf[js.Any])
    if (menuHideDelay != null) __obj.updateDynamic("menuHideDelay")(menuHideDelay.asInstanceOf[js.Any])
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction0(onDestroy))
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(js.Any.fromFunction0(onRemoved))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1(query))
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2(queryBy))
    if (queryById != null) __obj.updateDynamic("queryById")(js.Any.fromFunction1(queryById))
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (setHandler != null) __obj.updateDynamic("setHandler")(js.Any.fromFunction2(setHandler))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1(setIcon))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1(setIconCls))
    if (setMenu != null) __obj.updateDynamic("setMenu")(js.Any.fromFunction2(setMenu))
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction1(setText))
    if (setTooltip != null) __obj.updateDynamic("setTooltip")(js.Any.fromFunction1(setTooltip))
    if (text != null) __obj.updateDynamic("text")(text)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipType != null) __obj.updateDynamic("tooltipType")(tooltipType)
    __obj.asInstanceOf[IItem]
  }
}

