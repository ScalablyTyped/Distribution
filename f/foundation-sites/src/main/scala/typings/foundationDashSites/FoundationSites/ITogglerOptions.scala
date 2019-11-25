package typings.foundationDashSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITogglerOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
}

object ITogglerOptions {
  @scala.inline
  def apply(animate: js.UndefOr[Boolean] = js.undefined): ITogglerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITogglerOptions]
  }
}

