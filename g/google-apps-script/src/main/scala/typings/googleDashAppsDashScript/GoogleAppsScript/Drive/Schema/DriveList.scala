package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveList extends js.Object {
  var items: js.UndefOr[js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object DriveList {
  @scala.inline
  def apply(
    items: js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive] = null,
    kind: String = null,
    nextPageToken: String = null
  ): DriveList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveList]
  }
}

