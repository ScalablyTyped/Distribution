package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchSync extends js.Object {
  /** The matches. */
  var items: js.UndefOr[js.Array[TurnBasedMatch]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchSync. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** True if there were more matches available to fetch at the time the response was generated (which were not returned due to page size limits.) */
  var moreAvailable: js.UndefOr[scala.Boolean] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object TurnBasedMatchSync {
  @scala.inline
  def apply(
    items: js.Array[TurnBasedMatch] = null,
    kind: java.lang.String = null,
    moreAvailable: js.UndefOr[scala.Boolean] = js.undefined,
    nextPageToken: java.lang.String = null
  ): TurnBasedMatchSync = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(moreAvailable)) __obj.updateDynamic("moreAvailable")(moreAvailable)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[TurnBasedMatchSync]
  }
}

