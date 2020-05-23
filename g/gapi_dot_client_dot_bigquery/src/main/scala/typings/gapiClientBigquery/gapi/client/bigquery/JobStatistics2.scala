package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics2 extends js.Object {
  /** [Output-only] Billing tier for the job. */
  var billingTier: js.UndefOr[Double] = js.undefined
  /** [Output-only] Whether the query result was fetched from the query cache. */
  var cacheHit: js.UndefOr[Boolean] = js.undefined
  /** [Output-only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE. */
  var numDmlAffectedRows: js.UndefOr[String] = js.undefined
  /** [Output-only] Describes execution plan for the query. */
  var queryPlan: js.UndefOr[js.Array[ExplainQueryStage]] = js.undefined
  /** [Output-only, Experimental] Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list. */
  var referencedTables: js.UndefOr[js.Array[TableReference]] = js.undefined
  /** [Output-only, Experimental] The schema of the results. Present only for successful dry run of non-legacy SQL queries. */
  var schema: js.UndefOr[TableSchema] = js.undefined
  /** [Output-only, Experimental] The type of query statement, if valid. */
  var statementType: js.UndefOr[String] = js.undefined
  /** [Output-only] Total bytes billed for the job. */
  var totalBytesBilled: js.UndefOr[String] = js.undefined
  /** [Output-only] Total bytes processed for the job. */
  var totalBytesProcessed: js.UndefOr[String] = js.undefined
  /** [Output-only] Slot-milliseconds for the job. */
  var totalSlotMs: js.UndefOr[String] = js.undefined
  /** [Output-only, Experimental] Standard SQL only: list of undeclared query parameters detected during a dry run validation. */
  var undeclaredQueryParameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
}

object JobStatistics2 {
  @scala.inline
  def apply(
    billingTier: js.UndefOr[Double] = js.undefined,
    cacheHit: js.UndefOr[Boolean] = js.undefined,
    numDmlAffectedRows: String = null,
    queryPlan: js.Array[ExplainQueryStage] = null,
    referencedTables: js.Array[TableReference] = null,
    schema: TableSchema = null,
    statementType: String = null,
    totalBytesBilled: String = null,
    totalBytesProcessed: String = null,
    totalSlotMs: String = null,
    undeclaredQueryParameters: js.Array[QueryParameter] = null
  ): JobStatistics2 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(billingTier)) __obj.updateDynamic("billingTier")(billingTier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheHit)) __obj.updateDynamic("cacheHit")(cacheHit.get.asInstanceOf[js.Any])
    if (numDmlAffectedRows != null) __obj.updateDynamic("numDmlAffectedRows")(numDmlAffectedRows.asInstanceOf[js.Any])
    if (queryPlan != null) __obj.updateDynamic("queryPlan")(queryPlan.asInstanceOf[js.Any])
    if (referencedTables != null) __obj.updateDynamic("referencedTables")(referencedTables.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (statementType != null) __obj.updateDynamic("statementType")(statementType.asInstanceOf[js.Any])
    if (totalBytesBilled != null) __obj.updateDynamic("totalBytesBilled")(totalBytesBilled.asInstanceOf[js.Any])
    if (totalBytesProcessed != null) __obj.updateDynamic("totalBytesProcessed")(totalBytesProcessed.asInstanceOf[js.Any])
    if (totalSlotMs != null) __obj.updateDynamic("totalSlotMs")(totalSlotMs.asInstanceOf[js.Any])
    if (undeclaredQueryParameters != null) __obj.updateDynamic("undeclaredQueryParameters")(undeclaredQueryParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatistics2]
  }
}

