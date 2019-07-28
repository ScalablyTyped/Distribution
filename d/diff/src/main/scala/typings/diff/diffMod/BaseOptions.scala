package typings.diff.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
    * `true` to ignore casing difference.
    * @default false
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(ignoreCase: js.UndefOr[Boolean] = js.undefined): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    __obj.asInstanceOf[BaseOptions]
  }
}

