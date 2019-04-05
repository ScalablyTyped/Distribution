package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuValue extends js.Object {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object MenuValue {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    iconUrl: java.lang.String = null,
    state: java.lang.String = null
  ): MenuValue = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[MenuValue]
  }
}

