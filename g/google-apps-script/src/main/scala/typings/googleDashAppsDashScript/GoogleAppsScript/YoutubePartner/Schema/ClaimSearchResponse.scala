package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimSearchResponse extends js.Object {
  var items: js.UndefOr[js.Array[ClaimSnippet]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  var previousPageToken: js.UndefOr[String] = js.undefined
}

object ClaimSearchResponse {
  @scala.inline
  def apply(
    items: js.Array[ClaimSnippet] = null,
    kind: String = null,
    nextPageToken: String = null,
    pageInfo: PageInfo = null,
    previousPageToken: String = null
  ): ClaimSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    if (previousPageToken != null) __obj.updateDynamic("previousPageToken")(previousPageToken)
    __obj.asInstanceOf[ClaimSearchResponse]
  }
}

