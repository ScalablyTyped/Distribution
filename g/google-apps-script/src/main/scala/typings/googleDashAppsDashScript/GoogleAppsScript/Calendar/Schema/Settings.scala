package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Setting]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var nextSyncToken: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Setting] = null,
    kind: String = null,
    nextPageToken: String = null,
    nextSyncToken: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken)
    __obj.asInstanceOf[Settings]
  }
}

