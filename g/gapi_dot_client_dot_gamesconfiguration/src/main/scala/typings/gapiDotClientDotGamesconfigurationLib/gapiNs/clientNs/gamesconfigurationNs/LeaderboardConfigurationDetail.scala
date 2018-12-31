package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardConfigurationDetail extends js.Object {
  /** The icon url of this leaderboard. Writes to this field are ignored. */
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#leaderboardConfigurationDetail. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Localized strings for the leaderboard name. */
  var name: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** The score formatting for the leaderboard. */
  var scoreFormat: js.UndefOr[GamesNumberFormatConfiguration] = js.undefined
  /** The sort rank of this leaderboard. Writes to this field are ignored. */
  var sortRank: js.UndefOr[scala.Double] = js.undefined
}

