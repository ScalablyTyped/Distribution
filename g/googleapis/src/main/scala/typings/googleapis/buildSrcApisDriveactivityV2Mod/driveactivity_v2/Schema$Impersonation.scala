package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an impersonation, where an admin acts on behalf of an end
  * user. Information about the acting admin is not currently available.
  */
@js.native
trait Schema$Impersonation extends js.Object {
  /**
    * The impersonated user.
    */
  var impersonatedUser: js.UndefOr[Schema$User] = js.native
}

object Schema$Impersonation {
  @scala.inline
  def apply(impersonatedUser: Schema$User = null): Schema$Impersonation = {
    val __obj = js.Dynamic.literal()
    if (impersonatedUser != null) __obj.updateDynamic("impersonatedUser")(impersonatedUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Impersonation]
  }
}

