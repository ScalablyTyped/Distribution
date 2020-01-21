package typings.dojo.dojox.dgauges

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.endAngle
import typings.dojo.dojoStrings.orientation
import typings.dojo.dojoStrings.originX
import typings.dojo.dojoStrings.originY
import typings.dojo.dojoStrings.radius
import typings.dojo.dojoStrings.startAngle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/CircularScale.html
  *
  * The circular scale. A scaler must be set to use this class.
  *
  */
@JSGlobal("dojox.dgauges.CircularScale")
@js.native
class CircularScale () extends ScaleBase {
  /**
    * The end angle of the scale in degrees.
    *
    */
  var endAngle: Double = js.native
  /**
    * The orientation of the scale. Can be "clockwise" or "cclockwise".
    * The default value is "clockwise".
    *
    */
  var orientation: String = js.native
  /**
    * The origin x-coordinate of the scale in pixels.
    *
    */
  var originX: Double = js.native
  /**
    * The origin y-coordinate of the scale in pixels.
    *
    */
  var originY: Double = js.native
  /**
    * The outer radius in pixels of the scale.
    *
    */
  var radius: Double = js.native
  /**
    * The start angle of the scale in degrees.
    *
    */
  var startAngle: Double = js.native
  @JSName("get")
  def get_endAngle(property: endAngle): Double = js.native
  @JSName("get")
  def get_orientation(property: orientation): String = js.native
  @JSName("get")
  def get_originX(property: originX): Double = js.native
  @JSName("get")
  def get_originY(property: originY): Double = js.native
  @JSName("get")
  def get_radius(property: radius): Double = js.native
  @JSName("get")
  def get_startAngle(property: startAngle): Double = js.native
  /**
    * Returns true if the value parameter is between the accepted scale positions.
    *
    * @param value
    */
  def positionInRange(value: Double): js.Any = js.native
  @JSName("set")
  def set_endAngle(property: endAngle, value: Double): Unit = js.native
  @JSName("set")
  def set_orientation(property: orientation, value: String): Unit = js.native
  @JSName("set")
  def set_originX(property: originX, value: Double): Unit = js.native
  @JSName("set")
  def set_originY(property: originY, value: Double): Unit = js.native
  @JSName("set")
  def set_radius(property: radius, value: Double): Unit = js.native
  @JSName("set")
  def set_startAngle(property: startAngle, value: Double): Unit = js.native
  @JSName("watch")
  def watch_endAngle(
    property: endAngle,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_orientation(
    property: orientation,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_originX(
    property: originX,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_originY(
    property: originY,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_radius(
    property: radius,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_startAngle(
    property: startAngle,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

