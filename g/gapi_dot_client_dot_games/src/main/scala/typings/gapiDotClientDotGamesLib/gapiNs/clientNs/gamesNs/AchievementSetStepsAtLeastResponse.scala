package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AchievementSetStepsAtLeastResponse extends js.Object {
  /** The current steps recorded for this incremental achievement. */
  var currentSteps: js.UndefOr[scala.Double] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementSetStepsAtLeastResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the the current steps for the achievement has reached the number of steps required to unlock. */
  var newlyUnlocked: js.UndefOr[scala.Boolean] = js.undefined
}

