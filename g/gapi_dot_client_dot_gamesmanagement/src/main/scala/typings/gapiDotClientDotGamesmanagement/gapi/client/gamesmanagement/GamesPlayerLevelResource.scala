package typings.gapiDotClientDotGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamesPlayerLevelResource extends js.Object {
  /** The level for the user. */
  var level: js.UndefOr[Double] = js.undefined
  /** The maximum experience points for this level. */
  var maxExperiencePoints: js.UndefOr[String] = js.undefined
  /** The minimum experience points for this level. */
  var minExperiencePoints: js.UndefOr[String] = js.undefined
}

object GamesPlayerLevelResource {
  @scala.inline
  def apply(level: Int | Double = null, maxExperiencePoints: String = null, minExperiencePoints: String = null): GamesPlayerLevelResource = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxExperiencePoints != null) __obj.updateDynamic("maxExperiencePoints")(maxExperiencePoints.asInstanceOf[js.Any])
    if (minExperiencePoints != null) __obj.updateDynamic("minExperiencePoints")(minExperiencePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamesPlayerLevelResource]
  }
}

