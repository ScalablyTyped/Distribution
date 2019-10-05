package typings.gapiDotClientDotGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGamesconfiguration.Anon_AchievementId
import typings.gapiDotClientDotGamesconfiguration.Anon_Alt
import typings.gapiDotClientDotGamesconfiguration.Anon_AltApplicationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementConfigurationsResource extends js.Object {
  /** Delete the achievement configuration with the given ID. */
  def delete(request: Anon_AchievementId): Request[Unit]
  /** Retrieves the metadata of the achievement configuration with the given ID. */
  def get(request: Anon_AchievementId): Request[AchievementConfiguration]
  /** Insert a new achievement configuration in this application. */
  def insert(request: Anon_Alt): Request[AchievementConfiguration]
  /** Returns a list of the achievement configurations in this application. */
  def list(request: Anon_AltApplicationId): Request[AchievementConfigurationListResponse]
  /** Update the metadata of the achievement configuration with the given ID. This method supports patch semantics. */
  def patch(request: Anon_AchievementId): Request[AchievementConfiguration]
  /** Update the metadata of the achievement configuration with the given ID. */
  def update(request: Anon_AchievementId): Request[AchievementConfiguration]
}

object AchievementConfigurationsResource {
  @scala.inline
  def apply(
    delete: Anon_AchievementId => Request[Unit],
    get: Anon_AchievementId => Request[AchievementConfiguration],
    insert: Anon_Alt => Request[AchievementConfiguration],
    list: Anon_AltApplicationId => Request[AchievementConfigurationListResponse],
    patch: Anon_AchievementId => Request[AchievementConfiguration],
    update: Anon_AchievementId => Request[AchievementConfiguration]
  ): AchievementConfigurationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AchievementConfigurationsResource]
  }
}

