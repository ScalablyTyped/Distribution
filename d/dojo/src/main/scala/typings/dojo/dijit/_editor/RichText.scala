package typings.dojo.dijit._editor

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit._Widget
import typings.dojo.dojo._base.url
import typings.dojo.dojoStrings.active
import typings.dojo.dojoStrings.captureEvents
import typings.dojo.dojoStrings.cssStateNodes
import typings.dojo.dojoStrings.disableSpellCheck
import typings.dojo.dojoStrings.disabled
import typings.dojo.dojoStrings.focusOnLoad
import typings.dojo.dojoStrings.height
import typings.dojo.dojoStrings.hovering
import typings.dojo.dojoStrings.inheritWidth
import typings.dojo.dojoStrings.isClosed
import typings.dojo.dojoStrings.isLoaded
import typings.dojo.dojoStrings.isTabIndent
import typings.dojo.dojoStrings.minHeight
import typings.dojo.dojoStrings.name
import typings.dojo.dojoStrings.onLoadDeferred
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.styleSheets
import typings.dojo.dojoStrings.updateInterval
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/RichText.html
  *
  * dijit/_editor/RichText is the core of dijit.Editor, which provides basic
  * WYSIWYG editing features.
  * dijit/_editor/RichText is the core of dijit.Editor, which provides basic
  * WYSIWYG editing features. It also encapsulates the differences
  * of different js engines for various browsers.  Do not use this widget
  * with an HTML <TEXTAREA> tag, since the browser unescapes XML escape characters,
  * like <.  This can have unexpected behavior and lead to security issues
  * such as scripting attacks.
  * 
  * @param params Initial settings for any of the widget attributes, except readonly attributes.     
  * @param srcNodeRef The widget replaces the specified DOMNode.     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering */ @JSGlobal("dijit._editor.RichText")
