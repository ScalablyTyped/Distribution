package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  /**
    * `true` if the value was inserted into the new string.
    */
  var added: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  /**
    * `true` if the value was removed from the old string.
    */
  var removed: js.UndefOr[Boolean] = js.undefined
  /**
    * Text content.
    */
  var value: String
}

object Change {
  @scala.inline
  def apply(
    value: String,
    added: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    removed: js.UndefOr[Boolean] = js.undefined
  ): Change = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(added)) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
}

