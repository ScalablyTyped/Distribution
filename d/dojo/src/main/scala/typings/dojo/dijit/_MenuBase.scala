package typings.dojo.dijit

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dojo.keys
import typings.dojo.dojoStrings.activated
import typings.dojo.dojoStrings.active
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.autoFocus
import typings.dojo.dojoStrings.cssStateNodes
import typings.dojo.dojoStrings.focusedChild
import typings.dojo.dojoStrings.hovering
import typings.dojo.dojoStrings.multiCharSearchDuration
import typings.dojo.dojoStrings.parentMenu
import typings.dojo.dojoStrings.passivePopupDelay
import typings.dojo.dojoStrings.popupDelay
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.selected
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.Event
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_MenuBase.html
  *
  * Abstract base class for Menu and MenuBar.
  * Subclass should implement _onUpArrow(), _onDownArrow(), _onLeftArrow(), and _onRightArrow().
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._FocusMixin because Already inherited
- typings.dojo.dijit._Container because Inheritance from two classes. Inlined 
- typings.dojo.dijit._KeyNavMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering
- typings.dojo.dijit._KeyNavContainer because Inheritance from two classes. Inlined focusedChild, multiCharSearchDuration, tabIndex, addChild, addChild, childSelector, connectKeyNavHandlers, focus, focusChild, focusFirstChild, focusLastChild, focusNext, focusPrev, getIndexOfChild, hasChildren, postCreate, removeChild, removeChild, startup, startupKeyNavChildren, onKeyboardSearch
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dijit._MenuBase")
@js.native
class _MenuBase () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * This Menu has been clicked (mouse or via space/arrow key) or opened as a submenu,
    * so mere mouseover will open submenus.  Focusing a menu via TAB does NOT automatically make it active
    * since TAB is a navigation operation and not a selection one.
    * For Windows apps, pressing the ALT key focuses the menubar menus (similar to TAB navigation) but the
    * menu is not active (ie no dropdown) until an item is clicked.
    * 
    */
  var activated: Boolean = js.native
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    * 
    */
  var active: Boolean = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    * 
    */
  var attachScope: js.Object = js.native
  /**
    * A toggle to control whether or not a Menu gets focused when opened as a drop down from a MenuBar
    * or DropDownButton/ComboButton.   Note though that it always get focused when opened via the keyboard.
    * 
    */
  var autoFocus: Boolean = js.native
  /**
    * Subclasses may define a cssStateNodes property that lists sub-nodes within the widget that
    * need CSS classes applied on mouse hover/press and focus.
    * 
    * Each entry in this optional hash is a an attach-point name (like "upArrowButton") mapped to a CSS class name
    * (like "dijitUpArrowButton"). Example:
    * 
    * {
    *     "upArrowButton": "dijitUpArrowButton",
    *     "downArrowButton": "dijitDownArrowButton"
    * }
    * The above will set the CSS class dijitUpArrowButton to the this.upArrowButton DOMNode when it
    * 
    * is hovered, etc.
    * 
    */
  var cssStateNodes: js.Object = js.native
  /**
    * The currently focused child widget, or null if there isn't one
    * 
    */
  var focusedChild: js.Object = js.native
  /**
    * True if cursor is over this widget
    * 
    */
  var hovering: Boolean = js.native
  /**
    * If multiple characters are typed where each keystroke happens within
    * multiCharSearchDuration of the previous keystroke,
    * search for nodes matching all the keystrokes.
    * 
    * For example, typing "ab" will search for entries starting with
    * "ab" unless the delay between "a" and "b" is greater than multiCharSearchDuration.
    * 
    */
  var multiCharSearchDuration: Double = js.native
  /**
    * pointer to menu that displayed me
    * 
    */
  var parentMenu: js.Object = js.native
  /**
    * For a passive (unclicked) Menu, number of milliseconds before hovering (without clicking) will cause
    * the popup to open.  Default is Infinity, meaning you need to click the menu to open it.
    * 
    */
  var passivePopupDelay: Double = js.native
  /**
    * After a menu has been activated (by clicking on it etc.), number of milliseconds before hovering
    * (without clicking) another MenuItem causes that MenuItem's popup to automatically open.
    * 
    */
  var popupDelay: Double = js.native
  /**
    * 
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Currently selected (a.k.a. highlighted) MenuItem, or null if no MenuItem is selected.
    * If a submenu is open, will be set to MenuItem that displayed the submenu.   OTOH, if
    * this Menu is in passive mode (i.e. hasn't been clicked yet), will be null, because
    * "selected" is not merely "hovered".
    * 
    */
  var selected: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style__MenuBase: String = js.native
  /**
    * Tab index of the container; same as HTML tabIndex attribute.
    * Note then when user tabs into the container, focus is immediately
    * moved to the first item in the container.
    * 
    */
  var tabIndex: String = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    * 
    */
  var templatePath: String = js.native
  /**
    * A string that represents the widget template.
    * Use in conjunction with dojo.cache() to load from a file.
    * 
    */
  var templateString: String = js.native
  /**
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: _WidgetBase): Unit = js.native
  def addChild(widget: _WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * Selector (passed to on.selector()) used to identify MenuItem child widgets, but exclude inert children
    * like MenuSeparator.  If subclass overrides to a string (ex: "> *"), the subclass must require dojo/query.
    * 
    * @param node             
    */
  /**
    * 
    * @param node             
    */
  def childSelector(node: HTMLElement): js.Any = js.native
  /**
    * Deprecated.  You can call this in postCreate() to attach the keyboard handlers to the container,
    * but the preferred method is to override _onLeftArrow() and _onRightArrow(), or
    * _onUpArrow() and _onDownArrow(), to call focusPrev() and focusNext().
    * 
    * @param prevKeyCodes Key codes for navigating to the previous child.             
    * @param nextKeyCodes Key codes for navigating to the next child.             
    */
  def connectKeyNavHandlers(prevKeyCodes: keys, nextKeyCodes: keys): Unit = js.native
  /**
    * Default focus() implementation: focus the first child.
    * 
    */
  def focus(): Unit = js.native
  /**
    * Focus specified child widget.
    * 
    * @param widget Reference to container's child widget             
    * @param last If true and if widget has multiple focusable nodes, focus thelast one instead of the first one             
    */
  def focusChild(widget: _WidgetBase, last: Boolean): Unit = js.native
  /**
    * Focus the first focusable child in the container.
    * 
    */
  def focusFirstChild(): Unit = js.native
  /**
    * Focus the last focusable child in the container.
    * 
    */
  def focusLastChild(): Unit = js.native
  /**
    * Focus the next widget
    * 
    */
  def focusNext(): Unit = js.native
  /**
    * Focus the last focusable node in the previous widget
    * (ex: go to the ComboButton icon section rather than button section)
    * 
    */
  def focusPrev(): Unit = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    * 
    * @param templateString The template             
    * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
    * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
    */
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: _WidgetBase): js.Any = js.native
  @JSName("get")
  def get_activated(property: activated): Boolean = js.native
  @JSName("get")
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_autoFocus(property: autoFocus): Boolean = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_focusedChild(property: focusedChild): js.Object = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_multiCharSearchDuration(property: multiCharSearchDuration): Double = js.native
  @JSName("get")
  def get_parentMenu(property: parentMenu): js.Object = js.native
  @JSName("get")
  def get_passivePopupDelay(property: passivePopupDelay): Double = js.native
  @JSName("get")
  def get_popupDelay(property: popupDelay): Double = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_selected(property: selected): js.Object = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  def hasChildren(): Boolean = js.native
  /**
    * Attach point for notification about when the user cancels the current menu
    * This is an internal mechanism used for Menus to signal to their parent to
    * close them.  In general developers should not attach to or override this method.
    * 
    * @param closeAll             
    */
  def onCancel(closeAll: Boolean): Unit = js.native
  /**
    * Attach point for notification about when a menu item has been executed.
    * This is an internal mechanism used for Menus to signal to their parent to
    * close them, because they are about to execute the onClick handler.  In
    * general developers should not attach to or override this method.
    * 
    */
  def onExecute(): Unit = js.native
  /**
    * Called when cursor is over a MenuItem.
    * 
    * @param item             
    */
  def onItemHover(item: MenuItem): Unit = js.native
  /**
    * Callback fires when mouse exits a MenuItem
    * 
    * @param item             
    */
  def onItemUnhover(item: MenuItem): Unit = js.native
  /**
    * Attach point for notification about when a menu item has been searched for
    * via the keyboard search mechanism.
    * 
    * @param item             
    * @param evt             
    * @param searchString             
    * @param numMatches             
    */
  def onKeyboardSearch(item: MenuItem, evt: Event, searchString: String, numMatches: Double): Unit = js.native
  /**
    * When a key is pressed that matches a child item,
    * this method is called so that a widget can take appropriate action is necessary.
    * 
    * @param item             
    * @param evt             
    * @param searchString             
    * @param numMatches             
    */
  def onKeyboardSearch(item: _WidgetBase, evt: Event, searchString: String, numMatches: Double): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    * 
    */
  def own(args: js.Any*): js.Array[_] = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: Double): Unit = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: _WidgetBase): Unit = js.native
  @JSName("set")
  def set_activated(property: activated, value: Boolean): Unit = js.native
  @JSName("set")
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_autoFocus(property: autoFocus, value: Boolean): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_focusedChild(property: focusedChild, value: js.Object): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_multiCharSearchDuration(property: multiCharSearchDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_parentMenu(property: parentMenu, value: js.Object): Unit = js.native
  @JSName("set")
  def set_passivePopupDelay(property: passivePopupDelay, value: Double): Unit = js.native
  @JSName("set")
  def set_popupDelay(property: popupDelay, value: Double): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selected(property: selected, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  /**
    * 
    */
  def startupKeyNavChildren(): Unit = js.native
  @JSName("watch")
  def watch_activated(property: activated, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_active(property: active, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_autoFocus(property: autoFocus, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cssStateNodes(property: cssStateNodes, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_focusedChild(property: focusedChild, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hovering(property: hovering, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_multiCharSearchDuration(property: multiCharSearchDuration, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_parentMenu(property: parentMenu, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_passivePopupDelay(property: passivePopupDelay, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_popupDelay(property: popupDelay, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selected(property: selected, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tabIndex(property: tabIndex, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

