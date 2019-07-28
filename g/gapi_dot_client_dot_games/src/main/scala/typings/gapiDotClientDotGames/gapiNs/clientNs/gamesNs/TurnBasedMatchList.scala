package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchList extends js.Object {
  /** The matches. */
  var items: js.UndefOr[js.Array[TurnBasedMatch]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchList. */
  var kind: js.UndefOr[String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object TurnBasedMatchList {
  @scala.inline
  def apply(items: js.Array[TurnBasedMatch] = null, kind: String = null, nextPageToken: String = null): TurnBasedMatchList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[TurnBasedMatchList]
  }
}

