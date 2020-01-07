package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an end user.
  */
@js.native
trait Schema$User extends js.Object {
  /**
    * A user whose account has since been deleted.
    */
  var deletedUser: js.UndefOr[Schema$DeletedUser] = js.native
  /**
    * A known user.
    */
  var knownUser: js.UndefOr[Schema$KnownUser] = js.native
  /**
    * A user about whom nothing is currently known.
    */
  var unknownUser: js.UndefOr[Schema$UnknownUser] = js.native
}

object Schema$User {
  @scala.inline
  def apply(
    deletedUser: Schema$DeletedUser = null,
    knownUser: Schema$KnownUser = null,
    unknownUser: Schema$UnknownUser = null
  ): Schema$User = {
    val __obj = js.Dynamic.literal()
    if (deletedUser != null) __obj.updateDynamic("deletedUser")(deletedUser.asInstanceOf[js.Any])
    if (knownUser != null) __obj.updateDynamic("knownUser")(knownUser.asInstanceOf[js.Any])
    if (unknownUser != null) __obj.updateDynamic("unknownUser")(unknownUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$User]
  }
}

