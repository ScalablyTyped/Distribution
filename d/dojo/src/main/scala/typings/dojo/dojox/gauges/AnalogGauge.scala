package typings.dojo.dojox.gauges

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.cx
import typings.dojo.dojoStrings.cy
import typings.dojo.dojoStrings.endAngle
import typings.dojo.dojoStrings.orientation
import typings.dojo.dojoStrings.radius
import typings.dojo.dojoStrings.startAngle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/AnalogGauge.html
  *
  * a gauge built using the dojox.gfx package.
  * using dojo.gfx (and thus either SVG or VML based on what is supported), this widget
  * builds a gauge component, used to display numerical data in a familiar format
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.gauges.AnalogGauge")
@js.native
class AnalogGauge () extends _Gauge {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * center of gauge x coordinate (default is gauge width / 2)
    *
    */
  var cx: Double = js.native
  /**
    * center of gauge x coordinate (default is gauge height / 2)
    *
    */
  var cy: Double = js.native
  /**
    * angle (in degrees) for end of gauge (default is 90)
    *
    */
  var endAngle: Double = js.native
  /**
    * The orientation of the gauge. The value can be 'clockwise' or 'cclockwise' (default is 'clockwise')
    *
    */
  var orientation: String = js.native
  /**
    * radius of gauge (default is smaller of cx-25 or cy-25)
    *
    */
  var radius: Double = js.native
  /**
    * angle (in degrees) for start of gauge (default is -90)
    *
    */
  var startAngle: Double = js.native
  /**
    * This function is used to draw (or redraw) a range
    * Draws a range (colored area on the background of the gauge)
    * based on the given arguments.
    *
    * @param group The GFX group where the range must be drawn.
    * @param range A range is a dojox.gauges.Range or an objectwith similar parameters (low, high, hover, etc.).
    */
  def drawRange(group: js.Object, range: js.Object): Unit = js.native
  /**
    * Determines which range the mouse is currently over
    *
    * @param e The event object as received by the mouse handling functions below.
    */
  def getRangeUnderMouse(e: js.Object): js.Any = js.native
  @JSName("get")
  def get_cx(property: cx): Double = js.native
  @JSName("get")
  def get_cy(property: cy): Double = js.native
  @JSName("get")
  def get_endAngle(property: endAngle): Double = js.native
  @JSName("get")
  def get_orientation(property: orientation): String = js.native
  @JSName("get")
  def get_radius(property: radius): Double = js.native
  @JSName("get")
  def get_startAngle(property: startAngle): Double = js.native
  @JSName("set")
  def set_cx(property: cx, value: Double): Unit = js.native
  @JSName("set")
  def set_cy(property: cy, value: Double): Unit = js.native
  @JSName("set")
  def set_endAngle(property: endAngle, value: Double): Unit = js.native
  @JSName("set")
  def set_orientation(property: orientation, value: String): Unit = js.native
  @JSName("set")
  def set_radius(property: radius, value: Double): Unit = js.native
  @JSName("set")
  def set_startAngle(property: startAngle, value: Double): Unit = js.native
  @JSName("watch")
  def watch_cx(
    property: cx,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cy(
    property: cy,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_endAngle(
    property: endAngle,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_orientation(
    property: orientation,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_radius(
    property: radius,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_startAngle(
    property: startAngle,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

