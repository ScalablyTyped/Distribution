package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Point represents an x- and y-coordinate pair in two-dimensional space.
  */
@JSGlobal("go.Point")
@js.native
/**
  * The default constructor produces the Point(0,0).
  */
open class Point ()
  extends typings.go.mod.Point {
  /**
    * The two-argument constructor produces the Point(x, y).
    * @param {number} x
    * @param {number} y
    */
  def this(x: Double, y: Double) = this()
}
object Point {
  
  @JSGlobal("go.Point")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This static function returns the angle in degrees of the line from point P to point Q.
    * @param {number} px
    * @param {number} py
    * @param {number} qx
    * @param {number} qy
    */
  /* static member */
  inline def direction(px: Double, py: Double, qx: Double, qy: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("direction")(px.asInstanceOf[js.Any], py.asInstanceOf[js.Any], qx.asInstanceOf[js.Any], qy.asInstanceOf[js.Any])).asInstanceOf[Double]
  
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
  /* static member */
  inline def distanceLineSegmentSquared(px: Double, py: Double, ax: Double, ay: Double, bx: Double, by: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceLineSegmentSquared")(px.asInstanceOf[js.Any], py.asInstanceOf[js.Any], ax.asInstanceOf[js.Any], ay.asInstanceOf[js.Any], bx.asInstanceOf[js.Any], by.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * This static function returns the square of the distance from the point P to the point Q.
    * @param {number} px
    * @param {number} py
    * @param {number} qx
    * @param {number} qy
    */
  /* static member */
  inline def distanceSquared(px: Double, py: Double, qx: Double, qy: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquared")(px.asInstanceOf[js.Any], py.asInstanceOf[js.Any], qx.asInstanceOf[js.Any], qy.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * This static function can be used to read in a Point from a string that was produced by Point.stringify.
    * @param {string} str
    */
  /* static member */
  inline def parse(str: String): typings.go.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typings.go.mod.Point]
  
  /**
    * This static function can be used to write out a Point as a string that can be read by Point.parse.
    * @param {Point} val
    */
  /* static member */
  inline def stringify(`val`: typings.go.mod.Point): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
