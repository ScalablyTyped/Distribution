package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.checkCanPlayerMatchAsync")
@js.native
object checkCanPlayerMatchAsync extends js.Object {
  /**
    * Checks if the current player is eligible for the matchPlayerAsync API.
    * @returns  A promise that resolves with true if the player is eligible to match with other players and false otherwise.
    * @throws NETWORK_FAILURE
    * @throws CLIENT_UNSUPPORTED_OPERATION
    */
  def apply(): js.Promise[Boolean] = js.native
}

