package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Number")
@js.native
class Number () extends js.Object

/* static members */
@JSGlobal("Ext.Number")
@js.native
object Number extends js.Object {
  /** [Method] Checks whether or not the passed number is within a desired range
  		* @param number Number The number to check
  		* @param min Number The minimum number in the range
  		* @param max Number The maximum number in the range
  		* @returns Number The constrained value if outside the range, otherwise the current value
  		*/
  def constrain(): scala.Double = js.native
  def constrain(number: scala.Double): scala.Double = js.native
  def constrain(number: scala.Double, min: scala.Double): scala.Double = js.native
  def constrain(number: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
  /** [Method] Corrects floating point numbers that overflow to a non precise value because of their floating nature for example 0
  		* @param The Number number
  		* @returns Number The correctly rounded number
  		*/
  def correctFloat(): scala.Double = js.native
  def correctFloat(The: scala.Double): scala.Double = js.native
  /** [Method] Validate that a value is numeric and convert it to a number if necessary
  		* @param value Object
  		* @param defaultValue Number The value to return if the original value is non-numeric
  		* @returns Number value, if numeric, defaultValue otherwise
  		*/
  def from(): scala.Double = js.native
  def from(value: js.Any): scala.Double = js.native
  def from(value: js.Any, defaultValue: scala.Double): scala.Double = js.native
  /** [Method] Returns a random integer between the specified range inclusive
  		* @param from Number Lowest value to return.
  		* @param to Number Highst value to return.
  		* @returns Number A random integer within the specified range.
  		*/
  def randomInt(): scala.Double = js.native
  def randomInt(from: scala.Double): scala.Double = js.native
  def randomInt(from: scala.Double, to: scala.Double): scala.Double = js.native
  /** [Method] Snaps the passed number between stopping points based upon a passed increment value
  		* @param value Number The unsnapped value.
  		* @param increment Number The increment by which the value must move.
  		* @param minValue Number The minimum value to which the returned value must be constrained. Overrides the increment.
  		* @param maxValue Number The maximum value to which the returned value must be constrained. Overrides the increment.
  		* @returns Number The value of the nearest snap target.
  		*/
  def snap(): scala.Double = js.native
  def snap(value: scala.Double): scala.Double = js.native
  def snap(value: scala.Double, increment: scala.Double): scala.Double = js.native
  def snap(value: scala.Double, increment: scala.Double, minValue: scala.Double): scala.Double = js.native
  def snap(value: scala.Double, increment: scala.Double, minValue: scala.Double, maxValue: scala.Double): scala.Double = js.native
  /** [Method] Snaps the passed number between stopping points based upon a passed increment value
  		* @param value Number The unsnapped value.
  		* @param increment Number The increment by which the value must move.
  		* @param minValue Number The minimum value to which the returned value must be constrained.
  		* @param maxValue Number The maximum value to which the returned value must be constrained.
  		* @returns Number The value of the nearest snap target.
  		*/
  def snapInRange(): scala.Double = js.native
  def snapInRange(value: scala.Double): scala.Double = js.native
  def snapInRange(value: scala.Double, increment: scala.Double): scala.Double = js.native
  def snapInRange(value: scala.Double, increment: scala.Double, minValue: scala.Double): scala.Double = js.native
  def snapInRange(value: scala.Double, increment: scala.Double, minValue: scala.Double, maxValue: scala.Double): scala.Double = js.native
  /** [Method] Formats a number using fixed point notation
  		* @param value Number The number to format
  		* @param precision Number The number of digits to show after the decimal point
  		*/
  def toFixed(): scala.Unit = js.native
  def toFixed(value: scala.Double): scala.Unit = js.native
  def toFixed(value: scala.Double, precision: scala.Double): scala.Unit = js.native
}

