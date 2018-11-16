package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AchievementUnlockResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUnlockResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this achievement was newly unlocked (that is, whether the unlock request for the achievement was the first for the player). */
  var newlyUnlocked: js.UndefOr[scala.Boolean] = js.undefined
}

