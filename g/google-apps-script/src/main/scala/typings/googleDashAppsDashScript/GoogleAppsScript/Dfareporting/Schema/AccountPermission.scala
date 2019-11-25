package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermission extends js.Object {
  var accountProfiles: js.UndefOr[js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var permissionGroupId: js.UndefOr[String] = js.undefined
}

object AccountPermission {
  @scala.inline
  def apply(
    accountProfiles: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    level: String = null,
    name: String = null,
    permissionGroupId: String = null
  ): AccountPermission = {
    val __obj = js.Dynamic.literal()
    if (accountProfiles != null) __obj.updateDynamic("accountProfiles")(accountProfiles.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissionGroupId != null) __obj.updateDynamic("permissionGroupId")(permissionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountPermission]
  }
}

