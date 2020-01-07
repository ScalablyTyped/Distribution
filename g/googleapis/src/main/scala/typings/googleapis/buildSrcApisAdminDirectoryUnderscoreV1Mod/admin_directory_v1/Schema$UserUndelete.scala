package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template to undelete a user in Directory API.
  */
@js.native
trait Schema$UserUndelete extends js.Object {
  /**
    * OrgUnit of User
    */
  var orgUnitPath: js.UndefOr[String] = js.native
}

object Schema$UserUndelete {
  @scala.inline
  def apply(orgUnitPath: String = null): Schema$UserUndelete = {
    val __obj = js.Dynamic.literal()
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserUndelete]
  }
}

