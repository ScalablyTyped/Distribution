package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buildings extends js.Object {
  var buildings: js.UndefOr[js.Array[Building]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object Buildings {
  @scala.inline
  def apply(
    buildings: js.Array[Building] = null,
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null
  ): Buildings = {
    val __obj = js.Dynamic.literal()
    if (buildings != null) __obj.updateDynamic("buildings")(buildings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buildings]
  }
}

