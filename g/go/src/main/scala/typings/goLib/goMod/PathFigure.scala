package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A PathFigure represents a section of a Geometry.
    * It is a single connected series of
    * two-dimensional geometric PathSegments.
    */
@JSImport("go", "PathFigure")
@js.native
class PathFigure ()
  extends goLib.goMod.goNs.PathFigure {
  /**
          * Constructs an empty figure.
          * The optional arguments specify the starting point of the figure.
          * You'll want to add a new instance of a PathFigure to the
          * Geometry.figures list of a Geometry.
          * @param {number=} sx optional: the X coordinate of the start point (default is zero).
          * @param {number=} sy optional: the Y coordinate of the start point (default is zero).
          * @param {boolean=} filled optional: whether the figure is filled (default is true).
          * @param {boolean=} shadowed optional: whether the figure may be drawn with a shadow (default is true).
          */
  def this(sx: scala.Double) = this()
  /**
          * Constructs an empty figure.
          * The optional arguments specify the starting point of the figure.
          * You'll want to add a new instance of a PathFigure to the
          * Geometry.figures list of a Geometry.
          * @param {number=} sx optional: the X coordinate of the start point (default is zero).
          * @param {number=} sy optional: the Y coordinate of the start point (default is zero).
          * @param {boolean=} filled optional: whether the figure is filled (default is true).
          * @param {boolean=} shadowed optional: whether the figure may be drawn with a shadow (default is true).
          */
  def this(sx: scala.Double, sy: scala.Double) = this()
  /**
          * Constructs an empty figure.
          * The optional arguments specify the starting point of the figure.
          * You'll want to add a new instance of a PathFigure to the
          * Geometry.figures list of a Geometry.
          * @param {number=} sx optional: the X coordinate of the start point (default is zero).
          * @param {number=} sy optional: the Y coordinate of the start point (default is zero).
          * @param {boolean=} filled optional: whether the figure is filled (default is true).
          * @param {boolean=} shadowed optional: whether the figure may be drawn with a shadow (default is true).
          */
  def this(sx: scala.Double, sy: scala.Double, filled: scala.Boolean) = this()
  /**
          * Constructs an empty figure.
          * The optional arguments specify the starting point of the figure.
          * You'll want to add a new instance of a PathFigure to the
          * Geometry.figures list of a Geometry.
          * @param {number=} sx optional: the X coordinate of the start point (default is zero).
          * @param {number=} sy optional: the Y coordinate of the start point (default is zero).
          * @param {boolean=} filled optional: whether the figure is filled (default is true).
          * @param {boolean=} shadowed optional: whether the figure may be drawn with a shadow (default is true).
          */
  def this(sx: scala.Double, sy: scala.Double, filled: scala.Boolean, shadowed: scala.Boolean) = this()
  /**Gets or sets whether this PathFigure is drawn filled.*/
  /* CompleteClass */
  override var isFilled: scala.Boolean = js.native
  /**Gets or sets whether this PathFigure will render a shadow if one is defined.*/
  /* CompleteClass */
  override var isShadowed: scala.Boolean = js.native
  /**Gets or sets the List of PathSegments that define this PathFigure.*/
  /* CompleteClass */
  override var segments: goLib.goMod.goNs.List[goLib.goMod.goNs.PathSegment] = js.native
  /**Gets or sets the starting point X coordinate of the PathFigure.*/
  /* CompleteClass */
  override var startX: scala.Double = js.native
  /**Gets or sets the starting point Y coordinate of the PathFigure.*/
  /* CompleteClass */
  override var startY: scala.Double = js.native
  /**
          * Add a PathSegment to the segments list.
          * @param {PathSegment} segment a newly allocated unshared PathSegment that will become owned by this PathFigure
          * @return {PathFigure} this
          */
  /* CompleteClass */
  override def add(segment: goLib.goMod.goNs.PathSegment): goLib.goMod.goNs.PathFigure = js.native
  /**
          * Create a copy of this PathFigure, with the same values and segments.
          */
  /* CompleteClass */
  override def copy(): goLib.goMod.goNs.PathFigure = js.native
  /* CompleteClass */
  override def equalsApprox(f: goLib.goMod.goNs.PathFigure): scala.Boolean = js.native
}

