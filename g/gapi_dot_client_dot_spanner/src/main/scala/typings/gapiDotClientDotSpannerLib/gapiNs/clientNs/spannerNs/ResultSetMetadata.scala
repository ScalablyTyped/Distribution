package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetMetadata extends js.Object {
  /**
    * Indicates the field names and types for the rows in the result
    * set.  For example, a SQL query like `"SELECT UserId, UserName FROM
    * Users"` could return a `row_type` value like:
    *
    * "fields": [
    * { "name": "UserId", "type": { "code": "INT64" } },
    * { "name": "UserName", "type": { "code": "STRING" } },
    * ]
    */
  var rowType: js.UndefOr[StructType] = js.undefined
  /**
    * If the read or SQL query began a transaction as a side-effect, the
    * information about the new transaction is yielded here.
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
}

