package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupItemsResponse extends js.Object {
  var errors: js.UndefOr[Errors] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[GroupItem]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ListGroupItemsResponse {
  @scala.inline
  def apply(
    errors: Errors = null,
    etag: java.lang.String = null,
    items: js.Array[GroupItem] = null,
    kind: java.lang.String = null
  ): ListGroupItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ListGroupItemsResponse]
  }
}

