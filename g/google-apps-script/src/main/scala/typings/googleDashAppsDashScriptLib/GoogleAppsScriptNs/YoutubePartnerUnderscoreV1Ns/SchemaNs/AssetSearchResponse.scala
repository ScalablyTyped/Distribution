package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetSearchResponse extends js.Object {
  var items: js.UndefOr[js.Array[AssetSnippet]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
}

object AssetSearchResponse {
  @scala.inline
  def apply(
    items: js.Array[AssetSnippet] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    pageInfo: PageInfo = null
  ): AssetSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    __obj.asInstanceOf[AssetSearchResponse]
  }
}

