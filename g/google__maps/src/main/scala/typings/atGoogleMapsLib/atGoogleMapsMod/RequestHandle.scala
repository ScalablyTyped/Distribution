package typings
package atGoogleMapsLib.atGoogleMapsMod

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
  def cancel(): scala.Unit
  /**
    * Registers a callback that will be called when the response is finished, either successfully, or with an error,
    * or having been cancelled. Use this to clean up resources.
    * Returns this handle, for chaining.
    */
  def `finally`(callback: js.Function0[scala.Unit]): RequestHandle[T]
}

object RequestHandle {
  @scala.inline
  def apply[T](
    asPromise: js.Function0[js.Promise[ClientResponse[T]]],
    cancel: js.Function0[scala.Unit],
    `finally`: js.Function1[js.Function0[scala.Unit], RequestHandle[T]]
  ): RequestHandle[T] = {
    val __obj = js.Dynamic.literal(asPromise = asPromise, cancel = cancel)
    __obj.updateDynamic("finally")(`finally`)
    __obj.asInstanceOf[RequestHandle[T]]
  }
}

