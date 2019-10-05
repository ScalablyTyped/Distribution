package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerEventListResponse extends js.Object {
  /** The player events. */
  var items: js.UndefOr[js.Array[PlayerEvent]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerEventListResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object PlayerEventListResponse {
  @scala.inline
  def apply(items: js.Array[PlayerEvent] = null, kind: String = null, nextPageToken: String = null): PlayerEventListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[PlayerEventListResponse]
  }
}

