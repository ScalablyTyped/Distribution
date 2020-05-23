package typings.gapiClientGamesconfiguration

import typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration.AchievementConfigurationsResource
import typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration.ImageConfigurationsResource
import typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration.LeaderboardConfigurationsResource
import typings.gapiClientGamesconfiguration.gapiClientGamesconfigurationStrings.gamesconfiguration
import typings.gapiClientGamesconfiguration.gapiClientGamesconfigurationStrings.v1configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val achievementConfigurations: AchievementConfigurationsResource = js.native
      val imageConfigurations: ImageConfigurationsResource = js.native
      val leaderboardConfigurations: LeaderboardConfigurationsResource = js.native
      /** Load Google Play Game Services Publishing API v1configuration */
      def load(name: gamesconfiguration, version: v1configuration): js.Thenable[Unit] = js.native
      def load(name: gamesconfiguration, version: v1configuration, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

