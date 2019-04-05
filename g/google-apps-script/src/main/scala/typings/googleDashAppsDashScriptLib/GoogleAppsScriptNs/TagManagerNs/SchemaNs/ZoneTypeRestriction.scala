package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneTypeRestriction extends js.Object {
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var whitelistedTypeId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ZoneTypeRestriction {
  @scala.inline
  def apply(
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    whitelistedTypeId: js.Array[java.lang.String] = null
  ): ZoneTypeRestriction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (whitelistedTypeId != null) __obj.updateDynamic("whitelistedTypeId")(whitelistedTypeId)
    __obj.asInstanceOf[ZoneTypeRestriction]
  }
}

