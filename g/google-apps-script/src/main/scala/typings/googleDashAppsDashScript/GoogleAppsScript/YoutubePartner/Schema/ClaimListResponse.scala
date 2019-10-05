package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimListResponse extends js.Object {
  var items: js.UndefOr[js.Array[Claim]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  var previousPageToken: js.UndefOr[String] = js.undefined
}

object ClaimListResponse {
  @scala.inline
  def apply(
    items: js.Array[Claim] = null,
    kind: String = null,
    nextPageToken: String = null,
    pageInfo: PageInfo = null,
    previousPageToken: String = null
  ): ClaimListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    if (previousPageToken != null) __obj.updateDynamic("previousPageToken")(previousPageToken)
    __obj.asInstanceOf[ClaimListResponse]
  }
}

