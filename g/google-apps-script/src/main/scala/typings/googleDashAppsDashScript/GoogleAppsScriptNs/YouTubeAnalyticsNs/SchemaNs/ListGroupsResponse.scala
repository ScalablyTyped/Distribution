package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupsResponse extends js.Object {
  var errors: js.UndefOr[Errors] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Group]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListGroupsResponse {
  @scala.inline
  def apply(
    errors: Errors = null,
    etag: String = null,
    items: js.Array[Group] = null,
    kind: String = null,
    nextPageToken: String = null
  ): ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListGroupsResponse]
  }
}

