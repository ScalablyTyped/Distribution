package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.AnonNameSlotMs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobStatistics2 extends js.Object {
  /**
    * [Output-only] Billing tier for the job.
    */
  var billingTier: js.UndefOr[Double] = js.native
  /**
    * [Output-only] Whether the query result was fetched from the query cache.
    */
  var cacheHit: js.UndefOr[Boolean] = js.native
  /**
    * The DDL operation performed, possibly dependent on the pre-existence of
    * the DDL target. Possible values (new values might be added in the
    * future): &quot;CREATE&quot;: The query created the DDL target.
    * &quot;SKIP&quot;: No-op. Example cases: the query is CREATE TABLE IF NOT
    * EXISTS while the table already exists, or the query is DROP TABLE IF
    * EXISTS while the table does not exist. &quot;REPLACE&quot;: The query
    * replaced the DDL target. Example case: the query is CREATE OR REPLACE
    * TABLE, and the table already exists. &quot;DROP&quot;: The query deleted
    * the DDL target.
    */
  var ddlOperationPerformed: js.UndefOr[String] = js.native
  /**
    * The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE
    * queries.
    */
  var ddlTargetRoutine: js.UndefOr[SchemaRoutineReference] = js.native
  /**
    * The DDL target table. Present only for CREATE/DROP TABLE/VIEW queries.
    */
  var ddlTargetTable: js.UndefOr[SchemaTableReference] = js.native
  /**
    * [Output-only] The original estimate of bytes processed for the job.
    */
  var estimatedBytesProcessed: js.UndefOr[String] = js.native
  /**
    * [Output-only, Beta] Information about create model query job progress.
    */
  var modelTraining: js.UndefOr[SchemaBigQueryModelTraining] = js.native
  /**
    * [Output-only, Beta] Deprecated; do not use.
    */
  var modelTrainingCurrentIteration: js.UndefOr[Double] = js.native
  /**
    * [Output-only, Beta] Deprecated; do not use.
    */
  var modelTrainingExpectedTotalIteration: js.UndefOr[String] = js.native
  /**
    * [Output-only] The number of rows affected by a DML statement. Present
    * only for DML statements INSERT, UPDATE or DELETE.
    */
  var numDmlAffectedRows: js.UndefOr[String] = js.native
  /**
    * [Output-only] Describes execution plan for the query.
    */
  var queryPlan: js.UndefOr[js.Array[SchemaExplainQueryStage]] = js.native
  /**
    * [Output-only] Referenced tables for the job. Queries that reference more
    * than 50 tables will not have a complete list.
    */
  var referencedTables: js.UndefOr[js.Array[SchemaTableReference]] = js.native
  /**
    * [Output-only] Job resource usage breakdown by reservation.
    */
  var reservationUsage: js.UndefOr[js.Array[AnonNameSlotMs]] = js.native
  /**
    * [Output-only] The schema of the results. Present only for successful dry
    * run of non-legacy SQL queries.
    */
  var schema: js.UndefOr[SchemaTableSchema] = js.native
  /**
    * The type of query statement, if valid. Possible values (new values might
    * be added in the future): &quot;SELECT&quot;: SELECT query.
    * &quot;INSERT&quot;: INSERT query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
    * &quot;UPDATE&quot;: UPDATE query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
    * &quot;DELETE&quot;: DELETE query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
    * &quot;MERGE&quot;: MERGE query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language.
    * &quot;CREATE_TABLE&quot;: CREATE [OR REPLACE] TABLE without AS SELECT.
    * &quot;CREATE_TABLE_AS_SELECT&quot;: CREATE [OR REPLACE] TABLE ... AS
    * SELECT ... . &quot;DROP_TABLE&quot;: DROP TABLE query.
    * &quot;CREATE_VIEW&quot;: CREATE [OR REPLACE] VIEW ... AS SELECT ... .
    * &quot;DROP_VIEW&quot;: DROP VIEW query. &quot;CREATE_FUNCTION&quot;:
    * CREATE FUNCTION query. &quot;DROP_FUNCTION&quot; : DROP FUNCTION query.
    * &quot;ALTER_TABLE&quot;: ALTER TABLE query. &quot;ALTER_VIEW&quot;: ALTER
    * VIEW query.
    */
  var statementType: js.UndefOr[String] = js.native
  /**
    * [Output-only] [Beta] Describes a timeline of job execution.
    */
  var timeline: js.UndefOr[js.Array[SchemaQueryTimelineSample]] = js.native
  /**
    * [Output-only] Total bytes billed for the job.
    */
  var totalBytesBilled: js.UndefOr[String] = js.native
  /**
    * [Output-only] Total bytes processed for the job.
    */
  var totalBytesProcessed: js.UndefOr[String] = js.native
  /**
    * [Output-only] For dry-run jobs, totalBytesProcessed is an estimate and
    * this field specifies the accuracy of the estimate. Possible values can
    * be: UNKNOWN: accuracy of the estimate is unknown. PRECISE: estimate is
    * precise. LOWER_BOUND: estimate is lower bound of what the query would
    * cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
    */
  var totalBytesProcessedAccuracy: js.UndefOr[String] = js.native
  /**
    * [Output-only] Total number of partitions processed from all partitioned
    * tables referenced in the job.
    */
  var totalPartitionsProcessed: js.UndefOr[String] = js.native
  /**
    * [Output-only] Slot-milliseconds for the job.
    */
  var totalSlotMs: js.UndefOr[String] = js.native
  /**
    * Standard SQL only: list of undeclared query parameters detected during a
    * dry run validation.
    */
  var undeclaredQueryParameters: js.UndefOr[js.Array[SchemaQueryParameter]] = js.native
}

