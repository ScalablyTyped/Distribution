package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PromiseOptions extends js.Object {
  /**
           * Register callbacks for success or failure.
           *
           * Invoked when the promise is fulfilled regardless of the result.
           * The promise instance that done is called on will pass any values into the provided callback.
           * Each call to done registers an additional set of callbacks
           *
           * @param Function callback : The function to call when the promise is fulfilled, successful or not.
           * @return PromiseOptions : An instance of a promise
           */
  def done(callback: js.Function): PromiseOptions
  /**
           * Call this on a promise to indicate failure.
           * The parameter values will depend on the situation.
           *
           * @param Object param : The value to pass to the promise's failure handler.
           * @return PromiseOptions : An instance of a promise
           */
  def failure(param: js.Any): PromiseOptions
  /**
           * Call this on a promise to indicate success.
           * The parameter values will depend on the situation.
           *
           * @param Object param : The value to pass to the promise's success handler.
           * @return PromiseOptions : An instance of a promise
           */
  def success(param: js.Any): PromiseOptions
  /**
           * Register callbacks from success and failure.
           *
           * The promise instance that then is called on will pass any values into the provided callbacks.
           * If success or failure have already occurred before these callbacks have been registered, then they will be called immediately after this call has been executed.
           * Each subsequent call to then registers an additional set of callbacks.
           *
           * @param Function successCallback : The function to call when the promise is successfully fulfilled
           * @param Function failureCallback : The function to call when the promise is unsuccessfully fulfilled
           * @return PromiseOptions : An instance of a promise
           */
  def `then`(successCallback: js.Function, failureCallback: js.Function): PromiseOptions
}

