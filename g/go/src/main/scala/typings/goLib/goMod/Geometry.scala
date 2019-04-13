package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Geometry class is used to define the "shape" of a Shape.
  * A Geometry can be simple straight lines, rectangles, or ellipses.
  * A Geometry can also be an arbitrarily complex path, consisting of a list of PathFigures.
  * A Geometry must not be modified once it has been used by a Shape.
  * However, a Geometry may be shared by multiple Shapes.
  */
@JSImport("go", "Geometry")
@js.native
/**
  * Construct an empty Geometry.
  * The geometry type must be one of the following values:
  * Geometry.Line, Geometry.Ellipse, Geometry.Rectangle, Geometry.Path.
  * @param {EnumValue=} type If not supplied, the default Geometry type is Geometry.Path.
  */
class Geometry () extends js.Object {
  def this(`type`: EnumValue) = this()
  /**This read-only property returns a rectangle that contains all points within the Geometry.*/
  var bounds: Rect = js.native
  /**Gets or sets the Shape.geometryStretch value the Shape should use by default.*/
  var defaultStretch: EnumValue = js.native
  /**Gets or sets the ending X coordinate of the Geometry if it is of type .Line, .Rectangle, or .Ellipse.*/
  var endX: scala.Double = js.native
  /**Gets or sets the ending Y coordinate of the Geometry if it is of type .Line, .Rectangle, or .Ellipse.*/
  var endY: scala.Double = js.native
  /**Gets or sets the List of PathFigures that describes the content of the path for Geometries of type .Path.*/
  var figures: List[PathFigure] = js.native
  /**Gets or sets the spot to use when the Shape.spot1 value is Spot.Default.*/
  var spot1: Spot = js.native
  /**Gets or sets the spot to use when the Shape.spot2 value is Spot.Default.*/
  var spot2: Spot = js.native
  /**Gets or sets the starting X coordinate of the Geometry if it is of type .Line, .Rectangle, or .Ellipse.*/
  var startX: scala.Double = js.native
  /**Gets or sets the starting Y coordinate of the Geometry if it is of type .Line, .Rectangle, or .Ellipse.*/
  var startY: scala.Double = js.native
  /**Gets or sets the type of the Geometry.*/
  var `type`: EnumValue = js.native
  /**
    * Add a PathFigure to the figures list.
    * @param {PathFigure} figure a newly allocated unshared PathFigure that will become owned by this Geometry
    * @return {Geometry} this
    */
  def add(figure: PathFigure): Geometry = js.native
  /**
    * Computes the Geometry's bounds without adding an origin point, and returns those bounds as a rect.
    */
  def computeBoundsWithoutOrigin(): Rect = js.native
  /**
    * Create a copy of this Geometry, with the same values and figures.
    */
  def copy(): Geometry = js.native
  def equalsApprox(g: Geometry): scala.Boolean = js.native
  /**
    * Normalizes the Geometry points in place by ensuring the top-left bounds of the geometry lines up with (0, 0), returning the Point (x, y) amount it was shifted.
    */
  def normalize(): Point = js.native
  /**
    * Offsets the Geometry in place by a given (x, y) amount
    * @param {number} x The x-axis offset factor.
    * @param {number} y The y-axis offset factor.
    * @return {Geometry} this
    */
  def offset(x: scala.Double, y: scala.Double): Geometry = js.native
  /**
    * Rotates the Geometry in place by a given angle, with optional x and y values to rotate the geometry about.
    * If no x and y value are giving, (0, 0) is used as the rotation point.
    * @param {number} angle The angle to rotate by.
    * @param {number=} x The optional X point to rotate the geometry about. If no point is given, this value is 0.
    * @param {number=} y The optional Y point to rotate the geometry about. If no point is given, this value is 0.
    * @return {Geometry} this
    */
  def rotate(angle: scala.Double): Geometry = js.native
  def rotate(angle: scala.Double, x: scala.Double): Geometry = js.native
  def rotate(angle: scala.Double, x: scala.Double, y: scala.Double): Geometry = js.native
  /**
    * Scales the Geometry in place by a given (x, y) scale factor
    * @param {number} x The x-axis scale factor.
    * @param {number} y The y-axis scale factor.
    * @return {Geometry} this
    */
  def scale(x: scala.Double, y: scala.Double): Geometry = js.native
}

/* static members */
@JSImport("go", "Geometry")
@js.native
object Geometry extends js.Object {
  /**For drawing an ellipse fitting within a rectangle; a value for Geometry.type.*/
  var Ellipse: goLib.goMod.EnumValue = js.native
  /**For drawing a simple straight line; a value for Geometry.type.*/
  var Line: goLib.goMod.EnumValue = js.native
  /**For drawing a complex path made of a list of PathFigures; a value for Geometry.type.*/
  var Path: goLib.goMod.EnumValue = js.native
  /**For drawing a rectangle; a value for Geometry.type.*/
  var Rectangle: goLib.goMod.EnumValue = js.native
  /**
    * Given a SVG or GoJS path string, returns a congruent path string with each PathFigure filled.
    * For instance, "M0 0 L22 22 L33 0" would become "F M0 0 L22 22 L33 0".
    * @param {string} str
    */
  def fillPath(str: java.lang.String): java.lang.String = js.native
  /**
    * Produce a Geometry from a string that uses an SVG-like compact path geometry syntax.
    * @param {string} str
    * @param {boolean=} filled whether figures should be filled.
    * If true, all PathFigures in the string will be filled regardless of the presence
    * of an "F" command or not.
    * If false, all PathFigures will determine their own filled state by the presence of an "F" command or not.
    * Default is false.
    */
  def parse(str: java.lang.String): goLib.goMod.Geometry = js.native
  def parse(str: java.lang.String, filled: scala.Boolean): goLib.goMod.Geometry = js.native
  /**
    * This static function can be used to write out a Geometry as a string
    * that can be read by Geometry.parse.
    * The string produced by this method is a superset of the SVG path
    * string rules that contains some additional GoJS-specific tokens.
    * See the <a href="../../intro/pictures.html">Introduction page on Geometry Parsing</a> for more details.
    * @param {Geometry} val
    */
  def stringify(`val`: goLib.goMod.Geometry): java.lang.String = js.native
}

