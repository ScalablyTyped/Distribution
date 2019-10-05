package typings.googleDashAppsDashScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskList extends js.Object {
  var items: js.UndefOr[js.Array[Task]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var totalItems: js.UndefOr[Double] = js.undefined
}

object TaskList {
  @scala.inline
  def apply(
    items: js.Array[Task] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): TaskList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskList]
  }
}

