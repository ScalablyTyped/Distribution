package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableList extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var tables: js.UndefOr[js.Array[TableListTables]] = js.undefined
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object TableList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    tables: js.Array[TableListTables] = null,
    totalItems: scala.Int | scala.Double = null
  ): TableList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableList]
  }
}

