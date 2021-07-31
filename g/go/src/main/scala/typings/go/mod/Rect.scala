package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Rect describes a rectangular two-dimensional area as a top-left point (x and y values)
  * and a size (width and height values).
  */
@JSImport("go", "Rect")
@js.native
/**
  * The default constructor (no argument) results in a Rect(0,0,0,0).
  */
class Rect () extends StObject {
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
  def this(x: Double, y: Double, w: Double, h: Double) = this()
  
  /**
    * Modify this Rect by adding the given Margin to each side of the Rect.
    * @param {Margin} m The Margin to add to the Rect.
    */
  def addMargin(m: Margin): Rect = js.native
  
  /**Gets or sets the y-axis value of the bottom of the Rect.*/
  var bottom: Double = js.native
  
  /**Gets or sets the Point at the center of this Rect.*/
  var center: Point = js.native
  
  /**Gets or sets the horizontal center X coordinate of the Rect.*/
  var centerX: Double = js.native
  
  /**Gets or sets the vertical center Y coordinate of the Rect.*/
  var centerY: Double = js.native
  
  /**
    * Indicates whether this Rect contains the given Point/Rect.
    * @param {number} x The X coordinate of the Point or Rect to include in the new bounds.
    * @param {number} y The Y coordinate of the Point or Rect to include in the new bounds.
    * @param {number=} w The Width of the Rect to include in the new bounds, defaults to zero.
    * @param {number=} h The Height of the Rect to include in the new bounds, defaults to zero.
    * false otherwise.
    */
  def contains(x: Double, y: Double): Boolean = js.native
  def contains(x: Double, y: Double, w: Double): Boolean = js.native
  def contains(x: Double, y: Double, w: Double, h: Double): Boolean = js.native
  def contains(x: Double, y: Double, w: Unit, h: Double): Boolean = js.native
  
  /**
    * Indicates whether this Rect contains the given Point.
    * @param {Point} p The Point to check.
    * false otherwise.
    */
  def containsPoint(p: Point): Boolean = js.native
  
  /**
    * Indicates whether this Rect contains the given Rect.
    * @param {Rect} r The Rect to check.
    * false otherwise.
    */
  def containsRect(r: Rect): Boolean = js.native
  
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
  def equalTo(x: Double, y: Double, w: Double, h: Double): Boolean = js.native
  
  /**
    * Indicates whether the given Rect is equal to the current Rect.
    * @param {Rect} r The rectangle to compare to the current rectangle.
    * and height.
    */
  def equals(r: Rect): Boolean = js.native
  
  def equalsApprox(r: Rect): Boolean = js.native
  
  /**
    * Modifies this Rect by adding some distance to each side of the Rect.
    * @param {number} t the amount to move the top side upwards; may be negative.
    * @param {number} r the amount to move the right side rightwards; may be negative.
    * @param {number} b the amount to move the bottom side downwards; may be negative.
    * @param {number} l the amount to move the left side leftwards; may be negative.
    */
  def grow(t: Double, r: Double, b: Double, l: Double): Rect = js.native
  
  /**Gets or sets the height of the Rect.*/
  var height: Double = js.native
  
  /**
    * Modify this Rect so that its width and height are changed on all four sides,
    * equally on the left and right sides, and equally on the top and bottom sides.
    * When the arguments are negative, this operation deflates this Rect, but not beyond zero.
    * @param {number} w The additional width on each side, left and right; may be negative.
    * @param {number} h The additional height on each side, top and bottom; may be negative.
    */
  def inflate(w: Double, h: Double): Rect = js.native
  
  /**
    * Modify this Rect so that it is the intersection of this Rect and the rectangle
    * defined by x, y, w, h.
    * @param {number} x
    * @param {number} y
    * @param {number} w
    * @param {number} h
    */
  def intersect(x: Double, y: Double, w: Double, h: Double): Rect = js.native
  
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
  def intersects(x: Double, y: Double, w: Double, h: Double): Boolean = js.native
  
  /**
    * Determine if a given Rect is partly or wholly inside of this Rect.
    * @param {Rect} r Rect to test intersection with.
    */
  def intersectsRect(r: Rect): Boolean = js.native
  
  /**
    * True if this Rect has a Width and Height of zero.
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * True if this Rect has X, Y, Width, and Height values that are real numbers and not infinity.
    */
  def isReal(): Boolean = js.native
  
  /**Gets or sets the leftmost value of the Rect.*/
  var left: Double = js.native
  
  /**
    * Modify this Rect by shifting its values with the given DX and DY offsets.
    * @param {number} dx
    * @param {number} dy
    */
  def offset(dx: Double, dy: Double): Rect = js.native
  
  /**Gets or sets the x- and y-axis position of the Rect as a Point.*/
  var position: Point = js.native
  
  /**Gets or sets the x-axis value of the right of the Rect.*/
  var right: Double = js.native
  
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
  def setSpot(x: Double, y: Double, spot: Spot): Rect = js.native
  
  /**
    * Modify this Rect with new X, Y, Width, and Height values.
    * @param {number} x
    * @param {number} y
    * @param {number} w the width.
    * @param {number} h the height.
    */
  def setTo(x: Double, y: Double, w: Double, h: Double): Rect = js.native
  
  /**Gets or sets the width and height of the Rect as a Size.*/
  var size: Size = js.native
  
  /**
    * Modify this Rect by subtracting the given Margin from each side of the Rect.
    * @param {Margin} m The Margin to subtract from the Rect.
    */
  def subtractMargin(m: Margin): Rect = js.native
  
  /**Gets or sets the topmost value of the Rect.*/
  var top: Double = js.native
  
  /**
    * Modify this Rect to be exactly big enough to contain both the original Rect and the given rectangular area.
    * @param {number} x The X coordinate of the Point or Rect to include in the new bounds.
    * @param {number} y The Y coordinate of the Point or Rect to include in the new bounds.
    * @param {number=} w The Width of the Rect to include in the new bounds, defaults to zero.
    * @param {number=} h The Height of the Rect to include in the new bounds, defaults to zero.
    */
  def union(x: Double, y: Double): Rect = js.native
  def union(x: Double, y: Double, w: Double): Rect = js.native
  def union(x: Double, y: Double, w: Double, h: Double): Rect = js.native
  def union(x: Double, y: Double, w: Unit, h: Double): Rect = js.native
  
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
  
  /**Gets or sets the width of the Rect.*/
  var width: Double = js.native
  
  /**Gets or sets the top-left x coordinate of the Rect.*/
  var x: Double = js.native
  
  /**Gets or sets the top-left y coordinate of the Rect.*/
  var y: Double = js.native
}
object Rect {
  
  @JSImport("go", "Rect")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  @scala.inline
  def contains(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rw.asInstanceOf[js.Any], rh.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def contains(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double, w: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rw.asInstanceOf[js.Any], rh.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def contains(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double, w: Double, h: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rw.asInstanceOf[js.Any], rh.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def contains(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double, w: Unit, h: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rw.asInstanceOf[js.Any], rh.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
  /* static member */
  @scala.inline
  def intersects(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double, w: Double, h: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rw.asInstanceOf[js.Any], rh.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * This static function can be used to read in a Rect from a string that was produced by Rect.stringify.
    * @param {string} str
    */
  /* static member */
  @scala.inline
  def parse(str: String): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[Rect]
  
  /**
    * This static function can be used to write out a Rect as a string that can be read by Rect.parse.
    * @param {Rect} val
    */
  /* static member */
  @scala.inline
  def stringify(`val`: Rect): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
