package typings.googleDashAppsDashScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnList extends js.Object {
  var items: js.UndefOr[js.Array[Column]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var totalItems: js.UndefOr[Double] = js.undefined
}

object ColumnList {
  @scala.inline
  def apply(
    items: js.Array[Column] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): ColumnList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnList]
  }
}

