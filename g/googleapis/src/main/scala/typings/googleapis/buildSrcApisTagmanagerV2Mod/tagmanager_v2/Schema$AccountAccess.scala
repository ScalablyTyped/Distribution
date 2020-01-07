package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the Google Tag Manager Account access permissions.
  */
@js.native
trait Schema$AccountAccess extends js.Object {
  /**
    * Whether the user has no access, user access, or admin access to an
    * account.
    */
  var permission: js.UndefOr[String] = js.native
}

object Schema$AccountAccess {
  @scala.inline
  def apply(permission: String = null): Schema$AccountAccess = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountAccess]
  }
}

