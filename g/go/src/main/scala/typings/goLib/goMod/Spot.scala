package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Spot represents a relative point from(0, 0) to(1, 1) within the bounds of
  * a rectangular area plus an absolute offset.
  */
@JSImport("go", "Spot")
@js.native
/**
  * The default constructor produces the Spot(0, 0, 0, 0), at the top-left corner.
  */
class Spot ()
  extends goLib.goMod.goNs.Spot {
  /**
    * The two-argument constructor produces the Spot(x, y), where X and Y are fractional distances, between zero and one.
    * @param {number} x must be between zero and one, inclusive.
    * @param {number} y must be between zero and one, inclusive.
    */
  def this(x: scala.Double, y: scala.Double) = this()
  /**
    * The four-argument constructor produces the Spot(x, y, offx, offy), where X and Y are fractional distances, between zero and one, and OFFX and OFFY are additional absolute offsets.
    * @param {number} x must be between zero and one, inclusive.
    * @param {number} y must be between zero and one, inclusive.
    * @param {number} offx an offset along the X coordinates, may be negative.
    * @param {number} offy an offset along the Y coordinates, may be negative.
    */
  def this(x: scala.Double, y: scala.Double, offx: scala.Double, offy: scala.Double) = this()
  /**Gets or sets the offsetX value of the Spot.*/
  /* CompleteClass */
  override var offsetX: scala.Double = js.native
  /**Gets or sets the offsetY value of the Spot.*/
  /* CompleteClass */
  override var offsetY: scala.Double = js.native
  /**Gets or sets the x value of the Spot, a fractional value between zero and one.*/
  /* CompleteClass */
  override var x: scala.Double = js.native
  /**Gets or sets the y value of the Spot, a fractional value between zero and one.*/
  /* CompleteClass */
  override var y: scala.Double = js.native
  /**
    * Create a copy of this Spot, with the same values.
    */
  /* CompleteClass */
  override def copy(): goLib.goMod.goNs.Spot = js.native
  /**
    * Two spots are equal if all four property values are the same.
    * @param {Spot} spot The Spot to compare to the current Spot.
    */
  /* CompleteClass */
  override def equals(spot: goLib.goMod.goNs.Spot): scala.Boolean = js.native
  /**
    * This predicate is true if this Spot is a side that
    * includes the side(s) given by the argument Spot.
    * @param {Spot} side
    */
  /* CompleteClass */
  override def includesSide(side: goLib.goMod.goNs.Spot): scala.Boolean = js.native
  /**
    * True if this is a special spot referring to the default spot.
    */
  /* CompleteClass */
  override def isDefault(): scala.Boolean = js.native
  /**
    * True if this is an unspecific special spot, such as Spot.None or one of the sides.
    */
  /* CompleteClass */
  override def isNoSpot(): scala.Boolean = js.native
  /**
    * True if this is a special spot referring to one (or more) of the sides.
    */
  /* CompleteClass */
  override def isSide(): scala.Boolean = js.native
  /**
    * True if this is a specific spot, not a side nor Spot.None.
    */
  /* CompleteClass */
  override def isSpot(): scala.Boolean = js.native
  /**
    * Return a new spot that is opposite this spot.
    */
  /* CompleteClass */
  override def opposite(): goLib.goMod.goNs.Spot = js.native
  /**
    * Modify this Spot so that its X, Y, OffsetX, and OffsetY values are the same as the given Spot.
    * @param {Spot} s the given Spot.
    */
  /* CompleteClass */
  override def set(s: goLib.goMod.goNs.Spot): goLib.goMod.goNs.Spot = js.native
  /**
    * Modify this Spot with new X, Y, OffsetX, and OffsetY values.
    * @param {number} x
    * @param {number} y
    * @param {number} offx
    * @param {number} offy
    */
  /* CompleteClass */
  override def setTo(x: scala.Double, y: scala.Double, offx: scala.Double, offy: scala.Double): goLib.goMod.goNs.Spot = js.native
}

/**
  * A Spot represents a relative point from(0, 0) to(1, 1) within the bounds of
  * a rectangular area plus an absolute offset.
  */
