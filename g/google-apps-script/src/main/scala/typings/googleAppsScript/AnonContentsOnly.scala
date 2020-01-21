package typings.googleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentsOnly extends js.Object {
  var contentsOnly: js.UndefOr[Boolean] = js.undefined
  var formatOnly: js.UndefOr[Boolean] = js.undefined
}

object AnonContentsOnly {
  @scala.inline
  def apply(contentsOnly: js.UndefOr[Boolean] = js.undefined, formatOnly: js.UndefOr[Boolean] = js.undefined): AnonContentsOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(formatOnly)) __obj.updateDynamic("formatOnly")(formatOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentsOnly]
  }
}

