package typings.dojo.dojox.fx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/fx/_core.html
  *
  * a custom _Line to accommodate multi-dimensional values
  * a normal dojo._Line is the curve, and does Line(start,end)
  * for propertyAnimation. as we make more complicatied animations, we realize
  * some properties can have 2, or 4 values relevant (x,y) or (t,l,r,b) for example
  *
  * this function provides support for those Lines, and is ported directly from 0.4
  * this is a lot of extra code for something so seldom used, so we'll put it here as
  * and optional core addition. you can create a new line, and use it during onAnimate
  * as you see fit.
  *
  * @param start An Integer (or an Array of integers) to use as a starting point
  * @param end An Integer (or an Array of integers) to use as an ending point
  */
@js.native
trait core extends js.Object {
  def apply(start: js.Array[_], end: js.Array[_]): Unit = js.native
  def apply(start: js.Array[_], end: Double): Unit = js.native
  def apply(start: Double, end: js.Array[_]): Unit = js.native
  def apply(start: Double, end: Double): Unit = js.native
}

@JSGlobal("dojox.fx._core")
@js.native
object core extends js.Object {
  /**
    * An Integer (or an Array of integers) to use as an ending point
    *
    */
  var end: Double = js.native
  /**
    * An Integer (or an Array of integers) to use as a starting point
    *
    */
  var start: Double = js.native
  /**
    * Returns the point on the line, or an array of points
    *
    * @param n a floating point number greater than 0 and less than 1
    */
  type getValue = js.Function1[/* n */ Double, js.Any]
}

