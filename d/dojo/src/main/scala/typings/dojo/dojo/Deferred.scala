package typings.dojo.dojo

import typings.dojo.dojo.promise.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/Deferred.html
  *
  * Creates a new deferred. This API is preferred over
  * dojo/_base/Deferred.
  * Creates a new deferred, as an abstraction over (primarily)
  * asynchronous operations. The deferred is the private interface
  * that should not be returned to calling code. That's what the
  * promise is for. See dojo/promise/Promise.
  *
  * @param canceler       OptionalWill be invoked if the deferred is canceled. The cancelerreceives the reason the deferred was canceled as its argument.The deferred is rejected with its return value, or a newdojo/errors/CancelError instance.
  */
@JSGlobal("dojo.Deferred")
@js.native
class Deferred () extends js.Object {
  def this(canceler: js.Function) = this()
  /**
    *
    */
  var promise: Promise[_] = js.native
  /**
    * Inform the deferred it may cancel its asynchronous operation.
    * Inform the deferred it may cancel its asynchronous operation.
    * The deferred's (optional) canceler is invoked and the
    * deferred will be left in a rejected state. Can affect other
    * promises that originate with the same deferred.
    *
    * @param reason A message that may be sent to the deferred's canceler,explaining why it's being canceled.
    * @param strict               OptionalIf strict, will throw an error if the deferred has alreadybeen fulfilled and consequently cannot be canceled.
    */
  def cancel(reason: js.Any): js.Any = js.native
  def cancel(reason: js.Any, strict: Boolean): js.Any = js.native
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
    * Emit a progress update on the deferred.
    * Emit a progress update on the deferred. Progress updates
    * can be used to communicate updates about the asynchronous
    * operation before it has finished.
    *
    * @param update The progress update. Passed to progbacks.
    * @param strict               OptionalIf strict, will throw an error if the deferred has alreadybeen fulfilled and consequently no progress can be emitted.
    */
  def progress(update: js.Any): Promise[_] = js.native
  def progress(update: js.Any, strict: Boolean): Promise[_] = js.native
  /**
    * Reject the deferred.
    * Reject the deferred, putting it in an error state.
    *
    * @param error The error result of the deferred. Passed to errbacks.
    * @param strict               OptionalIf strict, will throw an error if the deferred has alreadybeen fulfilled and consequently cannot be rejected.
    */
  def reject(error: js.Any): js.Any = js.native
  def reject(error: js.Any, strict: Boolean): js.Any = js.native
  /**
    * Resolve the deferred.
    * Resolve the deferred, putting it in a success state.
    *
    * @param value The result of the deferred. Passed to callbacks.
    * @param strict               OptionalIf strict, will throw an error if the deferred has alreadybeen fulfilled and consequently cannot be resolved.
    */
  def resolve(value: js.Any): Promise[_] = js.native
  def resolve(value: js.Any, strict: Boolean): Promise[_] = js.native
  /**
    * Add new callbacks to the deferred.
    * Add new callbacks to the deferred. Callbacks can be added
    * before or after the deferred is fulfilled.
    *
    * @param callback               OptionalCallback to be invoked when the promise is resolved.Receives the resolution value.
    * @param errback               OptionalCallback to be invoked when the promise is rejected.Receives the rejection error.
    * @param progback               OptionalCallback to be invoked when the promise emits a progressupdate. Receives the progress update.
    */
  def `then`(): Promise[_] = js.native
  def `then`(callback: js.Function): Promise[_] = js.native
  def `then`(callback: js.Function, errback: js.Function): Promise[_] = js.native
  def `then`(callback: js.Function, errback: js.Function, progback: js.Function): Promise[_] = js.native
}

