package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamesPlayedResource extends js.Object {
  /** True if the player was auto-matched with the currently authenticated user. */
  var autoMatched: js.UndefOr[Boolean] = js.undefined
  /** The last time the player played the game in milliseconds since the epoch in UTC. */
  var timeMillis: js.UndefOr[String] = js.undefined
}

object GamesPlayedResource {
  @scala.inline
  def apply(autoMatched: js.UndefOr[Boolean] = js.undefined, timeMillis: String = null): GamesPlayedResource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoMatched)) __obj.updateDynamic("autoMatched")(autoMatched.asInstanceOf[js.Any])
    if (timeMillis != null) __obj.updateDynamic("timeMillis")(timeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamesPlayedResource]
  }
}

