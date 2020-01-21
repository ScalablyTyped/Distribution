package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneTypeRestriction extends js.Object {
  /** True if type restrictions have been enabled for this Zone. */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** List of type public ids that have been whitelisted for use in this Zone. */
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

