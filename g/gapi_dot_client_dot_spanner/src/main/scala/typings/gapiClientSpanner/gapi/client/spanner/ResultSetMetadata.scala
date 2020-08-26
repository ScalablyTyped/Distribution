package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var rowType: js.UndefOr[StructType] = js.native
  /**
    * If the read or SQL query began a transaction as a side-effect, the
    * information about the new transaction is yielded here.
    */
  var transaction: js.UndefOr[Transaction] = js.native
}

object ResultSetMetadata {
  @scala.inline
  def apply(): ResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetMetadata]
  }
  @scala.inline
  implicit class ResultSetMetadataOps[Self <: ResultSetMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRowType(value: StructType): Self = this.set("rowType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowType: Self = this.set("rowType", js.undefined)
    @scala.inline
    def setTransaction(value: Transaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
  
}

