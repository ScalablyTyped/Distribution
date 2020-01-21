package typings.facebookInstantGames.FBInstant

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
  - typings.facebookInstantGames.facebookInstantGamesStrings.CUSTOM
  - typings.facebookInstantGames.facebookInstantGamesStrings.LEADERBOARD
*/
trait UpdateAction extends js.Object

object UpdateAction {
  @scala.inline
  def CUSTOM: typings.facebookInstantGames.facebookInstantGamesStrings.CUSTOM = this.cast("CUSTOM")
  @scala.inline
  def LEADERBOARD: typings.facebookInstantGames.facebookInstantGamesStrings.LEADERBOARD = this.cast("LEADERBOARD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

