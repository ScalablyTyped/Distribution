package typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HiddenPlayerList extends js.Object {
  /** The players. */
  var items: js.UndefOr[js.Array[HiddenPlayer]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#hiddenPlayerList. */
  var kind: js.UndefOr[String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object HiddenPlayerList {
  @scala.inline
  def apply(items: js.Array[HiddenPlayer] = null, kind: String = null, nextPageToken: String = null): HiddenPlayerList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[HiddenPlayerList]
  }
}

