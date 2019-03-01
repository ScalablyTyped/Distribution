package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementConfigurationsResource extends js.Object {
  /** Delete the achievement configuration with the given ID. */
  def delete(request: gapiDotClientDotGamesconfigurationLib.Anon_AchievementId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves the metadata of the achievement configuration with the given ID. */
  def get(request: gapiDotClientDotGamesconfigurationLib.Anon_AchievementId): gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
  /** Insert a new achievement configuration in this application. */
  def insert(request: gapiDotClientDotGamesconfigurationLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
  /** Returns a list of the achievement configurations in this application. */
  def list(request: gapiDotClientDotGamesconfigurationLib.Anon_AltApplicationId): gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfigurationListResponse]
  /** Update the metadata of the achievement configuration with the given ID. This method supports patch semantics. */
  def patch(request: gapiDotClientDotGamesconfigurationLib.Anon_AchievementId): gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
  /** Update the metadata of the achievement configuration with the given ID. */
  def update(request: gapiDotClientDotGamesconfigurationLib.Anon_AchievementId): gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
}

object AchievementConfigurationsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_AchievementId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_AchievementId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
    ],
    insert: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
    ],
    list: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_AltApplicationId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfigurationListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_AchievementId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
    ],
    update: js.Function1[
      gapiDotClientDotGamesconfigurationLib.Anon_AchievementId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
    ]
  ): AchievementConfigurationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AchievementConfigurationsResource]
  }
}

