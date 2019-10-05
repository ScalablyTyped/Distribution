package typings.dojo.dojox.gfx

import typings.dojo.dojox.gfx.matrix.Matrix2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/gradient.html
  *
  *
  */
@js.native
trait gradient extends js.Object {
  /**
    * Returns a new gradient using the "VML algorithm" and suitable for VML.
    *
    * @param matrix matrix to apply to a shape and its gradient
    * @param gradient a linear gradient object to be transformed
    * @param tl top-left corner of shape's bounding box
    * @param rb right-bottom corner of shape's bounding box
    * @param ttl top-left corner of shape's transformed bounding box
    * @param trb right-bottom corner of shape's transformed bounding box
    */
  def project(matrix: js.Any, gradient: js.Object, tl: js.Object, rb: js.Object, ttl: js.Object, trb: js.Object): js.Object = js.native
  /**
    * Returns a new gradient using the "VML algorithm" and suitable for VML.
    *
    * @param matrix matrix to apply to a shape and its gradient
    * @param gradient a linear gradient object to be transformed
    * @param tl top-left corner of shape's bounding box
    * @param rb right-bottom corner of shape's bounding box
    * @param ttl top-left corner of shape's transformed bounding box
    * @param trb right-bottom corner of shape's transformed bounding box
    */
  def project(
    matrix: Matrix2D,
    gradient: js.Object,
    tl: js.Object,
    rb: js.Object,
    ttl: js.Object,
    trb: js.Object
  ): js.Object = js.native
  /**
    * Recalculates a gradient from 0-1 window to
    * "from"-"to" window blending and replicating colors,
    * if necessary.
    *
    * @param stops input gradient as a list of colors with offsets(see dojox/gfx.defaultLinearGradient and dojox/gfx.defaultRadialGradient)
    * @param from the beginning of the window, should be less than "to"
    * @param to the end of the window, should be more than "from"
    */
  def rescale(stops: js.Array[_], from: Double, to: Double): js.Array[_] = js.native
}

