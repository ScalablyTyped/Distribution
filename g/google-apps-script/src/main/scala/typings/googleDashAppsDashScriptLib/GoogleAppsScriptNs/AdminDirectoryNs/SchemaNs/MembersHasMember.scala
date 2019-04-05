package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersHasMember extends js.Object {
  var isMember: js.UndefOr[scala.Boolean] = js.undefined
}

object MembersHasMember {
  @scala.inline
  def apply(isMember: js.UndefOr[scala.Boolean] = js.undefined): MembersHasMember = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMember)) __obj.updateDynamic("isMember")(isMember)
    __obj.asInstanceOf[MembersHasMember]
  }
}

