package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimListResponse extends js.Object {
  var items: js.UndefOr[js.Array[Claim]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  var previousPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ClaimListResponse {
  @scala.inline
  def apply(
    items: js.Array[Claim] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    pageInfo: PageInfo = null,
    previousPageToken: java.lang.String = null
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

