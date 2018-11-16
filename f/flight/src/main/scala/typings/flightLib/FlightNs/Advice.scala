package typings
package flightLib.FlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Advice extends Base {
  /**
           * Run the customFunc function after the existingFunc function.
           *
           * @param existingFuncName The name of the existing function (existingFunc)
           *        you want to augment.
           *
           * customFunc The function to be invoked after existingFunc.
           */
  def after(method: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
           * Run the existingFunc function in the middle of the customFunc function.
           * It's similar to underscore's _wrap function).
           *
           * @param existingFuncName The name of the existing function (existingFunc)
           *        you want to augment.
           *
           * customFunc The function to wrap around existingFunc. The existingFunc
           * function will be passed to customFunc as an argument.
           *
           * The existing function is passed to the custom function as an argument so
           * that it can be referenced. If the custom function does not call the
           * existing function then it will replace that function instead of
           * surrounding it.
           */
  def around(method: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
           * Run the customFunc function before the existingFunc function.
           *
           * @param existingFuncName The name of the existing function (existingFunc)
           *        you want to augment.
           *
           * @param customFunc The function to be invoked before existingFunc.
           */
  def before(method: java.lang.String, fn: js.Function): scala.Unit = js.native
}

