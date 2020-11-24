package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Point represents an x- and y-coordinate pair in two-dimensional space.
  */
@JSImport("go", "Point")
@js.native
/**
  * The default constructor produces the Point(0,0).
  */
class Point () extends js.Object {
  /**
    * The two-argument constructor produces the Point(x, y).
    * @param {number} x
    * @param {number} y
    */
  def this(x: Double, y: Double) = this()
  
  /**
    * Modify this point so that is the sum of the current Point and the
    * x and y co-ordinates of the given Point.
    * @param {Point} p The Point to add to this Point.
    */
  def add(p: Point): Point = js.native
  
  /**
    * Create a copy of this Point, with the same values.
    */
  def copy(): Point = js.native
  
  /**
    * Compute the angle from this Point to a given (px,py) point.
    * However, if the point is the same as this Point, the direction is zero.
    * @param {number} px
    * @param {number} py
    */
  def direction(px: Double, py: Double): Double = js.native
  
  /**
    * Compute the angle from this Point to a given Point.
    * However, if the given Point is the same as this Point, the direction is zero.
    * @param {Point} p the other Point to which to measure the relative angle.
    */
  def directionPoint(p: Point): Double = js.native
  
  /**
    * Returns the square of the distance from this point to a given point (px, py).
    * @param {number} px
    * @param {number} py
    */
  def distanceSquared(px: Double, py: Double): Double = js.native
  
  /**
    * Returns the square of the distance from this Point to a given Point.
    * @param {Point} p the other Point to measure to.
    */
  def distanceSquaredPoint(p: Point): Double = js.native
  
  /**
    * Indicates whether the given point (x, y) is equal to this Point.
    * @param {number} x
    * @param {number} y
    * false otherwise.
    */
  def equalTo(x: Double, y: Double): Boolean = js.native
  
  /**
    * Indicates whether the given Point is equal to this Point.
    * @param {Point} p The Point to compare to the current Point.
    * false otherwise.
    */
  def equals(p: Point): Boolean = js.native
  
  def equalsApprox(p: Point): Boolean = js.native
  
  /**
    * True if this Point has X and Y values that are real numbers and not infinity.
    */
  def isReal(): Boolean = js.native
  
  /**
    * Modify this Point so that its X and Y values have been normalized to a unit length.
    * However, if this Point is the origin (zero, zero), its length remains zero.
    */
  def normalize(): Point = js.native
  
  /**
    * Modify this point by shifting its values with the given DX and DY offsets.
    * @param {number} dx
    * @param {number} dy
    */
  def offset(dx: Double, dy: Double): Point = js.native
  
  /**
    * Modify this point to be the closest point to this point that is on a finite line segment given by (px,py) and (qx,qy).
    * @param {number} px
    * @param {number} py
    * @param {number} qx
    * @param {number} qy
    */
  def projectOntoLineSegment(px: Double, py: Double, qx: Double, qy: Double): Point = js.native
  
  /**
    * Modify this point to be the closest point to this point that is on a finite line segment given by P and Q.
    * @param {Point} p
    * @param {Point} q
    */
  def projectOntoLineSegmentPoint(p: Point, q: Point): Point = js.native
  
  /**
    * Modify this Point so that has been rotated about the origin by the given angle.
    * @param {number} angle an angle in degrees.
    */
  def rotate(angle: Double): Point = js.native
  
  /**
    * Modify this Point so that its X and Y values have been scaled by given factors along the X and Y axes.
    * @param {number} sx
    * @param {number} sy
    */
  def scale(sx: Double, sy: Double): Point = js.native
  
  /**
    * Modify this Point so that its X and Y values are the same as the given Point.
    * @param {Point} p the given Point.
    */
  def set(p: Point): Point = js.native
  
  /**
    * Modify this Point so that its X and Y values correspond to a particular Spot
    * in a given Rect.
    * The result is meaningless if Spot.isNoSpot is true for the given Spot.
    * @param {Rect} r the Rect for which we are finding the point.
    * @param {Spot} spot the Spot; Spot.isSpot must be true for this Spot.
    */
  def setRectSpot(r: Rect, spot: Spot): Point = js.native
  
  /**
    * Modify this Point so that its X and Y values correspond to a particular Spot
    * in a given rectangle.
    * The result is meaningless if Spot.isNoSpot is true for the given Spot.
    * @param {number} x The X coordinate of the Rect for which we are finding the point.
    * @param {number} y The Y coordinate of the Rect for which we are finding the point.
    * @param {number} w The Width of the Rect for which we are finding the point.
    * @param {number} h The Height of the Rect for which we are finding the point.
    * @param {Spot} spot the Spot; Spot.isSpot must be true for this Spot.
    */
  def setSpot(x: Double, y: Double, w: Double, h: Double, spot: Spot): Point = js.native
  
  /**
    * Modify this Point with new X and Y values.
    * @param {number} x
    * @param {number} y
    */
  def setTo(x: Double, y: Double): Point = js.native
  
  /**
    * Modify this point to be at the nearest point on an infinite grid,
    * given the grid's origin and size of each grid cell.
    * @param {number} originx
    * @param {number} originy
    * @param {number} cellwidth
    * @param {number} cellheight
    */
  def snapToGrid(originx: Double, originy: Double, cellwidth: Double, cellheight: Double): Point = js.native
  
  /**
    * Modify this point to be at the nearest point on an infinite grid,
    * given the grid's origin and size of each grid cell.
    * @param {Point} origin
    * @param {Size} cellsize
    */
  def snapToGridPoint(origin: Point, cellsize: Size): Point = js.native
  
  /**
    * Modify this point so that is the difference of this Point and the
    * x and y co-ordinates of the given Point.
    * @param {Point} p The Point to subtract from the current Point.
    */
  def subtract(p: Point): Point = js.native
  
  /**Gets or sets the x value of the Point.*/
  var x: Double = js.native
  
  /**Gets or sets the y value of the Point.*/
  var y: Double = js.native
}
/* static members */
@JSImport("go", "Point")
@js.native
object Point extends js.Object {
  
  /**
    * This static function returns the angle in degrees of the line from point P to point Q.
    * @param {number} px
    * @param {number} py
    * @param {number} qx
    * @param {number} qy
    */
  def direction(px: Double, py: Double, qx: Double, qy: Double): Double = js.native
  
  /**
    * This static function returns the square of the distance from the point P
    * to the finite line segment from point A to point B.
    * @param {number} px
    * @param {number} py
    * @param {number} ax
    * @param {number} ay
    * @param {number} bx
    * @param {number} by
    */
  def distanceLineSegmentSquared(px: Double, py: Double, ax: Double, ay: Double, bx: Double, by: Double): Double = js.native
  
  /**
    * This static function returns the square of the distance from the point P to the point Q.
    * @param {number} px
    * @param {number} py
    * @param {number} qx
    * @param {number} qy
    */
  def distanceSquared(px: Double, py: Double, qx: Double, qy: Double): Double = js.native
  
  /**
    * This static function can be used to read in a Point from a string that was produced by Point.stringify.
    * @param {string} str
    */
  def parse(str: String): Point = js.native
  
  /**
    * This static function can be used to write out a Point as a string that can be read by Point.parse.
    * @param {Point} val
    */
  def stringify(`val`: Point): String = js.native
}
