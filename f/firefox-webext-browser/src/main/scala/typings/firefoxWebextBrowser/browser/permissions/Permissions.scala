package typings.firefoxWebextBrowser.browser.permissions

import typings.firefoxWebextBrowser.browser.manifest.MatchPattern
import typings.firefoxWebextBrowser.browser.manifest.OptionalPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* permissions types */
trait Permissions extends js.Object {
  var origins: js.UndefOr[js.Array[MatchPattern]] = js.undefined
  var permissions: js.UndefOr[js.Array[OptionalPermission]] = js.undefined
}

object Permissions {
  @scala.inline
  def apply(origins: js.Array[MatchPattern] = null, permissions: js.Array[OptionalPermission] = null): Permissions = {
    val __obj = js.Dynamic.literal()
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
}

