package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlayerAchievementListResponse extends js.Object {
  /** The achievements. */
  var items: js.UndefOr[js.Array[PlayerAchievement]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerAchievementListResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

