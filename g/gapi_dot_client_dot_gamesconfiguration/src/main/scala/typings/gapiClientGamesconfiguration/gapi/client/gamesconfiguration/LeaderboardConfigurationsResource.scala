package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesconfiguration.anon.Alt
import typings.gapiClientGamesconfiguration.anon.ApplicationId
import typings.gapiClientGamesconfiguration.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaderboardConfigurationsResource extends js.Object {
  /** Delete the leaderboard configuration with the given ID. */
  def delete(request: Key): Request[Unit] = js.native
  /** Retrieves the metadata of the leaderboard configuration with the given ID. */
  def get(request: Key): Request[LeaderboardConfiguration] = js.native
  /** Insert a new leaderboard configuration in this application. */
  def insert(request: Alt): Request[LeaderboardConfiguration] = js.native
  /** Returns a list of the leaderboard configurations in this application. */
  def list(request: ApplicationId): Request[LeaderboardConfigurationListResponse] = js.native
  /** Update the metadata of the leaderboard configuration with the given ID. This method supports patch semantics. */
  def patch(request: Key): Request[LeaderboardConfiguration] = js.native
  /** Update the metadata of the leaderboard configuration with the given ID. */
  def update(request: Key): Request[LeaderboardConfiguration] = js.native
}

object LeaderboardConfigurationsResource {
  @scala.inline
  def apply(
    delete: Key => Request[Unit],
    get: Key => Request[LeaderboardConfiguration],
    insert: Alt => Request[LeaderboardConfiguration],
    list: ApplicationId => Request[LeaderboardConfigurationListResponse],
    patch: Key => Request[LeaderboardConfiguration],
    update: Key => Request[LeaderboardConfiguration]
  ): LeaderboardConfigurationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LeaderboardConfigurationsResource]
  }
  @scala.inline
  implicit class LeaderboardConfigurationsResourceOps[Self <: LeaderboardConfigurationsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Key => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[LeaderboardConfiguration]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Alt => Request[LeaderboardConfiguration]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: ApplicationId => Request[LeaderboardConfigurationListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Key => Request[LeaderboardConfiguration]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[LeaderboardConfiguration]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

