package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[Setting]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var nextSyncToken: js.UndefOr[java.lang.String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[Setting] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    nextSyncToken: java.lang.String = null
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

