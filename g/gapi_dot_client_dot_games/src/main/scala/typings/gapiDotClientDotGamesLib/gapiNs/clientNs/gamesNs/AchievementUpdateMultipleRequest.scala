package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AchievementUpdateMultipleRequest extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUpdateMultipleRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The individual achievement update requests. */
  var updates: js.UndefOr[js.Array[AchievementUpdateRequest]] = js.undefined
}

