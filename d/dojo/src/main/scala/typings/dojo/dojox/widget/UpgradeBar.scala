package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.buttonCancel
import typings.dojo.dojoStrings.noRemindButton
import typings.dojo.dojoStrings.notifications
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.HTMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/UpgradeBar.html
  *
  * Shows a bar at the top of the screen when the user is to
  * be notified that they should upgrade their browser or a
  * plugin.
  * You can insert custom validations to trigger the UpgradeBar
  * to display. An evaluation of 'true' shows the bar (as this
  * version is less than it should be). Multiple validations
  * may be checked, although only the first in the list will be
  * displayed.
  * Markup and programmatic are supported. Markup is a little
  * cleaner, since a majority of the parameters are the HTML
  * snippets to be displayed. In markup, the validate code should
  * be an expression that will evaluate to true or false. This
  * expression is wrapped in a try/catch, so if it blows up, it
  * is assumed to be true and trigger the bar.
  * In programmatic, a function should be used that returns true
  * or false. You would need to use your own try/catch in that.
  *
  * @param props
  * @param node
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.widget.UpgradeBar")
@js.native
class UpgradeBar protected () extends _WidgetBase {
  def this(props: js.Any, node: js.Any) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * The HTML tip show when hovering over the close button.
    *
    */
  var buttonCancel: String = js.native
  /**
    * The text link shown that when clicked, permanently dismisses
    * the message (sets a cookie). If this string is blank, this
    * link is not displayed.
    *
    */
  var noRemindButton: String = js.native
  /**
    * An array of objects that hold the criteria for upgrades:
    *
    * message: String: The message to display in the bar. Can be HTML.
    * validate: Function: The expression to evaluate to determine if the
    *   bar should show or not. Should be a simple expression
    *   if used in HTML:
    * <div validate="!google.gears">
    * <div validate="has('ie')<8">
    *
    */
  var notifications: js.Array[_] = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_UpgradeBar: String = js.native
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
  def get_buttonCancel(property: buttonCancel): String = js.native
  @JSName("get")
  def get_noRemindButton(property: noRemindButton): String = js.native
  @JSName("get")
  def get_notifications(property: notifications): js.Array[_] = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    * Hides the bar. May be called externally.
    *
    */
  def hide(): Unit = js.native
  /**
    *
    */
  @JSName("isValid")
  def isValid_MUpgradeBar(): Unit = js.native
  /**
    * Triggers the bar to display. An internal function,
    * but could be called externally for fun.
    *
    * @param msg
    */
  def notify(msg: js.Any): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_buttonCancel(property: buttonCancel, value: String): Unit = js.native
  @JSName("set")
  def set_noRemindButton(property: noRemindButton, value: String): Unit = js.native
  @JSName("set")
  def set_notifications(property: notifications, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
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
  def watch_buttonCancel(
    property: buttonCancel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_noRemindButton(
    property: noRemindButton,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_notifications(
    property: notifications,
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

