package typings.discourseSso.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserParams extends js.Object {
  var add_groups: js.UndefOr[js.Array[String]] = js.undefined
  var admin: js.UndefOr[Boolean] = js.undefined
  var avatar_url: js.UndefOr[String] = js.undefined
  var email: String
  var external_id: String
  var moderator: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nonce: String
  var remove_groups: js.UndefOr[js.Array[String]] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object UserParams {
  @scala.inline
  def apply(
    email: String,
    external_id: String,
    nonce: String,
    add_groups: js.Array[String] = null,
    admin: js.UndefOr[Boolean] = js.undefined,
    avatar_url: String = null,
    moderator: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    remove_groups: js.Array[String] = null,
    username: String = null
  ): UserParams = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    if (add_groups != null) __obj.updateDynamic("add_groups")(add_groups.asInstanceOf[js.Any])
    if (!js.isUndefined(admin)) __obj.updateDynamic("admin")(admin.get.asInstanceOf[js.Any])
    if (avatar_url != null) __obj.updateDynamic("avatar_url")(avatar_url.asInstanceOf[js.Any])
    if (!js.isUndefined(moderator)) __obj.updateDynamic("moderator")(moderator.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (remove_groups != null) __obj.updateDynamic("remove_groups")(remove_groups.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserParams]
  }
}

