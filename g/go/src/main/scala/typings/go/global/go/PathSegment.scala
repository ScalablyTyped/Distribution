package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PathSegment represents a straight line or curved segment of a path between
  * two or more points that are part of a PathFigure.
  * A PathSegment must not be modified once its containing PathFigure's
  * Geometry has been assigned to a Shape.
  */
@JSGlobal("go.PathSegment")
@js.native
class PathSegment protected ()
  extends typings.go.mod.PathSegment {
  /**
    * Constructs a segment that goes nowhere unless you specify some Points.
    * @param {EnumValue} type
    * @param {number=} ex optional: the X coordinate of the end point.
    * @param {number=} ey optional: the Y coordinate of the end point.
    * @param {number=} x1 optional: the X coordinate of the first bezier control point.
    * @param {number=} y1 optional: the Y coordinate of the first bezier control point.
    * @param {number=} x2 optional: the X coordinate of the second cubic bezier control point.
    * @param {number=} y2 optional: the Y coordinate of the second cubic bezier control point,
    * or the large-arc-flag of an SvgArc.
    * @param {boolean=} clockwise optional: whether an SvgArc goes clockwise or counterclockwise.
    */
  def this(
    `type`: typings.go.mod.EnumValue,
    ex: js.UndefOr[Double],
    ey: js.UndefOr[Double],
    x1: js.UndefOr[Double],
    y1: js.UndefOr[Double],
    x2: js.UndefOr[Double],
    y2: js.UndefOr[Double],
    clockwise: js.UndefOr[Boolean]
  ) = this()
}
object PathSegment {
  
  @JSGlobal("go.PathSegment")
  @js.native
  val ^ : js.Any = js.native
  
  /**For drawing an arc segment, a value for PathSegment.type.*/
  /* static member */
  @JSGlobal("go.PathSegment.Arc")
  @js.native
  def Arc: typings.go.mod.EnumValue = js.native
  inline def Arc_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arc")(x.asInstanceOf[js.Any])
  
  /**For drawing a cubic bezier segment, a value for PathSegment.type.*/
  /* static member */
  @JSGlobal("go.PathSegment.Bezier")
  @js.native
  def Bezier: typings.go.mod.EnumValue = js.native
  inline def Bezier_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bezier")(x.asInstanceOf[js.Any])
  
  /**For drawing a straight line segment, a value for PathSegment.type.*/
  /* static member */
  @JSGlobal("go.PathSegment.Line")
  @js.native
  def Line: typings.go.mod.EnumValue = js.native
  inline def Line_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
  
  /**For beginning a new subpath, a value for PathSegment.type.*/
  /* static member */
  @JSGlobal("go.PathSegment.Move")
  @js.native
  def Move: typings.go.mod.EnumValue = js.native
  inline def Move_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Move")(x.asInstanceOf[js.Any])
  
  /**For drawing a quadratic bezier segment, a value for PathSegment.type.*/
  /* static member */
  @JSGlobal("go.PathSegment.QuadraticBezier")
  @js.native
  def QuadraticBezier: typings.go.mod.EnumValue = js.native
  inline def QuadraticBezier_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QuadraticBezier")(x.asInstanceOf[js.Any])
  
  /**For drawing an SVG arc segment, a value for PathSegment.type.*/
  /* static member */
  @JSGlobal("go.PathSegment.SvgArc")
  @js.native
  def SvgArc: typings.go.mod.EnumValue = js.native
  inline def SvgArc_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SvgArc")(x.asInstanceOf[js.Any])
}
