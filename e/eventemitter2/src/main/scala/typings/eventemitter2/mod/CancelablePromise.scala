package typings.eventemitter2.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelablePromise[T] extends Promise[T] {
  def cancel(reason: String): js.UndefOr[scala.Nothing] = js.native
}

