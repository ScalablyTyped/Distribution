package typings
package facebookDashInstantDashGamesLib.FBInstantNs

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
  var name: java.lang.String
  /**
    * Optional text message. If not specified, a localized fallback message will be provided instead.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

