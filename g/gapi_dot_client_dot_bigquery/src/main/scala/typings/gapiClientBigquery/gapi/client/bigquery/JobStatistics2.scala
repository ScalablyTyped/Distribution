package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobStatistics2 extends js.Object {
  /** [Output-only] Billing tier for the job. */
  var billingTier: js.UndefOr[Double] = js.native
  /** [Output-only] Whether the query result was fetched from the query cache. */
  var cacheHit: js.UndefOr[Boolean] = js.native
  /** [Output-only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE. */
  var numDmlAffectedRows: js.UndefOr[String] = js.native
  /** [Output-only] Describes execution plan for the query. */
  var queryPlan: js.UndefOr[js.Array[ExplainQueryStage]] = js.native
  /** [Output-only, Experimental] Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list. */
  var referencedTables: js.UndefOr[js.Array[TableReference]] = js.native
  /** [Output-only, Experimental] The schema of the results. Present only for successful dry run of non-legacy SQL queries. */
  var schema: js.UndefOr[TableSchema] = js.native
  /** [Output-only, Experimental] The type of query statement, if valid. */
  var statementType: js.UndefOr[String] = js.native
  /** [Output-only] Total bytes billed for the job. */
  var totalBytesBilled: js.UndefOr[String] = js.native
  /** [Output-only] Total bytes processed for the job. */
  var totalBytesProcessed: js.UndefOr[String] = js.native
  /** [Output-only] Slot-milliseconds for the job. */
  var totalSlotMs: js.UndefOr[String] = js.native
  /** [Output-only, Experimental] Standard SQL only: list of undeclared query parameters detected during a dry run validation. */
  var undeclaredQueryParameters: js.UndefOr[js.Array[QueryParameter]] = js.native
}

object JobStatistics2 {
  @scala.inline
  def apply(): JobStatistics2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics2]
  }
  @scala.inline
  implicit class JobStatistics2Ops[Self <: JobStatistics2] (val x: Self) extends AnyVal {
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
    def setBillingTier(value: Double): Self = this.set("billingTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingTier: Self = this.set("billingTier", js.undefined)
    @scala.inline
    def setCacheHit(value: Boolean): Self = this.set("cacheHit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheHit: Self = this.set("cacheHit", js.undefined)
    @scala.inline
    def setNumDmlAffectedRows(value: String): Self = this.set("numDmlAffectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumDmlAffectedRows: Self = this.set("numDmlAffectedRows", js.undefined)
    @scala.inline
    def setQueryPlanVarargs(value: ExplainQueryStage*): Self = this.set("queryPlan", js.Array(value :_*))
    @scala.inline
    def setQueryPlan(value: js.Array[ExplainQueryStage]): Self = this.set("queryPlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryPlan: Self = this.set("queryPlan", js.undefined)
    @scala.inline
    def setReferencedTablesVarargs(value: TableReference*): Self = this.set("referencedTables", js.Array(value :_*))
    @scala.inline
    def setReferencedTables(value: js.Array[TableReference]): Self = this.set("referencedTables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferencedTables: Self = this.set("referencedTables", js.undefined)
    @scala.inline
    def setSchema(value: TableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setStatementType(value: String): Self = this.set("statementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatementType: Self = this.set("statementType", js.undefined)
    @scala.inline
    def setTotalBytesBilled(value: String): Self = this.set("totalBytesBilled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalBytesBilled: Self = this.set("totalBytesBilled", js.undefined)
    @scala.inline
    def setTotalBytesProcessed(value: String): Self = this.set("totalBytesProcessed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalBytesProcessed: Self = this.set("totalBytesProcessed", js.undefined)
    @scala.inline
    def setTotalSlotMs(value: String): Self = this.set("totalSlotMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSlotMs: Self = this.set("totalSlotMs", js.undefined)
    @scala.inline
    def setUndeclaredQueryParametersVarargs(value: QueryParameter*): Self = this.set("undeclaredQueryParameters", js.Array(value :_*))
    @scala.inline
    def setUndeclaredQueryParameters(value: js.Array[QueryParameter]): Self = this.set("undeclaredQueryParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndeclaredQueryParameters: Self = this.set("undeclaredQueryParameters", js.undefined)
  }
  
}

