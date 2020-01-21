package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomList extends js.Object {
  /** The rooms. */
  var items: js.UndefOr[js.Array[Room]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomList. */
  var kind: js.UndefOr[String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object RoomList {
  @scala.inline
  def apply(items: js.Array[Room] = null, kind: String = null, nextPageToken: String = null): RoomList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomList]
  }
}

