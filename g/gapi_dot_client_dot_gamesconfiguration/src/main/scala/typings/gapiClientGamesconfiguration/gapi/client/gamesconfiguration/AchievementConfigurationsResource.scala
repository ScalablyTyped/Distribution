package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGamesconfiguration.AnonAchievementId
import typings.gapiClientGamesconfiguration.AnonAlt
import typings.gapiClientGamesconfiguration.AnonAltApplicationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementConfigurationsResource extends js.Object {
  /** Delete the achievement configuration with the given ID. */
  def delete(request: AnonAchievementId): Request_[Unit]
  /** Retrieves the metadata of the achievement configuration with the given ID. */
  def get(request: AnonAchievementId): Request_[AchievementConfiguration]
  /** Insert a new achievement configuration in this application. */
  def insert(request: AnonAlt): Request_[AchievementConfiguration]
  /** Returns a list of the achievement configurations in this application. */
  def list(request: AnonAltApplicationId): Request_[AchievementConfigurationListResponse]
  /** Update the metadata of the achievement configuration with the given ID. This method supports patch semantics. */
  def patch(request: AnonAchievementId): Request_[AchievementConfiguration]
  /** Update the metadata of the achievement configuration with the given ID. */
  def update(request: AnonAchievementId): Request_[AchievementConfiguration]
}

object AchievementConfigurationsResource {
  @scala.inline
  def apply(
    delete: AnonAchievementId => Request_[Unit],
    get: AnonAchievementId => Request_[AchievementConfiguration],
    insert: AnonAlt => Request_[AchievementConfiguration],
    list: AnonAltApplicationId => Request_[AchievementConfigurationListResponse],
    patch: AnonAchievementId => Request_[AchievementConfiguration],
    update: AnonAchievementId => Request_[AchievementConfiguration]
  ): AchievementConfigurationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AchievementConfigurationsResource]
  }
}

