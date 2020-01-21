package typings.dojo.dojox.widget

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.Widget
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.centerIndicator
import typings.dojo.dojoStrings.color
import typings.dojo.dojoStrings.duration
import typings.dojo.dojoStrings.image
import typings.dojo.dojoStrings.imageText
import typings.dojo.dojoStrings.opacity
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.target
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.text
import typings.dojo.dojoStrings.zIndex
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Standby.html
  *
  * A widget designed to act as a Standby/Busy/Disable/Blocking widget to indicate a
  * particular DOM node is processing and cannot be clicked on at this time.
  * This widget uses absolute positioning to apply the overlay and image.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.widget.Standby")
@js.native
class Standby () extends Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Property to define if the image and its alt text should be used, or
    * a simple Text/HTML node should be used.  Allowable values are 'image'
    * and 'text'.
    * Default is 'image'.
    *
    */
  var centerIndicator: String = js.native
  /**
    * The color to set the overlay.  Should be in #XXXXXX form.
    * Default color for the translucent overlay is light gray.
    *
    */
  var color: String = js.native
  /**
    * Integer defining how long the show and hide effects should take in milliseconds.
    * Defaults to 500
    *
    */
  var duration: Double = js.native
  /**
    * A URL to an image to center within the blocking overlay.
    * The default is a basic spinner.
    *
    */
  var image: String = js.native
  /**
    * Text to set on the ALT tag of the image.
    * The default is 'Please wait...'
    *
    */
  var imageText: String = js.native
  /**
    * The opacity to make the overlay when it is displayed/faded in.
    * The default is 0.75.  This does not affect the image opacity, only the
    * overlay.
    *
    */
  var opacity: Double = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Standby: String = js.native
  /**
    * The target to overlay when active.  Can be a widget id, a
    * dom id, or a direct node reference.
    *
    */
  var target: String = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    *
    */
  var templatePath: String = js.native
  /**
    * The template string defining out the basics of the widget.  No need for an external
    * file.
    *
    */
  var templateString: String = js.native
  /**
    * Text/HTML to display in the center of the overlay
    * This is used if image center is disabled.
    * Defaults to 'Please Wait...'
    *
    */
  var text: String = js.native
  /**
    * Control that lets you specify if the zIndex for the overlay
    * should be auto-computed based off parent zIndex, or should be set
    * to a particular value.  This is useful when you want to overlay
    * things in digit.Dialogs, you can specify a base zIndex to append from.
    *
    */
  var zIndex: String = js.native
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
  def get_centerIndicator(property: centerIndicator): String = js.native
  @JSName("get")
  def get_color(property: color): String = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  @JSName("get")
  def get_image(property: image): String = js.native
  @JSName("get")
  def get_imageText(property: imageText): String = js.native
  @JSName("get")
  def get_opacity(property: opacity): Double = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_target(property: target): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_text(property: text): String = js.native
  @JSName("get")
  def get_zIndex(property: zIndex): String = js.native
  /**
    * Function to hide the blocking overlay and status icon or text.
    *
    */
  def hide(): Unit = js.native
  /**
    * Helper function so you can test if the widget is already visible or not.
    *
    */
  def isVisible(): js.Any = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_centerIndicator(property: centerIndicator, value: String): Unit = js.native
  @JSName("set")
  def set_color(property: color, value: String): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("set")
  def set_image(property: image, value: String): Unit = js.native
  @JSName("set")
  def set_imageText(property: imageText, value: String): Unit = js.native
  @JSName("set")
  def set_opacity(property: opacity, value: Double): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_target(property: target, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_text(property: text, value: String): Unit = js.native
  @JSName("set")
  def set_zIndex(property: zIndex, value: String): Unit = js.native
  /**
    * Function to display the blocking overlay and busy/status icon or text.
    *
    */
  def show(): Unit = js.native
  def startup(args: js.Any): Unit = js.native
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
  def watch_centerIndicator(
    property: centerIndicator,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_color(
    property: color,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
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
  def watch_image(
    property: image,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_imageText(
    property: imageText,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_opacity(
    property: opacity,
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
  def watch_target(
    property: target,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
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
  @JSName("watch")
  def watch_text(
    property: text,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_zIndex(
    property: zIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

