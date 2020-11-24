package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Spot represents a relative point from(0, 0) to(1, 1) within the bounds of
  * a rectangular area plus an absolute offset.
  */
@JSImport("go", "Spot")
@js.native
/**
  * The default constructor produces the Spot(0, 0, 0, 0), at the top-left corner.
  */
class Spot () extends js.Object {
  /**
    * The two-argument constructor produces the Spot(x, y), where X and Y are fractional distances, between zero and one.
    * @param {number} x must be between zero and one, inclusive.
    * @param {number} y must be between zero and one, inclusive.
    */
  def this(x: Double, y: Double) = this()
  /**
    * The four-argument constructor produces the Spot(x, y, offx, offy), where X and Y are fractional distances, between zero and one, and OFFX and OFFY are additional absolute offsets.
    * @param {number} x must be between zero and one, inclusive.
    * @param {number} y must be between zero and one, inclusive.
    * @param {number} offx an offset along the X coordinates, may be negative.
    * @param {number} offy an offset along the Y coordinates, may be negative.
    */
  def this(x: Double, y: Double, offx: Double, offy: Double) = this()
  
  /**
    * Create a copy of this Spot, with the same values.
    */
  def copy(): Spot = js.native
  
  /**
    * Two spots are equal if all four property values are the same.
    * @param {Spot} spot The Spot to compare to the current Spot.
    */
  def equals(spot: Spot): Boolean = js.native
  
  /**
    * This predicate is true if this Spot is a side that
    * includes the side(s) given by the argument Spot.
    * @param {Spot} side
    */
  def includesSide(side: Spot): Boolean = js.native
  
  /**
    * True if this is a special spot referring to the default spot.
    */
  def isDefault(): Boolean = js.native
  
  /**
    * True if this is an unspecific special spot, such as Spot.None or one of the sides.
    */
  def isNoSpot(): Boolean = js.native
  
  /**
    * True if this is a special spot referring to one (or more) of the sides.
    */
  def isSide(): Boolean = js.native
  
  /**
    * True if this is a specific spot, not a side nor Spot.None.
    */
  def isSpot(): Boolean = js.native
  
  /**Gets or sets the offsetX value of the Spot.*/
  var offsetX: Double = js.native
  
  /**Gets or sets the offsetY value of the Spot.*/
  var offsetY: Double = js.native
  
  /**
    * Return a new spot that is opposite this spot.
    */
  def opposite(): Spot = js.native
  
  /**
    * Modify this Spot so that its X, Y, OffsetX, and OffsetY values are the same as the given Spot.
    * @param {Spot} s the given Spot.
    */
  def set(s: Spot): Spot = js.native
  
  /**
    * Modify this Spot with new X, Y, OffsetX, and OffsetY values.
    * @param {number} x
    * @param {number} y
    * @param {number} offx
    * @param {number} offy
    */
  def setTo(x: Double, y: Double, offx: Double, offy: Double): Spot = js.native
  
  /**Gets or sets the x value of the Spot, a fractional value between zero and one.*/
  var x: Double = js.native
  
  /**Gets or sets the y value of the Spot, a fractional value between zero and one.*/
  var y: Double = js.native
}
/* static members */
@JSImport("go", "Spot")
@js.native
object Spot extends js.Object {
  
  /**The set of points on all sides of the bounding rectangle.*/
  var AllSides: Spot = js.native
  
  /**A synonym for Spot.BottomCenter.*/
  var Bottom: Spot = js.native
  
  /**The specific point at the middle of the bottom side of bounding rectangle.*/
  var BottomCenter: Spot = js.native
  
  /**The specific point at the bottom-left corner of the bounding rectangle.*/
  var BottomLeft: Spot = js.native
  
  /**The set of points at the left or bottom sides of the bounding rectangle.*/
  var BottomLeftSides: Spot = js.native
  
  /**The specific point at the bottom-right corner of the bounding rectangle.*/
  var BottomRight: Spot = js.native
  
  /**The set of points at the right or bottom sides of the bounding rectangle.*/
  var BottomRightSides: Spot = js.native
  
  /**The set of points at the bottom side of the bounding rectangle.*/
  var BottomSide: Spot = js.native
  
  /**The specific point at the very center of the bounding rectangle.*/
  var Center: Spot = js.native
  
  /**Use this value to indicate that the real spot value is inherited from elsewhere.*/
  var Default: Spot = js.native
  
  /**A synonym for Spot.LeftCenter.*/
  var Left: Spot = js.native
  
  /**The specific point at the middle of the left side of bounding rectangle.*/
  var LeftCenter: Spot = js.native
  
  /**The set of points at the left or right sides of the bounding rectangle.*/
  var LeftRightSides: Spot = js.native
  
  /**The set of points at the left side of the bounding rectangle.*/
  var LeftSide: Spot = js.native
  
  /**A synonym for Spot.BottomCenter.*/
  var MiddleBottom: Spot = js.native
  
  /**A synonym for Spot.LeftCenter.*/
  var MiddleLeft: Spot = js.native
  
  /**A synonym for Spot.RightCenter.*/
  var MiddleRight: Spot = js.native
  
  /**A synonym for Spot.TopCenter.*/
  var MiddleTop: Spot = js.native
  
  /**Use this Spot value to indicate no particular spot -- code looking for a particular point on an element will need to do their own calculations to determine the desired point depending on the circumstances.*/
  var None: Spot = js.native
  
  /**The set of points on all sides of bounding rectangle except bottom side.*/
  var NotBottomSide: Spot = js.native
  
  /**The set of points on all sides of the bounding rectangle except left side.*/
  var NotLeftSide: Spot = js.native
  
  /**The set of points on all sides of the bounding rectangle except right side.*/
  var NotRightSide: Spot = js.native
  
  /**The set of points on all sides of the bounding rectangle except top side.*/
  var NotTopSide: Spot = js.native
  
  /**A synonym for Spot.RightCenter.*/
  var Right: Spot = js.native
  
  /**The specific point at the middle of the right side of bounding rectangle.*/
  var RightCenter: Spot = js.native
  
  /**The set of points at the right side of the bounding rectangle.*/
  var RightSide: Spot = js.native
  
  /**A synonym for Spot.TopCenter.*/
  var Top: Spot = js.native
  
  /**The set of points at the top or bottom sides of the bounding rectangle.*/
  var TopBottomSides: Spot = js.native
  
  /**The specific point at the center of the top side of the bounding rectangle.*/
  var TopCenter: Spot = js.native
  
  /**The specific point at the top-left corner of the bounding rectangle.*/
  var TopLeft: Spot = js.native
  
  /**The set of points at the top or left sides of the bounding rectangle.*/
  var TopLeftSides: Spot = js.native
  
  /**The specific point at the top-right corner of the bounding rectangle.*/
  var TopRight: Spot = js.native
  
  /**The set of points at the top or right sides of the bounding rectangle.*/
  var TopRightSides: Spot = js.native
  
  /**The set of points at the top side of the bounding rectangle.*/
  var TopSide: Spot = js.native
  
  /**
    * This static function can be used to read in a Spot from a string that was produced by Spot.stringify.
    * @param {string} str
    */
  def parse(str: String): Spot = js.native
  
  /**
    * This static function can be used to write out a Spot as a string that can be read by Spot.parse.
    * @param {Spot} val
    */
  def stringify(`val`: Spot): String = js.native
}
