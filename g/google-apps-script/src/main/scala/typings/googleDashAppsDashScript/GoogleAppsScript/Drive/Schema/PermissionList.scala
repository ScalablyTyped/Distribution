package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionList extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Permission]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object PermissionList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Permission] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): PermissionList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionList]
  }
}

