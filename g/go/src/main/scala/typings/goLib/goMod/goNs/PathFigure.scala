package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A PathFigure represents a section of a Geometry.
    * It is a single connected series of
    * two-dimensional geometric PathSegments.
    */

trait PathFigure extends js.Object {
  /**Gets or sets whether this PathFigure is drawn filled.*/
  var isFilled: scala.Boolean
  /**Gets or sets whether this PathFigure will render a shadow if one is defined.*/
  var isShadowed: scala.Boolean
  /**Gets or sets the List of PathSegments that define this PathFigure.*/
  var segments: List[PathSegment]
  /**Gets or sets the starting point X coordinate of the PathFigure.*/
  var startX: scala.Double
  /**Gets or sets the starting point Y coordinate of the PathFigure.*/
  var startY: scala.Double
  /**
          * Add a PathSegment to the segments list.
          * @param {PathSegment} segment a newly allocated unshared PathSegment that will become owned by this PathFigure
          * @return {PathFigure} this
          */
  def add(segment: PathSegment): PathFigure
  /**
          * Create a copy of this PathFigure, with the same values and segments.
          */
  def copy(): PathFigure
  def equalsApprox(f: PathFigure): scala.Boolean
}

