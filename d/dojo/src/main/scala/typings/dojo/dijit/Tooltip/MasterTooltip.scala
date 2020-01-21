package typings.dojo.dijit.Tooltip

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.Widget
import typings.dojo.dijit.place.Rectangle
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.duration
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
- typings.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dijit.Tooltip._MasterTooltip")
@js.native
class MasterTooltip () extends Widget {
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
  var style_MasterTooltip: String = js.native
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
    aroundNode: Rectangle,
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
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_duration(
    property: duration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

