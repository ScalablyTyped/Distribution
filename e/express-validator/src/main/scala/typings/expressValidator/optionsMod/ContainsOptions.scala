package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainsOptions extends js.Object {
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
}

object ContainsOptions {
  @scala.inline
  def apply(ignoreCase: js.UndefOr[Boolean] = js.undefined): ContainsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsOptions]
  }
}

