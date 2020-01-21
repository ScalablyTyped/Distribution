package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.getLeaderboardAsync")
@js.native
object getLeaderboardAsync extends js.Object {
  /**
    * Fetch a specific leaderboard belonging to this Instant Game.
    *
    * @param name The name of the leaderboard. Each leaderboard for an Instant Game must have its own distinct name.
    * @returns A promise that resolves with the matching leaderboard, rejecting if one is not found.
    * @throws LEADERBOARD_NOT_FOUND
    * @throws NETWORK_FAILURE
    * @throws CLIENT_UNSUPPORTED_OPERATION
    * @throws INVALID_OPERATION
    * @throws INVALID_PARAM
    */
  def apply(name: String): js.Promise[Leaderboard] = js.native
}

