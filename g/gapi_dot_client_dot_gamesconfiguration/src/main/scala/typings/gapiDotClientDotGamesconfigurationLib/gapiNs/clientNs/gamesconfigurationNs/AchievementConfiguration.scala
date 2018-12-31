package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementConfiguration extends js.Object {
  /**
    * The type of the achievement.
    * Possible values are:
    * - "STANDARD" - Achievement is either locked or unlocked.
    * - "INCREMENTAL" - Achievement is incremental.
    */
  var achievementType: js.UndefOr[java.lang.String] = js.undefined
  /** The draft data of the achievement. */
  var draft: js.UndefOr[AchievementConfigurationDetail] = js.undefined
  /** The ID of the achievement. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The initial state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var initialState: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#achievementConfiguration. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The read-only published data of the achievement. */
  var published: js.UndefOr[AchievementConfigurationDetail] = js.undefined
  /** Steps to unlock. Only applicable to incremental achievements. */
  var stepsToUnlock: js.UndefOr[scala.Double] = js.undefined
  /** The token for this resource. */
  var token: js.UndefOr[java.lang.String] = js.undefined
}

