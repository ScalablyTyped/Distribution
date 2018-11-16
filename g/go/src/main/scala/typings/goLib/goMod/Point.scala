package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A Point represents an x- and y-coordinate pair in two-dimensional space.
    */
@JSImport("go", "Point")
@js.native
class Point ()
  extends goLib.goMod.goNs.Point {
  /**
          * The two-argument constructor produces the Point(x, y).
          * @param {number} x
          * @param {number} y
          */
  def this(x: scala.Double, y: scala.Double) = this()
  /**Gets or sets the x value of the Point.*/
  /* CompleteClass */
  override var x: scala.Double = js.native
  /**Gets or sets the y value of the Point.*/
  /* CompleteClass */
  override var y: scala.Double = js.native
  /**
          * Modify this point so that is the sum of the current Point and the
          * x and y co-ordinates of the given Point.
          * @param {Point} p The Point to add to this Point.
          */
  /* CompleteClass */
  override def add(p: goLib.goMod.goNs.Point): goLib.goMod.goNs.Point = js.native
  /**
          * Create a copy of this Point, with the same values.
          */
  /* CompleteClass */
  override def copy(): goLib.goMod.goNs.Point = js.native
  /**
          * Compute the angle from this Point to a given (px,py) point.
          * However, if the point is the same as this Point, the direction is zero.
          * @param {number} px
          * @param {number} py
          */
  /* CompleteClass */
  override def direction(px: scala.Double, py: scala.Double): scala.Double = js.native
  /**
          * Compute the angle from this Point to a given Point.
          * However, if the given Point is the same as this Point, the direction is zero.
          * @param {Point} p the other Point to which to measure the relative angle.
          */
  /* CompleteClass */
  override def directionPoint(p: goLib.goMod.goNs.Point): scala.Double = js.native
  /**
          * Returns the square of the distance from this point to a given point (px, py).
          * @param {number} px
          * @param {number} py
          */
  /* CompleteClass */
  override def distanceSquared(px: scala.Double, py: scala.Double): scala.Double = js.native
  /**
          * Returns the square of the distance from this Point to a given Point.
          * @param {Point} p the other Point to measure to.
          */
  /* CompleteClass */
  override def distanceSquaredPoint(p: goLib.goMod.goNs.Point): scala.Double = js.native
  /**
          * Indicates whether the given point (x, y) is equal to this Point.
          * @param {number} x
          * @param {number} y
          * false otherwise.
          */
  /* CompleteClass */
  override def equalTo(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
          * Indicates whether the given Point is equal to this Point.
          * @param {Point} p The Point to compare to the current Point.
          * false otherwise.
          */
  /* CompleteClass */
  override def equals(p: goLib.goMod.goNs.Point): scala.Boolean = js.native
  /* CompleteClass */
  override def equalsApprox(p: goLib.goMod.goNs.Point): scala.Boolean = js.native
  /**
          * True if this Point has X and Y values that are real numbers and not infinity.
          */
  /* CompleteClass */
  override def isReal(): scala.Boolean = js.native
  /**
          * Modify this Point so that its X and Y values have been normalized to a unit length.
          * However, if this Point is the origin (zero, zero), its length remains zero.
          */
  /* CompleteClass */
  override def normalize(): goLib.goMod.goNs.Point = js.native
  /**
          * Modify this point by shifting its values with the given DX and DY offsets.
          * @param {number} dx
          * @param {number} dy
          */
  /* CompleteClass */
  override def offset(dx: scala.Double, dy: scala.Double): goLib.goMod.goNs.Point = js.native
  /**
          * Modify this point to be the closest point to this point that is on a finite line segment given by (px,py) and (qx,qy).
          * @param {number} px
          * @param {number} py
          * @param {number} qx
          * @param {number} qy
          */
  /* CompleteClass */
  override def projectOntoLineSegment(px: scala.Double, py: scala.Double, qx: scala.Double, qy: scala.Double): goLib.goMod.goNs.Point = js.native
  /**
          * Modify this point to be the closest point to this point that is on a finite line segment given by P and Q.
          * @param {Point} p
          * @param {Point} q
          */
  /* CompleteClass */
  override def projectOntoLineSegmentPoint(p: goLib.goMod.goNs.Point, q: goLib.goMod.goNs.Point): goLib.goMod.goNs.Point = js.native
  /**
          * Modify this Point so that has been rotated about the origin by the given angle.
          * @param {number} angle an angle in degrees.
          */
  /* CompleteClass */
  override def rotate(angle: scala.Double): goLib.goMod.goNs.Point = js.native
  /**
          * Modify this Point so that its X and Y values have been scaled by given factors along the X and Y axes.
          * @param {number} sx
          * @param {number} sy
          */
  /* CompleteClass */
  override def scale(sx: scala.Double, sy: scala.Double): goLib.goMod.goNs.Point = js.native
  /**
          * Modify this Point so that its X and Y values are the same as the given Point.
          * @param {Point} p the given Point.
          */
  /* CompleteClass */
  override def set(p: goLib.goMod.goNs.Point): goLib.goMod.goNs.Point = js.native
  /**
          * Modify this Point so that its X and Y values correspond to a particular Spot
          * in a given Rect.
          * The result is meaningless if Spot.isNoSpot is true for the given Spot.
          * @param {Rect} r the Rect for which we are finding the point.
          * @param {Spot} spot the Spot; Spot.isSpot must be true for this Spot.
          */
  /* CompleteClass */
  override def setRectSpot(r: goLib.goMod.goNs.Rect, spot: goLib.goMod.goNs.Spot): goLib.goMod.goNs.Point = js.native
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
  /* CompleteClass */
  override def setSpot(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, spot: goLib.goMod.goNs.Spot): goLib.goMod.goNs.Point = js.native
  /**
          * Modify this Point with new X and Y values.
          * @param {number} x
          * @param {number} y
          */
  /* CompleteClass */
  override def setTo(x: scala.Double, y: scala.Double): goLib.goMod.goNs.Point = js.native
  /**
          * Modify this point to be at the nearest point on an infinite grid,
          * given the grid's origin and size of each grid cell.
          * @param {number} originx
          * @param {number} originy
          * @param {number} cellwidth
          * @param {number} cellheight
          */
  /* CompleteClass */
  override def snapToGrid(originx: scala.Double, originy: scala.Double, cellwidth: scala.Double, cellheight: scala.Double): goLib.goMod.goNs.Point = js.native
  /**
          * Modify this point to be at the nearest point on an infinite grid,
          * given the grid's origin and size of each grid cell.
          * @param {Point} origin
          * @param {Size} cellsize
          */
  /* CompleteClass */
  override def snapToGridPoint(origin: goLib.goMod.goNs.Point, cellsize: goLib.goMod.goNs.Size): goLib.goMod.goNs.Point = js.native
  /**
          * Modify this point so that is the difference of this Point and the
          * x and y co-ordinates of the given Point.
          * @param {Point} p The Point to subtract from the current Point.
          */
  /* CompleteClass */
  override def subtract(p: goLib.goMod.goNs.Point): goLib.goMod.goNs.Point = js.native
}

/**
    * A Point represents an x- and y-coordinate pair in two-dimensional space.
    */
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
  def direction(px: scala.Double, py: scala.Double, qx: scala.Double, qy: scala.Double): scala.Double = js.native
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
  def distanceLineSegmentSquared(
    px: scala.Double,
    py: scala.Double,
    ax: scala.Double,
    ay: scala.Double,
    bx: scala.Double,
    by: scala.Double
  ): scala.Double = js.native
  /**
          * This static function returns the square of the distance from the point P to the point Q.
          * @param {number} px
          * @param {number} py
          * @param {number} qx
          * @param {number} qy
          */
  def distanceSquared(px: scala.Double, py: scala.Double, qx: scala.Double, qy: scala.Double): scala.Double = js.native
  /**
          * This static function can be used to read in a Point from a string that was produced by Point.stringify.
          * @param {string} str
          */
  def parse(str: java.lang.String): goLib.goMod.goNs.Point = js.native
  /**
          * This static function can be used to write out a Point as a string that can be read by Point.parse.
          * @param {Point} val
          */
  def stringify(`val`: goLib.goMod.goNs.Point): java.lang.String = js.native
}

