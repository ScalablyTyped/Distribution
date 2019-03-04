package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Brush holds color information and describes how to draw the inside
  * of a Shape or the stroke of a shape or a TextBlock or the
  * background of any GraphObject.
  * A Brush must not be modified once it has been assigned to a GraphObject,
  * such as the Shape.fill or TextBlock.stroke
  * or GraphObject.background.
  * However, a Brush may be shared by multiple GraphObjects.
  */
trait Brush extends js.Object {
  /**Gets or sets the color of a solid Brush.*/
  var color: java.lang.String
  /**Gets or sets a Map holding all of the color stops used in this gradient, where the key is a number, the fractional distance between zero and one (inclusive), and where the corresponding value is a color string.*/
  var colorStops: Map[scala.Double, java.lang.String]
  /**Gets or sets the ending location for a linear or radial gradient.*/
  var end: Spot
  /**Gets or sets the radius of a radial brush at the end location.*/
  var endRadius: scala.Double
  /**Gets or sets the pattern of a brush of type Brush.Pattern, an HTMLImageElement or HTMLCanvasElement or HTMLVideoElement.*/
  var pattern: js.Any
  /**Gets or sets the starting location for a linear or radial gradient.*/
  var start: Spot
  /**Gets or sets the radius of a radial brush at the start location.*/
  var startRadius: scala.Double
  /**Gets or sets the type of brush.*/
  var `type`: EnumValue
  /**
    * Specify a particular color at a particular fraction of the distance.
    * If the  .type is Brush.Solid, change the type to Brush.Linear.
    * You should have a color stop at zero and a color stop at one.
    * You should not have duplicate color stop values at the same fractional distance.
    * @param {number} loc between zero and one, inclusive.
    * @param {string} color a CSS color string
    */
  def addColorStop(loc: scala.Double, color: java.lang.String): scala.Unit
  /**
    * Create a copy of this Brush, with the same values.
    */
  def copy(): Brush
}

object Brush {
  @scala.inline
  def apply(
    addColorStop: js.Function2[scala.Double, java.lang.String, scala.Unit],
    color: java.lang.String,
    colorStops: Map[scala.Double, java.lang.String],
    copy: js.Function0[Brush],
    end: Spot,
    endRadius: scala.Double,
    pattern: js.Any,
    start: Spot,
    startRadius: scala.Double,
    `type`: EnumValue
  ): Brush = {
    val __obj = js.Dynamic.literal(addColorStop = addColorStop, color = color, colorStops = colorStops, copy = copy, end = end, endRadius = endRadius, pattern = pattern, start = start, startRadius = startRadius)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Brush]
  }
}

