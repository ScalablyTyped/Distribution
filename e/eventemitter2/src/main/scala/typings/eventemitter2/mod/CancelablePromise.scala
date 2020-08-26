package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelablePromise[T]
  extends js.Promise[T] {
  def cancel(reason: String): js.UndefOr[scala.Nothing] = js.native
}

