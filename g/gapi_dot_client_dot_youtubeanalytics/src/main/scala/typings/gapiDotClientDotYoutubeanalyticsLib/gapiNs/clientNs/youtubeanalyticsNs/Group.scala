package typings
package gapiDotClientDotYoutubeanalyticsLib.gapiNs.clientNs.youtubeanalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var contentDetails: js.UndefOr[gapiDotClientDotYoutubeanalyticsLib.Anon_ItemCount] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var snippet: js.UndefOr[gapiDotClientDotYoutubeanalyticsLib.Anon_PublishedAt] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    contentDetails: gapiDotClientDotYoutubeanalyticsLib.Anon_ItemCount = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    snippet: gapiDotClientDotYoutubeanalyticsLib.Anon_PublishedAt = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[Group]
  }
}

