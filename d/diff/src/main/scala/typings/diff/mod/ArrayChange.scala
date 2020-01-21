package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayChange[T] extends js.Object {
  var added: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var removed: js.UndefOr[Boolean] = js.undefined
  var value: js.Array[T]
}

object ArrayChange {
  @scala.inline
  def apply[T](
    value: js.Array[T],
    added: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    removed: js.UndefOr[Boolean] = js.undefined
  ): ArrayChange[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(added)) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayChange[T]]
  }
}

