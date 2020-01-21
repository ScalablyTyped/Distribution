package typings.dojo.dojo.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/Deferred.html
  *
  * Deprecated.   This module defines the legacy dojo/_base/Deferred API.
  * New code should use dojo/Deferred instead.
  * The Deferred API is based on the concept of promises that provide a
  * generic interface into the eventual completion of an asynchronous action.
  * The motivation for promises fundamentally is about creating a
  * separation of concerns that allows one to achieve the same type of
  * call patterns and logical data flow in asynchronous code as can be
  * achieved in synchronous code. Promises allows one
  * to be able to call a function purely with arguments needed for
  * execution, without conflating the call with concerns of whether it is
  * sync or async. One shouldn't need to alter a call's arguments if the
  * implementation switches from sync to async (or vice versa). By having
  * async functions return promises, the concerns of making the call are
  * separated from the concerns of asynchronous interaction (which are
  * handled by the promise).
  *
  * The Deferred is a type of promise that provides methods for fulfilling the
  * promise with a successful result or an error. The most important method for
  * working with Dojo's promises is the then() method, which follows the
  * CommonJS proposed promise API. An example of using a Dojo promise:
  *
  * var resultingPromise = someAsyncOperation.then(function(result){
  *     ... handle result ...
  * },
  * function(error){
  *     ... handle error ...
  * });
  * The .then() call returns a new promise that represents the result of the
  * execution of the callback. The callbacks will never affect the original promises value.
  *
  * The Deferred instances also provide the following functions for backwards compatibility:
  *
  * addCallback(handler)
  * addErrback(handler)
  * callback(result)
  * errback(result)
  * Callbacks are allowed to return promises themselves, so
  * you can build complicated sequences of events with ease.
  *
  * The creator of the Deferred may specify a canceller.  The canceller
  * is a function that will be called if Deferred.cancel is called
  * before the Deferred fires. You can use this to implement clean
  * aborting of an XMLHttpRequest, etc. Note that cancel will fire the
  * deferred with a CancelledError (unless your canceller returns
  * another kind of error), so the errbacks should be prepared to
  * handle that error for cancellable Deferreds.
  *
  * @param canceller       Optional
  */
@js.native
trait Deferred extends js.Object {
  /**
    *
    */
  var fired: Double = js.native
  /**
    *
    */
  var promise: js.Object = js.native
  def apply(): Unit = js.native
  def apply(canceller: js.Function): Unit = js.native
  /**
    * Add handler as both successful callback and error callback for this deferred instance.
    *
    * @param callback
    */
  def addBoth(callback: js.Function): js.Any = js.native
  /**
    * Adds successful callback for this deferred instance.
    *
    * @param callback
    */
  def addCallback(callback: js.Function): js.Any = js.native
  /**
    * Adds callback and error callback for this deferred instance.
    *
    * @param callback               OptionalThe callback attached to this deferred object.
    * @param errback               OptionalThe error callback attached to this deferred object.
    */
  def addCallbacks(): js.Any = js.native
  def addCallbacks(callback: js.Function): js.Any = js.native
  def addCallbacks(callback: js.Function, errback: js.Function): js.Any = js.native
  /**
    * Adds error callback for this deferred instance.
    *
    * @param errback
    */
  def addErrback(errback: js.Function): js.Any = js.native
  /**
    * Fulfills the Deferred instance successfully with the provide value
    *
    * @param value
    */
  def callback(value: js.Any): Unit = js.native
  /**
    * Cancels the asynchronous operation
    *
    */
  def cancel(): Unit = js.native
  /**
    * Fulfills the Deferred instance as an error with the provided error
    *
    * @param error
    */
  def errback(error: js.Any): Unit = js.native
  /**
    * Checks whether the deferred has been canceled.
    *
    */
  def isCanceled(): Boolean = js.native
  /**
    * Checks whether the deferred has been resolved or rejected.
    *
    */
  def isFulfilled(): Boolean = js.native
  /**
    * Checks whether the deferred has been rejected.
    *
    */
  def isRejected(): Boolean = js.native
  /**
    * Checks whether the deferred has been resolved.
    *
    */
  def isResolved(): Boolean = js.native
  /**
    * Send progress events to all listeners
    *
    * @param update
    */
  def progress(update: js.Any): Unit = js.native
  /**
    * Fulfills the Deferred instance as an error with the provided error
    *
    * @param error
    */
  def reject(error: js.Any): Unit = js.native
  /**
    * Fulfills the Deferred instance successfully with the provide value
    *
    * @param value
    */
  def resolve(value: js.Any): Unit = js.native
  /**
    * Adds a fulfilledHandler, errorHandler, and progressHandler to be called for
    * completion of a promise. The fulfilledHandler is called when the promise
    * is fulfilled. The errorHandler is called when a promise fails. The
    * progressHandler is called for progress events. All arguments are optional
    * and non-function values are ignored. The progressHandler is not only an
    * optional argument, but progress events are purely optional. Promise
    * providers are not required to ever create progress events.
    *
    * This function will return a new promise that is fulfilled when the given
    * fulfilledHandler or errorHandler callback is finished. This allows promise
    * operations to be chained together. The value returned from the callback
    * handler is the fulfillment value for the returned promise. If the callback
    * throws an error, the returned promise will be moved to failed state.
    *
    * @param resolvedCallback               Optional
    * @param errorCallback               Optional
    * @param progressCallback               Optional
    */
  def `then`(): js.Any = js.native
  def `then`(resolvedCallback: js.Function): js.Any = js.native
  def `then`(resolvedCallback: js.Function, errorCallback: js.Function): js.Any = js.native
  def `then`(resolvedCallback: js.Function, errorCallback: js.Function, progressCallback: js.Function): js.Any = js.native
  /**
    * Transparently applies callbacks to values and/or promises.
    * Accepts promises but also transparently handles non-promises. If no
    * callbacks are provided returns a promise, regardless of the initial
    * value. Foreign promises are converted.
    *
    * If callbacks are provided and the initial value is not a promise,
    * the callback is executed immediately with no error handling. Returns
    * a promise if the initial value is a promise, or the result of the
    * callback otherwise.
    *
    * @param valueOrPromise Either a regular value or an object with a then() method thatfollows the Promises/A specification.
    * @param callback               OptionalCallback to be invoked when the promise is resolved, or a non-promiseis received.
    * @param errback               OptionalCallback to be invoked when the promise is rejected.
    * @param progback               OptionalCallback to be invoked when the promise emits a progress update.
    */
  def when(): js.Any = js.native
  def when(valueOrPromise: js.Any): js.Any = js.native
  def when(valueOrPromise: js.Any, callback: js.Function): js.Any = js.native
  def when(valueOrPromise: js.Any, callback: js.Function, errback: js.Function): js.Any = js.native
  def when(valueOrPromise: js.Any, callback: js.Function, errback: js.Function, progback: js.Function): js.Any = js.native
}

