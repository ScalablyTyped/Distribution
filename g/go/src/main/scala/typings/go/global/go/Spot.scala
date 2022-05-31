package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Spot represents a relative point from(0, 0) to(1, 1) within the bounds of
  * a rectangular area plus an absolute offset.
  */
@JSGlobal("go.Spot")
@js.native
/**
  * The default constructor produces the Spot(0, 0, 0, 0), at the top-left corner.
  */
class Spot ()
  extends typings.go.mod.Spot {
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
}
object Spot {
  
  @JSGlobal("go.Spot")
  @js.native
  val ^ : js.Any = js.native
  
  /**The set of points on all sides of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.AllSides")
  @js.native
  def AllSides: typings.go.mod.Spot = js.native
  inline def AllSides_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllSides")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.BottomCenter.*/
  /* static member */
  @JSGlobal("go.Spot.Bottom")
  @js.native
  def Bottom: typings.go.mod.Spot = js.native
  
  /**The specific point at the middle of the bottom side of bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.BottomCenter")
  @js.native
  def BottomCenter: typings.go.mod.Spot = js.native
  inline def BottomCenter_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomCenter")(x.asInstanceOf[js.Any])
  
  /**The specific point at the bottom-left corner of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.BottomLeft")
  @js.native
  def BottomLeft: typings.go.mod.Spot = js.native
  
  /**The set of points at the left or bottom sides of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.BottomLeftSides")
  @js.native
  def BottomLeftSides: typings.go.mod.Spot = js.native
  inline def BottomLeftSides_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomLeftSides")(x.asInstanceOf[js.Any])
  
  inline def BottomLeft_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomLeft")(x.asInstanceOf[js.Any])
  
  /**The specific point at the bottom-right corner of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.BottomRight")
  @js.native
  def BottomRight: typings.go.mod.Spot = js.native
  
  /**The set of points at the right or bottom sides of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.BottomRightSides")
  @js.native
  def BottomRightSides: typings.go.mod.Spot = js.native
  inline def BottomRightSides_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomRightSides")(x.asInstanceOf[js.Any])
  
  inline def BottomRight_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomRight")(x.asInstanceOf[js.Any])
  
  /**The set of points at the bottom side of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.BottomSide")
  @js.native
  def BottomSide: typings.go.mod.Spot = js.native
  inline def BottomSide_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BottomSide")(x.asInstanceOf[js.Any])
  
  inline def Bottom_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bottom")(x.asInstanceOf[js.Any])
  
  /**The specific point at the very center of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.Center")
  @js.native
  def Center: typings.go.mod.Spot = js.native
  inline def Center_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Center")(x.asInstanceOf[js.Any])
  
  /**Use this value to indicate that the real spot value is inherited from elsewhere.*/
  /* static member */
  @JSGlobal("go.Spot.Default")
  @js.native
  def Default: typings.go.mod.Spot = js.native
  inline def Default_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.LeftCenter.*/
  /* static member */
  @JSGlobal("go.Spot.Left")
  @js.native
  def Left: typings.go.mod.Spot = js.native
  
  /**The specific point at the middle of the left side of bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.LeftCenter")
  @js.native
  def LeftCenter: typings.go.mod.Spot = js.native
  inline def LeftCenter_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftCenter")(x.asInstanceOf[js.Any])
  
  /**The set of points at the left or right sides of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.LeftRightSides")
  @js.native
  def LeftRightSides: typings.go.mod.Spot = js.native
  inline def LeftRightSides_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftRightSides")(x.asInstanceOf[js.Any])
  
  /**The set of points at the left side of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.LeftSide")
  @js.native
  def LeftSide: typings.go.mod.Spot = js.native
  inline def LeftSide_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftSide")(x.asInstanceOf[js.Any])
  
  inline def Left_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Left")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.BottomCenter.*/
  /* static member */
  @JSGlobal("go.Spot.MiddleBottom")
  @js.native
  def MiddleBottom: typings.go.mod.Spot = js.native
  inline def MiddleBottom_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MiddleBottom")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.LeftCenter.*/
  /* static member */
  @JSGlobal("go.Spot.MiddleLeft")
  @js.native
  def MiddleLeft: typings.go.mod.Spot = js.native
  inline def MiddleLeft_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MiddleLeft")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.RightCenter.*/
  /* static member */
  @JSGlobal("go.Spot.MiddleRight")
  @js.native
  def MiddleRight: typings.go.mod.Spot = js.native
  inline def MiddleRight_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MiddleRight")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.TopCenter.*/
  /* static member */
  @JSGlobal("go.Spot.MiddleTop")
  @js.native
  def MiddleTop: typings.go.mod.Spot = js.native
  inline def MiddleTop_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MiddleTop")(x.asInstanceOf[js.Any])
  
