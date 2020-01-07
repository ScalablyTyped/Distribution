package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the owner of a Drive item.
  */
@js.native
trait Schema$Owner extends js.Object {
  /**
    * The domain of the Drive item owner.
    */
  var domain: js.UndefOr[Schema$Domain] = js.native
  /**
    * The Team Drive that owns the Drive item.
    */
  var teamDrive: js.UndefOr[Schema$TeamDriveReference] = js.native
  /**
    * The user that owns the Drive item.
    */
  var user: js.UndefOr[Schema$User] = js.native
}

object Schema$Owner {
  @scala.inline
  def apply(
    domain: Schema$Domain = null,
    teamDrive: Schema$TeamDriveReference = null,
    user: Schema$User = null
  ): Schema$Owner = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (teamDrive != null) __obj.updateDynamic("teamDrive")(teamDrive.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Owner]
  }
}

