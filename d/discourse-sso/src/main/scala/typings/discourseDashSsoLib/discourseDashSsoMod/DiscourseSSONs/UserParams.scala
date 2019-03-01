package typings
package discourseDashSsoLib.discourseDashSsoMod.DiscourseSSONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserParams extends js.Object {
  var add_groups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var admin: js.UndefOr[scala.Boolean] = js.undefined
  var avatar_url: js.UndefOr[java.lang.String] = js.undefined
  var email: java.lang.String
  var external_id: java.lang.String
  var moderator: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var nonce: java.lang.String
  var remove_groups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object UserParams {
  @scala.inline
  def apply(
    email: java.lang.String,
    external_id: java.lang.String,
    nonce: java.lang.String,
    add_groups: js.Array[java.lang.String] = null,
    admin: js.UndefOr[scala.Boolean] = js.undefined,
    avatar_url: java.lang.String = null,
    moderator: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    remove_groups: js.Array[java.lang.String] = null,
    username: java.lang.String = null
  ): UserParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("external_id")(external_id)
    __obj.updateDynamic("nonce")(nonce)
    if (add_groups != null) __obj.updateDynamic("add_groups")(add_groups)
    if (!js.isUndefined(admin)) __obj.updateDynamic("admin")(admin)
    if (avatar_url != null) __obj.updateDynamic("avatar_url")(avatar_url)
    if (!js.isUndefined(moderator)) __obj.updateDynamic("moderator")(moderator)
    if (name != null) __obj.updateDynamic("name")(name)
    if (remove_groups != null) __obj.updateDynamic("remove_groups")(remove_groups)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[UserParams]
  }
}

