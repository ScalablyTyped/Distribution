package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayChange[T] extends js.Object {
  var added: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var removed: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.Array[T]
}

object ArrayChange {
  @scala.inline
  def apply[T](
    value: js.Array[T],
    added: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    removed: js.UndefOr[scala.Boolean] = js.undefined
  ): ArrayChange[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (!js.isUndefined(added)) __obj.updateDynamic("added")(added)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed)
    __obj.asInstanceOf[ArrayChange[T]]
  }
}

