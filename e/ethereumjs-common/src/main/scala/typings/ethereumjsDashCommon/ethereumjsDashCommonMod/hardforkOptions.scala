package typings.ethereumjsDashCommon.ethereumjsDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hardforkOptions extends js.Object {
  /** optional, only active HFs (default: false) */
  var onlyActive: js.UndefOr[Boolean] = js.undefined
  /** optional, only allow supported HFs (default: false) */
  var onlySupported: js.UndefOr[Boolean] = js.undefined
}

object hardforkOptions {
  @scala.inline
  def apply(onlyActive: js.UndefOr[Boolean] = js.undefined, onlySupported: js.UndefOr[Boolean] = js.undefined): hardforkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlyActive)) __obj.updateDynamic("onlyActive")(onlyActive.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySupported)) __obj.updateDynamic("onlySupported")(onlySupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[hardforkOptions]
  }
}

