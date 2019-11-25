package typings.es6DashShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorResult[T] extends js.Object {
  var done: Boolean
  var value: js.UndefOr[T] = js.undefined
}

object IteratorResult {
  @scala.inline
  def apply[T](done: Boolean, value: T = null): IteratorResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorResult[T]]
  }
}

