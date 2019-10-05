package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderEntities extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[js.Array[Tag]] = js.undefined
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
  var variable: js.UndefOr[js.Array[Variable]] = js.undefined
}

object FolderEntities {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    tag: js.Array[Tag] = null,
    trigger: js.Array[Trigger] = null,
    variable: js.Array[Variable] = null
  ): FolderEntities = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[FolderEntities]
  }
}

