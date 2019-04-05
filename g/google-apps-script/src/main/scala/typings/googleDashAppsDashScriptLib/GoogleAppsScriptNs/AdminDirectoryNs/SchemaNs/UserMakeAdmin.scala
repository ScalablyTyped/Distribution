package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserMakeAdmin extends js.Object {
  var status: js.UndefOr[scala.Boolean] = js.undefined
}

object UserMakeAdmin {
  @scala.inline
  def apply(status: js.UndefOr[scala.Boolean] = js.undefined): UserMakeAdmin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[UserMakeAdmin]
  }
}

