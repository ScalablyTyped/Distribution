package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.canCreateShortcutAsync")
@js.native
object canCreateShortcutAsync extends js.Object {
  /**
    * Returns whether or not the user is eligible to have shortcut creation requested.
    *
    * Will return false if createShortcutAsync was already called this session or the user is ineligible for shortcut creation.
    *
    * @returns Promise that resolves with true if the game can request the player create a shortcut to the game, and false otherwise
    * @throws PENDING_REQUEST
    * @throws CLIENT_REQUIRES_UPDATE
    * @throws INVALID_OPERATION
    */
  def apply(): js.Promise[Boolean] = js.native
}