  /**Use this Spot value to indicate no particular spot -- code looking for a particular point on an element will need to do their own calculations to determine the desired point depending on the circumstances.*/
  /* static member */
  @JSGlobal("go.Spot.None")
  @js.native
  def None: typings.go.mod.Spot = js.native
  inline def None_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**The set of points on all sides of bounding rectangle except bottom side.*/
  /* static member */
  @JSGlobal("go.Spot.NotBottomSide")
  @js.native
  def NotBottomSide: typings.go.mod.Spot = js.native
  inline def NotBottomSide_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotBottomSide")(x.asInstanceOf[js.Any])
  
  /**The set of points on all sides of the bounding rectangle except left side.*/
  /* static member */
  @JSGlobal("go.Spot.NotLeftSide")
  @js.native
  def NotLeftSide: typings.go.mod.Spot = js.native
  inline def NotLeftSide_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotLeftSide")(x.asInstanceOf[js.Any])
  
  /**The set of points on all sides of the bounding rectangle except right side.*/
  /* static member */
  @JSGlobal("go.Spot.NotRightSide")
  @js.native
  def NotRightSide: typings.go.mod.Spot = js.native
  inline def NotRightSide_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotRightSide")(x.asInstanceOf[js.Any])
  
  /**The set of points on all sides of the bounding rectangle except top side.*/
  /* static member */
  @JSGlobal("go.Spot.NotTopSide")
  @js.native
  def NotTopSide: typings.go.mod.Spot = js.native
  inline def NotTopSide_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotTopSide")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.RightCenter.*/
  /* static member */
  @JSGlobal("go.Spot.Right")
  @js.native
  def Right: typings.go.mod.Spot = js.native
  
  /**The specific point at the middle of the right side of bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.RightCenter")
  @js.native
  def RightCenter: typings.go.mod.Spot = js.native
  inline def RightCenter_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RightCenter")(x.asInstanceOf[js.Any])
  
  /**The set of points at the right side of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.RightSide")
  @js.native
  def RightSide: typings.go.mod.Spot = js.native
  inline def RightSide_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RightSide")(x.asInstanceOf[js.Any])
  
  inline def Right_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Right")(x.asInstanceOf[js.Any])
  
  /**A synonym for Spot.TopCenter.*/
  /* static member */
  @JSGlobal("go.Spot.Top")
  @js.native
  def Top: typings.go.mod.Spot = js.native
  
  /**The set of points at the top or bottom sides of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.TopBottomSides")
  @js.native
  def TopBottomSides: typings.go.mod.Spot = js.native
  inline def TopBottomSides_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopBottomSides")(x.asInstanceOf[js.Any])
  
  /**The specific point at the center of the top side of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.TopCenter")
  @js.native
  def TopCenter: typings.go.mod.Spot = js.native
  inline def TopCenter_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopCenter")(x.asInstanceOf[js.Any])
  
  /**The specific point at the top-left corner of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.TopLeft")
  @js.native
  def TopLeft: typings.go.mod.Spot = js.native
  
  /**The set of points at the top or left sides of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.TopLeftSides")
  @js.native
  def TopLeftSides: typings.go.mod.Spot = js.native
  inline def TopLeftSides_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopLeftSides")(x.asInstanceOf[js.Any])
  
  inline def TopLeft_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopLeft")(x.asInstanceOf[js.Any])
  
  /**The specific point at the top-right corner of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.TopRight")
  @js.native
  def TopRight: typings.go.mod.Spot = js.native
  
  /**The set of points at the top or right sides of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.TopRightSides")
  @js.native
  def TopRightSides: typings.go.mod.Spot = js.native
  inline def TopRightSides_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopRightSides")(x.asInstanceOf[js.Any])
  
  inline def TopRight_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopRight")(x.asInstanceOf[js.Any])
  
  /**The set of points at the top side of the bounding rectangle.*/
  /* static member */
  @JSGlobal("go.Spot.TopSide")
  @js.native
  def TopSide: typings.go.mod.Spot = js.native
  inline def TopSide_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopSide")(x.asInstanceOf[js.Any])
  
  inline def Top_=(x: typings.go.mod.Spot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Top")(x.asInstanceOf[js.Any])
  
  /**
    * This static function can be used to read in a Spot from a string that was produced by Spot.stringify.
    * @param {string} str
    */
  /* static member */
  inline def parse(str: String): typings.go.mod.Spot = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typings.go.mod.Spot]
  
  /**
    * This static function can be used to write out a Spot as a string that can be read by Spot.parse.
    * @param {Spot} val
    */
  /* static member */
  inline def stringify(`val`: typings.go.mod.Spot): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
