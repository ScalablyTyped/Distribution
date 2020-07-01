package typings.firebaseAdmin.admin.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConfigUser extends js.Object {
  /**
    * Email address. Output only.
    */
  var email: String
  /**
    * Image URL. Output only.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * Display name. Output only.
    */
  var name: js.UndefOr[String] = js.undefined
}

object RemoteConfigUser {
  @scala.inline
  def apply(email: String, imageUrl: String = null, name: String = null): RemoteConfigUser = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteConfigUser]
  }
}

