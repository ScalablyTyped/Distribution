package typings
package facebookDashInstantDashGamesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FBInstantNs {
  /**
       * A filter that may be applied to a Context Choose operation
       * 'NEW_CONTEXT_ONLY' - Prefer to only surface contexts the game has not been played in before.
       * 'INCLUDE_EXISTING_CHALLENGES' - Include the "Existing Challenges" section, which surfaces actively played-in contexts that the player is a part of.
       * 'NEW_PLAYERS_ONLY' - In sections containing individuals, prefer people who have not played the game.
       */
  type ContextFilter = facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.NEW_CONTEXT_ONLY | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.INCLUDE_EXISTING_CHALLENGES | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.NEW_PLAYERS_ONLY
  type ErrorCodeType = facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.ADS_FREQUENT_LOAD | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.ADS_NO_FILL | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.ADS_NOT_LOADED | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.ADS_TOO_MANY_INSTANCES | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.ANALYTICS_POST_EXCEPTION | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.CLIENT_REQUIRES_UPDATE | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.CLIENT_UNSUPPORTED_OPERATION | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.INVALID_OPERATION | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.INVALID_PARAM | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.LEADERBOARD_NOT_FOUND | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.LEADERBOARD_WRONG_CONTEXT | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.NETWORK_FAILURE | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.PENDING_REQUEST | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.RATE_LIMITED | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.SAME_CONTEXT | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.UNKNOWN | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.USER_INPUT
  type Intent = facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.INVITE | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.REQUEST | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.CHALLENGE | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.SHARE
  /**
       * Represents the current platform that the user is playing on.
       */
  type Platform = facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.IOS | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.ANDROID | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.WEB | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.MOBILE_WEB
  type SignedPurchaseRequest = java.lang.String
  type Type = facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.POST | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.THREAD | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.GROUP | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.SOLO
  /**
       * Represents the type of the update action to perform.
       *
       * "CUSTOM": A custom update, with all content specified by the game.
       * "LEADERBOARD": An update associated with an Instant Game leaderboard.
       */
  type UpdateAction = facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.CUSTOM | facebookDashInstantDashGamesLib.facebookDashInstantDashGamesLibStrings.LEADERBOARD
}
