package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerLevel extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerLevel. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The level for the user. */
  var level: js.UndefOr[scala.Double] = js.undefined
  /** The maximum experience points for this level. */
  var maxExperiencePoints: js.UndefOr[java.lang.String] = js.undefined
  /** The minimum experience points for this level. */
  var minExperiencePoints: js.UndefOr[java.lang.String] = js.undefined
}

object PlayerLevel {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    level: scala.Int | scala.Double = null,
    maxExperiencePoints: java.lang.String = null,
    minExperiencePoints: java.lang.String = null
  ): PlayerLevel = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxExperiencePoints != null) __obj.updateDynamic("maxExperiencePoints")(maxExperiencePoints)
    if (minExperiencePoints != null) __obj.updateDynamic("minExperiencePoints")(minExperiencePoints)
    __obj.asInstanceOf[PlayerLevel]
  }
}

