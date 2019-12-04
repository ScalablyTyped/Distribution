package typings.dojo.dojox.mobile

import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.style
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Tooltip.html
  *
  * A non-templated popup bubble widget
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.Tooltip")
@js.native
class Tooltip () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Tooltip: String = js.native
  /**
    * Pop down the tooltip
    *
    */
  def hide(): Unit = js.native
  def onBlur(e: Event): Boolean = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  /**
    * Pop up the tooltip and point to aroundNode using the best position
    *
    * @param aroundNode
    * @param positions Ordered list of positions to try matching up.before-centered: places drop down before the aroundNodeafter-centered: places drop down after the aroundNodeabove-centered: drop down goes above aroundNodebelow-centered: drop down goes below aroundNode
    */
  def show(aroundNode: HTMLElement, positions: js.Array[_]): js.Any = js.native
}

