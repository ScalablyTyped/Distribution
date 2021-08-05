package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
class Spot () extends StObject {
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
object Spot {
  
  @JSImport("go", "Spot")
  @js.native
  val ^ : js.Any = js.native
  
  /**The set of points on all sides of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.AllSides")
  @js.native
  def AllSides: Spot = js.native
  inline def AllSides_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllSides")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.BottomCenter.*/
  /* static member */
  @JSImport("go", "Spot.Bottom")
  @js.native
  def Bottom: Spot = js.native
  
  /**The specific point at the middle of the bottom side of bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.BottomCenter")
  @js.native
  def BottomCenter: Spot = js.native
  inline def BottomCenter_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomCenter")(x.asInstanceOf[js.Any])
  
  /**The specific point at the bottom-left corner of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.BottomLeft")
  @js.native
  def BottomLeft: Spot = js.native
  
  /**The set of points at the left or bottom sides of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.BottomLeftSides")
  @js.native
  def BottomLeftSides: Spot = js.native
  inline def BottomLeftSides_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomLeftSides")(x.asInstanceOf[js.Any])
  
  inline def BottomLeft_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomLeft")(x.asInstanceOf[js.Any])
  
  /**The specific point at the bottom-right corner of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.BottomRight")
  @js.native
  def BottomRight: Spot = js.native
  
  /**The set of points at the right or bottom sides of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.BottomRightSides")
  @js.native
  def BottomRightSides: Spot = js.native
  inline def BottomRightSides_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomRightSides")(x.asInstanceOf[js.Any])
  
  inline def BottomRight_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomRight")(x.asInstanceOf[js.Any])
  
  /**The set of points at the bottom side of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.BottomSide")
  @js.native
  def BottomSide: Spot = js.native
  inline def BottomSide_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomSide")(x.asInstanceOf[js.Any])
  
  inline def Bottom_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bottom")(x.asInstanceOf[js.Any])
  
  /**The specific point at the very center of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.Center")
  @js.native
  def Center: Spot = js.native
  inline def Center_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Center")(x.asInstanceOf[js.Any])
  
  /**Use this value to indicate that the real spot value is inherited from elsewhere.*/
  /* static member */
  @JSImport("go", "Spot.Default")
  @js.native
  def Default: Spot = js.native
  inline def Default_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.LeftCenter.*/
  /* static member */
  @JSImport("go", "Spot.Left")
  @js.native
  def Left: Spot = js.native
  
  /**The specific point at the middle of the left side of bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.LeftCenter")
  @js.native
  def LeftCenter: Spot = js.native
  inline def LeftCenter_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftCenter")(x.asInstanceOf[js.Any])
  
  /**The set of points at the left or right sides of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.LeftRightSides")
  @js.native
  def LeftRightSides: Spot = js.native
  inline def LeftRightSides_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftRightSides")(x.asInstanceOf[js.Any])
  
  /**The set of points at the left side of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.LeftSide")
  @js.native
  def LeftSide: Spot = js.native
  inline def LeftSide_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftSide")(x.asInstanceOf[js.Any])
  
  inline def Left_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Left")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.BottomCenter.*/
  /* static member */
  @JSImport("go", "Spot.MiddleBottom")
  @js.native
  def MiddleBottom: Spot = js.native
  inline def MiddleBottom_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MiddleBottom")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.LeftCenter.*/
  /* static member */
  @JSImport("go", "Spot.MiddleLeft")
  @js.native
  def MiddleLeft: Spot = js.native
  inline def MiddleLeft_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MiddleLeft")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.RightCenter.*/
  /* static member */
  @JSImport("go", "Spot.MiddleRight")
  @js.native
  def MiddleRight: Spot = js.native
  inline def MiddleRight_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MiddleRight")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.TopCenter.*/
  /* static member */
  @JSImport("go", "Spot.MiddleTop")
  @js.native
  def MiddleTop: Spot = js.native
  inline def MiddleTop_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MiddleTop")(x.asInstanceOf[js.Any])
  
