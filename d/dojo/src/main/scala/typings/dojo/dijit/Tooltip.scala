package typings.dojo.dijit

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit.place.__Rectangle
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.connectId
import typings.dojo.dojoStrings.defaultPosition
import typings.dojo.dojoStrings.duration
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.position
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.selector
import typings.dojo.dojoStrings.showDelay
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Tooltip.html
  *
  * Pops up a tooltip (a help message) when you hover over a node.
  * Also provides static show() and hide() methods that can be used without instantiating a dijit/Tooltip.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.Tooltip")
@js.native
class Tooltip () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Id of domNode(s) to attach the tooltip to.
    * When user hovers over specified dom node(s), the tooltip will appear.
    * 
    */
  var connectId: String = js.native
  /**
    * This variable controls the position of tooltips, if the position is not specified to
    * the Tooltip widget or *TextBox widget itself.  It's an array of strings with the values
    * possible for dijit/place.around().   The recommended values are:
    * 
    * before-centered: centers tooltip to the left of the anchor node/widget, or to the right
    * in the case of RTL scripts like Hebrew and Arabic
    * after-centered: centers tooltip to the right of the anchor node/widget, or to the left
    * in the case of RTL scripts like Hebrew and Arabic
    * above-centered: tooltip is centered above anchor node
    * below-centered: tooltip is centered above anchor node
    * The list is positions is tried, in order, until a position is found where the tooltip fits
    * within the viewport.
    * 
    * Be careful setting this parameter.  A value of "above-centered" may work fine until the user scrolls
    * the screen so that there's no room above the target node.   Nodes with drop downs, like
    * DropDownButton or FilteringSelect, are especially problematic, in that you need to be sure
    * that the drop down and tooltip don't overlap, even when the viewport is scrolled so that there
    * is only room below (or above) the target node, but not both.
    * 
    */
  var defaultPosition: js.Object = js.native
  /**
    * HTML to display in the tooltip.
    * Specified as innerHTML when creating the widget from markup.
    * 
    */
  var label: String = js.native
  /**
    * See description of dijit/Tooltip.defaultPosition for details on position parameter.
    * 
    */
  var position: js.Object = js.native
  /**
    * CSS expression to apply this Tooltip to descendants of connectIds, rather than to
    * the nodes specified by connectIds themselves.    Useful for applying a Tooltip to
    * a range of rows in a table, tree, etc.   Use in conjunction with getContent() parameter.
    * Ex: connectId: myTable, selector: "tr", getContent: function(node){ return ...; }
    * 
    * The application must require() an appropriate level of dojo/query to handle the selector.
    * 
    */
  var selector: js.Object = js.native
  /**
    * Number of milliseconds to wait after hovering over/focusing on the object, before
    * the tooltip is displayed.
    * 
    */
  var showDelay: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_Tooltip: String = js.native
  /**
    * Attach tooltip to specified node if it's not already connected
    * 
    * @param node             
    */
  def addTarget(node: String): Unit = js.native
  /**
    * Attach tooltip to specified node if it's not already connected
    * 
    * @param node             
    */
  def addTarget(node: HTMLElement): Unit = js.native
  /**
    * User overridable function that return the text to display in the tooltip.
    * 
    * @param node             
    */
  def getContent(node: HTMLElement): js.Any = js.native
  @JSName("get")
  def get_connectId(property: connectId): String = js.native
  @JSName("get")
  def get_defaultPosition(property: defaultPosition): js.Object = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_position(property: position): js.Object = js.native
  @JSName("get")
  def get_selector(property: selector): js.Object = js.native
  @JSName("get")
  def get_showDelay(property: showDelay): Double = js.native
  def onShow(target: js.Any): Unit = js.native
  def onShow(target: js.Any, position: js.Any): Unit = js.native
  /**
    * Detach tooltip from specified node
    * 
    * @param node             
    */
  def removeTarget(node: String): Unit = js.native
  /**
    * Detach tooltip from specified node
    * 
    * @param node             
    */
  def removeTarget(node: HTMLElement): Unit = js.native
  @JSName("set")
  def set_connectId(property: connectId, value: String): Unit = js.native
  @JSName("set")
  def set_defaultPosition(property: defaultPosition, value: js.Object): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_position(property: position, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selector(property: selector, value: js.Object): Unit = js.native
  @JSName("set")
  def set_showDelay(property: showDelay, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_connectId(property: connectId, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_defaultPosition(property: defaultPosition, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_label(property: label, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_position(property: position, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selector(property: selector, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_showDelay(property: showDelay, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

/* static members */
@JSGlobal("dijit.Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/Tooltip._MasterTooltip.html
    *
    * Internal widget that holds the actual tooltip markup,
    * which occurs once per page.
    * Called by Tooltip widgets which are just containers to hold
    * the markup
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class _MasterTooltip () extends _Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      * 
      */
    var attachScope: js.Object = js.native
    /**
      * Milliseconds to fade in/fade out
      * 
      */
    var duration: Double = js.native
    /**
      * 
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      * 
      */
    @JSName("style")
    var style__MasterTooltip: String = js.native
    /**
      * Path to template (HTML file) for this widget relative to dojo.baseUrl.
      * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
      * 
      */
    var templatePath: String = js.native
    /**
      * 
      */
    var templateString: String = js.native
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
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_duration(property: duration): Double = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    /**
      * Hide the tooltip
      * 
      * @param aroundNode             
      */
    def hide(aroundNode: js.Any): Unit = js.native
    /**
      * Private function to set CSS for tooltip node based on which position it's in.
      * This is called by the dijit popup code.   It will also reduce the tooltip's
      * width to whatever width is available
      * 
      * @param node             
      * @param aroundCorner             
      * @param tooltipCorner             
      * @param spaceAvailable             
      * @param aroundNodeCoords             
      */
    def orient(
      node: HTMLElement,
      aroundCorner: String,
      tooltipCorner: String,
      spaceAvailable: js.Object,
      aroundNodeCoords: js.Object
    ): js.Any = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_duration(property: duration, value: Double): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    /**
      * Display tooltip w/specified contents to right of specified node
      * (To left if there's no space on the right, or if rtl == true)
      * 
      * @param innerHTML Contents of the tooltip             
      * @param aroundNode Specifies that tooltip should be next to this node / area             
      * @param position               OptionalList of positions to try to position tooltip (ex: ["right", "above"])             
      * @param rtl               OptionalCorresponds to WidgetBase.dir attribute, where false means "ltr" and truemeans "rtl"; specifies GUI direction, not text direction.             
      * @param textDir               OptionalCorresponds to WidgetBase.textdir attribute; specifies direction of text.             
      */
    def show(
      innerHTML: String,
      aroundNode: __Rectangle,
      position: js.Array[String],
      rtl: Boolean,
      textDir: String
    ): Unit = js.native
    /**
      * Display tooltip w/specified contents to right of specified node
      * (To left if there's no space on the right, or if rtl == true)
      * 
      * @param innerHTML Contents of the tooltip             
      * @param aroundNode Specifies that tooltip should be next to this node / area             
      * @param position               OptionalList of positions to try to position tooltip (ex: ["right", "above"])             
      * @param rtl               OptionalCorresponds to WidgetBase.dir attribute, where false means "ltr" and truemeans "rtl"; specifies GUI direction, not text direction.             
      * @param textDir               OptionalCorresponds to WidgetBase.textdir attribute; specifies direction of text.             
      */
    def show(
      innerHTML: String,
      aroundNode: HTMLElement,
      position: js.Array[String],
      rtl: Boolean,
      textDir: String
    ): Unit = js.native
    @JSName("watch")
    def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_duration(property: duration, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
  /**
    * Static method to hide the tooltip displayed via showTooltip()
    * 
    * @param aroundNode             
    */
  def hide(aroundNode: js.Any): js.Any = js.native
  /**
    * Static method to display tooltip w/specified contents in specified position.
    * See description of dijit/Tooltip.defaultPosition for details on position parameter.
    * If position is not specified then dijit/Tooltip.defaultPosition is used.
    * 
    * @param innerHTML Contents of the tooltip             
    * @param aroundNode Specifies that tooltip should be next to this node / area             
    * @param position               OptionalList of positions to try to position tooltip (ex: ["right", "above"])             
    * @param rtl               OptionalCorresponds to WidgetBase.dir attribute, where false means "ltr" and truemeans "rtl"; specifies GUI direction, not text direction.             
    * @param textDir               OptionalCorresponds to WidgetBase.textdir attribute; specifies direction of text.             
    */
  def show(innerHTML: String, aroundNode: js.Object): js.Any = js.native
  def show(innerHTML: String, aroundNode: js.Object, position: js.Array[String]): js.Any = js.native
  def show(innerHTML: String, aroundNode: js.Object, position: js.Array[String], rtl: Boolean): js.Any = js.native
  def show(
    innerHTML: String,
    aroundNode: js.Object,
    position: js.Array[String],
    rtl: Boolean,
    textDir: String
  ): js.Any = js.native
}

