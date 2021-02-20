package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PathSegment represents a straight line or curved segment of a path between
  * two or more points that are part of a PathFigure.
  * A PathSegment must not be modified once its containing PathFigure's
  * Geometry has been assigned to a Shape.
  */
@JSImport("go", "PathSegment")
@js.native
class PathSegment protected () extends StObject {
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
    `type`: EnumValue,
    ex: js.UndefOr[Double],
    ey: js.UndefOr[Double],
    x1: js.UndefOr[Double],
    y1: js.UndefOr[Double],
    x2: js.UndefOr[Double],
    y2: js.UndefOr[Double],
    clockwise: js.UndefOr[Boolean]
  ) = this()
  
  /**Gets or sets the center X value of the Arc for a PathSegment of type .Arc.*/
  var centerX: Double = js.native
  
  /**Gets or sets the center Y value of the Arc for a PathSegment of type .Arc.*/
  var centerY: Double = js.native
  
  /**
    * Closes the path after this PathSegment.
    */
  def close(): PathSegment = js.native
  
  /**
    * Makes a copy of this PathSegment.
    */
  def copy(): PathSegment = js.native
  
  /**Gets or sets the X coordinate of the end point for all kinds of PathSegment.*/
  var endX: Double = js.native
  
  /**Gets or sets the Y coordinate of the end point for all kinds of PathSegment.*/
  var endY: Double = js.native
  
  def equalsApprox(s: PathSegment): Boolean = js.native
  
  /**Gets or sets the sweep-flag for a PathSegment of type .SvgArc.*/
  var isClockwiseArc: Boolean = js.native
  
  /**Gets or sets whether the path is closed after this PathSegment.*/
  var isClosed: Boolean = js.native
  
  /**Gets or sets the large-arc-flag for a PathSegment of type .SvgArc.*/
  var isLargeArc: Boolean = js.native
  
  /**Gets or sets the X value of the first control point for a PathSegment of type .Bezier or .QuadraticBezier.*/
  var point1X: Double = js.native
  
  /**Gets or sets the Y value of the first control point for a PathSegment of type .Bezier or .QuadraticBezier.*/
  var point1Y: Double = js.native
  
  /**Gets or sets the X value of the second control point for a PathSegment of type cubic .Bezier.*/
  var point2X: Double = js.native
  
  /**Gets or sets the Y value of the second control point for a PathSegment of type cubic .Bezier.*/
  var point2Y: Double = js.native
  
  /**Gets or sets the X value of the radius for a PathSegment of type .Arc.*/
  var radiusX: Double = js.native
  
  /**Gets or sets the Y value of the radius for a PathSegment of type .Arc.*/
  var radiusY: Double = js.native
  
  /**Gets or sets the starting angle for a PathSegment of type .Arc.*/
  var startAngle: Double = js.native
  
  /**Gets or sets the length of angle in degrees, or amount of arc to "sweep" for a PathSegment of type .Arc.*/
  var sweepAngle: Double = js.native
  
  /**Gets or sets the type of the PathSegment.*/
  var `type`: EnumValue = js.native
  
  /**Gets or sets the X-axis rotation for a PathSegment of type .SvgArc.*/
  var xAxisRotation: Double = js.native
}
object PathSegment {
  
  @JSImport("go", "PathSegment")
  @js.native
  val ^ : js.Any = js.native
  
  /**For drawing an arc segment, a value for PathSegment.type.*/
  /* static member */
  @JSImport("go", "PathSegment.Arc")
  @js.native
  def Arc: EnumValue = js.native
  @scala.inline
  def Arc_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arc")(x.asInstanceOf[js.Any])
  
  /**For drawing a cubic bezier segment, a value for PathSegment.type.*/
  /* static member */
  @JSImport("go", "PathSegment.Bezier")
  @js.native
  def Bezier: EnumValue = js.native
  @scala.inline
  def Bezier_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bezier")(x.asInstanceOf[js.Any])
  
  /**For drawing a straight line segment, a value for PathSegment.type.*/
  /* static member */
  @JSImport("go", "PathSegment.Line")
  @js.native
  def Line: EnumValue = js.native
  @scala.inline
  def Line_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
  
  /**For beginning a new subpath, a value for PathSegment.type.*/
  /* static member */
  @JSImport("go", "PathSegment.Move")
  @js.native
  def Move: EnumValue = js.native
  @scala.inline
  def Move_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Move")(x.asInstanceOf[js.Any])
  
  /**For drawing a quadratic bezier segment, a value for PathSegment.type.*/
  /* static member */
  @JSImport("go", "PathSegment.QuadraticBezier")
  @js.native
  def QuadraticBezier: EnumValue = js.native
  @scala.inline
  def QuadraticBezier_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QuadraticBezier")(x.asInstanceOf[js.Any])
  
  /**For drawing an SVG arc segment, a value for PathSegment.type.*/
  /* static member */
  @JSImport("go", "PathSegment.SvgArc")
  @js.native
  def SvgArc: EnumValue = js.native
  @scala.inline
  def SvgArc_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SvgArc")(x.asInstanceOf[js.Any])
}
