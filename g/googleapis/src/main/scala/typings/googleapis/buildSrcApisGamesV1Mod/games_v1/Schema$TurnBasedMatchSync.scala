package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of turn-based matches returned from a
  * sync.
  */
@js.native
trait Schema$TurnBasedMatchSync extends js.Object {
  /**
    * The matches.
    */
  var items: js.UndefOr[js.Array[Schema$TurnBasedMatch]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchSync.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * True if there were more matches available to fetch at the time the
    * response was generated (which were not returned due to page size limits.)
    */
  var moreAvailable: js.UndefOr[Boolean] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$TurnBasedMatchSync {
  @scala.inline
  def apply(
    items: js.Array[Schema$TurnBasedMatch] = null,
    kind: String = null,
    moreAvailable: js.UndefOr[Boolean] = js.undefined,
    nextPageToken: String = null
  ): Schema$TurnBasedMatchSync = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(moreAvailable)) __obj.updateDynamic("moreAvailable")(moreAvailable.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TurnBasedMatchSync]
  }
}

