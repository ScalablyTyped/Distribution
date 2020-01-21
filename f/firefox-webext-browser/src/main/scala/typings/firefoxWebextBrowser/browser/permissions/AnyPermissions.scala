package typings.firefoxWebextBrowser.browser.permissions

import typings.firefoxWebextBrowser.browser.manifest.MatchPattern
import typings.firefoxWebextBrowser.browser.manifest.Permission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyPermissions extends js.Object {
  var origins: js.UndefOr[js.Array[MatchPattern]] = js.undefined
  var permissions: js.UndefOr[js.Array[Permission]] = js.undefined
}

object AnyPermissions {
  @scala.inline
  def apply(origins: js.Array[MatchPattern] = null, permissions: js.Array[Permission] = null): AnyPermissions = {
    val __obj = js.Dynamic.literal()
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyPermissions]
  }
}

