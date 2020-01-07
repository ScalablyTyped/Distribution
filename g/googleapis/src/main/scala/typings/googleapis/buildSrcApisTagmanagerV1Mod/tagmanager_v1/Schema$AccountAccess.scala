package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the Google Tag Manager Account access permissions.
  */
@js.native
trait Schema$AccountAccess extends js.Object {
  /**
    * List of Account permissions. Valid account permissions are read and
    * manage.
    */
  var permission: js.UndefOr[js.Array[String]] = js.native
}

object Schema$AccountAccess {
  @scala.inline
  def apply(permission: js.Array[String] = null): Schema$AccountAccess = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountAccess]
  }
}

