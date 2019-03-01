package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Point")
@js.native
class Point protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double) = this()
  var `type`: java.lang.String = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  /**
  	 * Adds another point to this one and returns another one
  	 * @param {fabric.Point} that
  	 * @return {fabric.Point} new Point instance with added values
  	 */
  def add(that: Point): Point = js.native
  /**
  	 * Adds another point to this one
  	 * @param {fabric.Point} that
  	 * @return {fabric.Point} thisArg
  	 * @chainable
  	 */
  def addEquals(that: Point): Point = js.native
  /**
  	 * Returns distance from this point and another one
  	 * @param {fabric.Point} that
  	 * @return {Number}
  	 */
  def distanceFrom(that: Point): scala.Double = js.native
  /**
  	 * Divides this point by a value and returns a new one
  	 * @param {Number} scalar
  	 * @return {fabric.Point}
  	 */
  def divide(scalar: scala.Double): Point = js.native
  /**
  	 * Divides this point by a value
  	 * @param {Number} scalar
  	 * @return {fabric.Point} thisArg
  	 * @chainable
  	 */
  def divideEquals(scalar: scala.Double): Point = js.native
  /**
  	 * Returns true if this point is equal to another one
  	 * @param {fabric.Point} that
  	 * @return {Boolean}
  	 */
  def eq(that: Point): Point = js.native
  /**
  	 * Returns true if this point is greater another one
  	 * @param {fabric.Point} that
  	 * @return {Boolean}
  	 */
  def gt(that: Point): Point = js.native
  /**
  	 * Returns true if this point is greater than or equal to another one
  	 * @param {fabric.Point} that
  	 * @return {Boolean}
  	 */
  def gte(that: Point): Point = js.native
  /**
  	 * Returns new point which is the result of linear interpolation with this one and another one
  	 * @param {fabric.Point} that
  	 * @param {Number} t , position of interpolation, between 0 and 1 default 0.5
  	 * @return {fabric.Point}
  	 */
  def lerp(that: Point, t: scala.Double): Point = js.native
  /**
  	 * Returns true if this point is less than another one
  	 * @param {fabric.Point} that
  	 * @return {Boolean}
  	 */
  def lt(that: Point): Point = js.native
  /**
  	 * Returns true if this point is less than or equal to another one
  	 * @param {fabric.Point} that
  	 * @return {Boolean}
  	 */
  def lte(that: Point): Point = js.native
  /**
  	 * Returns a new point which is the max of this and another one
  	 * @param {fabric.Point} that
  	 * @return {fabric.Point}
  	 */
  def max(that: Point): Point = js.native
  /**
  	 * Returns the point between this point and another one
  	 * @param {fabric.Point} that
  	 * @return {fabric.Point}
  	 */
  def midPointFrom(that: Point): Point = js.native
  /**
  	 * Returns a new point which is the min of this and another one
  	 * @param {fabric.Point} that
  	 * @return {fabric.Point}
  	 */
  def min(that: Point): Point = js.native
  /**
  	 * Multiplies this point by a value and returns a new one
  	 * @param {Number} scalar
  	 * @return {fabric.Point}
  	 */
  def multiply(scalar: scala.Double): Point = js.native
  /**
  	 * Multiplies this point by a value
  	 * @param {Number} scalar
  	 * @return {fabric.Point} thisArg
  	 * @chainable
  	 */
  def multiplyEquals(scalar: scala.Double): Point = js.native
  /**
  	 * Adds value to this point and returns a new one
  	 * @param {Number} scalar
  	 * @return {fabric.Point} new Point with added value
  	 */
  def scalarAdd(scalar: scala.Double): Point = js.native
  /**
  	 * Adds value to this point
  	 * @param {Number} scalar
  	 * @return {fabric.Point} thisArg
  	 * @chainable
  	 */
  def scalarAddEquals(scalar: scala.Double): Point = js.native
  /**
  	 * Subtracts value from this point and returns a new one
  	 * @param {Number} scalar
  	 * @return {fabric.Point}
  	 */
  def scalarSubtract(scalar: scala.Double): Point = js.native
  /**
  	 * Subtracts value from this point
  	 * @param {Number} scalar
  	 * @return {fabric.Point} thisArg
  	 * @chainable
  	 */
  def scalarSubtractEquals(scalar: scala.Double): Point = js.native
  /**
  	 * Sets x/y of this point from another point
  	 * @param {fabric.Point} that
  	 * @chainable
  	 */
  def setFromPoint(that: Point): Point = js.native
  /**
  	 * Sets x of this point
  	 * @param {Number} x
  	 * @chainable
  	 */
  def setX(x: scala.Double): Point = js.native
  /**
  	 * Sets x/y of this point
  	 * @param {Number} x
  	 * @param {Number} y
  	 * @chainable
  	 */
  def setXY(x: scala.Double, y: scala.Double): Point = js.native
  /**
  	 * Sets y of this point
  	 * @param {Number} y
  	 * @chainable
  	 */
  def setY(y: scala.Double): Point = js.native
  /**
  	 * Subtracts another point from this point and returns a new one
  	 * @param {fabric.Point} that
  	 * @return {fabric.Point} new Point object with subtracted values
  	 */
  def subtract(that: Point): Point = js.native
  /**
  	 * Subtracts another point from this point
  	 * @param {fabric.Point} that
  	 * @return {fabric.Point} thisArg
  	 * @chainable
  	 */
  def subtractEquals(that: Point): Point = js.native
  /**
  	 * Swaps x/y of this point and another point
  	 * @param {fabric.Point} that
  	 */
  def swap(that: Point): Point = js.native
}

