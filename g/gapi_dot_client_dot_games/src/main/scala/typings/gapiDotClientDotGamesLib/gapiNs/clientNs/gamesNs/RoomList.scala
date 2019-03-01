package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomList extends js.Object {
  /** The rooms. */
  var items: js.UndefOr[js.Array[Room]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object RoomList {
  @scala.inline
  def apply(
    items: js.Array[Room] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): RoomList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[RoomList]
  }
}

