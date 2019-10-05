package typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuValue extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object MenuValue {
  @scala.inline
  def apply(displayName: String = null, iconUrl: String = null, state: String = null): MenuValue = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[MenuValue]
  }
}

