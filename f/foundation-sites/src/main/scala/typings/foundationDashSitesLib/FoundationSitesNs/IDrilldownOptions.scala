package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrilldownOptions extends js.Object {
  var backButton: js.UndefOr[java.lang.String] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var parentLink: js.UndefOr[scala.Boolean] = js.undefined
  var wrapper: js.UndefOr[java.lang.String] = js.undefined
}

object IDrilldownOptions {
  @scala.inline
  def apply(
    backButton: java.lang.String = null,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    parentLink: js.UndefOr[scala.Boolean] = js.undefined,
    wrapper: java.lang.String = null
  ): IDrilldownOptions = {
    val __obj = js.Dynamic.literal()
    if (backButton != null) __obj.updateDynamic("backButton")(backButton)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(parentLink)) __obj.updateDynamic("parentLink")(parentLink)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[IDrilldownOptions]
  }
}

