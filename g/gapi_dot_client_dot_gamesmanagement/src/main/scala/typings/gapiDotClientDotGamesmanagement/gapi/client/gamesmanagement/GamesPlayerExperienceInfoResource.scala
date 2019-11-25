package typings.gapiDotClientDotGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamesPlayerExperienceInfoResource extends js.Object {
  /** The current number of experience points for the player. */
  var currentExperiencePoints: js.UndefOr[String] = js.undefined
  /** The current level of the player. */
  var currentLevel: js.UndefOr[GamesPlayerLevelResource] = js.undefined
  /** The timestamp when the player was leveled up, in millis since Unix epoch UTC. */
  var lastLevelUpTimestampMillis: js.UndefOr[String] = js.undefined
  /** The next level of the player. If the current level is the maximum level, this should be same as the current level. */
  var nextLevel: js.UndefOr[GamesPlayerLevelResource] = js.undefined
}

object GamesPlayerExperienceInfoResource {
  @scala.inline
  def apply(
    currentExperiencePoints: String = null,
    currentLevel: GamesPlayerLevelResource = null,
    lastLevelUpTimestampMillis: String = null,
    nextLevel: GamesPlayerLevelResource = null
  ): GamesPlayerExperienceInfoResource = {
    val __obj = js.Dynamic.literal()
    if (currentExperiencePoints != null) __obj.updateDynamic("currentExperiencePoints")(currentExperiencePoints.asInstanceOf[js.Any])
    if (currentLevel != null) __obj.updateDynamic("currentLevel")(currentLevel.asInstanceOf[js.Any])
    if (lastLevelUpTimestampMillis != null) __obj.updateDynamic("lastLevelUpTimestampMillis")(lastLevelUpTimestampMillis.asInstanceOf[js.Any])
    if (nextLevel != null) __obj.updateDynamic("nextLevel")(nextLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamesPlayerExperienceInfoResource]
  }
}

