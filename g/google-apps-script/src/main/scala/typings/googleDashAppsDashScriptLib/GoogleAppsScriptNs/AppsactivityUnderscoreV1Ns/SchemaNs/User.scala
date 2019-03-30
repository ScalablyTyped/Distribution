package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var isDeleted: js.UndefOr[scala.Boolean] = js.undefined
  var isMe: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var permissionId: js.UndefOr[java.lang.String] = js.undefined
  var photo: js.UndefOr[Photo] = js.undefined
}

object User {
  @scala.inline
  def apply(
    isDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    isMe: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    permissionId: java.lang.String = null,
    photo: Photo = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDeleted)) __obj.updateDynamic("isDeleted")(isDeleted)
    if (!js.isUndefined(isMe)) __obj.updateDynamic("isMe")(isMe)
    if (name != null) __obj.updateDynamic("name")(name)
    if (permissionId != null) __obj.updateDynamic("permissionId")(permissionId)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    __obj.asInstanceOf[User]
  }
}

