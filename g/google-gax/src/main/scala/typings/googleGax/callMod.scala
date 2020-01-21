package typings.googleGax

import typings.googleGax.apitypesMod.APICallback
import typings.googleGax.apitypesMod.RequestType
import typings.googleGax.apitypesMod.ResultTuple
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.std.Promise
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/call", JSImport.Namespace)
@js.native
object callMod extends js.Object {
  @js.native
  trait CancellablePromise[T] extends Promise[T] {
    def cancel(): Unit = js.native
  }
  
  @js.native
  /**
    * OngoingCall manages callback, API calls, and cancellation
    * of the API calls.
    * @param {APICallback=} callback
    *   The callback to be called asynchronously when the API call
    *   finishes.
    * @constructor
    * @property {APICallback} callback
    *   The callback function to be called.
    * @private
    */
  class OngoingCall () extends js.Object {
    def this(callback: APICallback) = this()
    var callback: js.UndefOr[APICallback] = js.native
    var cancelFunc: js.UndefOr[js.Function0[Unit]] = js.native
    var completed: Boolean = js.native
    /**
      * Call calls the specified function. Result will be used to fulfill
      * the promise.
      *
      * @param {SimpleCallbackFunction} func
      *   A function for an API call.
      * @param {Object} argument
      *   A request object.
      */
    def call(func: SimpleCallbackFunction, argument: RequestType): Unit = js.native
    /**
      * Cancels the ongoing promise.
      */
    def cancel(): Unit = js.native
  }
  
  @js.native
  class OngoingCallPromise protected () extends OngoingCall {
    /**
      * GaxPromise is GRPCCallbackWrapper, but it holds a promise when
      * the API call finishes.
      * @param {Function} PromiseCtor - A constructor for a promise that implements
      * the ES6 specification of promise.
      * @constructor
      * @private
      */
    def this(PromiseCtor: PromiseConstructor) = this()
    var promise: CancellablePromise[ResultTuple] = js.native
  }
  
}

