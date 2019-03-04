package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestsResource extends js.Object {
  /** Indicates that the currently authorized user will participate in the quest. */
  def accept(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Quest]
  /** Get a list of quests for your application and the currently authenticated player. */
  def list(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[QuestListResponse]
}

object QuestsResource {
  @scala.inline
  def apply(
    accept: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Quest]
    ],
    list: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMaxResults, 
      gapiDotClientLib.gapiNs.clientNs.Request[QuestListResponse]
    ]
  ): QuestsResource = {
    val __obj = js.Dynamic.literal(accept = accept, list = list)
  
    __obj.asInstanceOf[QuestsResource]
  }
}

