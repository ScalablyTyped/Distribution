package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataList extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[TableRow]] = js.undefined
  var totalRows: js.UndefOr[String] = js.undefined
}

object TableDataList {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    pageToken: String = null,
    rows: js.Array[TableRow] = null,
    totalRows: String = null
  ): TableDataList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (totalRows != null) __obj.updateDynamic("totalRows")(totalRows)
    __obj.asInstanceOf[TableDataList]
  }
}

