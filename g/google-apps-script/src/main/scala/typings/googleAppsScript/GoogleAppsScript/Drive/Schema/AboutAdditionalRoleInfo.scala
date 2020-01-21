package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutAdditionalRoleInfo extends js.Object {
  var roleSets: js.UndefOr[js.Array[AboutAdditionalRoleInfoRoleSets]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AboutAdditionalRoleInfo {
  @scala.inline
  def apply(roleSets: js.Array[AboutAdditionalRoleInfoRoleSets] = null, `type`: String = null): AboutAdditionalRoleInfo = {
    val __obj = js.Dynamic.literal()
    if (roleSets != null) __obj.updateDynamic("roleSets")(roleSets.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboutAdditionalRoleInfo]
  }
}

