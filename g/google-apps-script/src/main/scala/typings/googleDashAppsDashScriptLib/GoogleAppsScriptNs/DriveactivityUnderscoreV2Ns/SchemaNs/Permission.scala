package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var allowDiscovery: js.UndefOr[scala.Boolean] = js.undefined
  var anyone: js.UndefOr[js.Any] = js.undefined
  var domain: js.UndefOr[Domain] = js.undefined
  var group: js.UndefOr[Group] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var user: js.UndefOr[User] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    allowDiscovery: js.UndefOr[scala.Boolean] = js.undefined,
    anyone: js.Any = null,
    domain: Domain = null,
    group: Group = null,
    role: java.lang.String = null,
    user: User = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDiscovery)) __obj.updateDynamic("allowDiscovery")(allowDiscovery)
    if (anyone != null) __obj.updateDynamic("anyone")(anyone)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (group != null) __obj.updateDynamic("group")(group)
    if (role != null) __obj.updateDynamic("role")(role)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Permission]
  }
}

