package typings.dojo.dojox.gauges

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.dataHeight
import typings.dojo.dojoStrings.dataWidth
import typings.dojo.dojoStrings.dataX
import typings.dojo.dojoStrings.dataY
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gauges/BarGauge.html
  *
  * a bar graph built using the dojox.gfx package.
  * using dojo.gfx (and thus either SVG or VML based on what is supported), this widget
  * builds a bar graph component, used to display numerical data in a familiar format.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.gauges.BarGauge")
@js.native
class BarGauge () extends _Gauge {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * height of data area (default is bar graph width - 10)
    *
    */
  var dataHeight: Double = js.native
  /**
    * width of data area (default is bar graph width - 10)
    *
    */
  var dataWidth: Double = js.native
  /**
    * x position of data area (default 5)
    *
    */
  var dataX: Double = js.native
  /**
    * y position of data area (default 5)
    *
    */
  var dataY: Double = js.native
  /**
    * This function is used to draw (or redraw) a range
    * Draws a range (colored area on the background of the gauge)
    * based on the given arguments.
    *
    * @param group The GFX group where the range must be drawn.
    * @param range A range is either a dojox.gauges.Range or an objectwith similar parameters (low, high, hover, etc.).
    */
  def drawRange(group: js.Object, range: js.Object): Unit = js.native
  /**
    * Determines which range the mouse is currently over
    *
    * @param e The event object as received by the mouse handling functions below.
    */
  def getRangeUnderMouse(e: js.Object): js.Any = js.native
  @JSName("get")
  def get_dataHeight(property: dataHeight): Double = js.native
  @JSName("get")
  def get_dataWidth(property: dataWidth): Double = js.native
  @JSName("get")
  def get_dataX(property: dataX): Double = js.native
  @JSName("get")
  def get_dataY(property: dataY): Double = js.native
  @JSName("set")
  def set_dataHeight(property: dataHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_dataWidth(property: dataWidth, value: Double): Unit = js.native
  @JSName("set")
  def set_dataX(property: dataX, value: Double): Unit = js.native
  @JSName("set")
  def set_dataY(property: dataY, value: Double): Unit = js.native
  @JSName("watch")
  def watch_dataHeight(
    property: dataHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dataWidth(
    property: dataWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dataX(
    property: dataX,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dataY(
    property: dataY,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

