package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.MaxResults
import typings.gapiClientGames.anon.PlayerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayersResource extends js.Object {
  /** Retrieves the Player resource with the given ID. To retrieve the player for the currently authenticated user, set playerId to me. */
  def get(request: PlayerId): Request[Player]
  /** Get the collection of players for the currently authenticated user. */
  def list(request: MaxResults): Request[PlayerListResponse]
}

object PlayersResource {
  @scala.inline
  def apply(get: PlayerId => Request[Player], list: MaxResults => Request[PlayerListResponse]): PlayersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PlayersResource]
  }
}