@JSImport("go", "Spot")
@js.native
object Spot extends js.Object {
  /**The set of points on all sides of the bounding rectangle.*/
  var AllSides: goLib.goMod.goNs.Spot = js.native
  /**A synonym for Spot.BottomCenter.*/
  var Bottom: goLib.goMod.goNs.Spot = js.native
  /**The specific point at the middle of the bottom side of bounding rectangle.*/
  var BottomCenter: goLib.goMod.goNs.Spot = js.native
  /**The specific point at the bottom-left corner of the bounding rectangle.*/
  var BottomLeft: goLib.goMod.goNs.Spot = js.native
  /**The set of points at the left or bottom sides of the bounding rectangle.*/
  var BottomLeftSides: goLib.goMod.goNs.Spot = js.native
  /**The specific point at the bottom-right corner of the bounding rectangle.*/
  var BottomRight: goLib.goMod.goNs.Spot = js.native
  /**The set of points at the right or bottom sides of the bounding rectangle.*/
  var BottomRightSides: goLib.goMod.goNs.Spot = js.native
  /**The set of points at the bottom side of the bounding rectangle.*/
  var BottomSide: goLib.goMod.goNs.Spot = js.native
  /**The specific point at the very center of the bounding rectangle.*/
  var Center: goLib.goMod.goNs.Spot = js.native
  /**Use this value to indicate that the real spot value is inherited from elsewhere.*/
  var Default: goLib.goMod.goNs.Spot = js.native
  /**A synonym for Spot.LeftCenter.*/
  var Left: goLib.goMod.goNs.Spot = js.native
  /**The specific point at the middle of the left side of bounding rectangle.*/
  var LeftCenter: goLib.goMod.goNs.Spot = js.native
  /**The set of points at the left or right sides of the bounding rectangle.*/
  var LeftRightSides: goLib.goMod.goNs.Spot = js.native
  /**The set of points at the left side of the bounding rectangle.*/
  var LeftSide: goLib.goMod.goNs.Spot = js.native
  /**A synonym for Spot.BottomCenter.*/
  var MiddleBottom: goLib.goMod.goNs.Spot = js.native
  /**A synonym for Spot.LeftCenter.*/
  var MiddleLeft: goLib.goMod.goNs.Spot = js.native
  /**A synonym for Spot.RightCenter.*/
  var MiddleRight: goLib.goMod.goNs.Spot = js.native
  /**A synonym for Spot.TopCenter.*/
  var MiddleTop: goLib.goMod.goNs.Spot = js.native
  /**Use this Spot value to indicate no particular spot -- code looking for a particular point on an element will need to do their own calculations to determine the desired point depending on the circumstances.*/
  var None: goLib.goMod.goNs.Spot = js.native
  /**The set of points on all sides of bounding rectangle except bottom side.*/
  var NotBottomSide: goLib.goMod.goNs.Spot = js.native
  /**The set of points on all sides of the bounding rectangle except left side.*/
  var NotLeftSide: goLib.goMod.goNs.Spot = js.native
  /**The set of points on all sides of the bounding rectangle except right side.*/
  var NotRightSide: goLib.goMod.goNs.Spot = js.native
  /**The set of points on all sides of the bounding rectangle except top side.*/
  var NotTopSide: goLib.goMod.goNs.Spot = js.native
  /**A synonym for Spot.RightCenter.*/
  var Right: goLib.goMod.goNs.Spot = js.native
  /**The specific point at the middle of the right side of bounding rectangle.*/
  var RightCenter: goLib.goMod.goNs.Spot = js.native
  /**The set of points at the right side of the bounding rectangle.*/
  var RightSide: goLib.goMod.goNs.Spot = js.native
  /**A synonym for Spot.TopCenter.*/
  var Top: goLib.goMod.goNs.Spot = js.native
  /**The set of points at the top or bottom sides of the bounding rectangle.*/
  var TopBottomSides: goLib.goMod.goNs.Spot = js.native
  /**The specific point at the center of the top side of the bounding rectangle.*/
  var TopCenter: goLib.goMod.goNs.Spot = js.native
  /**The specific point at the top-left corner of the bounding rectangle.*/
  var TopLeft: goLib.goMod.goNs.Spot = js.native
  /**The set of points at the top or left sides of the bounding rectangle.*/
  var TopLeftSides: goLib.goMod.goNs.Spot = js.native
  /**The specific point at the top-right corner of the bounding rectangle.*/
  var TopRight: goLib.goMod.goNs.Spot = js.native
  /**The set of points at the top or right sides of the bounding rectangle.*/
  var TopRightSides: goLib.goMod.goNs.Spot = js.native
  /**The set of points at the top side of the bounding rectangle.*/
  var TopSide: goLib.goMod.goNs.Spot = js.native
  /**
    * This static function can be used to read in a Spot from a string that was produced by Spot.stringify.
    * @param {string} str
    */
  def parse(str: java.lang.String): goLib.goMod.goNs.Spot = js.native
  /**
    * This static function can be used to write out a Spot as a string that can be read by Spot.parse.
    * @param {Spot} val
    */
  def stringify(`val`: goLib.goMod.goNs.Spot): java.lang.String = js.native
}

