package typings.dojo.dojox.dgauges

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.paddingBottom
import typings.dojo.dojoStrings.paddingLeft
import typings.dojo.dojoStrings.paddingRight
import typings.dojo.dojoStrings.paddingTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/RectangularScale.html
  *
  * The rectangular scale. A scaler must be set to use this class.
  *
  */
@JSGlobal("dojox.dgauges.RectangularScale")
@js.native
class RectangularScale () extends ScaleBase {
  /**
    * The bottom padding.
    *
    */
  var paddingBottom: Double = js.native
  /**
    * The left padding.
    *
    */
  var paddingLeft: Double = js.native
  /**
    * The right padding.
    *
    */
  var paddingRight: Double = js.native
  /**
    * The top padding.
    *
    */
  var paddingTop: Double = js.native
  @JSName("get")
  def get_paddingBottom(property: paddingBottom): Double = js.native
  @JSName("get")
  def get_paddingLeft(property: paddingLeft): Double = js.native
  @JSName("get")
  def get_paddingRight(property: paddingRight): Double = js.native
  @JSName("get")
  def get_paddingTop(property: paddingTop): Double = js.native
  /**
    * Transforms a value into a position using the associated scaler.
    *
    * @param value The value to transform.
    */
  def positionForValue(value: js.Any): js.Any = js.native
  @JSName("set")
  def set_paddingBottom(property: paddingBottom, value: Double): Unit = js.native
  @JSName("set")
  def set_paddingLeft(property: paddingLeft, value: Double): Unit = js.native
  @JSName("set")
  def set_paddingRight(property: paddingRight, value: Double): Unit = js.native
  @JSName("set")
  def set_paddingTop(property: paddingTop, value: Double): Unit = js.native
  /**
    * Transforms a position in pixels into a value using the associated scaler.
    *
    * @param pos The position to transform.
    */
  def valueForPosition(pos: js.Any): js.Any = js.native
  @JSName("watch")
  def watch_paddingBottom(
    property: paddingBottom,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_paddingLeft(
    property: paddingLeft,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_paddingRight(
    property: paddingRight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_paddingTop(
    property: paddingTop,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

