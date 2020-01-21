package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.`lazy`
import typings.dojo.dojoStrings.badge
import typings.dojo.dojoStrings.badgeClass
import typings.dojo.dojoStrings.content
import typings.dojo.dojoStrings.deletable
import typings.dojo.dojoStrings.deleteIcon
import typings.dojo.dojoStrings.requires
import typings.dojo.dojoStrings.tag
import typings.dojo.dojoStrings.timeout
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/IconItem.html
  *
  * An icon item widget.
  * IconItem represents an item that has an application component
  * and its icon image. You can tap the icon to open the
  * corresponding application component. You can also use the icon
  * to move to a different view by specifying either of the moveTo,
  * href or url parameters.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.IconItem")
@js.native
class IconItem () extends ItemBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * A text to show in a badge (ex. "55").
    *
    */
  var badge: String = js.native
  /**
    * A class name of a DOM button for a badge.
    *
    */
  var badgeClass: String = js.native
  /**
    * An HTML fragment to embed as icon content.
    *
    */
  var content: String = js.native
  /**
    * If true, you can delete this IconItem by clicking on the delete
    * icon during edit mode.
    * If false, the delete icon is not displayed during edit mode so
    * that it cannot be deleted.
    *
    */
  var deletable: Boolean = js.native
  /**
    * A delete icon to display at the top-left corner of the item
    * during edit mode. The value can be either a path for an image
    * file or a class name of a DOM button.
    *
    */
  var deleteIcon: String = js.native
  /**
    * If true, the content of the widget, which includes dojo markup,
    * is instantiated lazily. That is, only when the widget is opened
    * by the user, the required modules are loaded and the content
    * widgets are instantiated.
    * This option works both in the sync and async loader mode.
    *
    */
  var `lazy`: String = js.native
  /**
    * Comma-separated required module names to be lazily loaded. This
    * property is effective only when lazy=true. All the modules
    * specified with data-dojo-type and their depending modules are
    * automatically loaded by the IconItem when it is opened.
    * However, if you need other extra modules to be loaded, use this parameter.
    * This option works both in the sync and async loader mode.
    *
    */
  var requires: String = js.native
  /**
    * A name of the HTML tag to create as domNode.
    *
    */
  var tag: String = js.native
  /**
    * Duration of highlight in seconds.
    *
    */
  var timeout: String = js.native
  /**
    * Closes the icon content.
    *
    * @param noAnimation               Optional
    */
  def close(noAnimation: Boolean): Unit = js.native
  /**
    * User-defined function to handle clicks for the close icon.
    *
    * @param e
    */
  def closeIconClicked(e: Event_): Unit = js.native
  @JSName("get")
  def get_badge(property: badge): String = js.native
  @JSName("get")
  def get_badgeClass(property: badgeClass): String = js.native
  @JSName("get")
  def get_content(property: content): String = js.native
  @JSName("get")
  def get_deletable(property: deletable): Boolean = js.native
  @JSName("get")
  def get_deleteIcon(property: deleteIcon): String = js.native
  @JSName("get")
  def get_lazy(property: `lazy`): String = js.native
  @JSName("get")
  def get_requires(property: requires): String = js.native
  @JSName("get")
  def get_tag(property: tag): String = js.native
  @JSName("get")
  def get_timeout(property: timeout): String = js.native
  /**
    * Shakes the icon 10 seconds.
    *
    * @param timeout               Optional
    */
  def highlight(timeout: Double): Unit = js.native
  /**
    * Returns true if the icon is open.
    *
    * @param e
    */
  def isOpen(e: js.Any): js.Any = js.native
  /**
    * User-defined function to handle clicks.
    *
    * @param e
    */
  def onClick(e: Event_): Unit = js.native
  /**
    * Stub method to allow the application to connect.
    *
    */
  def onClose(): Unit = js.native
  /**
    * Stub method to allow the application to connect.
    *
    */
  def onOpen(): Unit = js.native
  /**
    * Opens the icon content, or makes a transition.
    *
    * @param e
    */
  def open(e: js.Any): Unit = js.native
  /**
    * Scrolls until the given node is in the view.
    *
    * @param node
    */
  def scrollIntoView(node: HTMLElement): Unit = js.native
  @JSName("set")
  def set_badge(property: badge, value: String): Unit = js.native
  @JSName("set")
  def set_badgeClass(property: badgeClass, value: String): Unit = js.native
  @JSName("set")
  def set_content(property: content, value: String): Unit = js.native
  @JSName("set")
  def set_deletable(property: deletable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_deleteIcon(property: deleteIcon, value: String): Unit = js.native
  @JSName("set")
  def set_lazy(property: `lazy`, value: String): Unit = js.native
  @JSName("set")
  def set_requires(property: requires, value: String): Unit = js.native
  @JSName("set")
  def set_tag(property: tag, value: String): Unit = js.native
  @JSName("set")
  def set_timeout(property: timeout, value: String): Unit = js.native
  /**
    * Stops shaking the icon.
    *
    */
  def unhighlight(): Unit = js.native
  @JSName("watch")
  def watch_badge(
    property: badge,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_badgeClass(
    property: badgeClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_content(
    property: content,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_deletable(
    property: deletable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_deleteIcon(
    property: deleteIcon,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_lazy(
    property: `lazy`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_requires(
    property: requires,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tag(
    property: tag,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_timeout(
    property: timeout,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

