package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabsOptions extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var linkClass: js.UndefOr[String] = js.undefined
  var matchHeight: js.UndefOr[Boolean] = js.undefined
  var panelClass: js.UndefOr[String] = js.undefined
  var wrapOnKeys: js.UndefOr[Boolean] = js.undefined
}

object ITabsOptions {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    linkClass: String = null,
    matchHeight: js.UndefOr[Boolean] = js.undefined,
    panelClass: String = null,
    wrapOnKeys: js.UndefOr[Boolean] = js.undefined
  ): ITabsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (linkClass != null) __obj.updateDynamic("linkClass")(linkClass.asInstanceOf[js.Any])
    if (!js.isUndefined(matchHeight)) __obj.updateDynamic("matchHeight")(matchHeight.asInstanceOf[js.Any])
    if (panelClass != null) __obj.updateDynamic("panelClass")(panelClass.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapOnKeys)) __obj.updateDynamic("wrapOnKeys")(wrapOnKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabsOptions]
  }
}

