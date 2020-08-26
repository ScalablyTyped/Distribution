package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.MaxResults
import typings.gapiClientGames.anon.PlayerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayersResource extends js.Object {
  /** Retrieves the Player resource with the given ID. To retrieve the player for the currently authenticated user, set playerId to me. */
  def get(request: PlayerId): Request[Player] = js.native
  /** Get the collection of players for the currently authenticated user. */
  def list(request: MaxResults): Request[PlayerListResponse] = js.native
}

object PlayersResource {
  @scala.inline
  def apply(get: PlayerId => Request[Player], list: MaxResults => Request[PlayerListResponse]): PlayersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PlayersResource]
  }
  @scala.inline
  implicit class PlayersResourceOps[Self <: PlayersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: PlayerId => Request[Player]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[PlayerListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

