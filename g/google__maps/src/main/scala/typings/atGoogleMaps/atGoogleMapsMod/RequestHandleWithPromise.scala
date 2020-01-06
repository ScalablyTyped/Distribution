package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHandleWithPromise[T] extends RequestHandle[T] {
  /**
    * Returns the response as a [Promise](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise).
    * This method is only available if you supplied the `Promise` constructor to the `createClient()` method when you constructed
    * the client object.
    */
  def asPromise(): js.Promise[ClientResponse[T]]
}

object RequestHandleWithPromise {
  @scala.inline
  def apply[T](
    asPromise: () => js.Promise[ClientResponse[T]],
    cancel: () => Unit,
    `finally`: js.Function0[Unit] => RequestHandle[T]
  ): RequestHandleWithPromise[T] = {
    val __obj = js.Dynamic.literal(asPromise = js.Any.fromFunction0(asPromise), cancel = js.Any.fromFunction0(cancel))
    __obj.updateDynamic("finally")(js.Any.fromFunction1(`finally`))
    __obj.asInstanceOf[RequestHandleWithPromise[T]]
  }
}

