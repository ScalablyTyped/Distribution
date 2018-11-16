package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A PathSegment represents a straight line or curved segment of a path between
    * two or more points that are part of a PathFigure.
    * A PathSegment must not be modified once its containing PathFigure's
    * Geometry has been assigned to a Shape.
    */
@JSImport("go", "PathSegment")
@js.native
class PathSegment protected ()
  extends goLib.goMod.goNs.PathSegment {
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
  def this(`type`: goLib.goMod.goNs.EnumValue, ex: js.UndefOr[scala.Double], ey: js.UndefOr[scala.Double], x1: js.UndefOr[scala.Double], y1: js.UndefOr[scala.Double], x2: js.UndefOr[scala.Double], y2: js.UndefOr[scala.Double], clockwise: js.UndefOr[scala.Boolean]) = this()
  /**Gets or sets the center X value of the Arc for a PathSegment of type .Arc.*/
  /* CompleteClass */
  override var centerX: scala.Double = js.native
  /**Gets or sets the center Y value of the Arc for a PathSegment of type .Arc.*/
  /* CompleteClass */
  override var centerY: scala.Double = js.native
  /**Gets or sets the X coordinate of the end point for all kinds of PathSegment.*/
  /* CompleteClass */
  override var endX: scala.Double = js.native
  /**Gets or sets the Y coordinate of the end point for all kinds of PathSegment.*/
  /* CompleteClass */
  override var endY: scala.Double = js.native
  /**Gets or sets the sweep-flag for a PathSegment of type .SvgArc.*/
  /* CompleteClass */
  override var isClockwiseArc: scala.Boolean = js.native
  /**Gets or sets whether the path is closed after this PathSegment.*/
  /* CompleteClass */
  override var isClosed: scala.Boolean = js.native
  /**Gets or sets the large-arc-flag for a PathSegment of type .SvgArc.*/
  /* CompleteClass */
  override var isLargeArc: scala.Boolean = js.native
  /**Gets or sets the X value of the first control point for a PathSegment of type .Bezier or .QuadraticBezier.*/
  /* CompleteClass */
  override var point1X: scala.Double = js.native
  /**Gets or sets the Y value of the first control point for a PathSegment of type .Bezier or .QuadraticBezier.*/
  /* CompleteClass */
  override var point1Y: scala.Double = js.native
  /**Gets or sets the X value of the second control point for a PathSegment of type cubic .Bezier.*/
  /* CompleteClass */
  override var point2X: scala.Double = js.native
  /**Gets or sets the Y value of the second control point for a PathSegment of type cubic .Bezier.*/
  /* CompleteClass */
  override var point2Y: scala.Double = js.native
  /**Gets or sets the X value of the radius for a PathSegment of type .Arc.*/
  /* CompleteClass */
  override var radiusX: scala.Double = js.native
  /**Gets or sets the Y value of the radius for a PathSegment of type .Arc.*/
  /* CompleteClass */
  override var radiusY: scala.Double = js.native
  /**Gets or sets the starting angle for a PathSegment of type .Arc.*/
  /* CompleteClass */
  override var startAngle: scala.Double = js.native
  /**Gets or sets the length of angle in degrees, or amount of arc to "sweep" for a PathSegment of type .Arc.*/
  /* CompleteClass */
  override var sweepAngle: scala.Double = js.native
  /**Gets or sets the type of the PathSegment.*/
  /* CompleteClass */
  override var `type`: goLib.goMod.goNs.EnumValue = js.native
  /**Gets or sets the X-axis rotation for a PathSegment of type .SvgArc.*/
  /* CompleteClass */
  override var xAxisRotation: scala.Double = js.native
  /**
          * Closes the path after this PathSegment.
          */
  /* CompleteClass */
  override def close(): goLib.goMod.goNs.PathSegment = js.native
  /**
          * Makes a copy of this PathSegment.
          */
  /* CompleteClass */
  override def copy(): goLib.goMod.goNs.PathSegment = js.native
  /* CompleteClass */
  override def equalsApprox(s: goLib.goMod.goNs.PathSegment): scala.Boolean = js.native
}

/**
    * A PathSegment represents a straight line or curved segment of a path between
    * two or more points that are part of a PathFigure.
    * A PathSegment must not be modified once its containing PathFigure's
    * Geometry has been assigned to a Shape.
    */
@JSImport("go", "PathSegment")
@js.native
object PathSegment extends js.Object {
  /**For drawing an arc segment, a value for PathSegment.type.*/
  var Arc: goLib.goMod.goNs.EnumValue = js.native
  /**For drawing a cubic bezier segment, a value for PathSegment.type.*/
  var Bezier: goLib.goMod.goNs.EnumValue = js.native
  /**For drawing a straight line segment, a value for PathSegment.type.*/
  var Line: goLib.goMod.goNs.EnumValue = js.native
  /**For beginning a new subpath, a value for PathSegment.type.*/
  var Move: goLib.goMod.goNs.EnumValue = js.native
  /**For drawing a quadratic bezier segment, a value for PathSegment.type.*/
  var QuadraticBezier: goLib.goMod.goNs.EnumValue = js.native
  /**For drawing an SVG arc segment, a value for PathSegment.type.*/
  var SvgArc: goLib.goMod.goNs.EnumValue = js.native
}

