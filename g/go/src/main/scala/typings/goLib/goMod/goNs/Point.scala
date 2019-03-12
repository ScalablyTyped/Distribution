package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Point represents an x- and y-coordinate pair in two-dimensional space.
  */
trait Point extends js.Object {
  /**Gets or sets the x value of the Point.*/
  var x: scala.Double
  /**Gets or sets the y value of the Point.*/
  var y: scala.Double
  /**
    * Modify this point so that is the sum of the current Point and the
    * x and y co-ordinates of the given Point.
    * @param {Point} p The Point to add to this Point.
    */
  def add(p: Point): Point
  /**
    * Create a copy of this Point, with the same values.
    */
  def copy(): Point
  /**
    * Compute the angle from this Point to a given (px,py) point.
    * However, if the point is the same as this Point, the direction is zero.
    * @param {number} px
    * @param {number} py
    */
  def direction(px: scala.Double, py: scala.Double): scala.Double
  /**
    * Compute the angle from this Point to a given Point.
    * However, if the given Point is the same as this Point, the direction is zero.
    * @param {Point} p the other Point to which to measure the relative angle.
    */
  def directionPoint(p: Point): scala.Double
  /**
    * Returns the square of the distance from this point to a given point (px, py).
    * @param {number} px
    * @param {number} py
    */
  def distanceSquared(px: scala.Double, py: scala.Double): scala.Double
  /**
    * Returns the square of the distance from this Point to a given Point.
    * @param {Point} p the other Point to measure to.
    */
  def distanceSquaredPoint(p: Point): scala.Double
  /**
    * Indicates whether the given point (x, y) is equal to this Point.
    * @param {number} x
    * @param {number} y
    * false otherwise.
    */
  def equalTo(x: scala.Double, y: scala.Double): scala.Boolean
  /**
    * Indicates whether the given Point is equal to this Point.
    * @param {Point} p The Point to compare to the current Point.
    * false otherwise.
    */
  def equals(p: Point): scala.Boolean
  def equalsApprox(p: Point): scala.Boolean
  /**
    * True if this Point has X and Y values that are real numbers and not infinity.
    */
  def isReal(): scala.Boolean
  /**
    * Modify this Point so that its X and Y values have been normalized to a unit length.
    * However, if this Point is the origin (zero, zero), its length remains zero.
    */
  def normalize(): Point
  /**
    * Modify this point by shifting its values with the given DX and DY offsets.
    * @param {number} dx
    * @param {number} dy
    */
  def offset(dx: scala.Double, dy: scala.Double): Point
  /**
    * Modify this point to be the closest point to this point that is on a finite line segment given by (px,py) and (qx,qy).
    * @param {number} px
    * @param {number} py
    * @param {number} qx
    * @param {number} qy
    */
  def projectOntoLineSegment(px: scala.Double, py: scala.Double, qx: scala.Double, qy: scala.Double): Point
  /**
    * Modify this point to be the closest point to this point that is on a finite line segment given by P and Q.
    * @param {Point} p
    * @param {Point} q
    */
  def projectOntoLineSegmentPoint(p: Point, q: Point): Point
  /**
    * Modify this Point so that has been rotated about the origin by the given angle.
    * @param {number} angle an angle in degrees.
    */
  def rotate(angle: scala.Double): Point
  /**
    * Modify this Point so that its X and Y values have been scaled by given factors along the X and Y axes.
    * @param {number} sx
    * @param {number} sy
    */
  def scale(sx: scala.Double, sy: scala.Double): Point
  /**
    * Modify this Point so that its X and Y values are the same as the given Point.
    * @param {Point} p the given Point.
    */
  def set(p: Point): Point
  /**
    * Modify this Point so that its X and Y values correspond to a particular Spot
    * in a given Rect.
    * The result is meaningless if Spot.isNoSpot is true for the given Spot.
    * @param {Rect} r the Rect for which we are finding the point.
    * @param {Spot} spot the Spot; Spot.isSpot must be true for this Spot.
    */
  def setRectSpot(r: Rect, spot: Spot): Point
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
  def setSpot(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, spot: Spot): Point
  /**
    * Modify this Point with new X and Y values.
    * @param {number} x
    * @param {number} y
    */
  def setTo(x: scala.Double, y: scala.Double): Point
  /**
    * Modify this point to be at the nearest point on an infinite grid,
    * given the grid's origin and size of each grid cell.
    * @param {number} originx
    * @param {number} originy
    * @param {number} cellwidth
    * @param {number} cellheight
    */
  def snapToGrid(originx: scala.Double, originy: scala.Double, cellwidth: scala.Double, cellheight: scala.Double): Point
  /**
    * Modify this point to be at the nearest point on an infinite grid,
    * given the grid's origin and size of each grid cell.
    * @param {Point} origin
    * @param {Size} cellsize
    */
  def snapToGridPoint(origin: Point, cellsize: Size): Point
  /**
    * Modify this point so that is the difference of this Point and the
    * x and y co-ordinates of the given Point.
    * @param {Point} p The Point to subtract from the current Point.
    */
  def subtract(p: Point): Point
}

