package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesconfiguration.anon.Alt
import typings.gapiClientGamesconfiguration.anon.ApplicationId
import typings.gapiClientGamesconfiguration.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardConfigurationsResource extends js.Object {
  /** Delete the leaderboard configuration with the given ID. */
  def delete(request: Key): Request[Unit]
  /** Retrieves the metadata of the leaderboard configuration with the given ID. */
  def get(request: Key): Request[LeaderboardConfiguration]
  /** Insert a new leaderboard configuration in this application. */
  def insert(request: Alt): Request[LeaderboardConfiguration]
  /** Returns a list of the leaderboard configurations in this application. */
  def list(request: ApplicationId): Request[LeaderboardConfigurationListResponse]
  /** Update the metadata of the leaderboard configuration with the given ID. This method supports patch semantics. */
  def patch(request: Key): Request[LeaderboardConfiguration]
  /** Update the metadata of the leaderboard configuration with the given ID. */
  def update(request: Key): Request[LeaderboardConfiguration]
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
}

