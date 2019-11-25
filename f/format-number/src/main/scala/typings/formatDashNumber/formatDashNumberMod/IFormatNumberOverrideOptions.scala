package typings.formatDashNumber.formatDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormatNumberOverrideOptions extends js.Object {
  var noSeparator: js.UndefOr[Boolean] = js.undefined
  var noUnits: js.UndefOr[Boolean] = js.undefined
}

object IFormatNumberOverrideOptions {
  @scala.inline
  def apply(noSeparator: js.UndefOr[Boolean] = js.undefined, noUnits: js.UndefOr[Boolean] = js.undefined): IFormatNumberOverrideOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noSeparator)) __obj.updateDynamic("noSeparator")(noSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(noUnits)) __obj.updateDynamic("noUnits")(noUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormatNumberOverrideOptions]
  }
}

