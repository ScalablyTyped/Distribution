package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The actor of a Drive activity.
  */
@js.native
trait Schema$Actor extends js.Object {
  /**
    * An administrator.
    */
  var administrator: js.UndefOr[Schema$Administrator] = js.native
  /**
    * An anonymous user.
    */
  var anonymous: js.UndefOr[Schema$AnonymousUser] = js.native
  /**
    * An account acting on behalf of another.
    */
  var impersonation: js.UndefOr[Schema$Impersonation] = js.native
  /**
    * A non-user actor (i.e. system triggered).
    */
  var system: js.UndefOr[Schema$SystemEvent] = js.native
  /**
    * An end user.
    */
  var user: js.UndefOr[Schema$User] = js.native
}

object Schema$Actor {
  @scala.inline
  def apply(
    administrator: Schema$Administrator = null,
    anonymous: Schema$AnonymousUser = null,
    impersonation: Schema$Impersonation = null,
    system: Schema$SystemEvent = null,
    user: Schema$User = null
  ): Schema$Actor = {
    val __obj = js.Dynamic.literal()
    if (administrator != null) __obj.updateDynamic("administrator")(administrator.asInstanceOf[js.Any])
    if (anonymous != null) __obj.updateDynamic("anonymous")(anonymous.asInstanceOf[js.Any])
    if (impersonation != null) __obj.updateDynamic("impersonation")(impersonation.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Actor]
  }
}

