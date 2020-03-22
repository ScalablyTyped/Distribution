package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGamesconfiguration.AnonAlt
import typings.gapiClientGamesconfiguration.AnonApplicationId
import typings.gapiClientGamesconfiguration.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardConfigurationsResource extends js.Object {
  /** Delete the leaderboard configuration with the given ID. */
  def delete(request: AnonKey): Request_[Unit]
  /** Retrieves the metadata of the leaderboard configuration with the given ID. */
  def get(request: AnonKey): Request_[LeaderboardConfiguration]
  /** Insert a new leaderboard configuration in this application. */
  def insert(request: AnonAlt): Request_[LeaderboardConfiguration]
  /** Returns a list of the leaderboard configurations in this application. */
  def list(request: AnonApplicationId): Request_[LeaderboardConfigurationListResponse]
  /** Update the metadata of the leaderboard configuration with the given ID. This method supports patch semantics. */
  def patch(request: AnonKey): Request_[LeaderboardConfiguration]
  /** Update the metadata of the leaderboard configuration with the given ID. */
  def update(request: AnonKey): Request_[LeaderboardConfiguration]
}

object LeaderboardConfigurationsResource {
  @scala.inline
  def apply(
    delete: AnonKey => Request_[Unit],
    get: AnonKey => Request_[LeaderboardConfiguration],
    insert: AnonAlt => Request_[LeaderboardConfiguration],
    list: AnonApplicationId => Request_[LeaderboardConfigurationListResponse],
    patch: AnonKey => Request_[LeaderboardConfiguration],
    update: AnonKey => Request_[LeaderboardConfiguration]
  ): LeaderboardConfigurationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LeaderboardConfigurationsResource]
  }
}

