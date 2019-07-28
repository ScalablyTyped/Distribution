package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyLanguageMaxResults
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestsResource extends js.Object {
  /** Indicates that the currently authorized user will participate in the quest. */
  def accept(request: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrint): Request[Quest]
  /** Get a list of quests for your application and the currently authenticated player. */
  def list(request: Anon_AltConsistencyTokenFieldsKeyLanguageMaxResults): Request[QuestListResponse]
}

object QuestsResource {
  @scala.inline
  def apply(
    accept: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrint => Request[Quest],
    list: Anon_AltConsistencyTokenFieldsKeyLanguageMaxResults => Request[QuestListResponse]
  ): QuestsResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[QuestsResource]
  }
}

