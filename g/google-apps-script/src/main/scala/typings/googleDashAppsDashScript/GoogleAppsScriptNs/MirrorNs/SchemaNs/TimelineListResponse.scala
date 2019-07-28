package typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineListResponse extends js.Object {
  var items: js.UndefOr[js.Array[TimelineItem]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object TimelineListResponse {
  @scala.inline
  def apply(items: js.Array[TimelineItem] = null, kind: String = null, nextPageToken: String = null): TimelineListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[TimelineListResponse]
  }
}

