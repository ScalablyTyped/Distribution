package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneTypeRestriction extends js.Object {
  var enable: js.UndefOr[Boolean] = js.undefined
  var whitelistedTypeId: js.UndefOr[js.Array[String]] = js.undefined
}

object ZoneTypeRestriction {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined, whitelistedTypeId: js.Array[String] = null): ZoneTypeRestriction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (whitelistedTypeId != null) __obj.updateDynamic("whitelistedTypeId")(whitelistedTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneTypeRestriction]
  }
}

