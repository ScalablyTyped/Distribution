package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.defaultType
import typings.dojo.dojoStrings.duration
import typings.dojo.dojoStrings.messageTopic
import typings.dojo.dojoStrings.messageTypes
import typings.dojo.dojoStrings.positionDirection
import typings.dojo.dojoStrings.positionDirectionTypes
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.separator
import typings.dojo.dojoStrings.slideDuration
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.Event
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Toaster.html
  *
  * Message that slides in from the corner of the screen, used for notifications
  * like "new email".
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.widget.Toaster")
@js.native
class Toaster () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * If message type isn't specified (see "messageTopic" parameter),
    * then display message as this type.
    * Possible values in messageTypes enumeration ("message", "warning", "error", "fatal")
    *
    */
  var defaultType: String = js.native
  /**
    * Number of milliseconds to show message
    *
    */
  var duration: Double = js.native
  /**
    * Name of topic; anything published to this topic will be displayed as a message.
    * Message format is either String or an object like
    * {message: "hello word", type: "error", duration: 500}
    *
    */
  var messageTopic: String = js.native
  /**
    * Possible message types.
    *
    */
  var messageTypes: js.Object = js.native
  /**
    * Position from which message slides into screen, one of
    * ["br-up", "br-left", "bl-up", "bl-right", "tr-down", "tr-left", "tl-down", "tl-right"]
    *
    */
  var positionDirection: String = js.native
  /**
    * Possible values for positionDirection parameter
    *
    */
  var positionDirectionTypes: js.Array[_] = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * String used to separate messages if consecutive calls are made to setContent before previous messages go away
    *
    */
  var separator: String = js.native
  /**
    * Number of milliseconds for the slide animation, increasing will cause the Toaster
    * to slide in more slowly.
    *
    */
  var slideDuration: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Toaster: String = js.native
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
  def get_defaultType(property: defaultType): String = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  @JSName("get")
  def get_messageTopic(property: messageTopic): String = js.native
  @JSName("get")
  def get_messageTypes(property: messageTypes): js.Object = js.native
  @JSName("get")
  def get_positionDirection(property: positionDirection): String = js.native
  @JSName("get")
  def get_positionDirectionTypes(property: positionDirectionTypes): js.Array[_] = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_separator(property: separator): String = js.native
  @JSName("get")
  def get_slideDuration(property: slideDuration): Double = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    * hide the Toaster
    *
    */
  def hide(): Unit = js.native
  /**
    *
    */
  @JSName("isValid")
  def isValid_MToaster(): Unit = js.native
  /**
    * callback for when user clicks the message
    *
    * @param e
    */
  def onSelect(e: Event): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * sets and displays the given message and show duration
    *
    * @param message the message. If this is a function, it will be called with this toaster widget as the only argument.
    * @param messageType type of message; possible values in messageTypes enumeration ("message", "warning", "error", "fatal")
    * @param duration               Optionalduration in milliseconds to display message before removing it. Widget has default value.
    */
  def setContent(message: String, messageType: String, duration: Double): Unit = js.native
  /**
    * sets and displays the given message and show duration
    *
    * @param message the message. If this is a function, it will be called with this toaster widget as the only argument.
    * @param messageType type of message; possible values in messageTypes enumeration ("message", "warning", "error", "fatal")
    * @param duration               Optionalduration in milliseconds to display message before removing it. Widget has default value.
    */
  def setContent(message: js.Function, messageType: String, duration: Double): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_defaultType(property: defaultType, value: String): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("set")
  def set_messageTopic(property: messageTopic, value: String): Unit = js.native
  @JSName("set")
  def set_messageTypes(property: messageTypes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_positionDirection(property: positionDirection, value: String): Unit = js.native
  @JSName("set")
  def set_positionDirectionTypes(property: positionDirectionTypes, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_separator(property: separator, value: String): Unit = js.native
  @JSName("set")
  def set_slideDuration(property: slideDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  /**
    * '
    * show the Toaster
    *
    */
  def show(): Unit = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_defaultType(
    property: defaultType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_duration(
    property: duration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_messageTopic(
    property: messageTopic,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_messageTypes(
    property: messageTypes,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_positionDirection(
    property: positionDirection,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_positionDirectionTypes(
    property: positionDirectionTypes,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_separator(
    property: separator,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_slideDuration(
    property: slideDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

