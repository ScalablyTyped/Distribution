package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  /**
    * `true` if the value was inserted into the new string.
    */
  var added: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * `true` if the value was removed from the old string.
    */
  var removed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text content.
    */
  var value: java.lang.String
}

object Change {
  @scala.inline
  def apply(
    value: java.lang.String,
    added: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    removed: js.UndefOr[scala.Boolean] = js.undefined
  ): Change = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (!js.isUndefined(added)) __obj.updateDynamic("added")(added)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed)
    __obj.asInstanceOf[Change]
  }
}

