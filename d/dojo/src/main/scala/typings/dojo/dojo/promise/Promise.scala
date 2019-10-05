package typings.dojo.dojo.promise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/promise/Promise.html
  *
  * The public interface to a deferred.
  * The public interface to a deferred. All promises in Dojo are
  * instances of this class.
  *
  */
@js.native
trait Promise[T] extends Thenable[T] {
  /**
    * Add a callback to be invoked when the promise is resolved
    * or rejected.
    *
    * @param callbackOrErrback               OptionalA function that is used both as a callback and errback.
    */
  def always[U](callbackOrErrback: Callback[_, U]): Promise[U] = js.native
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
    * Checks whether the promise has been canceled.
    *
    */
  def isCanceled(): Boolean = js.native
  /**
    * Checks whether the promise has been resolved or rejected.
    *
    */
  def isFulfilled(): Boolean = js.native
  /**
    * Checks whether the promise has been rejected.
    *
    */
  def isRejected(): Boolean = js.native
  /**
    * Checks whether the promise has been resolved.
    *
    */
  def isResolved(): Boolean = js.native
  /**
    * Add new errbacks to the promise.
    *
    * @param errback               OptionalCallback to be invoked when the promise is rejected.
    */
  def otherwise[U](): Promise[U] = js.native
  def otherwise[U](errback: Callback[_, U]): Promise[U] = js.native
  def `then`[U](callback: Callback[T, U], errback: Callback[_, U], progback: Callback[_, U]): Promise[U] = js.native
  /**
    * Trace the promise.
    * Tracing allows you to transparently log progress,
    * resolution and rejection of promises, without affecting the
    * promise itself. Any arguments passed to trace() are
    * emitted in trace events. See dojo/promise/tracer on how
    * to handle traces.
    *
    */
  def trace(): Promise[T] = js.native
  /**
    * Trace rejection of the promise.
    * Tracing allows you to transparently log progress,
    * resolution and rejection of promises, without affecting the
    * promise itself. Any arguments passed to trace() are
    * emitted in trace events. See dojo/promise/tracer on how
    * to handle traces.
    *
    */
  def traceRejected(): Promise[T] = js.native
}

