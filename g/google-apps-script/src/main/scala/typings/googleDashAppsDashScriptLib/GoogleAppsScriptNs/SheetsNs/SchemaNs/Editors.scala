package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editors extends js.Object {
  var domainUsersCanEdit: js.UndefOr[scala.Boolean] = js.undefined
  var groups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var users: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Editors {
  @scala.inline
  def apply(
    domainUsersCanEdit: js.UndefOr[scala.Boolean] = js.undefined,
    groups: js.Array[java.lang.String] = null,
    users: js.Array[java.lang.String] = null
  ): Editors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(domainUsersCanEdit)) __obj.updateDynamic("domainUsersCanEdit")(domainUsersCanEdit)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[Editors]
  }
}

