package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilArray extends js.Object {
  /**
  	 * Invokes method on all items in a given array
  	 * @param array Array to iterate over
  	 * @param method Name of a method to invoke
  	 */
  def invoke(array: js.Array[_], method: java.lang.String): js.Array[_]
  /**
  	 * Finds maximum value in array (not necessarily "first" one)
  	 * @param array Array to iterate over
  	 */
  def max(array: js.Array[_], byProperty: java.lang.String): js.Any
  /**
  	 * Finds minimum value in array (not necessarily "first" one)
  	 * @param array Array to iterate over
  	 */
  def min(array: js.Array[_], byProperty: java.lang.String): js.Any
}

object IUtilArray {
  @scala.inline
  def apply(
    invoke: js.Function2[js.Array[_], java.lang.String, js.Array[_]],
    max: js.Function2[js.Array[_], java.lang.String, js.Any],
    min: js.Function2[js.Array[_], java.lang.String, js.Any]
  ): IUtilArray = {
    val __obj = js.Dynamic.literal(invoke = invoke, max = max, min = min)
  
    __obj.asInstanceOf[IUtilArray]
  }
}

