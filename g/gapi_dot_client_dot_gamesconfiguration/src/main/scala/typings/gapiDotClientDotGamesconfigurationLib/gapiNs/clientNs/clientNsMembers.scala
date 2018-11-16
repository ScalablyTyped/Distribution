package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val achievementConfigurations: gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs.AchievementConfigurationsResource = js.native
  val imageConfigurations: gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs.ImageConfigurationsResource = js.native
  val leaderboardConfigurations: gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs.LeaderboardConfigurationsResource = js.native
  /** Load Google Play Game Services Publishing API v1configuration */
  def load(
    name: gapiDotClientDotGamesconfigurationLib.gapiDotClientDotGamesconfigurationLibStrings.gamesconfiguration,
    version: gapiDotClientDotGamesconfigurationLib.gapiDotClientDotGamesconfigurationLibStrings.v1configuration
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotGamesconfigurationLib.gapiDotClientDotGamesconfigurationLibStrings.gamesconfiguration,
    version: gapiDotClientDotGamesconfigurationLib.gapiDotClientDotGamesconfigurationLibStrings.v1configuration,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

