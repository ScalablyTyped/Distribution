package typings
package goLib.goMod.goNs

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
@js.native
trait Geometry extends js.Object {
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
  /**
          * Rotates the Geometry in place by a given angle, with optional x and y values to rotate the geometry about.
          * If no x and y value are giving, (0, 0) is used as the rotation point.
          * @param {number} angle The angle to rotate by.
          * @param {number=} x The optional X point to rotate the geometry about. If no point is given, this value is 0.
          * @param {number=} y The optional Y point to rotate the geometry about. If no point is given, this value is 0.
          * @return {Geometry} this
          */
  def rotate(angle: scala.Double, x: scala.Double): Geometry = js.native
  /**
          * Rotates the Geometry in place by a given angle, with optional x and y values to rotate the geometry about.
          * If no x and y value are giving, (0, 0) is used as the rotation point.
          * @param {number} angle The angle to rotate by.
          * @param {number=} x The optional X point to rotate the geometry about. If no point is given, this value is 0.
          * @param {number=} y The optional Y point to rotate the geometry about. If no point is given, this value is 0.
          * @return {Geometry} this
          */
  def rotate(angle: scala.Double, x: scala.Double, y: scala.Double): Geometry = js.native
  /**
          * Scales the Geometry in place by a given (x, y) scale factor
          * @param {number} x The x-axis scale factor.
          * @param {number} y The y-axis scale factor.
          * @return {Geometry} this
          */
  def scale(x: scala.Double, y: scala.Double): Geometry = js.native
}

