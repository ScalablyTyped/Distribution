package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppIcons extends js.Object {
  var category: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object AppIcons {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    iconUrl: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): AppIcons = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppIcons]
  }
}

