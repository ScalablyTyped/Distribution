package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Number")
@js.native
class Number ()
  extends StObject
     with typings.extjs.Ext.Number
/* static members */
object Number {
  
  @JSGlobal("Ext.Number")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Checks whether or not the passed number is within a desired range
    * @param number Number The number to check
    * @param min Number The minimum number in the range
    * @param max Number The maximum number in the range
    * @returns Number The constrained value if outside the range, otherwise the current value
    */
  inline def constrain(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("constrain")().asInstanceOf[Double]
  inline def constrain(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("constrain")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def constrain(number: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("constrain")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def constrain(number: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("constrain")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def constrain(number: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("constrain")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def constrain(number: Unit, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("constrain")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def constrain(number: Unit, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("constrain")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def constrain(number: Unit, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("constrain")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Corrects floating point numbers that overflow to a non precise value because of their floating nature for example 0
    * @param The Number number
    * @returns Number The correctly rounded number
    */
  inline def correctFloat(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("correctFloat")().asInstanceOf[Double]
  inline def correctFloat(The: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("correctFloat")(The.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Validate that a value is numeric and convert it to a number if necessary
    * @param value Object
    * @param defaultValue Number The value to return if the original value is non-numeric
    * @returns Number value, if numeric, defaultValue otherwise
    */
  inline def from(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[Double]
  inline def from(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def from(value: js.Any, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def from(value: Unit, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Returns a random integer between the specified range inclusive
    * @param from Number Lowest value to return.
    * @param to Number Highst value to return.
    * @returns Number A random integer within the specified range.
    */
  inline def randomInt(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")().asInstanceOf[Double]
  inline def randomInt(from: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(from.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def randomInt(from: Double, to: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def randomInt(from: Unit, to: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Snaps the passed number between stopping points based upon a passed increment value
    * @param value Number The unsnapped value.
    * @param increment Number The increment by which the value must move.
    * @param minValue Number The minimum value to which the returned value must be constrained. Overrides the increment.
    * @param maxValue Number The maximum value to which the returned value must be constrained. Overrides the increment.
    * @returns Number The value of the nearest snap target.
    */
  inline def snap(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("snap")().asInstanceOf[Double]
  inline def snap(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def snap(value: Double, increment: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Double, increment: Double, minValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Double, increment: Double, minValue: Double, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Double, increment: Double, minValue: Unit, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Double, increment: Unit, minValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Double, increment: Unit, minValue: Double, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Double, increment: Unit, minValue: Unit, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Unit, increment: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Unit, increment: Double, minValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Unit, increment: Double, minValue: Double, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Unit, increment: Double, minValue: Unit, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Unit, increment: Unit, minValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Unit, increment: Unit, minValue: Double, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snap(value: Unit, increment: Unit, minValue: Unit, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Snaps the passed number between stopping points based upon a passed increment value
    * @param value Number The unsnapped value.
    * @param increment Number The increment by which the value must move.
    * @param minValue Number The minimum value to which the returned value must be constrained.
    * @param maxValue Number The maximum value to which the returned value must be constrained.
    * @returns Number The value of the nearest snap target.
    */
  inline def snapInRange(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")().asInstanceOf[Double]
  inline def snapInRange(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def snapInRange(value: Double, increment: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Double, increment: Double, minValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Double, increment: Double, minValue: Double, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Double, increment: Double, minValue: Unit, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Double, increment: Unit, minValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Double, increment: Unit, minValue: Double, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Double, increment: Unit, minValue: Unit, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Unit, increment: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Unit, increment: Double, minValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Unit, increment: Double, minValue: Double, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Unit, increment: Double, minValue: Unit, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Unit, increment: Unit, minValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Unit, increment: Unit, minValue: Double, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def snapInRange(value: Unit, increment: Unit, minValue: Unit, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapInRange")(value.asInstanceOf[js.Any], increment.asInstanceOf[js.Any], minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Formats a number using fixed point notation
    * @param value Number The number to format
    * @param precision Number The number of digits to show after the decimal point
    */
  inline def toFixed(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")().asInstanceOf[Unit]
  inline def toFixed(value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def toFixed(value: Double, precision: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFixed(value: Unit, precision: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
