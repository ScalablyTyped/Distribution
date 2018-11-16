package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QuestsResource extends js.Object {
  /** Indicates that the currently authorized user will participate in the quest. */
  def accept(
    request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenPrettyPrintQuotaUserKeyUserIpOauthtokenLanguageAltFields
  ): gapiDotClientLib.gapiNs.clientNs.Request[Quest]
  /** Get a list of quests for your application and the currently authenticated player. */
  def list(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenMaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[QuestListResponse]
}

