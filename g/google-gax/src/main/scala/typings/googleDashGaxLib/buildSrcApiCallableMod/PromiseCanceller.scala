package typings
package googleDashGaxLib.buildSrcApiCallableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/apiCallable", "PromiseCanceller")
@js.native
class PromiseCanceller[T] protected () extends Canceller {
  /**
    * PromiseCanceller is Canceller, but it holds a promise when
    * the API call finishes.
    * @param {Function} PromiseCtor - A constructor for a promise that implements
    * the ES6 specification of promise.
    * @constructor
    * @private
    */
  def this(PromiseCtor: stdLib.PromiseConstructor) = this()
  var promise: CancellablePromise[T] = js.native
}

