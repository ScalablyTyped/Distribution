package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchSync extends js.Object {
  /** The matches. */
  var items: js.UndefOr[js.Array[TurnBasedMatch]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchSync. */
  var kind: js.UndefOr[String] = js.undefined
  /** True if there were more matches available to fetch at the time the response was generated (which were not returned due to page size limits.) */
  var moreAvailable: js.UndefOr[Boolean] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object TurnBasedMatchSync {
  @scala.inline
  def apply(
    items: js.Array[TurnBasedMatch] = null,
    kind: String = null,
    moreAvailable: js.UndefOr[Boolean] = js.undefined,
    nextPageToken: String = null
  ): TurnBasedMatchSync = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(moreAvailable)) __obj.updateDynamic("moreAvailable")(moreAvailable.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnBasedMatchSync]
  }
}

