package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.NameSlotMs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var reservationUsage: js.UndefOr[js.Array[NameSlotMs]] = js.native
  
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
  def apply(): SchemaJobStatistics2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics2]
  }
  
  @scala.inline
  implicit class SchemaJobStatistics2Ops[Self <: SchemaJobStatistics2] (val x: Self) extends AnyVal {
    
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
    def setDdlOperationPerformed(value: String): Self = this.set("ddlOperationPerformed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlOperationPerformed: Self = this.set("ddlOperationPerformed", js.undefined)
    
    @scala.inline
    def setDdlTargetRoutine(value: SchemaRoutineReference): Self = this.set("ddlTargetRoutine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlTargetRoutine: Self = this.set("ddlTargetRoutine", js.undefined)
    
    @scala.inline
    def setDdlTargetTable(value: SchemaTableReference): Self = this.set("ddlTargetTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlTargetTable: Self = this.set("ddlTargetTable", js.undefined)
    
    @scala.inline
    def setEstimatedBytesProcessed(value: String): Self = this.set("estimatedBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedBytesProcessed: Self = this.set("estimatedBytesProcessed", js.undefined)
    
    @scala.inline
    def setModelTraining(value: SchemaBigQueryModelTraining): Self = this.set("modelTraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelTraining: Self = this.set("modelTraining", js.undefined)
    
    @scala.inline
    def setModelTrainingCurrentIteration(value: Double): Self = this.set("modelTrainingCurrentIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelTrainingCurrentIteration: Self = this.set("modelTrainingCurrentIteration", js.undefined)
    
    @scala.inline
    def setModelTrainingExpectedTotalIteration(value: String): Self = this.set("modelTrainingExpectedTotalIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelTrainingExpectedTotalIteration: Self = this.set("modelTrainingExpectedTotalIteration", js.undefined)
    
    @scala.inline
    def setNumDmlAffectedRows(value: String): Self = this.set("numDmlAffectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumDmlAffectedRows: Self = this.set("numDmlAffectedRows", js.undefined)
    
    @scala.inline
    def setQueryPlanVarargs(value: SchemaExplainQueryStage*): Self = this.set("queryPlan", js.Array(value :_*))
    
    @scala.inline
    def setQueryPlan(value: js.Array[SchemaExplainQueryStage]): Self = this.set("queryPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryPlan: Self = this.set("queryPlan", js.undefined)
    
    @scala.inline
    def setReferencedTablesVarargs(value: SchemaTableReference*): Self = this.set("referencedTables", js.Array(value :_*))
    
    @scala.inline
    def setReferencedTables(value: js.Array[SchemaTableReference]): Self = this.set("referencedTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencedTables: Self = this.set("referencedTables", js.undefined)
    
    @scala.inline
    def setReservationUsageVarargs(value: NameSlotMs*): Self = this.set("reservationUsage", js.Array(value :_*))
    
    @scala.inline
    def setReservationUsage(value: js.Array[NameSlotMs]): Self = this.set("reservationUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationUsage: Self = this.set("reservationUsage", js.undefined)
    
    @scala.inline
    def setSchema(value: SchemaTableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setStatementType(value: String): Self = this.set("statementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatementType: Self = this.set("statementType", js.undefined)
    
    @scala.inline
    def setTimelineVarargs(value: SchemaQueryTimelineSample*): Self = this.set("timeline", js.Array(value :_*))
    
    @scala.inline
    def setTimeline(value: js.Array[SchemaQueryTimelineSample]): Self = this.set("timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeline: Self = this.set("timeline", js.undefined)
    
    @scala.inline
    def setTotalBytesBilled(value: String): Self = this.set("totalBytesBilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesBilled: Self = this.set("totalBytesBilled", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessed(value: String): Self = this.set("totalBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesProcessed: Self = this.set("totalBytesProcessed", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessedAccuracy(value: String): Self = this.set("totalBytesProcessedAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesProcessedAccuracy: Self = this.set("totalBytesProcessedAccuracy", js.undefined)
    
    @scala.inline
    def setTotalPartitionsProcessed(value: String): Self = this.set("totalPartitionsProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPartitionsProcessed: Self = this.set("totalPartitionsProcessed", js.undefined)
    
    @scala.inline
    def setTotalSlotMs(value: String): Self = this.set("totalSlotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSlotMs: Self = this.set("totalSlotMs", js.undefined)
    
    @scala.inline
    def setUndeclaredQueryParametersVarargs(value: SchemaQueryParameter*): Self = this.set("undeclaredQueryParameters", js.Array(value :_*))
    
    @scala.inline
    def setUndeclaredQueryParameters(value: js.Array[SchemaQueryParameter]): Self = this.set("undeclaredQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndeclaredQueryParameters: Self = this.set("undeclaredQueryParameters", js.undefined)
  }
}
