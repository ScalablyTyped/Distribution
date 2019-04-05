package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceListResponse extends js.Object {
  var items: js.UndefOr[js.Array[Reference]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
}

object ReferenceListResponse {
  @scala.inline
  def apply(
    items: js.Array[Reference] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    pageInfo: PageInfo = null
  ): ReferenceListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    __obj.asInstanceOf[ReferenceListResponse]
  }
}

