package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonPageToken
import typings.gapiClientGames.AnonQuestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestsResource extends js.Object {
  /** Indicates that the currently authorized user will participate in the quest. */
  def accept(request: AnonQuestId): Request_[Quest]
  /** Get a list of quests for your application and the currently authenticated player. */
  def list(request: AnonPageToken): Request_[QuestListResponse]
}

object QuestsResource {
  @scala.inline
  def apply(accept: AnonQuestId => Request_[Quest], list: AnonPageToken => Request_[QuestListResponse]): QuestsResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[QuestsResource]
  }
}

