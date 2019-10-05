package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserUndelete extends js.Object {
  var orgUnitPath: js.UndefOr[String] = js.undefined
}

object UserUndelete {
  @scala.inline
  def apply(orgUnitPath: String = null): UserUndelete = {
    val __obj = js.Dynamic.literal()
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath)
    __obj.asInstanceOf[UserUndelete]
  }
}

