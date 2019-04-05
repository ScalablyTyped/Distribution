package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataList extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[js.Array[TableRow]] = js.undefined
  var totalRows: js.UndefOr[java.lang.String] = js.undefined
}

object TableDataList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    pageToken: java.lang.String = null,
    rows: js.Array[TableRow] = null,
    totalRows: java.lang.String = null
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

