package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

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
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (totalRows != null) __obj.updateDynamic("totalRows")(totalRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDataList]
  }
}

