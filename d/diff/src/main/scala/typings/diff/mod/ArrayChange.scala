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
    count: js.UndefOr[Double] = js.undefined,
    removed: js.UndefOr[Boolean] = js.undefined
  ): ArrayChange[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(added)) __obj.updateDynamic("added")(added.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayChange[T]]
  }
}

