package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetRelationshipListResponse extends js.Object {
  var items: js.UndefOr[js.Array[AssetRelationship]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
}

object AssetRelationshipListResponse {
  @scala.inline
  def apply(
    items: js.Array[AssetRelationship] = null,
    kind: String = null,
    nextPageToken: String = null,
    pageInfo: PageInfo = null
  ): AssetRelationshipListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetRelationshipListResponse]
  }
}

