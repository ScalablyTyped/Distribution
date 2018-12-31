package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementDefinitionsListResponse extends js.Object {
  /** The achievement definitions. */
  var items: js.UndefOr[js.Array[AchievementDefinition]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementDefinitionsListResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

