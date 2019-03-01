package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Played extends js.Object {
  /** True if the player was auto-matched with the currently authenticated user. */
  var autoMatched: js.UndefOr[scala.Boolean] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#played. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The last time the player played the game in milliseconds since the epoch in UTC. */
  var timeMillis: js.UndefOr[java.lang.String] = js.undefined
}

object Played {
  @scala.inline
  def apply(
    autoMatched: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    timeMillis: java.lang.String = null
  ): Played = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoMatched)) __obj.updateDynamic("autoMatched")(autoMatched)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (timeMillis != null) __obj.updateDynamic("timeMillis")(timeMillis)
    __obj.asInstanceOf[Played]
  }
}

