package typings
package googleDashGaxLib.buildSrcApiCallableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/apiCallable", "Canceller")
@js.native
/**
  * Canceller manages callback, API calls, and cancellation
  * of the API calls.
  * @param {APICallback=} callback
  *   The callback to be called asynchronously when the API call
  *   finishes.
  * @constructor
  * @property {APICallback} callback
  *   The callback function to be called.
  * @private
  */
class Canceller () extends js.Object {
  def this(callback: APICallback) = this()
  var callback: js.UndefOr[APICallback] = js.native
  var cancelFunc: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var completed: scala.Boolean = js.native
  /**
    * Call calls the specified function. Result will be used to fulfill
    * the promise.
    *
    * @param {function(Object, APICallback=)} aFunc
    *   A function for an API call.
    * @param {Object} argument
    *   A request object.
    */
  def call(
    aFunc: js.Function2[/* obj */ js.Object, /* callback */ APICallback, PromiseCanceller[_]],
    argument: js.Object
  ): scala.Unit = js.native
  /**
    * Cancels the ongoing promise.
    */
  def cancel(): scala.Unit = js.native
}

