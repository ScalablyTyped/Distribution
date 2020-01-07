package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a ResultSet or PartialResultSet.
  */
@js.native
trait Schema$ResultSetMetadata extends js.Object {
  /**
    * Indicates the field names and types for the rows in the result set.  For
    * example, a SQL query like `&quot;SELECT UserId, UserName FROM
    * Users&quot;` could return a `row_type` value like: &quot;fields&quot;: [
    * { &quot;name&quot;: &quot;UserId&quot;, &quot;type&quot;: {
    * &quot;code&quot;: &quot;INT64&quot; } },       { &quot;name&quot;:
    * &quot;UserName&quot;, &quot;type&quot;: { &quot;code&quot;:
    * &quot;STRING&quot; } },     ]
    */
  var rowType: js.UndefOr[Schema$StructType] = js.native
  /**
    * If the read or SQL query began a transaction as a side-effect, the
    * information about the new transaction is yielded here.
    */
  var transaction: js.UndefOr[Schema$Transaction] = js.native
}

object Schema$ResultSetMetadata {
  @scala.inline
  def apply(rowType: Schema$StructType = null, transaction: Schema$Transaction = null): Schema$ResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResultSetMetadata]
  }
}

