package typings.extjs.Ext.button

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.ITemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ trait IButton extends IComponent {
  /** [Config Option] (Boolean) */
  var allowDepress: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var arrowAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var arrowCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
  		*/
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (String) */
  var clickEvent: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var destroyMenu: js.UndefOr[Boolean] = js.undefined
  /** [Method] inherit docs
  		* @param silent Object
  		*/
  @JSName("disable")
  var disable_IButton: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
  		*/
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var enableToggle: js.UndefOr[Boolean] = js.undefined
  /** [Method] inherit docs
  		* @param silent Object
  		*/
  @JSName("enable")
  var enable_IButton: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[String] = js.undefined
  /** [Method] This method returns an object which provides substitution parameters for the XTemplate used to create this Button s D
  		* @returns Object Substitution data for a Template. The default implementation which provides data for the default template returns an Object containing the following properties:
  		*/
  var getTemplateArgs: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the text for this Button
  		* @returns String The button text
  		*/
  var getText: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var handleMouseEvents: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if the button has a menu and it is visible
  		* @returns Boolean
  		*/
  var hasVisibleMenu: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Hides this button s menu if it has one
  		* @returns Ext.button.Button this
  		*/
  var hideMenu: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  var href: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var iconAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.undefined
  /** [Property] (Boolean) */
  var isAction: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.menu.Menu/String/Object) */
  var menu: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var menuActiveCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var menuAlign: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var overflowText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var pressed: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[Boolean] = js.undefined
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
  var setHref: js.UndefOr[js.Function1[/* href */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the background image inline style of the button
  		* @param icon String The path to an image to display in the button
  		* @returns Ext.button.Button this
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Sets the CSS class that provides a background image to use as the button s icon
  		* @param cls String The CSS class providing the icon image
  		* @returns Ext.button.Button this
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Sets the href of the link dynamically according to the params passed and any baseParams configured
  		* @param params Object Parameters to use in the href URL.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Method to change the scale of the button
  		* @param scale String The scale to change to.
  		*/
  var setScale: js.UndefOr[js.Function1[/* scale */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets this Button s text
  		* @param text String The button text
  		* @returns Ext.button.Button this
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Sets the text alignment for this button
  		* @param align String The new alignment of the button text. See textAlign.
  		*/
  var setTextAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the tooltip for this Button
  		* @param tooltip String/Object This may be:  String : A string to be used as innerHTML (html tags are accepted) to show in a tooltip Object : A configuration object for Ext.tip.QuickTipManager.register.
  		* @returns Ext.button.Button this
  		*/
  var setTooltip: js.UndefOr[js.Function1[/* tooltip */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] inherit docs
  		* @param ui Object
  		*/
  @JSName("setUI")
  var setUI_IButton: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var showEmptyMenu: js.UndefOr[Boolean] = js.undefined
  /** [Method] Shows this button s menu if it has one
  		* @param fromEvent Object
  		*/
  var showMenu: js.UndefOr[js.Function1[/* fromEvent */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /** [Property] (Ext.Template) */
  var template: js.UndefOr[ITemplate] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var textAlign: js.UndefOr[String] = js.undefined
  /** [Method] If a state it passed it becomes the pressed state otherwise the current state is toggled
  		* @param state Boolean Force a particular state
  		* @param suppressEvent Boolean True to stop events being fired when calling this method.
  		* @returns Ext.button.Button this
  		*/
  var toggle: js.UndefOr[
    js.Function2[/* state */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Config Option] (String) */
  var toggleGroup: js.UndefOr[String] = js.undefined
  /** [Config Option] (Function) */
  var toggleHandler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[String] = js.undefined
}

object IButton {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    allowDepress: js.UndefOr[Boolean] = js.undefined,
    arrowAlign: String = null,
    arrowCls: String = null,
    baseParams: js.Any = null,
    child: js.UndefOr[js.Any] => _ = null,
    clickEvent: String = null,
    destroyMenu: js.UndefOr[Boolean] = js.undefined,
    disable: /* silent */ js.UndefOr[js.Any] => Unit = null,
    down: js.UndefOr[js.Any] => _ = null,
    enable: /* silent */ js.UndefOr[js.Any] => Unit = null,
    enableToggle: js.UndefOr[Boolean] = js.undefined,
    focusCls: String = null,
    getTemplateArgs: () => _ = null,
    getText: () => String = null,
    glyph: js.Any = null,
    handleMouseEvents: js.UndefOr[Boolean] = js.undefined,
    handler: js.Any = null,
    hasVisibleMenu: () => Boolean = null,
    hideMenu: () => IButton = null,
    href: String = null,
    hrefTarget: String = null,
    icon: String = null,
    iconAlign: String = null,
    iconCls: String = null,
    isAction: js.UndefOr[Boolean] = js.undefined,
    menu: js.Any = null,
    menuActiveCls: String = null,
    menuAlign: String = null,
    overflowText: String = null,
    params: js.Any = null,
    pressed: js.UndefOr[Boolean] = js.undefined,
    pressedCls: String = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    query: js.UndefOr[String] => Array = null,
    queryBy: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array = null,
    queryById: js.UndefOr[String] => IComponent = null,
    repeat: js.Any = null,
    scale: js.Any = null,
    scope: js.Any = null,
    setGlyph: /* glyph */ js.UndefOr[js.Any] => IButton = null,
    setHandler: (/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IButton = null,
    setHref: /* href */ js.UndefOr[String] => Unit = null,
    setIcon: /* icon */ js.UndefOr[String] => IButton = null,
    setIconCls: /* cls */ js.UndefOr[String] => IButton = null,
    setParams: /* params */ js.UndefOr[js.Any] => Unit = null,
    setScale: /* scale */ js.UndefOr[String] => Unit = null,
    setText: /* text */ js.UndefOr[String] => IButton = null,
    setTextAlign: /* align */ js.UndefOr[String] => Unit = null,
    setTooltip: /* tooltip */ js.UndefOr[js.Any] => IButton = null,
    setUI: /* ui */ js.UndefOr[js.Any] => Unit = null,
    showEmptyMenu: js.UndefOr[Boolean] = js.undefined,
    showMenu: /* fromEvent */ js.UndefOr[js.Any] => Unit = null,
    tabIndex: Int | Double = null,
    template: ITemplate = null,
    text: String = null,
    textAlign: String = null,
    toggle: (/* state */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => IButton = null,
    toggleGroup: String = null,
    toggleHandler: js.Any = null,
    tooltip: js.Any = null,
    tooltipType: String = null
  ): IButton = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(allowDepress)) __obj.updateDynamic("allowDepress")(allowDepress.asInstanceOf[js.Any])
    if (arrowAlign != null) __obj.updateDynamic("arrowAlign")(arrowAlign.asInstanceOf[js.Any])
    if (arrowCls != null) __obj.updateDynamic("arrowCls")(arrowCls.asInstanceOf[js.Any])
    if (baseParams != null) __obj.updateDynamic("baseParams")(baseParams.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction1(child))
    if (clickEvent != null) __obj.updateDynamic("clickEvent")(clickEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyMenu)) __obj.updateDynamic("destroyMenu")(destroyMenu.asInstanceOf[js.Any])
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction1(disable))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1(down))
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction1(enable))
    if (!js.isUndefined(enableToggle)) __obj.updateDynamic("enableToggle")(enableToggle.asInstanceOf[js.Any])
    if (focusCls != null) __obj.updateDynamic("focusCls")(focusCls.asInstanceOf[js.Any])
    if (getTemplateArgs != null) __obj.updateDynamic("getTemplateArgs")(js.Any.fromFunction0(getTemplateArgs))
    if (getText != null) __obj.updateDynamic("getText")(js.Any.fromFunction0(getText))
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (!js.isUndefined(handleMouseEvents)) __obj.updateDynamic("handleMouseEvents")(handleMouseEvents.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (hasVisibleMenu != null) __obj.updateDynamic("hasVisibleMenu")(js.Any.fromFunction0(hasVisibleMenu))
    if (hideMenu != null) __obj.updateDynamic("hideMenu")(js.Any.fromFunction0(hideMenu))
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefTarget != null) __obj.updateDynamic("hrefTarget")(hrefTarget.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconAlign != null) __obj.updateDynamic("iconAlign")(iconAlign.asInstanceOf[js.Any])
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls.asInstanceOf[js.Any])
    if (!js.isUndefined(isAction)) __obj.updateDynamic("isAction")(isAction.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuActiveCls != null) __obj.updateDynamic("menuActiveCls")(menuActiveCls.asInstanceOf[js.Any])
    if (menuAlign != null) __obj.updateDynamic("menuAlign")(menuAlign.asInstanceOf[js.Any])
    if (overflowText != null) __obj.updateDynamic("overflowText")(overflowText.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(pressed)) __obj.updateDynamic("pressed")(pressed.asInstanceOf[js.Any])
    if (pressedCls != null) __obj.updateDynamic("pressedCls")(pressedCls.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1(query))
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2(queryBy))
    if (queryById != null) __obj.updateDynamic("queryById")(js.Any.fromFunction1(queryById))
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
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
    if (!js.isUndefined(showEmptyMenu)) __obj.updateDynamic("showEmptyMenu")(showEmptyMenu.asInstanceOf[js.Any])
    if (showMenu != null) __obj.updateDynamic("showMenu")(js.Any.fromFunction1(showMenu))
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction2(toggle))
    if (toggleGroup != null) __obj.updateDynamic("toggleGroup")(toggleGroup.asInstanceOf[js.Any])
    if (toggleHandler != null) __obj.updateDynamic("toggleHandler")(toggleHandler.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipType != null) __obj.updateDynamic("tooltipType")(tooltipType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButton]
  }
}

