package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a ListByPlayer response.
  */
@js.native
trait Schema$PlayerEventListResponse extends js.Object {
  /**
    * The player events.
    */
  var items: js.UndefOr[js.Array[Schema$PlayerEvent]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerEventListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$PlayerEventListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$PlayerEvent] = null, kind: String = null, nextPageToken: String = null): Schema$PlayerEventListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlayerEventListResponse]
  }
}

