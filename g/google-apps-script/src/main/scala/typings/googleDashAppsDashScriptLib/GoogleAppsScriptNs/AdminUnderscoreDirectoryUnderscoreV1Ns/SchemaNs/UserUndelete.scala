package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserUndelete extends js.Object {
  var orgUnitPath: js.UndefOr[java.lang.String] = js.undefined
}

object UserUndelete {
  @scala.inline
  def apply(orgUnitPath: java.lang.String = null): UserUndelete = {
    val __obj = js.Dynamic.literal()
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath)
    __obj.asInstanceOf[UserUndelete]
  }
}

