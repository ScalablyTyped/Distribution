package typings.googleDashAppsDashScript.GoogleAppsScript.Appsactivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var permissionId: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[User] = js.undefined
  var withLink: js.UndefOr[Boolean] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    name: String = null,
    permissionId: String = null,
    role: String = null,
    `type`: String = null,
    user: User = null,
    withLink: js.UndefOr[Boolean] = js.undefined
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId)
    if (role != null) __obj.updateDynamic("role")(role)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (user != null) __obj.updateDynamic("user")(user)
    if (!js.isUndefined(withLink)) __obj.updateDynamic("withLink")(withLink)
    __obj.asInstanceOf[Permission]
  }
}