object Point {
  @scala.inline
  def apply(
    add: Point => Point,
    copy: () => Point,
    direction: (scala.Double, scala.Double) => scala.Double,
    directionPoint: Point => scala.Double,
    distanceSquared: (scala.Double, scala.Double) => scala.Double,
    distanceSquaredPoint: Point => scala.Double,
    equalTo: (scala.Double, scala.Double) => scala.Boolean,
    equals: Point => scala.Boolean,
    equalsApprox: Point => scala.Boolean,
    isReal: () => scala.Boolean,
    normalize: () => Point,
    offset: (scala.Double, scala.Double) => Point,
    projectOntoLineSegment: (scala.Double, scala.Double, scala.Double, scala.Double) => Point,
    projectOntoLineSegmentPoint: (Point, Point) => Point,
    rotate: scala.Double => Point,
    scale: (scala.Double, scala.Double) => Point,
    set: Point => Point,
    setRectSpot: (Rect, Spot) => Point,
    setSpot: (scala.Double, scala.Double, scala.Double, scala.Double, Spot) => Point,
    setTo: (scala.Double, scala.Double) => Point,
    snapToGrid: (scala.Double, scala.Double, scala.Double, scala.Double) => Point,
    snapToGridPoint: (Point, Size) => Point,
    subtract: Point => Point,
    x: scala.Double,
    y: scala.Double
  ): Point = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), copy = js.Any.fromFunction0(copy), direction = js.Any.fromFunction2(direction), directionPoint = js.Any.fromFunction1(directionPoint), distanceSquared = js.Any.fromFunction2(distanceSquared), distanceSquaredPoint = js.Any.fromFunction1(distanceSquaredPoint), equalTo = js.Any.fromFunction2(equalTo), equals = js.Any.fromFunction1(equals), equalsApprox = js.Any.fromFunction1(equalsApprox), isReal = js.Any.fromFunction0(isReal), normalize = js.Any.fromFunction0(normalize), offset = js.Any.fromFunction2(offset), projectOntoLineSegment = js.Any.fromFunction4(projectOntoLineSegment), projectOntoLineSegmentPoint = js.Any.fromFunction2(projectOntoLineSegmentPoint), rotate = js.Any.fromFunction1(rotate), scale = js.Any.fromFunction2(scale), set = js.Any.fromFunction1(set), setRectSpot = js.Any.fromFunction2(setRectSpot), setSpot = js.Any.fromFunction5(setSpot), setTo = js.Any.fromFunction2(setTo), snapToGrid = js.Any.fromFunction4(snapToGrid), snapToGridPoint = js.Any.fromFunction2(snapToGridPoint), subtract = js.Any.fromFunction1(subtract), x = x, y = y)
  
    __obj.asInstanceOf[Point]
  }
}

