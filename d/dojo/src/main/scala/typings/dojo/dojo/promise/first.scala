package typings.dojo.dojo.promise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/promise/first.html
  *
  * Takes multiple promises and returns a new promise that is fulfilled
  * when the first of these promises is fulfilled.
  * Takes multiple promises and returns a new promise that is fulfilled
  * when the first of these promises is fulfilled. Canceling the returned
  * promise will not cancel any passed promises. The promise will be
  * fulfilled with the value of the first fulfilled promise.
  *
  * @param objectOrArray       OptionalThe promises are taken from the array or object values. If no valueis passed, the returned promise is resolved with an undefined value.
  */
@js.native
trait first extends js.Object {
  def apply(): Unit = js.native
  def apply(objectOrArray: js.Array[_]): Unit = js.native
  def apply(objectOrArray: js.Object): Unit = js.native
}

