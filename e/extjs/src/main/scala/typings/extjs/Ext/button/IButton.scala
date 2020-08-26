package typings.extjs.Ext.button

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.ITemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ @js.native
trait IButton extends IComponent {
  /** [Config Option] (Boolean) */
  var allowDepress: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var arrowAlign: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var arrowCls: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.native
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
    * @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
    */
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (String) */
  var clickEvent: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var destroyMenu: js.UndefOr[Boolean] = js.native
  /** [Method] inherit docs
    * @param silent Object
    */
  @JSName("disable")
  var disable_IButton: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
    * @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
    */
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Boolean) */
  var enableToggle: js.UndefOr[Boolean] = js.native
  /** [Method] inherit docs
    * @param silent Object
    */
  @JSName("enable")
  var enable_IButton: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[String] = js.native
  /** [Method] This method returns an object which provides substitution parameters for the XTemplate used to create this Button s D
    * @returns Object Substitution data for a Template. The default implementation which provides data for the default template returns an Object containing the following properties:
    */
  var getTemplateArgs: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the text for this Button
    * @returns String The button text
    */
  var getText: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var handleMouseEvents: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  /** [Method] Returns true if the button has a menu and it is visible
    * @returns Boolean
    */
  var hasVisibleMenu: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Hides this button s menu if it has one
    * @returns Ext.button.Button this
    */
  var hideMenu: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (String) */
  var href: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var iconAlign: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var isAction: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.menu.Menu/String/Object) */
  var menu: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var menuActiveCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var menuAlign: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var overflowText: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var pressed: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[Boolean] = js.native
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
  /** [Config Option] (Boolean/Object) */
  var repeat: js.UndefOr[js.Any] = js.native
  /** [Config Option] ("small"/"medium"/"large") */
  var scale: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets this button s glyph
    * @param glyph Number/String the numeric charCode or string charCode/font-family. This parameter expects a format consistent with that of glyph
    * @returns Ext.button.Button this
    */
  var setGlyph: js.UndefOr[js.Function1[/* glyph */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Assigns this Button s click handler
    * @param handler Function The function to call when the button is clicked
    * @param scope Object The scope (this reference) in which the handler function is executed. Defaults to this Button.
    * @returns Ext.button.Button this
    */
  var setHandler: js.UndefOr[
    js.Function2[/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Method] Sets the href of the embedded anchor element to the passed URL
    * @param href String The URL to set in the anchor element.
    */
  var setHref: js.UndefOr[js.Function1[/* href */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the background image inline style of the button
    * @param icon String The path to an image to display in the button
    * @returns Ext.button.Button this
    */
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[String], this.type]] = js.native
  /** [Method] Sets the CSS class that provides a background image to use as the button s icon
    * @param cls String The CSS class providing the icon image
    * @returns Ext.button.Button this
    */
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], this.type]] = js.native
  /** [Method] Sets the href of the link dynamically according to the params passed and any baseParams configured
    * @param params Object Parameters to use in the href URL.
    */
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Method to change the scale of the button
    * @param scale String The scale to change to.
    */
  var setScale: js.UndefOr[js.Function1[/* scale */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets this Button s text
    * @param text String The button text
    * @returns Ext.button.Button this
    */
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], this.type]] = js.native
  /** [Method] Sets the text alignment for this button
    * @param align String The new alignment of the button text. See textAlign.
    */
  var setTextAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the tooltip for this Button
    * @param tooltip String/Object This may be:  String : A string to be used as innerHTML (html tags are accepted) to show in a tooltip Object : A configuration object for Ext.tip.QuickTipManager.register.
    * @returns Ext.button.Button this
    */
  var setTooltip: js.UndefOr[js.Function1[/* tooltip */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] inherit docs
    * @param ui Object
    */
  @JSName("setUI")
  var setUI_IButton: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var showEmptyMenu: js.UndefOr[Boolean] = js.native
  /** [Method] Shows this button s menu if it has one
    * @param fromEvent Object
    */
  var showMenu: js.UndefOr[js.Function1[/* fromEvent */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.native
  /** [Property] (Ext.Template) */
  var template: js.UndefOr[ITemplate] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var textAlign: js.UndefOr[String] = js.native
  /** [Method] If a state it passed it becomes the pressed state otherwise the current state is toggled
    * @param state Boolean Force a particular state
    * @param suppressEvent Boolean True to stop events being fired when calling this method.
    * @returns Ext.button.Button this
    */
  var toggle: js.UndefOr[
    js.Function2[/* state */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Config Option] (String) */
  var toggleGroup: js.UndefOr[String] = js.native
  /** [Config Option] (Function) */
  var toggleHandler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[String] = js.native
}

object IButton {
  @scala.inline
  def apply(): IButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButton]
  }
  @scala.inline
  implicit class IButtonOps[Self <: IButton] (val x: Self) extends AnyVal {
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
    def setAllowDepress(value: Boolean): Self = this.set("allowDepress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDepress: Self = this.set("allowDepress", js.undefined)
    @scala.inline
    def setArrowAlign(value: String): Self = this.set("arrowAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowAlign: Self = this.set("arrowAlign", js.undefined)
    @scala.inline
    def setArrowCls(value: String): Self = this.set("arrowCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowCls: Self = this.set("arrowCls", js.undefined)
    @scala.inline
    def setBaseParams(value: js.Any): Self = this.set("baseParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseParams: Self = this.set("baseParams", js.undefined)
    @scala.inline
    def setChild(value: js.UndefOr[js.Any] => _): Self = this.set("child", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    @scala.inline
    def setClickEvent(value: String): Self = this.set("clickEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickEvent: Self = this.set("clickEvent", js.undefined)
    @scala.inline
    def setDestroyMenu(value: Boolean): Self = this.set("destroyMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyMenu: Self = this.set("destroyMenu", js.undefined)
    @scala.inline
    def setDisable(value: /* silent */ js.UndefOr[js.Any] => Unit): Self = this.set("disable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setDown(value: js.UndefOr[js.Any] => _): Self = this.set("down", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setEnable(value: /* silent */ js.UndefOr[js.Any] => Unit): Self = this.set("enable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setEnableToggle(value: Boolean): Self = this.set("enableToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableToggle: Self = this.set("enableToggle", js.undefined)
    @scala.inline
    def setFocusCls(value: String): Self = this.set("focusCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusCls: Self = this.set("focusCls", js.undefined)
    @scala.inline
    def setGetTemplateArgs(value: () => _): Self = this.set("getTemplateArgs", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTemplateArgs: Self = this.set("getTemplateArgs", js.undefined)
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetText: Self = this.set("getText", js.undefined)
    @scala.inline
    def setGlyph(value: js.Any): Self = this.set("glyph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyph: Self = this.set("glyph", js.undefined)
    @scala.inline
    def setHandleMouseEvents(value: Boolean): Self = this.set("handleMouseEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleMouseEvents: Self = this.set("handleMouseEvents", js.undefined)
    @scala.inline
    def setHandler(value: js.Any): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setHasVisibleMenu(value: () => Boolean): Self = this.set("hasVisibleMenu", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasVisibleMenu: Self = this.set("hasVisibleMenu", js.undefined)
    @scala.inline
    def setHideMenu(value: () => IButton): Self = this.set("hideMenu", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHideMenu: Self = this.set("hideMenu", js.undefined)
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
    def setIconAlign(value: String): Self = this.set("iconAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconAlign: Self = this.set("iconAlign", js.undefined)
    @scala.inline
    def setIconCls(value: String): Self = this.set("iconCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconCls: Self = this.set("iconCls", js.undefined)
    @scala.inline
    def setIsAction(value: Boolean): Self = this.set("isAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAction: Self = this.set("isAction", js.undefined)
    @scala.inline
    def setMenu(value: js.Any): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setMenuActiveCls(value: String): Self = this.set("menuActiveCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuActiveCls: Self = this.set("menuActiveCls", js.undefined)
    @scala.inline
    def setMenuAlign(value: String): Self = this.set("menuAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuAlign: Self = this.set("menuAlign", js.undefined)
    @scala.inline
    def setOverflowText(value: String): Self = this.set("overflowText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowText: Self = this.set("overflowText", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPressed(value: Boolean): Self = this.set("pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressed: Self = this.set("pressed", js.undefined)
    @scala.inline
    def setPressedCls(value: String): Self = this.set("pressedCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressedCls: Self = this.set("pressedCls", js.undefined)
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
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
    def setRepeat(value: js.Any): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    @scala.inline
    def setScale(value: js.Any): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSetGlyph(value: /* glyph */ js.UndefOr[js.Any] => IButton): Self = this.set("setGlyph", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetGlyph: Self = this.set("setGlyph", js.undefined)
    @scala.inline
    def setSetHandler(value: (/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IButton): Self = this.set("setHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetHandler: Self = this.set("setHandler", js.undefined)
    @scala.inline
    def setSetHref(value: /* href */ js.UndefOr[String] => Unit): Self = this.set("setHref", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHref: Self = this.set("setHref", js.undefined)
    @scala.inline
    def setSetIcon(value: /* icon */ js.UndefOr[String] => IButton): Self = this.set("setIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIcon: Self = this.set("setIcon", js.undefined)
    @scala.inline
    def setSetIconCls(value: /* cls */ js.UndefOr[String] => IButton): Self = this.set("setIconCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIconCls: Self = this.set("setIconCls", js.undefined)
    @scala.inline
    def setSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("setParams", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetParams: Self = this.set("setParams", js.undefined)
    @scala.inline
    def setSetScale(value: /* scale */ js.UndefOr[String] => Unit): Self = this.set("setScale", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetScale: Self = this.set("setScale", js.undefined)
    @scala.inline
    def setSetText(value: /* text */ js.UndefOr[String] => IButton): Self = this.set("setText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetText: Self = this.set("setText", js.undefined)
    @scala.inline
    def setSetTextAlign(value: /* align */ js.UndefOr[String] => Unit): Self = this.set("setTextAlign", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTextAlign: Self = this.set("setTextAlign", js.undefined)
    @scala.inline
    def setSetTooltip(value: /* tooltip */ js.UndefOr[js.Any] => IButton): Self = this.set("setTooltip", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTooltip: Self = this.set("setTooltip", js.undefined)
    @scala.inline
    def setSetUI(value: /* ui */ js.UndefOr[js.Any] => Unit): Self = this.set("setUI", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUI: Self = this.set("setUI", js.undefined)
    @scala.inline
    def setShowEmptyMenu(value: Boolean): Self = this.set("showEmptyMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowEmptyMenu: Self = this.set("showEmptyMenu", js.undefined)
    @scala.inline
    def setShowMenu(value: /* fromEvent */ js.UndefOr[js.Any] => Unit): Self = this.set("showMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShowMenu: Self = this.set("showMenu", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTemplate(value: ITemplate): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setToggle(value: (/* state */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => IButton): Self = this.set("toggle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setToggleGroup(value: String): Self = this.set("toggleGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleGroup: Self = this.set("toggleGroup", js.undefined)
    @scala.inline
    def setToggleHandler(value: js.Any): Self = this.set("toggleHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleHandler: Self = this.set("toggleHandler", js.undefined)
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

