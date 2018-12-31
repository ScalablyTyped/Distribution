package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementConfigurationDetail extends js.Object {
  /** Localized strings for the achievement description. */
  var description: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** The icon url of this achievement. Writes to this field are ignored. */
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#achievementConfigurationDetail. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Localized strings for the achievement name. */
  var name: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** Point value for the achievement. */
  var pointValue: js.UndefOr[scala.Double] = js.undefined
  /** The sort rank of this achievement. Writes to this field are ignored. */
  var sortRank: js.UndefOr[scala.Double] = js.undefined
}

