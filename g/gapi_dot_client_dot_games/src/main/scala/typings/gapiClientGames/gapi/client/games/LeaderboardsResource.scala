package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.Alt
import typings.gapiClientGames.anon.LeaderboardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaderboardsResource extends js.Object {
  /** Retrieves the metadata of the leaderboard with the given ID. */
  def get(request: LeaderboardId): Request[Leaderboard] = js.native
  /** Lists all the leaderboard metadata for your application. */
  def list(request: Alt): Request[LeaderboardListResponse] = js.native
}

object LeaderboardsResource {
  @scala.inline
  def apply(get: LeaderboardId => Request[Leaderboard], list: Alt => Request[LeaderboardListResponse]): LeaderboardsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LeaderboardsResource]
  }
  @scala.inline
  implicit class LeaderboardsResourceOps[Self <: LeaderboardsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: LeaderboardId => Request[Leaderboard]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[LeaderboardListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

