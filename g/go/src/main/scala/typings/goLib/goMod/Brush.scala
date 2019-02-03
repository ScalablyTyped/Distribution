package typings
package goLib.goMod

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
@JSImport("go", "Brush")
@js.native
/**
  * Construct a solid color Brush that holds the given color information.
  * @param {string=} color a well-formed CSS string describing a solid color brush; if not supplied uses 'black'.
  */
class Brush ()
  extends goLib.goMod.goNs.Brush {
  def this(color: java.lang.String) = this()
  /**
    * Construct a Brush class of a given type.
    * @param {EnumValue} type one of the values  Brush.Solid, Brush.Linear, Brush.Radial, Brush.Pattern.
    */
  def this(`type`: goLib.goMod.goNs.EnumValue) = this()
  /**Gets or sets the color of a solid Brush.*/
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**Gets or sets a Map holding all of the color stops used in this gradient, where the key is a number, the fractional distance between zero and one (inclusive), and where the corresponding value is a color string.*/
  /* CompleteClass */
  override var colorStops: goLib.goMod.goNs.Map[scala.Double, java.lang.String] = js.native
  /**Gets or sets the ending location for a linear or radial gradient.*/
  /* CompleteClass */
  override var end: goLib.goMod.goNs.Spot = js.native
  /**Gets or sets the radius of a radial brush at the end location.*/
  /* CompleteClass */
  override var endRadius: scala.Double = js.native
  /**Gets or sets the pattern of a brush of type Brush.Pattern, an HTMLImageElement or HTMLCanvasElement or HTMLVideoElement.*/
  /* CompleteClass */
  override var pattern: js.Any = js.native
  /**Gets or sets the starting location for a linear or radial gradient.*/
  /* CompleteClass */
  override var start: goLib.goMod.goNs.Spot = js.native
  /**Gets or sets the radius of a radial brush at the start location.*/
  /* CompleteClass */
  override var startRadius: scala.Double = js.native
  /**Gets or sets the type of brush.*/
  /* CompleteClass */
  override var `type`: goLib.goMod.goNs.EnumValue = js.native
  /**
    * Specify a particular color at a particular fraction of the distance.
    * If the  .type is Brush.Solid, change the type to Brush.Linear.
    * You should have a color stop at zero and a color stop at one.
    * You should not have duplicate color stop values at the same fractional distance.
    * @param {number} loc between zero and one, inclusive.
    * @param {string} color a CSS color string
    */
  /* CompleteClass */
  override def addColorStop(loc: scala.Double, color: java.lang.String): scala.Unit = js.native
  /**
    * Create a copy of this Brush, with the same values.
    */
  /* CompleteClass */
  override def copy(): goLib.goMod.goNs.Brush = js.native
}

/* static members */
@JSImport("go", "Brush")
@js.native
object Brush extends js.Object {
  /**For linear gradient brushes, used as the value for Brush.type.*/
  var Linear: goLib.goMod.goNs.EnumValue = js.native
  /**For pattern brushes, used as the value for Brush.type.*/
  var Pattern: goLib.goMod.goNs.EnumValue = js.native
  /**For radial gradient brushes, used as the value for Brush.type.*/
  var Radial: goLib.goMod.goNs.EnumValue = js.native
  /**For simple, solid color brushes, used as the value for Brush.type.*/
  var Solid: goLib.goMod.goNs.EnumValue = js.native
  def isValidColor(color: java.lang.String): scala.Boolean = js.native
  /**
    * This static function can be used to generate a random color string.
    * @param {number=} min a number between zero and 255, defaults to 128.
    * @param {number=} max a number between zero and 255, defaults to 255.
    */
  def randomColor(): java.lang.String = js.native
  def randomColor(min: scala.Double): java.lang.String = js.native
  def randomColor(min: scala.Double, max: scala.Double): java.lang.String = js.native
}

