package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilArray extends js.Object {
  /**
  	 * Invokes method on all items in a given array
  	 * @param array Array to iterate over
  	 * @param method Name of a method to invoke
  	 */
  def invoke(array: js.Array[_], method: String): js.Array[_]
  /**
  	 * Finds maximum value in array (not necessarily "first" one)
  	 * @param array Array to iterate over
  	 */
  def max(array: js.Array[_], byProperty: String): js.Any
  /**
  	 * Finds minimum value in array (not necessarily "first" one)
  	 * @param array Array to iterate over
  	 */
  def min(array: js.Array[_], byProperty: String): js.Any
}

object IUtilArray {
  @scala.inline
  def apply(
    invoke: (js.Array[_], String) => js.Array[_],
    max: (js.Array[_], String) => js.Any,
    min: (js.Array[_], String) => js.Any
  ): IUtilArray = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction2(invoke), max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min))
  
    __obj.asInstanceOf[IUtilArray]
  }
}

