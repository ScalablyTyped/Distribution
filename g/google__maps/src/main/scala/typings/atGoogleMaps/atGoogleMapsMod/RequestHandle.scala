package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHandle[T] extends js.Object {
  /**
    * Returns the response as a [Promise](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise).
    * This method is only available if you supplied the `Promise` constructor to the `createClient()` method when you constructed
    * the client object.
    */
  def asPromise(): js.Promise[ClientResponse[T]]
  /**
    * Cancels the request.
    * The ResponseCallback will not be invoked, and promises will not be settled.
    * Use the RequestHandle#finally handler will still be called.
    */
  def cancel(): Unit
  /**
    * Registers a callback that will be called when the response is finished, either successfully, or with an error,
    * or having been cancelled. Use this to clean up resources.
    * Returns this handle, for chaining.
    */
  def `finally`(callback: js.Function0[Unit]): RequestHandle[T]
}

object RequestHandle {
  @scala.inline
  def apply[T](
    asPromise: () => js.Promise[ClientResponse[T]],
    cancel: () => Unit,
    `finally`: js.Function0[Unit] => RequestHandle[T]
  ): RequestHandle[T] = {
    val __obj = js.Dynamic.literal(asPromise = js.Any.fromFunction0(asPromise), cancel = js.Any.fromFunction0(cancel))
    __obj.updateDynamic("finally")(js.Any.fromFunction1(`finally`))
    __obj.asInstanceOf[RequestHandle[T]]
  }
}

