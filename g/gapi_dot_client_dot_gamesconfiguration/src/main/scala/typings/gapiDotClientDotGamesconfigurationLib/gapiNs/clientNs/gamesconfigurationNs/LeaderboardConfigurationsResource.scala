package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardConfigurationsResource extends js.Object {
  /** Delete the leaderboard configuration with the given ID. */
  def delete(request: gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves the metadata of the leaderboard configuration with the given ID. */
  def get(request: gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration]
  /** Insert a new leaderboard configuration in this application. */
  def insert(request: gapiDotClientDotGamesconfigurationLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration]
  /** Returns a list of the leaderboard configurations in this application. */
  def list(request: gapiDotClientDotGamesconfigurationLib.Anon_AltApplicationId): gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfigurationListResponse]
  /** Update the metadata of the leaderboard configuration with the given ID. This method supports patch semantics. */
  def patch(request: gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration]
  /** Update the metadata of the leaderboard configuration with the given ID. */
  def update(request: gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration]
}

object LeaderboardConfigurationsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration],
    insert: gapiDotClientDotGamesconfigurationLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration],
    list: gapiDotClientDotGamesconfigurationLib.Anon_AltApplicationId => gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfigurationListResponse],
    patch: gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration],
    update: gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration]
  ): LeaderboardConfigurationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LeaderboardConfigurationsResource]
  }
}

