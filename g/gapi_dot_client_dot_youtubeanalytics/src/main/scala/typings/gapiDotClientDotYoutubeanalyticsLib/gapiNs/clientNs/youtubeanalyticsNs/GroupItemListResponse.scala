package typings
package gapiDotClientDotYoutubeanalyticsLib.gapiNs.clientNs.youtubeanalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItemListResponse extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[GroupItem]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object GroupItemListResponse {
  @scala.inline
  def apply(etag: java.lang.String = null, items: js.Array[GroupItem] = null, kind: java.lang.String = null): GroupItemListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[GroupItemListResponse]
  }
}