object SchemaJobStatistics2 {
  @scala.inline
  def apply(
    billingTier: Int | Double = null,
    cacheHit: js.UndefOr[Boolean] = js.undefined,
    ddlOperationPerformed: String = null,
    ddlTargetRoutine: SchemaRoutineReference = null,
    ddlTargetTable: SchemaTableReference = null,
    estimatedBytesProcessed: String = null,
    modelTraining: SchemaBigQueryModelTraining = null,
    modelTrainingCurrentIteration: Int | Double = null,
    modelTrainingExpectedTotalIteration: String = null,
    numDmlAffectedRows: String = null,
    queryPlan: js.Array[SchemaExplainQueryStage] = null,
    referencedTables: js.Array[SchemaTableReference] = null,
    reservationUsage: js.Array[AnonNameSlotMs] = null,
    schema: SchemaTableSchema = null,
    statementType: String = null,
    timeline: js.Array[SchemaQueryTimelineSample] = null,
    totalBytesBilled: String = null,
    totalBytesProcessed: String = null,
    totalBytesProcessedAccuracy: String = null,
    totalPartitionsProcessed: String = null,
    totalSlotMs: String = null,
    undeclaredQueryParameters: js.Array[SchemaQueryParameter] = null
  ): SchemaJobStatistics2 = {
    val __obj = js.Dynamic.literal()
    if (billingTier != null) __obj.updateDynamic("billingTier")(billingTier.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheHit)) __obj.updateDynamic("cacheHit")(cacheHit.asInstanceOf[js.Any])
    if (ddlOperationPerformed != null) __obj.updateDynamic("ddlOperationPerformed")(ddlOperationPerformed.asInstanceOf[js.Any])
    if (ddlTargetRoutine != null) __obj.updateDynamic("ddlTargetRoutine")(ddlTargetRoutine.asInstanceOf[js.Any])
    if (ddlTargetTable != null) __obj.updateDynamic("ddlTargetTable")(ddlTargetTable.asInstanceOf[js.Any])
    if (estimatedBytesProcessed != null) __obj.updateDynamic("estimatedBytesProcessed")(estimatedBytesProcessed.asInstanceOf[js.Any])
    if (modelTraining != null) __obj.updateDynamic("modelTraining")(modelTraining.asInstanceOf[js.Any])
    if (modelTrainingCurrentIteration != null) __obj.updateDynamic("modelTrainingCurrentIteration")(modelTrainingCurrentIteration.asInstanceOf[js.Any])
    if (modelTrainingExpectedTotalIteration != null) __obj.updateDynamic("modelTrainingExpectedTotalIteration")(modelTrainingExpectedTotalIteration.asInstanceOf[js.Any])
    if (numDmlAffectedRows != null) __obj.updateDynamic("numDmlAffectedRows")(numDmlAffectedRows.asInstanceOf[js.Any])
    if (queryPlan != null) __obj.updateDynamic("queryPlan")(queryPlan.asInstanceOf[js.Any])
    if (referencedTables != null) __obj.updateDynamic("referencedTables")(referencedTables.asInstanceOf[js.Any])
    if (reservationUsage != null) __obj.updateDynamic("reservationUsage")(reservationUsage.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (statementType != null) __obj.updateDynamic("statementType")(statementType.asInstanceOf[js.Any])
    if (timeline != null) __obj.updateDynamic("timeline")(timeline.asInstanceOf[js.Any])
    if (totalBytesBilled != null) __obj.updateDynamic("totalBytesBilled")(totalBytesBilled.asInstanceOf[js.Any])
    if (totalBytesProcessed != null) __obj.updateDynamic("totalBytesProcessed")(totalBytesProcessed.asInstanceOf[js.Any])
    if (totalBytesProcessedAccuracy != null) __obj.updateDynamic("totalBytesProcessedAccuracy")(totalBytesProcessedAccuracy.asInstanceOf[js.Any])
    if (totalPartitionsProcessed != null) __obj.updateDynamic("totalPartitionsProcessed")(totalPartitionsProcessed.asInstanceOf[js.Any])
    if (totalSlotMs != null) __obj.updateDynamic("totalSlotMs")(totalSlotMs.asInstanceOf[js.Any])
    if (undeclaredQueryParameters != null) __obj.updateDynamic("undeclaredQueryParameters")(undeclaredQueryParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobStatistics2]
  }
}

