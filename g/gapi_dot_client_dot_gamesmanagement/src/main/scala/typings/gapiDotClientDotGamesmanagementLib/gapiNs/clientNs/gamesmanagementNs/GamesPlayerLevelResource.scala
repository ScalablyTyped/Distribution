package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamesPlayerLevelResource extends js.Object {
  /** The level for the user. */
  var level: js.UndefOr[scala.Double] = js.undefined
  /** The maximum experience points for this level. */
  var maxExperiencePoints: js.UndefOr[java.lang.String] = js.undefined
  /** The minimum experience points for this level. */
  var minExperiencePoints: js.UndefOr[java.lang.String] = js.undefined
}

object GamesPlayerLevelResource {
  @scala.inline
  def apply(
    level: scala.Int | scala.Double = null,
    maxExperiencePoints: java.lang.String = null,
    minExperiencePoints: java.lang.String = null
  ): GamesPlayerLevelResource = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxExperiencePoints != null) __obj.updateDynamic("maxExperiencePoints")(maxExperiencePoints)
    if (minExperiencePoints != null) __obj.updateDynamic("minExperiencePoints")(minExperiencePoints)
    __obj.asInstanceOf[GamesPlayerLevelResource]
  }
}

