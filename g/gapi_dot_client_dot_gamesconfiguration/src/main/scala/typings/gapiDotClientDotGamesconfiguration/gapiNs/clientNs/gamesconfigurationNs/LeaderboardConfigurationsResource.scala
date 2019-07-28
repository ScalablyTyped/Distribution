package typings.gapiDotClientDotGamesconfiguration.gapiNs.clientNs.gamesconfigurationNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGamesconfiguration.Anon_Alt
import typings.gapiDotClientDotGamesconfiguration.Anon_AltApplicationId
import typings.gapiDotClientDotGamesconfiguration.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardConfigurationsResource extends js.Object {
  /** Delete the leaderboard configuration with the given ID. */
  def delete(request: Anon_AltFieldsKey): Request[Unit]
  /** Retrieves the metadata of the leaderboard configuration with the given ID. */
  def get(request: Anon_AltFieldsKey): Request[LeaderboardConfiguration]
  /** Insert a new leaderboard configuration in this application. */
  def insert(request: Anon_Alt): Request[LeaderboardConfiguration]
  /** Returns a list of the leaderboard configurations in this application. */
  def list(request: Anon_AltApplicationId): Request[LeaderboardConfigurationListResponse]
  /** Update the metadata of the leaderboard configuration with the given ID. This method supports patch semantics. */
  def patch(request: Anon_AltFieldsKey): Request[LeaderboardConfiguration]
  /** Update the metadata of the leaderboard configuration with the given ID. */
  def update(request: Anon_AltFieldsKey): Request[LeaderboardConfiguration]
}

object LeaderboardConfigurationsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKey => Request[Unit],
    get: Anon_AltFieldsKey => Request[LeaderboardConfiguration],
    insert: Anon_Alt => Request[LeaderboardConfiguration],
    list: Anon_AltApplicationId => Request[LeaderboardConfigurationListResponse],
    patch: Anon_AltFieldsKey => Request[LeaderboardConfiguration],
    update: Anon_AltFieldsKey => Request[LeaderboardConfiguration]
  ): LeaderboardConfigurationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LeaderboardConfigurationsResource]
  }
}

