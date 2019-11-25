package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a leaderboard update for FBInstant.updateAsync.
  */
trait LeaderboardUpdatePayload extends js.Object {
  /**
    * For a leaderboard update, this should be 'LEADERBOARD'. text. By default we will use a localized 'Play Now' as the button text.
    */
  var action: UpdateAction
  /**
    * The name of the leaderboard to feature in the update.
    */
  var name: String
  /**
    * Optional text message. If not specified, a localized fallback message will be provided instead.
    */
  var text: js.UndefOr[String] = js.undefined
}

object LeaderboardUpdatePayload {
  @scala.inline
  def apply(action: UpdateAction, name: String, text: String = null): LeaderboardUpdatePayload = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderboardUpdatePayload]
  }
}

