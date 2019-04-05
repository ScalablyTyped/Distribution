package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfile extends js.Object {
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[Name] = js.undefined
  var permissions: js.UndefOr[js.Array[GlobalPermission]] = js.undefined
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
  var verifiedTeacher: js.UndefOr[scala.Boolean] = js.undefined
}

object UserProfile {
  @scala.inline
  def apply(
    emailAddress: java.lang.String = null,
    id: java.lang.String = null,
    name: Name = null,
    permissions: js.Array[GlobalPermission] = null,
    photoUrl: java.lang.String = null,
    verifiedTeacher: js.UndefOr[scala.Boolean] = js.undefined
  ): UserProfile = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    if (!js.isUndefined(verifiedTeacher)) __obj.updateDynamic("verifiedTeacher")(verifiedTeacher)
    __obj.asInstanceOf[UserProfile]
  }
}

