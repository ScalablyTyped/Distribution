package typings.gapiDotClientDotGamesconfiguration.gapiNs.clientNs

import typings.gapiDotClientDotGamesconfiguration.gapiDotClientDotGamesconfigurationStrings.gamesconfiguration
import typings.gapiDotClientDotGamesconfiguration.gapiDotClientDotGamesconfigurationStrings.v1configuration
import typings.gapiDotClientDotGamesconfiguration.gapiNs.clientNs.gamesconfigurationNs.AchievementConfigurationsResource
import typings.gapiDotClientDotGamesconfiguration.gapiNs.clientNs.gamesconfigurationNs.ImageConfigurationsResource
import typings.gapiDotClientDotGamesconfiguration.gapiNs.clientNs.gamesconfigurationNs.LeaderboardConfigurationsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val achievementConfigurations: AchievementConfigurationsResource = js.native
  val imageConfigurations: ImageConfigurationsResource = js.native
  val leaderboardConfigurations: LeaderboardConfigurationsResource = js.native
  /** Load Google Play Game Services Publishing API v1configuration */
  def load(name: gamesconfiguration, version: v1configuration): js.Thenable[Unit] = js.native
  def load(name: gamesconfiguration, version: v1configuration, callback: js.Function0[_]): Unit = js.native
}

