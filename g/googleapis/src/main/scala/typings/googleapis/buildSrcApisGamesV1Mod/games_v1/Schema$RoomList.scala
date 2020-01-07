package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of rooms.
  */
@js.native
trait Schema$RoomList extends js.Object {
  /**
    * The rooms.
    */
  var items: js.UndefOr[js.Array[Schema$Room]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$RoomList {
  @scala.inline
  def apply(items: js.Array[Schema$Room] = null, kind: String = null, nextPageToken: String = null): Schema$RoomList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RoomList]
  }
}

