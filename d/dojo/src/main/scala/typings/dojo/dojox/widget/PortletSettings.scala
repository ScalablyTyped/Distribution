package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dijit.layout.ContentPane
import typings.dojo.dojoStrings.portletIconClass
import typings.dojo.dojoStrings.portletIconHoverClass
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/PortletSettings.html
  *
  * A settings widget to be used with a dojox.widget.Portlet.
  * This widget should be placed inside a dojox.widget.Portlet widget.
  * It is used to set some preferences for that Portlet.    It is essentially
  * a ContentPane, and should contain other widgets and DOM nodes that
  * do the real work of setting preferences for the portlet.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.widget.PortletSettings")
@js.native
class PortletSettings () extends ContentPane {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The CSS class to apply to the icon in the Portlet title bar that is used
    * to toggle the visibility of this widget.
    *
    */
  var portletIconClass: String = js.native
  /**
    * The CSS class to apply to the icon in the Portlet title bar that is used
    * to toggle the visibility of this widget when the mouse hovers over it.
    *
    */
  var portletIconHoverClass: String = js.native
  @JSName("get")
  def get_portletIconClass(property: portletIconClass): String = js.native
  @JSName("get")
  def get_portletIconHoverClass(property: portletIconHoverClass): String = js.native
  @JSName("set")
  def set_portletIconClass(property: portletIconClass, value: String): Unit = js.native
  @JSName("set")
  def set_portletIconHoverClass(property: portletIconHoverClass, value: String): Unit = js.native
  /**
    * Toggles the visibility of this widget.
    *
    */
  def toggle(): Unit = js.native
  @JSName("watch")
  def watch_portletIconClass(property: portletIconClass, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_portletIconHoverClass(property: portletIconHoverClass, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

