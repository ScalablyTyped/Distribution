package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrilldownOptions extends js.Object {
  var backButton: js.UndefOr[String] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var parentLink: js.UndefOr[Boolean] = js.undefined
  var wrapper: js.UndefOr[String] = js.undefined
}

object IDrilldownOptions {
  @scala.inline
  def apply(
    backButton: String = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    parentLink: js.UndefOr[Boolean] = js.undefined,
    wrapper: String = null
  ): IDrilldownOptions = {
    val __obj = js.Dynamic.literal()
    if (backButton != null) __obj.updateDynamic("backButton")(backButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parentLink)) __obj.updateDynamic("parentLink")(parentLink.get.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDrilldownOptions]
  }
}

