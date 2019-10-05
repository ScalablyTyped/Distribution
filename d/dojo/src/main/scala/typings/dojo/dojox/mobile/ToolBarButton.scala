package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dojoStrings.arrow
import typings.dojo.dojoStrings.defaultColor
import typings.dojo.dojoStrings.light
import typings.dojo.dojoStrings.selColor
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ToolBarButton.html
  *
  * A button widget which is placed in the Heading widget.
  * ToolBarButton is a button which is typically placed in the
  * Heading widget. It is a subclass of dojox/mobile/_ItemBase just
  * like ListItem or IconItem. So, unlike Button, it has basically
  * the same capability as ListItem or IconItem, such as icon
  * support, transition, etc.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.ToolBarButton")
@js.native
class ToolBarButton () extends _ItemBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Specifies "right" or "left" to be an arrow button.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var arrow: String = js.native
  /**
    * CSS class for the default color.
    * Note: If this button has an arrow (typically back buttons on iOS),
    * the class selector used for it is the value of defaultColor + "45".
    * For example, by default the arrow selector is "mblColorDefault45".
    *
    */
  var defaultColor: String = js.native
  /**
    * If true, this widget produces only a single <span> node when it
    * has only an icon or only a label, and has no arrow. In that
    * case, you cannot have both icon and label, or arrow even if you
    * try to set them.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var light: Boolean = js.native
  /**
    * CSS class for the selected color.
    * Note: If this button has an arrow (typically back buttons on iOS),
    * the class selector used for it is the value of selColor + "45".
    * For example, by default the selected arrow selector is "mblColorDefaultSel45".
    *
    */
  var selColor: String = js.native
  @JSName("get")
  def get_arrow(property: arrow): String = js.native
  @JSName("get")
  def get_defaultColor(property: defaultColor): String = js.native
  @JSName("get")
  def get_light(property: light): Boolean = js.native
  @JSName("get")
  def get_selColor(property: selColor): String = js.native
  /**
    * User defined function to handle clicks
    *
    * @param e
    */
  def onClick(e: Event): Unit = js.native
  @JSName("set")
  def set_arrow(property: arrow, value: String): Unit = js.native
  @JSName("set")
  def set_defaultColor(property: defaultColor, value: String): Unit = js.native
  @JSName("set")
  def set_light(property: light, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selColor(property: selColor, value: String): Unit = js.native
  @JSName("watch")
  def watch_arrow(property: arrow, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_defaultColor(property: defaultColor, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_light(property: light, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selColor(property: selColor, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

