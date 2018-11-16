package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResultSet extends js.Object {
  /** Metadata about the result set, such as row type information. */
  var metadata: js.UndefOr[ResultSetMetadata] = js.undefined
  /**
               * Each element in `rows` is a row whose format is defined by
               * metadata.row_type. The ith element
               * in each row matches the ith field in
               * metadata.row_type. Elements are
               * encoded based on type as described
               * here.
               */
  var rows: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /**
               * Query plan and execution statistics for the query that produced this
               * result set. These can be requested by setting
               * ExecuteSqlRequest.query_mode.
               */
  var stats: js.UndefOr[ResultSetStats] = js.undefined
}

