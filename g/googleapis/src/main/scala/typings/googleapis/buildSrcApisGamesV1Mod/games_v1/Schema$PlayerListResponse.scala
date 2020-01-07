package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a third party player list response.
  */
@js.native
trait Schema$PlayerListResponse extends js.Object {
  /**
    * The players.
    */
  var items: js.UndefOr[js.Array[Schema$Player]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token corresponding to the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$PlayerListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$Player] = null, kind: String = null, nextPageToken: String = null): Schema$PlayerListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlayerListResponse]
  }
}

