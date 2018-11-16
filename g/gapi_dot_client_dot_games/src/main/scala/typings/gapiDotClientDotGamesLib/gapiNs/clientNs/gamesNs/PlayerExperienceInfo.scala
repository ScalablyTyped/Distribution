package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlayerExperienceInfo extends js.Object {
  /** The current number of experience points for the player. */
  var currentExperiencePoints: js.UndefOr[java.lang.String] = js.undefined
  /** The current level of the player. */
  var currentLevel: js.UndefOr[PlayerLevel] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerExperienceInfo. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp when the player was leveled up, in millis since Unix epoch UTC. */
  var lastLevelUpTimestampMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The next level of the player. If the current level is the maximum level, this should be same as the current level. */
  var nextLevel: js.UndefOr[PlayerLevel] = js.undefined
}

