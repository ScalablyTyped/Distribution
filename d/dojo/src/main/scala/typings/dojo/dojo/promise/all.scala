package typings.dojo.dojo.promise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/promise/all.html
  *
  * Takes multiple promises and returns a new promise that is fulfilled
  * when all promises have been fulfilled.
  * Takes multiple promises and returns a new promise that is fulfilled
  * when all promises have been fulfilled. If one of the promises is rejected,
  * the returned promise is also rejected. Canceling the returned promise will
  * not cancel any passed promises.
  *
  * @param objectOrArray       OptionalThe promise will be fulfilled with a list of results if invoked with anarray, or an object of results when passed an object (using the samekeys). If passed neither an object or array it is resolved with anundefined value.
  */
@js.native
trait all extends js.Object {
  def apply(value: js.Object): Promise[_] = js.native
  def apply[T](value: js.Array[Promise[T]]): Promise[js.Array[T]] = js.native
}

