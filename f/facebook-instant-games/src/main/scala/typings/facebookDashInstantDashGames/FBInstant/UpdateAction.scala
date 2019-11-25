package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the type of the update action to perform.
  *
  * "CUSTOM": A custom update, with all content specified by the game.
  * "LEADERBOARD": An update associated with an Instant Game leaderboard.
  */
/* Rewritten from type alias, can be one of: 
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.CUSTOM
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.LEADERBOARD
*/
trait UpdateAction extends js.Object

object UpdateAction {
  @scala.inline
  def CUSTOM: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.CUSTOM = this.cast("CUSTOM")
  @scala.inline
  def LEADERBOARD: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.LEADERBOARD = this.cast("LEADERBOARD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

