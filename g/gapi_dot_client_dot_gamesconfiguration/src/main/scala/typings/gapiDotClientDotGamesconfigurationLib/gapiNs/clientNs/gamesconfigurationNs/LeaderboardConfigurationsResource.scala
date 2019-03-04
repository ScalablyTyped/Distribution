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
    delete: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration]
    ],
    insert: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration]
    ],
    list: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_AltApplicationId, 
      gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfigurationListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration]
    ],
    update: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardConfiguration]
    ]
  ): LeaderboardConfigurationsResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[LeaderboardConfigurationsResource]
  }
}

