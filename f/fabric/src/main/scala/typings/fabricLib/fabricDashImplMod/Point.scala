package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "Point")
@js.native
class Point protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  /**
  	 * Adds another point to this one and returns another one
  	 */
  def add(that: Point): Point = js.native
  /**
  	 * Adds another point to this one
  	 */
  def addEquals(that: Point): Point = js.native
  /**
  	 * Returns distance from this point and another one
  	 */
  def distanceFrom(that: Point): scala.Double = js.native
  /**
  	 * Divides this point by a value and returns a new one
  	 */
  def divide(scalar: scala.Double): Point = js.native
  /**
  	 * Divides this point by a value
  	 */
  def divideEquals(scalar: scala.Double): Point = js.native
  /**
  	 * Returns true if this point is equal to another one
  	 */
  def eq(that: Point): Point = js.native
  /**
  	 * Returns true if this point is greater another one
  	 */
  def gt(that: Point): Point = js.native
  /**
  	 * Returns true if this point is greater than or equal to another one
  	 */
  def gte(that: Point): Point = js.native
  /**
  	 * Returns new point which is the result of linear interpolation with this one and another one
  	 */
  def lerp(that: Point, t: scala.Double): Point = js.native
  /**
  	 * Returns true if this point is less than another one
  	 */
  def lt(that: Point): Point = js.native
  /**
  	 * Returns true if this point is less than or equal to another one
  	 */
  def lte(that: Point): Point = js.native
  /**
  	 * Returns a new point which is the max of this and another one
  	 */
  def max(that: Point): Point = js.native
  /**
  	 * Returns the point between this point and another one
  	 */
  def midPointFrom(that: Point): Point = js.native
  /**
  	 * Returns a new point which is the min of this and another one
  	 */
  def min(that: Point): Point = js.native
  /**
  	 * Miltiplies this point by a value and returns a new one
  	 */
  def multiply(scalar: scala.Double): Point = js.native
  /**
  	 * Miltiplies this point by a value
  	 */
  def multiplyEquals(scalar: scala.Double): Point = js.native
  /**
  	 * Adds value to this point and returns a new one
  	 */
  def scalarAdd(scalar: scala.Double): Point = js.native
  /**
  	 * Adds value to this point
  	 */
  def scalarAddEquals(scalar: scala.Double): Point = js.native
  /**
  	 * Subtracts value from this point and returns a new one
  	 */
  def scalarSubtract(scalar: scala.Double): Point = js.native
  /**
  	 * Subtracts value from this point
  	 */
  def scalarSubtractEquals(scalar: scala.Double): Point = js.native
  /**
  	 * Sets x/y of this point from another point
  	 */
  def setFromPoint(that: Point): Point = js.native
  /**
  	 * Sets x/y of this point
  	 */
  def setXY(x: scala.Double, y: scala.Double): Point = js.native
  /**
  	 * Subtracts another point from this point and returns a new one
  	 */
  def subtract(that: Point): Point = js.native
  /**
  	 * Subtracts another point from this point
  	 */
  def subtractEquals(that: Point): Point = js.native
  /**
  	 * Swaps x/y of this point and another point
  	 */
  def swap(that: Point): Point = js.native
}

