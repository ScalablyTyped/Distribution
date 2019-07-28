package typings.go.goMod

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
class PathFigure () extends js.Object {
  def this(sx: Double) = this()
  def this(sx: Double, sy: Double) = this()
  def this(sx: Double, sy: Double, filled: Boolean) = this()
  def this(sx: Double, sy: Double, filled: Boolean, shadowed: Boolean) = this()
  /**Gets or sets whether this PathFigure is drawn filled.*/
  var isFilled: Boolean = js.native
  /**Gets or sets whether this PathFigure will render a shadow if one is defined.*/
  var isShadowed: Boolean = js.native
  /**Gets or sets the List of PathSegments that define this PathFigure.*/
  var segments: List[PathSegment] = js.native
  /**Gets or sets the starting point X coordinate of the PathFigure.*/
  var startX: Double = js.native
  /**Gets or sets the starting point Y coordinate of the PathFigure.*/
  var startY: Double = js.native
  /**
    * Add a PathSegment to the segments list.
    * @param {PathSegment} segment a newly allocated unshared PathSegment that will become owned by this PathFigure
    * @return {PathFigure} this
    */
  def add(segment: PathSegment): PathFigure = js.native
  /**
    * Create a copy of this PathFigure, with the same values and segments.
    */
  def copy(): PathFigure = js.native
  def equalsApprox(f: PathFigure): Boolean = js.native
}

