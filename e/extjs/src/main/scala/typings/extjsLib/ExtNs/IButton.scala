package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ trait IButton extends IComponent {
  /** [Config Option] (Boolean) */
  var allowDepress: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var arrowAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var arrowCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
  		*/
  var child: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (String) */
  var clickEvent: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var destroyMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] inherit docs
  		* @param silent Object
  		*/
  @JSName("disable")
  var disable_IButton: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
  		*/
  var down: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var enableToggle: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] inherit docs
  		* @param silent Object
  		*/
  @JSName("enable")
  var enable_IButton: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] This method returns an object which provides substitution parameters for the XTemplate used to create this Button s D
  		* @returns Object Substitution data for a Template. The default implementation which provides data for the default template returns an Object containing the following properties:
  		*/
  var getTemplateArgs: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the text for this Button
  		* @returns String The button text
  		*/
  var getText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var handleMouseEvents: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if the button has a menu and it is visible
  		* @returns Boolean
  		*/
  var hasVisibleMenu: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Hides this button s menu if it has one
  		* @returns Ext.button.Button this
  		*/
  var hideMenu: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var isAction: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.menu.Menu/String/Object) */
  var menu: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var menuActiveCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var menuAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var overflowText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var pressed: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
  		* @returns Ext.Component[] Components which matched the selector
  		*/
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Array]] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed function
  		* @param fn Function The matcher function. It will be called with a single argument, the component being tested.
  		* @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
  		* @returns Ext.Component[] Components matched by the passed function
  		*/
  var queryBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Finds a component at any level under this container matching the id itemId
  		* @param id String The id to find
  		* @returns Ext.Component The matching id, null if not found
  		*/
  var queryById: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], IComponent]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var repeat: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] ("small"/"medium"/"large") */
  var scale: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets this button s glyph
  		* @param glyph Number/String the numeric charCode or string charCode/font-family. This parameter expects a format consistent with that of glyph
  		* @returns Ext.button.Button this
  		*/
  var setGlyph: js.UndefOr[js.Function1[/* glyph */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Assigns this Button s click handler
  		* @param handler Function The function to call when the button is clicked
  		* @param scope Object The scope (this reference) in which the handler function is executed. Defaults to this Button.
  		* @returns Ext.button.Button this
  		*/
  var setHandler: js.UndefOr[
    js.Function2[/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Sets the href of the embedded anchor element to the passed URL
  		* @param href String The URL to set in the anchor element.
  		*/
  var setHref: js.UndefOr[js.Function1[/* href */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the background image inline style of the button
  		* @param icon String The path to an image to display in the button
  		* @returns Ext.button.Button this
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Method] Sets the CSS class that provides a background image to use as the button s icon
  		* @param cls String The CSS class providing the icon image
  		* @returns Ext.button.Button this
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Method] Sets the href of the link dynamically according to the params passed and any baseParams configured
  		* @param params Object Parameters to use in the href URL.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Method to change the scale of the button
  		* @param scale String The scale to change to.
  		*/
  var setScale: js.UndefOr[js.Function1[/* scale */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets this Button s text
  		* @param text String The button text
  		* @returns Ext.button.Button this
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Method] Sets the text alignment for this button
  		* @param align String The new alignment of the button text. See textAlign.
  		*/
  var setTextAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the tooltip for this Button
  		* @param tooltip String/Object This may be:  String : A string to be used as innerHTML (html tags are accepted) to show in a tooltip Object : A configuration object for Ext.tip.QuickTipManager.register.
  		* @returns Ext.button.Button this
  		*/
  var setTooltip: js.UndefOr[js.Function1[/* tooltip */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] inherit docs
  		* @param ui Object
  		*/
  @JSName("setUI")
  var setUI_IButton: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var showEmptyMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Shows this button s menu if it has one
  		* @param fromEvent Object
  		*/
  var showMenu: js.UndefOr[js.Function1[/* fromEvent */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Ext.Template) */
  var template: js.UndefOr[ITemplate] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] If a state it passed it becomes the pressed state otherwise the current state is toggled
  		* @param state Boolean Force a particular state
  		* @param suppressEvent Boolean True to stop events being fired when calling this method.
  		* @returns Ext.button.Button this
  		*/
  var toggle: js.UndefOr[
    js.Function2[
      /* state */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var toggleGroup: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Function) */
  var toggleHandler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[java.lang.String] = js.undefined
}

object IButton {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    IQueryable: IQueryable = null,
    allowDepress: js.UndefOr[scala.Boolean] = js.undefined,
    arrowAlign: java.lang.String = null,
    arrowCls: java.lang.String = null,
    baseCls: java.lang.String = null,
    baseParams: js.Any = null,
    child: /* selector */ js.UndefOr[js.Any] => _ = null,
    clickEvent: java.lang.String = null,
    cls: java.lang.String = null,
    componentLayout: js.Any = null,
    destroyMenu: js.UndefOr[scala.Boolean] = js.undefined,
    disable: /* silent */ js.UndefOr[js.Any] => scala.Unit = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    down: /* selector */ js.UndefOr[js.Any] => _ = null,
    enable: /* silent */ js.UndefOr[js.Any] => scala.Unit = null,
    enableToggle: js.UndefOr[scala.Boolean] = js.undefined,
    focusCls: java.lang.String = null,
    frame: js.UndefOr[scala.Boolean] = js.undefined,
    getTemplateArgs: () => _ = null,
    getText: () => java.lang.String = null,
    glyph: js.Any = null,
    handleMouseEvents: js.UndefOr[scala.Boolean] = js.undefined,
    handler: js.Any = null,
    hasVisibleMenu: () => scala.Boolean = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hideMenu: () => IButton = null,
    href: java.lang.String = null,
    hrefTarget: java.lang.String = null,
    icon: java.lang.String = null,
    iconAlign: java.lang.String = null,
    iconCls: java.lang.String = null,
    initComponent: () => scala.Unit = null,
    isAction: js.UndefOr[scala.Boolean] = js.undefined,
    menu: js.Any = null,
    menuActiveCls: java.lang.String = null,
    menuAlign: java.lang.String = null,
    minWidth: scala.Int | scala.Double = null,
    onDisable: () => scala.Unit = null,
    overCls: java.lang.String = null,
    overflowText: java.lang.String = null,
    params: js.Any = null,
    pressed: js.UndefOr[scala.Boolean] = js.undefined,
    pressedCls: java.lang.String = null,
    preventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    query: /* selector */ js.UndefOr[java.lang.String] => Array = null,
    queryBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Array = null,
    queryById: /* id */ js.UndefOr[java.lang.String] => IComponent = null,
    renderTpl: js.Any = null,
    repeat: js.Any = null,
    scale: js.Any = null,
    scope: js.Any = null,
    setGlyph: /* glyph */ js.UndefOr[js.Any] => IButton = null,
    setHandler: (/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IButton = null,
    setHref: /* href */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setIcon: /* icon */ js.UndefOr[java.lang.String] => IButton = null,
    setIconCls: /* cls */ js.UndefOr[java.lang.String] => IButton = null,
    setParams: /* params */ js.UndefOr[js.Any] => scala.Unit = null,
    setScale: /* scale */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setText: /* text */ js.UndefOr[java.lang.String] => IButton = null,
    setTextAlign: /* align */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setTooltip: /* tooltip */ js.UndefOr[js.Any] => IButton = null,
    setUI: /* ui */ js.UndefOr[js.Any] => scala.Unit = null,
    showEmptyMenu: js.UndefOr[scala.Boolean] = js.undefined,
    showMenu: /* fromEvent */ js.UndefOr[js.Any] => scala.Unit = null,
    shrinkWrap: js.Any = null,
    tabIndex: scala.Int | scala.Double = null,
    template: ITemplate = null,
    text: java.lang.String = null,
    textAlign: java.lang.String = null,
    toggle: (/* state */ js.UndefOr[scala.Boolean], /* suppressEvent */ js.UndefOr[scala.Boolean]) => IButton = null,
    toggleGroup: java.lang.String = null,
    toggleHandler: js.Any = null,
    tooltip: js.Any = null,
    tooltipType: java.lang.String = null
  ): IButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    js.Dynamic.global.Object.assign(__obj, IQueryable)
    if (!js.isUndefined(allowDepress)) __obj.updateDynamic("allowDepress")(allowDepress)
    if (arrowAlign != null) __obj.updateDynamic("arrowAlign")(arrowAlign)
    if (arrowCls != null) __obj.updateDynamic("arrowCls")(arrowCls)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (baseParams != null) __obj.updateDynamic("baseParams")(baseParams)
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction1(child))
    if (clickEvent != null) __obj.updateDynamic("clickEvent")(clickEvent)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (!js.isUndefined(destroyMenu)) __obj.updateDynamic("destroyMenu")(destroyMenu)
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction1(disable))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1(down))
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction1(enable))
    if (!js.isUndefined(enableToggle)) __obj.updateDynamic("enableToggle")(enableToggle)
    if (focusCls != null) __obj.updateDynamic("focusCls")(focusCls)
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame)
    if (getTemplateArgs != null) __obj.updateDynamic("getTemplateArgs")(js.Any.fromFunction0(getTemplateArgs))
    if (getText != null) __obj.updateDynamic("getText")(js.Any.fromFunction0(getText))
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (!js.isUndefined(handleMouseEvents)) __obj.updateDynamic("handleMouseEvents")(handleMouseEvents)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (hasVisibleMenu != null) __obj.updateDynamic("hasVisibleMenu")(js.Any.fromFunction0(hasVisibleMenu))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hideMenu != null) __obj.updateDynamic("hideMenu")(js.Any.fromFunction0(hideMenu))
    if (href != null) __obj.updateDynamic("href")(href)
    if (hrefTarget != null) __obj.updateDynamic("hrefTarget")(hrefTarget)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconAlign != null) __obj.updateDynamic("iconAlign")(iconAlign)
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls)
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (!js.isUndefined(isAction)) __obj.updateDynamic("isAction")(isAction)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (menuActiveCls != null) __obj.updateDynamic("menuActiveCls")(menuActiveCls)
    if (menuAlign != null) __obj.updateDynamic("menuAlign")(menuAlign)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onDisable != null) __obj.updateDynamic("onDisable")(js.Any.fromFunction0(onDisable))
    if (overCls != null) __obj.updateDynamic("overCls")(overCls)
    if (overflowText != null) __obj.updateDynamic("overflowText")(overflowText)
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(pressed)) __obj.updateDynamic("pressed")(pressed)
    if (pressedCls != null) __obj.updateDynamic("pressedCls")(pressedCls)
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault)
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1(query))
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2(queryBy))
    if (queryById != null) __obj.updateDynamic("queryById")(js.Any.fromFunction1(queryById))
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (setGlyph != null) __obj.updateDynamic("setGlyph")(js.Any.fromFunction1(setGlyph))
    if (setHandler != null) __obj.updateDynamic("setHandler")(js.Any.fromFunction2(setHandler))
    if (setHref != null) __obj.updateDynamic("setHref")(js.Any.fromFunction1(setHref))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1(setIcon))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1(setIconCls))
    if (setParams != null) __obj.updateDynamic("setParams")(js.Any.fromFunction1(setParams))
    if (setScale != null) __obj.updateDynamic("setScale")(js.Any.fromFunction1(setScale))
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction1(setText))
    if (setTextAlign != null) __obj.updateDynamic("setTextAlign")(js.Any.fromFunction1(setTextAlign))
    if (setTooltip != null) __obj.updateDynamic("setTooltip")(js.Any.fromFunction1(setTooltip))
    if (setUI != null) __obj.updateDynamic("setUI")(js.Any.fromFunction1(setUI))
    if (!js.isUndefined(showEmptyMenu)) __obj.updateDynamic("showEmptyMenu")(showEmptyMenu)
    if (showMenu != null) __obj.updateDynamic("showMenu")(js.Any.fromFunction1(showMenu))
    if (shrinkWrap != null) __obj.updateDynamic("shrinkWrap")(shrinkWrap)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction2(toggle))
    if (toggleGroup != null) __obj.updateDynamic("toggleGroup")(toggleGroup)
    if (toggleHandler != null) __obj.updateDynamic("toggleHandler")(toggleHandler)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipType != null) __obj.updateDynamic("tooltipType")(tooltipType)
    __obj.asInstanceOf[IButton]
  }
}

