package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabsOptions extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var linkClass: js.UndefOr[java.lang.String] = js.undefined
  var matchHeight: js.UndefOr[scala.Boolean] = js.undefined
  var panelClass: js.UndefOr[java.lang.String] = js.undefined
  var wrapOnKeys: js.UndefOr[scala.Boolean] = js.undefined
}

object ITabsOptions {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    linkClass: java.lang.String = null,
    matchHeight: js.UndefOr[scala.Boolean] = js.undefined,
    panelClass: java.lang.String = null,
    wrapOnKeys: js.UndefOr[scala.Boolean] = js.undefined
  ): ITabsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (linkClass != null) __obj.updateDynamic("linkClass")(linkClass)
    if (!js.isUndefined(matchHeight)) __obj.updateDynamic("matchHeight")(matchHeight)
    if (panelClass != null) __obj.updateDynamic("panelClass")(panelClass)
    if (!js.isUndefined(wrapOnKeys)) __obj.updateDynamic("wrapOnKeys")(wrapOnKeys)
    __obj.asInstanceOf[ITabsOptions]
  }
}

