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

