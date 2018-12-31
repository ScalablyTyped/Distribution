package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamesAchievementIncrement extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#GamesAchievementIncrement. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The requestId associated with an increment to an achievement. */
  var requestId: js.UndefOr[java.lang.String] = js.undefined
  /** The number of steps to be incremented. */
  var steps: js.UndefOr[scala.Double] = js.undefined
}

