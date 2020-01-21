package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.updateAsync")
@js.native
object updateAsync extends js.Object {
  /**
    * Informs Facebook of an update that occurred in the game. This will temporarily yield control to Facebook and Facebook will decide what to do based on what the update is.
    * The returned promise will resolve/reject when Facebook returns control to the game.
    *
    * @param payload A payload that describes the update.
    * @returns A promise that resolves when Facebook gives control back to the game.
    * @throws INVALID_PARAM
    * @throws PENDING_REQUEST
    * @throws INVALID_OPERATION
    */
  def apply(payload: CustomUpdatePayload): js.Promise[Unit] = js.native
  def apply(payload: LeaderboardUpdatePayload): js.Promise[Unit] = js.native
}

