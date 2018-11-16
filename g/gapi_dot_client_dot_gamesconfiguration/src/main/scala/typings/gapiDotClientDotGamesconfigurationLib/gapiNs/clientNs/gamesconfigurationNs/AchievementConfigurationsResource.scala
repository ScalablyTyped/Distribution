package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AchievementConfigurationsResource extends js.Object {
  /** Delete the achievement configuration with the given ID. */
  def delete(request: gapiDotClientDotGamesconfigurationLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves the metadata of the achievement configuration with the given ID. */
  def get(request: gapiDotClientDotGamesconfigurationLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
  /** Insert a new achievement configuration in this application. */
  def insert(request: gapiDotClientDotGamesconfigurationLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
  /** Returns a list of the achievement configurations in this application. */
  def list(request: gapiDotClientDotGamesconfigurationLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfigurationListResponse]
  /** Update the metadata of the achievement configuration with the given ID. This method supports patch semantics. */
  def patch(request: gapiDotClientDotGamesconfigurationLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
  /** Update the metadata of the achievement configuration with the given ID. */
  def update(request: gapiDotClientDotGamesconfigurationLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[AchievementConfiguration]
}

