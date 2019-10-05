package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerListResponse extends js.Object {
  /** The players. */
  var items: js.UndefOr[js.Array[Player]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerListResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object PlayerListResponse {
  @scala.inline
  def apply(items: js.Array[Player] = null, kind: String = null, nextPageToken: String = null): PlayerListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[PlayerListResponse]
  }
}

