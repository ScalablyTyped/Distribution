package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineListResponse extends js.Object {
  var items: js.UndefOr[js.Array[TimelineItem]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object TimelineListResponse {
  @scala.inline
  def apply(
    items: js.Array[TimelineItem] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): TimelineListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[TimelineListResponse]
  }
}

