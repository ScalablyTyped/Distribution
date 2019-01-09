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