  /**Use this Spot value to indicate no particular spot -- code looking for a particular point on an element will need to do their own calculations to determine the desired point depending on the circumstances.*/
  /* static member */
  @JSImport("go", "Spot.None")
  @js.native
  def None: Spot = js.native
  inline def None_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**The set of points on all sides of bounding rectangle except bottom side.*/
  /* static member */
  @JSImport("go", "Spot.NotBottomSide")
  @js.native
  def NotBottomSide: Spot = js.native
  inline def NotBottomSide_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotBottomSide")(x.asInstanceOf[js.Any])
  
  /**The set of points on all sides of the bounding rectangle except left side.*/
  /* static member */
  @JSImport("go", "Spot.NotLeftSide")
  @js.native
  def NotLeftSide: Spot = js.native
  inline def NotLeftSide_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotLeftSide")(x.asInstanceOf[js.Any])
  
  /**The set of points on all sides of the bounding rectangle except right side.*/
  /* static member */
  @JSImport("go", "Spot.NotRightSide")
  @js.native
  def NotRightSide: Spot = js.native
  inline def NotRightSide_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotRightSide")(x.asInstanceOf[js.Any])
  
  /**The set of points on all sides of the bounding rectangle except top side.*/
  /* static member */
  @JSImport("go", "Spot.NotTopSide")
  @js.native
  def NotTopSide: Spot = js.native
  inline def NotTopSide_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotTopSide")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.RightCenter.*/
  /* static member */
  @JSImport("go", "Spot.Right")
  @js.native
  def Right: Spot = js.native
  
  /**The specific point at the middle of the right side of bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.RightCenter")
  @js.native
  def RightCenter: Spot = js.native
  inline def RightCenter_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RightCenter")(x.asInstanceOf[js.Any])
  
  /**The set of points at the right side of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.RightSide")
  @js.native
  def RightSide: Spot = js.native
  inline def RightSide_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RightSide")(x.asInstanceOf[js.Any])
  
  inline def Right_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Right")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.TopCenter.*/
  /* static member */
  @JSImport("go", "Spot.Top")
  @js.native
  def Top: Spot = js.native
  
  /**The set of points at the top or bottom sides of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.TopBottomSides")
  @js.native
  def TopBottomSides: Spot = js.native
  inline def TopBottomSides_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopBottomSides")(x.asInstanceOf[js.Any])
  
  /**The specific point at the center of the top side of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.TopCenter")
  @js.native
  def TopCenter: Spot = js.native
  inline def TopCenter_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopCenter")(x.asInstanceOf[js.Any])
  
  /**The specific point at the top-left corner of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.TopLeft")
  @js.native
  def TopLeft: Spot = js.native
  
  /**The set of points at the top or left sides of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.TopLeftSides")
  @js.native
  def TopLeftSides: Spot = js.native
  inline def TopLeftSides_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopLeftSides")(x.asInstanceOf[js.Any])
  
  inline def TopLeft_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopLeft")(x.asInstanceOf[js.Any])
  
  /**The specific point at the top-right corner of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.TopRight")
  @js.native
  def TopRight: Spot = js.native
  
  /**The set of points at the top or right sides of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.TopRightSides")
  @js.native
  def TopRightSides: Spot = js.native
  inline def TopRightSides_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopRightSides")(x.asInstanceOf[js.Any])
  
  inline def TopRight_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopRight")(x.asInstanceOf[js.Any])
  
  /**The set of points at the top side of the bounding rectangle.*/
  /* static member */
  @JSImport("go", "Spot.TopSide")
  @js.native
  def TopSide: Spot = js.native
  inline def TopSide_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopSide")(x.asInstanceOf[js.Any])
  
  inline def Top_=(x: Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Top")(x.asInstanceOf[js.Any])
  
  /**
    * This static function can be used to read in a Spot from a string that was produced by Spot.stringify.
    * @param {string} str
    */
  /* static member */
  inline def parse(str: String): Spot = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[Spot]
  
  /**
    * This static function can be used to write out a Spot as a string that can be read by Spot.parse.
    * @param {Spot} val
    */
  /* static member */
  inline def stringify(`val`: Spot): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
