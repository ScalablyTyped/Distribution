package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesconfiguration.anon.AchievementId
import typings.gapiClientGamesconfiguration.anon.Alt
import typings.gapiClientGamesconfiguration.anon.ApplicationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementConfigurationsResource extends js.Object {
  /** Delete the achievement configuration with the given ID. */
  def delete(request: AchievementId): Request[Unit]
  /** Retrieves the metadata of the achievement configuration with the given ID. */
  def get(request: AchievementId): Request[AchievementConfiguration]
  /** Insert a new achievement configuration in this application. */
  def insert(request: Alt): Request[AchievementConfiguration]
  /** Returns a list of the achievement configurations in this application. */
  def list(request: ApplicationId): Request[AchievementConfigurationListResponse]
  /** Update the metadata of the achievement configuration with the given ID. This method supports patch semantics. */
  def patch(request: AchievementId): Request[AchievementConfiguration]
  /** Update the metadata of the achievement configuration with the given ID. */
  def update(request: AchievementId): Request[AchievementConfiguration]
}

object AchievementConfigurationsResource {
  @scala.inline
  def apply(
    delete: AchievementId => Request[Unit],
    get: AchievementId => Request[AchievementConfiguration],
    insert: Alt => Request[AchievementConfiguration],
    list: ApplicationId => Request[AchievementConfigurationListResponse],
    patch: AchievementId => Request[AchievementConfiguration],
    update: AchievementId => Request[AchievementConfiguration]
  ): AchievementConfigurationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AchievementConfigurationsResource]
  }
}

