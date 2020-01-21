package typings.dojo.dojox.calendar

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.containerSize
import typings.dojo.dojoStrings.direction
import typings.dojo.dojoStrings.maximum
import typings.dojo.dojoStrings.minimum
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/_ScrollBarBase.html
  *
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.calendar._ScrollBarBase")
@js.native
class ScrollBarBase () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  var containerSize: Double = js.native
  /**
    * Direction of the scroll bar. Valid values are "vertical" or "horizontal".
    *
    */
  var direction: String = js.native
  /**
    * The maximum value of the scroll bar.
    *
    */
  var maximum: Double = js.native
  /**
    * The minimum value of the scroll bar.
    *
    */
  var minimum: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_ScrollBarBase: String = js.native
  /**
    * The value of the scroll bar in pixel offset.
    *
    */
  var value: Double = js.native
  @JSName("get")
  def get_containerSize(property: containerSize): Double = js.native
  @JSName("get")
  def get_direction(property: direction): String = js.native
  @JSName("get")
  def get_maximum(property: maximum): Double = js.native
  @JSName("get")
  def get_minimum(property: minimum): Double = js.native
  @JSName("get")
  def get_value(property: value): Double = js.native
  /**
    * An extension point invoked when the value has changed.
    *
    * @param value The position of the scroll bar in pixels.
    */
  def onChange(value: Double): Unit = js.native
  /**
    * An extension point invoked when the user scrolls with the mouse.
    *
    * @param value The position of the scroll bar in pixels.
    */
  def onScroll(value: Double): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_containerSize(property: containerSize, value: Double): Unit = js.native
  @JSName("set")
  def set_direction(property: direction, value: String): Unit = js.native
  @JSName("set")
  def set_maximum(property: maximum, value: Double): Unit = js.native
  @JSName("set")
  def set_minimum(property: minimum, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: Double): Unit = js.native
  @JSName("watch")
  def watch_containerSize(
    property: containerSize,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_direction(
    property: direction,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_maximum(
    property: maximum,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_minimum(
    property: minimum,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

