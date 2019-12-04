package typings.dojo.dojox.dgauges

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.endThickness
import typings.dojo.dojoStrings.fill
import typings.dojo.dojoStrings.radius
import typings.dojo.dojoStrings.start
import typings.dojo.dojoStrings.startThickness
import typings.dojo.dojoStrings.stroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/CircularRangeIndicator.html
  *
  * A CircularRangeIndicator is used to represent a range of values on a scale.
  * Use the addIndicator method of CircularScale to use it.
  * It is represented as a donut slice.
  *
  */
@JSGlobal("dojox.dgauges.CircularRangeIndicator")
@js.native
class CircularRangeIndicator () extends ScaleIndicatorBase {
  /**
    * The end thickness of the donut slice in pixels.
    *
    */
  var endThickness: Double = js.native
  /**
    * A fill object that will be passed to the setFill method of GFX.
    *
    */
  var fill: js.Object = js.native
  /**
    * The outer radius in pixels of the range indicator.
    *
    */
  var radius: Double = js.native
  /**
    * The start value of the range indicator.
    *
    */
  var start: Double = js.native
  /**
    * The start thickness of the donut slice in pixels.
    *
    */
  var startThickness: Double = js.native
  /**
    * A stroke object that will be passed to the setStroke method of GFX.
    *
    */
  var stroke: js.Object = js.native
  @JSName("get")
  def get_endThickness(property: endThickness): Double = js.native
  @JSName("get")
  def get_fill(property: fill): js.Object = js.native
  @JSName("get")
  def get_radius(property: radius): Double = js.native
  @JSName("get")
  def get_start(property: start): Double = js.native
  @JSName("get")
  def get_startThickness(property: startThickness): Double = js.native
  @JSName("get")
  def get_stroke(property: stroke): js.Object = js.native
  @JSName("set")
  def set_endThickness(property: endThickness, value: Double): Unit = js.native
  @JSName("set")
  def set_fill(property: fill, value: js.Object): Unit = js.native
  @JSName("set")
  def set_radius(property: radius, value: Double): Unit = js.native
  @JSName("set")
  def set_start(property: start, value: Double): Unit = js.native
  @JSName("set")
  def set_startThickness(property: startThickness, value: Double): Unit = js.native
  @JSName("set")
  def set_stroke(property: stroke, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_endThickness(
    property: endThickness,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_fill(
    property: fill,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
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
  def watch_start(
    property: start,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_startThickness(
    property: startThickness,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_stroke(
    property: stroke,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

