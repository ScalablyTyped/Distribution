package typings.dojo.dojox.gauges

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.`type`
import typings.dojo.dojoStrings.duration
import typings.dojo.dojoStrings.font
import typings.dojo.dojoStrings.front
import typings.dojo.dojoStrings.hideValue
import typings.dojo.dojoStrings.hover
import typings.dojo.dojoStrings.interactionMode
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.length
import typings.dojo.dojoStrings.noChange
import typings.dojo.dojoStrings.offset
import typings.dojo.dojoStrings.strokeColor
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.value
import typings.dojo.dojoStrings.width
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/_Indicator.html
  *
  * An indicator to be used in a gauge
  * An indicator widget, which has given properties.  drawn by a gauge.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.gauges._Indicator")
@js.native
class _Indicator () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The color of the indicator.
    *
    */
  var color: String = js.native
  /**
    * indicates how long an animation of the indicator should take
    *
    */
  var duration: Double = js.native
  /**
    * The font for the indicator. The font is enerally in a format similar to:
    * {family: "Helvetica", weight: "bold", style: "italic", size: "18pt", rotated: true}
    *
    */
  var font: js.Object = js.native
  /**
    * Keep this indicator at the front
    *
    */
  var front: Boolean = js.native
  /**
    *
    */
  var hideValue: Boolean = js.native
  /**
    * The string to put in the tooltip when this indicator is hovered over.
    *
    */
  var hover: String = js.native
  /**
    * The interactionMode can have two values: "indicator" (the default) or "gauge".
    * When the value is "indicator", the user must click on the indicator to change the value.
    * When the value is "gauge", the user can click on the gauge to change the indicator value.
    * If a gauge contains several indicators with the indicatorMode property set to "gauge", then
    * only the first indicator will be moved when clicking the gauge.
    *
    */
  var interactionMode: String = js.native
  /**
    * The text label for the indicator.
    *
    */
  var label: String = js.native
  /**
    * The length of the indicator.  In the above example, the radius of the AnalogGauge
    * is 125, but the length of the indicator is 135, meaning it would project beyond
    * the edge of the AnalogGauge
    *
    */
  var length: Double = js.native
  /**
    * Indicates whether the indicator's value can be changed.  Useful for
    * a static target indicator.  Default is false (that the value can be changed).
    *
    */
  var noChange: Boolean = js.native
  /**
    * The offset of the indicator
    *
    */
  var offset: Double = js.native
  /**
    * The color to stroke the outline of the indicator.
    *
    */
  var strokeColor: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style__Indicator: String = js.native
  /**
    * The type of indicator to draw.  Varies by gauge type.  Some examples include
    * "line", "arrow", and "bar"
    *
    */
  var `type`: String = js.native
  /**
    * The value (on the gauge) that this indicator should be placed at
    *
    */
  var value: Double = js.native
  /**
    * The width of the indicator.
    *
    */
  var width: Double = js.native
  /**
    * Performs the initial drawing of the indicator.
    *
    * @param dontAnimate               OptionalIndicates if the drawing should not be animated (rather than teh default, to animate)
    */
  def draw(dontAnimate: Boolean): Unit = js.native
  /**
    * indicates the easing function to be used when animating the of an indicator.
    *
    * @param n               Optional
    */
  def easing(n: Double): Double = js.native
  @JSName("get")
  def get_color(property: typings.dojo.dojoStrings.color): String = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  @JSName("get")
  def get_font(property: font): js.Object = js.native
  @JSName("get")
  def get_front(property: front): Boolean = js.native
  @JSName("get")
  def get_hideValue(property: hideValue): Boolean = js.native
  @JSName("get")
  def get_hover(property: hover): String = js.native
  @JSName("get")
  def get_interactionMode(property: interactionMode): String = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_length(property: length): Double = js.native
  @JSName("get")
  def get_noChange(property: noChange): Boolean = js.native
  @JSName("get")
  def get_offset(property: offset): Double = js.native
  @JSName("get")
  def get_strokeColor(property: strokeColor): String = js.native
  @JSName("get")
  def get_type(property: `type`): String = js.native
  @JSName("get")
  def get_value(property: value): Double = js.native
  @JSName("get")
  def get_width(property: width): Double = js.native
  /**
    * Handles mouse-down events in the indicator.
    *
    * @param e
    */
  def handleMouseDown(e: js.Any): Unit = js.native
  /**
    * Handles mouse-out events in the indicator.
    *
    * @param e
    */
  def handleMouseOut(e: js.Any): Unit = js.native
  /**
    * Handles mouse-over events in the indicator.
    *
    * @param e
    */
  def handleMouseOver(e: js.Any): Unit = js.native
  /**
    * Handles touch start events in the indicator.
    *
    * @param e
    */
  def handleTouchStart(e: js.Any): Unit = js.native
  /**
    * Handles updating the text box and the hover text while dragging an indicator
    *
    */
  def onDragMove(): Unit = js.native
  /**
    * Removes the indicator's shape from the gauge surface.
    *
    */
  def remove(): Unit = js.native
  @JSName("set")
  def set_color(property: typings.dojo.dojoStrings.color, value: String): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("set")
  def set_font(property: font, value: js.Object): Unit = js.native
  @JSName("set")
  def set_front(property: front, value: Boolean): Unit = js.native
  @JSName("set")
  def set_hideValue(property: hideValue, value: Boolean): Unit = js.native
  @JSName("set")
  def set_hover(property: hover, value: String): Unit = js.native
  @JSName("set")
  def set_interactionMode(property: interactionMode, value: String): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_length(property: length, value: Double): Unit = js.native
  @JSName("set")
  def set_noChange(property: noChange, value: Boolean): Unit = js.native
  @JSName("set")
  def set_offset(property: offset, value: Double): Unit = js.native
  @JSName("set")
  def set_strokeColor(property: strokeColor, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_type(property: `type`, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: Double): Unit = js.native
  @JSName("set")
  def set_width(property: width, value: Double): Unit = js.native
  /**
    * Updates the value of the indicator, including moving/re-drawing at it's new location and
    * updating the text box
    *
    * @param value
    * @param animate
    */
  def update(value: js.Any, animate: js.Any): Unit = js.native
  /**
    * Invoked every time the value of the indicator changes.
    *
    */
  def valueChanged(): Unit = js.native
  @JSName("watch")
  def watch_color(property: typings.dojo.dojoStrings.color, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_duration(property: duration, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_font(property: font, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_front(property: front, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hideValue(property: hideValue, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hover(property: hover, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_interactionMode(property: interactionMode, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_label(property: label, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_length(property: length, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_noChange(property: noChange, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_offset(property: offset, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_strokeColor(property: strokeColor, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_type(property: `type`, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_value(property: value, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_width(property: width, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
}

