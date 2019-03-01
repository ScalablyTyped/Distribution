package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataList extends js.Object {
  /** A hash of this page of results. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The resource type of the response. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A token used for paging results. Providing this token instead of the startIndex parameter can help you retrieve stable results when an underlying table
    * is changing.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Rows of results. */
  var rows: js.UndefOr[js.Array[TableRow]] = js.undefined
  /** The total number of rows in the complete table. */
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

