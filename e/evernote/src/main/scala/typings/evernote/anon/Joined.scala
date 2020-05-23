package typings.evernote.anon

import typings.evernote.mod.Types.BusinessUserAttributes
import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Joined extends js.Object {
  var attributes: js.UndefOr[BusinessUserAttributes] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[UserID] = js.undefined
  var joined: js.UndefOr[Timestamp] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var photoLastUpdated: js.UndefOr[Timestamp] = js.undefined
  var photoUrl: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[BusinessUserRole] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Joined {
  @scala.inline
  def apply(
    attributes: BusinessUserAttributes = null,
    email: String = null,
    id: js.UndefOr[UserID] = js.undefined,
    joined: js.UndefOr[Timestamp] = js.undefined,
    name: String = null,
    photoLastUpdated: js.UndefOr[Timestamp] = js.undefined,
    photoUrl: String = null,
    role: BusinessUserRole = null,
    username: String = null
  ): Joined = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(joined)) __obj.updateDynamic("joined")(joined.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(photoLastUpdated)) __obj.updateDynamic("photoLastUpdated")(photoLastUpdated.get.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Joined]
  }
}

