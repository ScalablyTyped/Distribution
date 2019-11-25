package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter that may be applied to a Context Choose operation
  * 'NEW_CONTEXT_ONLY' - Prefer to only surface contexts the game has not been played in before.
  * 'INCLUDE_EXISTING_CHALLENGES' - Include the "Existing Challenges" section, which surfaces actively played-in contexts that the player is a part of.
  * 'NEW_PLAYERS_ONLY' - In sections containing individuals, prefer people who have not played the game.
  */
/* Rewritten from type alias, can be one of: 
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.NEW_CONTEXT_ONLY
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.INCLUDE_EXISTING_CHALLENGES
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.NEW_PLAYERS_ONLY
*/
trait ContextFilter extends js.Object

object ContextFilter {
  @scala.inline
  def INCLUDE_EXISTING_CHALLENGES: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.INCLUDE_EXISTING_CHALLENGES = this.cast("INCLUDE_EXISTING_CHALLENGES")
  @scala.inline
  def NEW_CONTEXT_ONLY: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.NEW_CONTEXT_ONLY = this.cast("NEW_CONTEXT_ONLY")
  @scala.inline
  def NEW_PLAYERS_ONLY: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.NEW_PLAYERS_ONLY = this.cast("NEW_PLAYERS_ONLY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

