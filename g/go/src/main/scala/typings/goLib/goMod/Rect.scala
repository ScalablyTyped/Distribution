package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Rect describes a rectangular two-dimensional area as a top-left point (x and y values)
  * and a size (width and height values).
  */
@JSImport("go", "Rect")
@js.native
/**
  * The default constructor (no argument) results in a Rect(0,0,0,0).
  */
class Rect () extends js.Object {
  /**
    * The constructor taking two Points produces a Rect that spans both points.
    * @param {Point} tl Top-left Point
    * @param {Point} br Bottom-right Point
    */
  def this(tl: Point, br: Point) = this()
  /**
    * The constructor taking a Point and a Size produces a Rect at that point with that size.
    * @param {Point} tl Top-left Point
    * @param {Point} sz Size
    */
  def this(tl: Point, sz: Size) = this()
  /**
    * The four-argument constructor takes four numbers for the x, y, width, height.
    * @param {number} x Top-left x value.
    * @param {number} y Top-left y value.
    * @param {number} w Width to be used; must be non-negative.
    * @param {number} h Height to be used; must be non-negative.
    */
  def this(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double) = this()
  /**Gets or sets the y-axis value of the bottom of the Rect.*/
  var bottom: scala.Double = js.native
  /**Gets or sets the Point at the center of this Rect.*/
  var center: Point = js.native
  /**Gets or sets the horizontal center X coordinate of the Rect.*/
  var centerX: scala.Double = js.native
  /**Gets or sets the vertical center Y coordinate of the Rect.*/
  var centerY: scala.Double = js.native
  /**Gets or sets the height of the Rect.*/
  var height: scala.Double = js.native
  /**Gets or sets the leftmost value of the Rect.*/
  var left: scala.Double = js.native
  /**Gets or sets the x- and y-axis position of the Rect as a Point.*/
  var position: Point = js.native
  /**Gets or sets the x-axis value of the right of the Rect.*/
  var right: scala.Double = js.native
  /**Gets or sets the width and height of the Rect as a Size.*/
  var size: Size = js.native
  /**Gets or sets the topmost value of the Rect.*/
  var top: scala.Double = js.native
  /**Gets or sets the width of the Rect.*/
  var width: scala.Double = js.native
  /**Gets or sets the top-left x coordinate of the Rect.*/
  var x: scala.Double = js.native
  /**Gets or sets the top-left y coordinate of the Rect.*/
  var y: scala.Double = js.native
  /**
    * Modify this Rect by adding the given Margin to each side of the Rect.
    * @param {Margin} m The Margin to add to the Rect.
    */
  def addMargin(m: Margin): Rect = js.native
  /**
    * Indicates whether this Rect contains the given Point/Rect.
    * @param {number} x The X coordinate of the Point or Rect to include in the new bounds.
    * @param {number} y The Y coordinate of the Point or Rect to include in the new bounds.
    * @param {number=} w The Width of the Rect to include in the new bounds, defaults to zero.
    * @param {number=} h The Height of the Rect to include in the new bounds, defaults to zero.
    * false otherwise.
    */
  def contains(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def contains(x: scala.Double, y: scala.Double, w: scala.Double): scala.Boolean = js.native
  def contains(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Boolean = js.native
  /**
    * Indicates whether this Rect contains the given Point.
    * @param {Point} p The Point to check.
    * false otherwise.
    */
  def containsPoint(p: Point): scala.Boolean = js.native
  /**
    * Indicates whether this Rect contains the given Rect.
    * @param {Rect} r The Rect to check.
    * false otherwise.
    */
  def containsRect(r: Rect): scala.Boolean = js.native
  /**
    * Create a copy of this Rect, with the same values.
    */
  def copy(): Rect = js.native
  /**
    * Indicates whether the given Rect is equal to the current Rect.
    * @param {number} x
    * @param {number} y
    * @param {number} w the width.
    * @param {number} h the height.
    */
  def equalTo(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Boolean = js.native
  /**
    * Indicates whether the given Rect is equal to the current Rect.
    * @param {Rect} r The rectangle to compare to the current rectangle.
    * and height.
    */
  def equals(r: Rect): scala.Boolean = js.native
  def equalsApprox(r: Rect): scala.Boolean = js.native
  /**
    * Modifies this Rect by adding some distance to each side of the Rect.
    * @param {number} t the amount to move the top side upwards; may be negative.
    * @param {number} r the amount to move the right side rightwards; may be negative.
    * @param {number} b the amount to move the bottom side downwards; may be negative.
    * @param {number} l the amount to move the left side leftwards; may be negative.
    */
  def grow(t: scala.Double, r: scala.Double, b: scala.Double, l: scala.Double): Rect = js.native
  /**
    * Modify this Rect so that its width and height are changed on all four sides,
    * equally on the left and right sides, and equally on the top and bottom sides.
    * When the arguments are negative, this operation deflates this Rect, but not beyond zero.
    * @param {number} w The additional width on each side, left and right; may be negative.
    * @param {number} h The additional height on each side, top and bottom; may be negative.
    */
  def inflate(w: scala.Double, h: scala.Double): Rect = js.native
  /**
    * Modify this Rect so that it is the intersection of this Rect and the rectangle
    * defined by x, y, w, h.
    * @param {number} x
    * @param {number} y
    * @param {number} w
    * @param {number} h
    */
  def intersect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): Rect = js.native
  /**
    * Modify this Rect so that it is the intersection of this Rect and the given Rect.
    * @param {Rect} r Rect to intersect with.
    */
  def intersectRect(r: Rect): Rect = js.native
  /**
    * Determine if this Rect partly or wholly overlaps the rectangle
    * defined by x, y, w, h.
    * @param {number} x
    * @param {number} y
    * @param {number} w
    * @param {number} h
    */
  def intersects(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Boolean = js.native
  /**
    * Determine if a given Rect is partly or wholly inside of this Rect.
    * @param {Rect} r Rect to test intersection with.
    */
  def intersectsRect(r: Rect): scala.Boolean = js.native
  /**
    * True if this Rect has a Width and Height of zero.
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * True if this Rect has X, Y, Width, and Height values that are real numbers and not infinity.
    */
  def isReal(): scala.Boolean = js.native
  /**
    * Modify this Rect by shifting its values with the given DX and DY offsets.
    * @param {number} dx
    * @param {number} dy
    */
  def offset(dx: scala.Double, dy: scala.Double): Rect = js.native
  /**
    * Modify this Rect so that its X, Y, Width, and Height values are the same as the given Rect.
    * @param {Rect} r the given Rect.
    */
  def set(r: Rect): Rect = js.native
  /**
    * Modify this Rect so that its X and Y values are the same as the given Point.
    * @param {Point} p the given Point.
    */
  def setPoint(p: Point): Rect = js.native
  /**
    * Modify this Rect so that its Width and Height values are the same as the given Size.
    * @param {Size} s the given Size.
    */
  def setSize(s: Size): Rect = js.native
  /**
    * Modify this Rect so that a given Spot is at a given (x,y) point using this Rect's size.
    * Return this rectangle for which the spot is at that point, without modifying the size.
    * The result is meaningless if Spot.isNoSpot is true.
    * @param {number} x the point where the spot should be.
    * @param {number} y the point where the spot should be.
    * @param {Spot} spot a Spot; Spot.isSpot must be true.
    */
  def setSpot(x: scala.Double, y: scala.Double, spot: Spot): Rect = js.native
  /**
    * Modify this Rect with new X, Y, Width, and Height values.
    * @param {number} x
    * @param {number} y
    * @param {number} w the width.
    * @param {number} h the height.
    */
  def setTo(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): Rect = js.native
  /**
    * Modify this Rect by subtracting the given Margin from each side of the Rect.
    * @param {Margin} m The Margin to subtract from the Rect.
    */
  def subtractMargin(m: Margin): Rect = js.native
  /**
    * Modify this Rect to be exactly big enough to contain both the original Rect and the given rectangular area.
    * @param {number} x The X coordinate of the Point or Rect to include in the new bounds.
    * @param {number} y The Y coordinate of the Point or Rect to include in the new bounds.
    * @param {number=} w The Width of the Rect to include in the new bounds, defaults to zero.
    * @param {number=} h The Height of the Rect to include in the new bounds, defaults to zero.
    */
  def union(x: scala.Double, y: scala.Double): Rect = js.native
  def union(x: scala.Double, y: scala.Double, w: scala.Double): Rect = js.native
  def union(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): Rect = js.native
  /**
    * Modify this Rect to be exactly big enough to contain both the original Rect and the given Point.
    * @param {Point} p The Point to include in the new bounds.
    */
  def unionPoint(p: Point): Rect = js.native
  /**
    * Modify this Rect to be exactly big enough to contain this Rect and the given Rect.
    *
    * @param {Rect} r The Rect to include in the new bounds.
    */
  def unionRect(r: Rect): Rect = js.native
}

/* static members */
@JSImport("go", "Rect")
@js.native
object Rect extends js.Object {
  /**
    * This static function indicates whether a Rect contains the given Point/Rect.
    * @param {number} rx The X coordinate of a Rect.
    * @param {number} ry The Y coordinate of a Rect.
    * @param {number} rw The Width of a Rect.
    * @param {number} rh The Height of a Rect.
    * @param {number} x The X coordinate of the Point or Rect that might be in the bounds (RX, RY, RW, RH).
    * @param {number} y The Y coordinate of the Point or Rect that might be in the bounds (RX, RY, RW, RH).
    * @param {number=} w The Width of the Rect to include in the new bounds, defaults to zero.
    * @param {number=} h The Height of the Rect to include in the new bounds, defaults to zero.
    * false otherwise.
    */
  def contains(
    rx: scala.Double,
    ry: scala.Double,
    rw: scala.Double,
    rh: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Boolean = js.native
  def contains(
    rx: scala.Double,
    ry: scala.Double,
    rw: scala.Double,
    rh: scala.Double,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double
  ): scala.Boolean = js.native
  def contains(
    rx: scala.Double,
    ry: scala.Double,
    rw: scala.Double,
    rh: scala.Double,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double
  ): scala.Boolean = js.native
  /**
    * This static function indicates whether a Rect partly or wholly overlaps the given Rect.
    * @param {number} rx The X coordinate of a Rect.
    * @param {number} ry The Y coordinate of a Rect.
    * @param {number} rw The Width of a Rect.
    * @param {number} rh The Height of a Rect.
    * @param {number} x The X coordinate of the Point or Rect that might overlap the bounds (RX, RY, RW, RH).
    * @param {number} y The Y coordinate of the Point or Rect that might overlap the bounds (RX, RY, RW, RH).
    * @param {number} w
    * @param {number} h
    */
  def intersects(
    rx: scala.Double,
    ry: scala.Double,
    rw: scala.Double,
    rh: scala.Double,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double
  ): scala.Boolean = js.native
  /**
    * This static function can be used to read in a Rect from a string that was produced by Rect.stringify.
    * @param {string} str
    */
  def parse(str: java.lang.String): goLib.goMod.Rect = js.native
  /**
    * This static function can be used to write out a Rect as a string that can be read by Rect.parse.
    * @param {Rect} val
    */
  def stringify(`val`: goLib.goMod.Rect): java.lang.String = js.native
}

