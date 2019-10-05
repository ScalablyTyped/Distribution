package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.createShortcutAsync")
@js.native
object createShortcutAsync extends js.Object {
  /**
    * Prompts the user to create a shortcut to the game if they are eligible to Can only be called once per session. (see canCreateShortcutAsync)
    * @throws USER_INPUT
    * @throws PENDING_REQUEST
    * @throws CLIENT_REQUIRES_UPDATE
    * @throws INVALID_OPERATION
    */
  def apply(): js.Promise[Unit] = js.native
}