@js.native
class RichText protected () extends _Widget {
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    * 
    */
  var active: Boolean = js.native
  /**
    * Events which should be connected to the underlying editing
    * area, events in this array will be addListener with
    * capture=true.
    * 
    */
  var captureEvents: js.Object = js.native
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
    * When true, disables the browser's native spell checking, if supported.
    * Works only in Firefox.
    * 
    */
  var disableSpellCheck: Boolean = js.native
  /**
    * The editor is disabled; the text cannot be changed.
    * 
    */
  var disabled: Boolean = js.native
  /**
    * Focus into this widget when the page is loaded
    * 
    */
  var focusOnLoad: Boolean = js.native
  /**
    * Set height to fix the editor at a specific height, with scrolling.
    * By default, this is 300px.  If you want to have the editor always
    * resizes to accommodate the content, use AlwaysShowToolbar plugin
    * and set height="".  If this editor is used within a layout widget,
    * set height="100%".
    * 
    */
  var height: String = js.native
  /**
    * True if cursor is over this widget
    * 
    */
  var hovering: Boolean = js.native
  /**
    * whether to inherit the parent's width or simply use 100%
    * 
    */
  var inheritWidth: Boolean = js.native
  /**
    * 
    */
  var isClosed: Boolean = js.native
  /**
    * 
    */
  var isLoaded: Boolean = js.native
  /**
    * Make tab key and shift-tab indent and outdent rather than navigating.
    * Caution: sing this makes web pages inaccessible to users unable to use a mouse.
    * 
    */
  var isTabIndent: Boolean = js.native
  /**
    * The minimum height that the editor should have.
    * 
    */
  var minHeight: String = js.native
  /**
    * Specifies the name of a (hidden) <textarea> node on the page that's used to save
    * the editor content on page leave.   Used to restore editor contents after navigating
    * to a new page and then hitting the back button.
    * 
    */
  var name: js.Object = js.native
  /**
    * Deferred which is fired when the editor finishes loading.
    * Call myEditor.onLoadDeferred.then(callback) it to be informed
    * when the rich-text area initialization is finalized.
    * 
    */
  var onLoadDeferred: js.Object = js.native
  /**
    * semicolon (";") separated list of css files for the editing area
    * 
    */
  var styleSheets: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_RichText: String = js.native
  /**
    * 
    */
  var updateInterval: Double = js.native
  /**
    * Add a handler for a keyboard shortcut
    * 
    * @param key             
    * @param ctrl             
    * @param shift             
    * @param handler             
    */
  def addKeyHandler(key: String, ctrl: Boolean, shift: Boolean, handler: js.Function): Unit = js.native
  /**
    * Add a handler for a keyboard shortcut
    * 
    * @param key             
    * @param ctrl             
    * @param shift             
    * @param handler             
    */
  def addKeyHandler(key: Double, ctrl: Boolean, shift: Boolean, handler: js.Function): Unit = js.native
  /**
    * add an external stylesheet for the editing area
    * 
    * @param uri Url of the external css file             
    */
  def addStyleSheet(uri: url): Unit = js.native
  /**
    * Remove focus from this instance.
    * 
    */
  def blur(): Unit = js.native
  /**
    * Executes a command in the Rich Text area
    * 
    * @param command The command to execute             
    * @param argument An optional argument to the command             
    */
  def execCommand(command: String, argument: js.Any): js.Any = js.native
  /**
    * Move focus to this editor
    * 
    */
  def focus(): Unit = js.native
  /**
    * A function for obtaining the height of the footer node
    * 
    */
  def getFooterHeight(): js.Any = js.native
  /**
    * A function for obtaining the height of the header node
    * 
    */
  def getHeaderHeight(): js.Any = js.native
  /**
    * Deprecated.   Use dijit/_editor/html::getChildrenHtml() instead.
    * 
    * @param dom             
    */
  def getNodeChildrenHtml(dom: HTMLElement): js.Any = js.native
  /**
    * Deprecated.   Use dijit/_editor/html::_getNodeHtml() instead.
    * 
    * @param node             
    */
  def getNodeHtml(node: HTMLElement): js.Any = js.native
  @JSName("get")
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_captureEvents(property: captureEvents): js.Object = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_disableSpellCheck(property: disableSpellCheck): Boolean = js.native
  @JSName("get")
  def get_disabled(property: disabled): Boolean = js.native
  @JSName("get")
  def get_focusOnLoad(property: focusOnLoad): Boolean = js.native
  @JSName("get")
  def get_height(property: height): String = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_inheritWidth(property: inheritWidth): Boolean = js.native
  @JSName("get")
  def get_isClosed(property: isClosed): Boolean = js.native
  @JSName("get")
  def get_isLoaded(property: isLoaded): Boolean = js.native
  @JSName("get")
  def get_isTabIndent(property: isTabIndent): Boolean = js.native
  @JSName("get")
  def get_minHeight(property: minHeight): String = js.native
  @JSName("get")
  def get_name(property: name): js.Object = js.native
  @JSName("get")
  def get_onLoadDeferred(property: onLoadDeferred): js.Object = js.native
  @JSName("get")
  def get_styleSheets(property: styleSheets): String = js.native
  @JSName("get")
  def get_updateInterval(property: updateInterval): Double = js.native
  /**
    * This is fired if and only if the editor loses focus and
    * the content is changed.
    * 
    * @param newContent             
    */
  def onChange(newContent: js.Any): Unit = js.native
  /**
    * Handler for keydown event
    * 
    * @param e             
    */
  def onKeyDown(e: Event): Boolean = js.native
  /**
    * Handler after the iframe finishes loading.
    * 
    * @param html Editor contents should be set to this value             
    */
  def onLoad(html: String): Unit = js.native
  /**
    * Check whether a command is enabled or not.
    * 
    * @param command The command to execute             
    */
  def queryCommandEnabled(command: String): js.Any = js.native
  /**
    * Check the state of a given command and returns true or false.
    * 
    * @param command             
    */
  def queryCommandState(command: js.Any): js.Any = js.native
  /**
    * Check the value of a given command. This matters most for
    * custom selections and complex values like font value setting.
    * 
    * @param command             
    */
  def queryCommandValue(command: js.Any): js.Any = js.native
  /**
    * remove an external stylesheet for the editing area
    * 
    * @param uri             
    */
  def removeStyleSheet(uri: url): Unit = js.native
  /**
    * This function set the content while trying to maintain the undo stack
    * (now only works fine with Moz, this is identical to setValue in all
    * other browsers)
    * 
    * @param html             
    */
  def replaceValue(html: String): Unit = js.native
  /**
    * Deprecated, use set('disabled', ...) instead.
    * 
    * @param disabled             
    */
  def setDisabled(disabled: Boolean): Unit = js.native
  /**
    * This function sets the content. No undo history is preserved.
    * Users should use set('value', ...) instead.
    * 
    * @param html             
    */
  def setValue(html: String): Unit = js.native
  @JSName("set")
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_captureEvents(property: captureEvents, value: js.Object): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_disableSpellCheck(property: disableSpellCheck, value: Boolean): Unit = js.native
  @JSName("set")
  def set_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_focusOnLoad(property: focusOnLoad, value: Boolean): Unit = js.native
  @JSName("set")
  def set_height(property: height, value: String): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_inheritWidth(property: inheritWidth, value: Boolean): Unit = js.native
  @JSName("set")
  def set_isClosed(property: isClosed, value: Boolean): Unit = js.native
  @JSName("set")
  def set_isLoaded(property: isLoaded, value: Boolean): Unit = js.native
  @JSName("set")
  def set_isTabIndent(property: isTabIndent, value: Boolean): Unit = js.native
  @JSName("set")
  def set_minHeight(property: minHeight, value: String): Unit = js.native
  @JSName("set")
  def set_name(property: name, value: js.Object): Unit = js.native
  @JSName("set")
  def set_onLoadDeferred(property: onLoadDeferred, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_styleSheets(property: styleSheets, value: String): Unit = js.native
  @JSName("set")
  def set_updateInterval(property: updateInterval, value: Double): Unit = js.native
  /**
    * Add some default key handlers
    * Overwrite this to setup your own handlers. The default
    * implementation does not use Editor commands, but directly
    * executes the builtin commands within the underlying browser
    * support.
    * 
    */
  def setupDefaultShortcuts(): Unit = js.native
  @JSName("watch")
  def watch_active(property: active, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_captureEvents(property: captureEvents, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cssStateNodes(property: cssStateNodes, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_disableSpellCheck(property: disableSpellCheck, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_disabled(property: disabled, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_focusOnLoad(property: focusOnLoad, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_height(property: height, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hovering(property: hovering, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_inheritWidth(property: inheritWidth, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isClosed(property: isClosed, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isLoaded(property: isLoaded, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isTabIndent(property: isTabIndent, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minHeight(property: minHeight, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_name(property: name, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_onLoadDeferred(property: onLoadDeferred, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_styleSheets(property: styleSheets, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_updateInterval(property: updateInterval, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
}

