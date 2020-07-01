package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsIMEIOptions extends js.Object {
  var allow_hyphens: js.UndefOr[Boolean] = js.undefined
}

object IsIMEIOptions {
  @scala.inline
  def apply(allow_hyphens: js.UndefOr[Boolean] = js.undefined): IsIMEIOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_hyphens)) __obj.updateDynamic("allow_hyphens")(allow_hyphens.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsIMEIOptions]
  }
}

