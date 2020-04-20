package typings.dojo.dojox.dgauges.components

import typings.dojo.dojox.dgauges.IndicatorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/components/utils.html
  *
  *
  */
trait utils extends js.Object {
  /**
    * Adjusts the brightness of a color.
    *
    * @param col The base color
    * @param b A positive or negative value to adjust the brightness
    */
  def brightness(col: Double, b: Double): Double
  /**
    * Creates a gradient object
    *
    * @param entries An array of numbers representing colors
    */
  def createGradient(entries: js.Array[_]): Double
  /**
    * A helper method for configuring a circular gauge.
    *
    * @param scale A circular scale
    * @param indicator A circular indicator
    * @param originX The x-coordinate of the center of the scale (in pixels)
    * @param originY The y-coordinate of the center of the scale (in pixels)
    * @param radius The radius of the scale (in pixels)
    * @param startAngle The start angle of the scale (in degrees)
    * @param endAngle The end angle of the scale (in degrees)
    * @param orientation               OptionalThe orientation of the scale, can be "clockwise" or "cclockwise"
    * @param font               OptionalThe font used for the gauge
    * @param labelPosition               OptionalThe position of the labels regarding
    * @param tickShapeFunc               OptionalA drawing function for the ticks
    */
  def genericCircularGauge(
    scale: Double,
    indicator: IndicatorBase,
    originX: Double,
    originY: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    orientation: String,
    font: js.Object,
    labelPosition: String,
    tickShapeFunc: js.Object
  ): Double
}

object utils {
  @scala.inline
  def apply(
    brightness: (Double, Double) => Double,
    createGradient: js.Array[_] => Double,
    genericCircularGauge: (Double, IndicatorBase, Double, Double, Double, Double, Double, String, js.Object, String, js.Object) => Double
  ): utils = {
    val __obj = js.Dynamic.literal(brightness = js.Any.fromFunction2(brightness), createGradient = js.Any.fromFunction1(createGradient), genericCircularGauge = js.Any.fromFunction11(genericCircularGauge))
    __obj.asInstanceOf[utils]
  }
}

