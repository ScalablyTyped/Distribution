package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of category data objects.
  */
@js.native
trait Schema$CategoryListResponse extends js.Object {
  /**
    * The list of categories with usage data.
    */
  var items: js.UndefOr[js.Array[Schema$Category]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#categoryListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token corresponding to the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$CategoryListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$Category] = null, kind: String = null, nextPageToken: String = null): Schema$CategoryListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CategoryListResponse]
  }
}

