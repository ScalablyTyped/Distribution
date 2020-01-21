package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.closeOnAction
import typings.dojo.dojoStrings.selColor
import typings.dojo.dojoStrings.tag
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/IconMenuItem.html
  *
  * An item of IconMenu.
  * IconMenuItem represents a menu item of dojox/mobile/MenuItem.
  * This widget inherits from dojox/mobile/_ItemBase. Its basic usage is
  * similar to other subclasses such as dojox/mobile/ListItem.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.IconMenuItem")
@js.native
class IconMenuItem () extends ItemBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * If true, the internal handler of click events calls the hide() method
    * of the parent widget, which is typically a dojox/mobile/SimpleDialog.
    * The default value is false.
    *
    */
  var closeOnAction: Boolean = js.native
  /**
    *
    */
  var selColor: String = js.native
  /**
    * The name of the HTML tag to create as domNode.
    *
    */
  var tag: String = js.native
  @JSName("get")
  def get_closeOnAction(property: closeOnAction): Boolean = js.native
  @JSName("get")
  def get_selColor(property: selColor): String = js.native
  @JSName("get")
  def get_tag(property: tag): String = js.native
  /**
    * User-defined function to handle clicks.
    *
    * @param e
    */
  def onClick(e: Event_): Unit = js.native
  @JSName("set")
  def set_closeOnAction(property: closeOnAction, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selColor(property: selColor, value: String): Unit = js.native
  @JSName("set")
  def set_tag(property: tag, value: String): Unit = js.native
  @JSName("watch")
  def watch_closeOnAction(
    property: closeOnAction,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_selColor(
    property: selColor,
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
}

