package typings.expressDashValidator.srcOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsFQDNOptions extends js.Object {
  var allow_trailing_dot: js.UndefOr[Boolean] = js.undefined
  var allow_underscores: js.UndefOr[Boolean] = js.undefined
  var require_tld: js.UndefOr[Boolean] = js.undefined
}

object IsFQDNOptions {
  @scala.inline
  def apply(
    allow_trailing_dot: js.UndefOr[Boolean] = js.undefined,
    allow_underscores: js.UndefOr[Boolean] = js.undefined,
    require_tld: js.UndefOr[Boolean] = js.undefined
  ): IsFQDNOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_trailing_dot)) __obj.updateDynamic("allow_trailing_dot")(allow_trailing_dot.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_underscores)) __obj.updateDynamic("allow_underscores")(allow_underscores.asInstanceOf[js.Any])
    if (!js.isUndefined(require_tld)) __obj.updateDynamic("require_tld")(require_tld.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFQDNOptions]
  }
}

