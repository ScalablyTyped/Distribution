package typings
package facebookDashInstantDashGamesLib.FBInstantNs

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
  - facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.NEW_CONTEXT_ONLY
  - facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.INCLUDE_EXISTING_CHALLENGES
  - facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.NEW_PLAYERS_ONLY
*/
trait ContextFilter extends js.Object

