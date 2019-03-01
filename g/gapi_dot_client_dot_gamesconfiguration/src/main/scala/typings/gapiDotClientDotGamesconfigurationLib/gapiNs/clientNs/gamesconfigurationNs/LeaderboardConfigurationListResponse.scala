package typings
package gapiDotClientDotGamesconfigurationLib.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardConfigurationListResponse extends js.Object {
  /** The leaderboard configurations. */
  var items: js.UndefOr[js.Array[LeaderboardConfiguration]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardConfigurationListResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object LeaderboardConfigurationListResponse {
  @scala.inline
  def apply(
    items: js.Array[LeaderboardConfiguration] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): LeaderboardConfigurationListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[LeaderboardConfigurationListResponse]
  }
}

