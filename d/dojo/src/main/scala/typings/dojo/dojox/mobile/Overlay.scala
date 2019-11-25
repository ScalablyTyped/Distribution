package typings.dojo.dojox.mobile

import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.style
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Overlay.html
  *
  * A non-templated widget that animates up from the bottom,
  * overlaying the current content.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.Overlay")
@js.native
class Overlay () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Overlay: String = js.native
  /**
    * Scroll the overlay down and then make it invisible
    *
    */
  def hide(): Unit = js.native
  def onBlur(e: Event): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  /**
    * Scroll the overlay up into view
    *
    * @param aroundNode               Optional
    */
  def show(aroundNode: HTMLElement): js.Any = js.native
}

