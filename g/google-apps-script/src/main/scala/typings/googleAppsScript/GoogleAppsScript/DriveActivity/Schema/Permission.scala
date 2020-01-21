package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var allowDiscovery: js.UndefOr[Boolean] = js.undefined
  var anyone: js.UndefOr[js.Any] = js.undefined
  var domain: js.UndefOr[Domain] = js.undefined
  var group: js.UndefOr[Group] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[User] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    allowDiscovery: js.UndefOr[Boolean] = js.undefined,
    anyone: js.Any = null,
    domain: Domain = null,
    group: Group = null,
    role: String = null,
    user: User = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDiscovery)) __obj.updateDynamic("allowDiscovery")(allowDiscovery.asInstanceOf[js.Any])
    if (anyone != null) __obj.updateDynamic("anyone")(anyone.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
}

