package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataHistoryListResponse extends js.Object {
  var items: js.UndefOr[js.Array[MetadataHistory]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object MetadataHistoryListResponse {
  @scala.inline
  def apply(items: js.Array[MetadataHistory] = null, kind: String = null): MetadataHistoryListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataHistoryListResponse]
  }
}

