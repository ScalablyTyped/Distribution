package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerScoreListResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerScoreListResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The score submissions statuses. */
  var submittedScores: js.UndefOr[js.Array[PlayerScoreResponse]] = js.undefined
}

