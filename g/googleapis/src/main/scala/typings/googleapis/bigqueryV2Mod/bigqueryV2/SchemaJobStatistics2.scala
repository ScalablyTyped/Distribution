package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.NameSlotMs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobStatistics2 extends StObject {
  
  /**
    * [Output-only] Billing tier for the job.
    */
  var billingTier: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output-only] Whether the query result was fetched from the query cache.
    */
  var cacheHit: js.UndefOr[Boolean] = js.undefined
  
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
  var ddlOperationPerformed: js.UndefOr[String] = js.undefined
  
  /**
    * The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE
    * queries.
    */
  var ddlTargetRoutine: js.UndefOr[SchemaRoutineReference] = js.undefined
  
  /**
    * The DDL target table. Present only for CREATE/DROP TABLE/VIEW queries.
    */
  var ddlTargetTable: js.UndefOr[SchemaTableReference] = js.undefined
  
  /**
    * [Output-only] The original estimate of bytes processed for the job.
    */
  var estimatedBytesProcessed: js.UndefOr[String] = js.undefined
  
  /**
    * [Output-only, Beta] Information about create model query job progress.
    */
  var modelTraining: js.UndefOr[SchemaBigQueryModelTraining] = js.undefined
  
  /**
    * [Output-only, Beta] Deprecated; do not use.
    */
  var modelTrainingCurrentIteration: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output-only, Beta] Deprecated; do not use.
    */
  var modelTrainingExpectedTotalIteration: js.UndefOr[String] = js.undefined
  
  /**
    * [Output-only] The number of rows affected by a DML statement. Present
    * only for DML statements INSERT, UPDATE or DELETE.
    */
  var numDmlAffectedRows: js.UndefOr[String] = js.undefined
  
  /**
    * [Output-only] Describes execution plan for the query.
    */
  var queryPlan: js.UndefOr[js.Array[SchemaExplainQueryStage]] = js.undefined
  
  /**
    * [Output-only] Referenced tables for the job. Queries that reference more
    * than 50 tables will not have a complete list.
    */
  var referencedTables: js.UndefOr[js.Array[SchemaTableReference]] = js.undefined
  
  /**
    * [Output-only] Job resource usage breakdown by reservation.
    */
  var reservationUsage: js.UndefOr[js.Array[NameSlotMs]] = js.undefined
  
  /**
    * [Output-only] The schema of the results. Present only for successful dry
    * run of non-legacy SQL queries.
    */
  var schema: js.UndefOr[SchemaTableSchema] = js.undefined
  
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
  var statementType: js.UndefOr[String] = js.undefined
  
  /**
    * [Output-only] [Beta] Describes a timeline of job execution.
    */
  var timeline: js.UndefOr[js.Array[SchemaQueryTimelineSample]] = js.undefined
  
  /**
    * [Output-only] Total bytes billed for the job.
    */
  var totalBytesBilled: js.UndefOr[String] = js.undefined
  
  /**
    * [Output-only] Total bytes processed for the job.
    */
  var totalBytesProcessed: js.UndefOr[String] = js.undefined
  
  /**
    * [Output-only] For dry-run jobs, totalBytesProcessed is an estimate and
    * this field specifies the accuracy of the estimate. Possible values can
    * be: UNKNOWN: accuracy of the estimate is unknown. PRECISE: estimate is
    * precise. LOWER_BOUND: estimate is lower bound of what the query would
    * cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
    */
  var totalBytesProcessedAccuracy: js.UndefOr[String] = js.undefined
  
  /**
    * [Output-only] Total number of partitions processed from all partitioned
    * tables referenced in the job.
    */
  var totalPartitionsProcessed: js.UndefOr[String] = js.undefined
  
  /**
    * [Output-only] Slot-milliseconds for the job.
    */
  var totalSlotMs: js.UndefOr[String] = js.undefined
  
  /**
    * Standard SQL only: list of undeclared query parameters detected during a
    * dry run validation.
    */
  var undeclaredQueryParameters: js.UndefOr[js.Array[SchemaQueryParameter]] = js.undefined
}
object SchemaJobStatistics2 {
  
  inline def apply(): SchemaJobStatistics2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics2]
  }
  
  extension [Self <: SchemaJobStatistics2](x: Self) {
    
    inline def setBillingTier(value: Double): Self = StObject.set(x, "billingTier", value.asInstanceOf[js.Any])
    
    inline def setBillingTierUndefined: Self = StObject.set(x, "billingTier", js.undefined)
    
    inline def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
    
    inline def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
    
    inline def setDdlOperationPerformed(value: String): Self = StObject.set(x, "ddlOperationPerformed", value.asInstanceOf[js.Any])
    
    inline def setDdlOperationPerformedUndefined: Self = StObject.set(x, "ddlOperationPerformed", js.undefined)
    
    inline def setDdlTargetRoutine(value: SchemaRoutineReference): Self = StObject.set(x, "ddlTargetRoutine", value.asInstanceOf[js.Any])
    
    inline def setDdlTargetRoutineUndefined: Self = StObject.set(x, "ddlTargetRoutine", js.undefined)
    
    inline def setDdlTargetTable(value: SchemaTableReference): Self = StObject.set(x, "ddlTargetTable", value.asInstanceOf[js.Any])
    
    inline def setDdlTargetTableUndefined: Self = StObject.set(x, "ddlTargetTable", js.undefined)
    
    inline def setEstimatedBytesProcessed(value: String): Self = StObject.set(x, "estimatedBytesProcessed", value.asInstanceOf[js.Any])
    
    inline def setEstimatedBytesProcessedUndefined: Self = StObject.set(x, "estimatedBytesProcessed", js.undefined)
    
    inline def setModelTraining(value: SchemaBigQueryModelTraining): Self = StObject.set(x, "modelTraining", value.asInstanceOf[js.Any])
    
    inline def setModelTrainingCurrentIteration(value: Double): Self = StObject.set(x, "modelTrainingCurrentIteration", value.asInstanceOf[js.Any])
    
    inline def setModelTrainingCurrentIterationUndefined: Self = StObject.set(x, "modelTrainingCurrentIteration", js.undefined)
    
    inline def setModelTrainingExpectedTotalIteration(value: String): Self = StObject.set(x, "modelTrainingExpectedTotalIteration", value.asInstanceOf[js.Any])
    
    inline def setModelTrainingExpectedTotalIterationUndefined: Self = StObject.set(x, "modelTrainingExpectedTotalIteration", js.undefined)
    
    inline def setModelTrainingUndefined: Self = StObject.set(x, "modelTraining", js.undefined)
    
    inline def setNumDmlAffectedRows(value: String): Self = StObject.set(x, "numDmlAffectedRows", value.asInstanceOf[js.Any])
    
    inline def setNumDmlAffectedRowsUndefined: Self = StObject.set(x, "numDmlAffectedRows", js.undefined)
    
    inline def setQueryPlan(value: js.Array[SchemaExplainQueryStage]): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    inline def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    inline def setQueryPlanVarargs(value: SchemaExplainQueryStage*): Self = StObject.set(x, "queryPlan", js.Array(value :_*))
    
    inline def setReferencedTables(value: js.Array[SchemaTableReference]): Self = StObject.set(x, "referencedTables", value.asInstanceOf[js.Any])
    
    inline def setReferencedTablesUndefined: Self = StObject.set(x, "referencedTables", js.undefined)
    
    inline def setReferencedTablesVarargs(value: SchemaTableReference*): Self = StObject.set(x, "referencedTables", js.Array(value :_*))
    
    inline def setReservationUsage(value: js.Array[NameSlotMs]): Self = StObject.set(x, "reservationUsage", value.asInstanceOf[js.Any])
    
    inline def setReservationUsageUndefined: Self = StObject.set(x, "reservationUsage", js.undefined)
    
    inline def setReservationUsageVarargs(value: NameSlotMs*): Self = StObject.set(x, "reservationUsage", js.Array(value :_*))
    
    inline def setSchema(value: SchemaTableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setStatementType(value: String): Self = StObject.set(x, "statementType", value.asInstanceOf[js.Any])
    
    inline def setStatementTypeUndefined: Self = StObject.set(x, "statementType", js.undefined)
    
    inline def setTimeline(value: js.Array[SchemaQueryTimelineSample]): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    
    inline def setTimelineVarargs(value: SchemaQueryTimelineSample*): Self = StObject.set(x, "timeline", js.Array(value :_*))
    
    inline def setTotalBytesBilled(value: String): Self = StObject.set(x, "totalBytesBilled", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesBilledUndefined: Self = StObject.set(x, "totalBytesBilled", js.undefined)
    
    inline def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesProcessedAccuracy(value: String): Self = StObject.set(x, "totalBytesProcessedAccuracy", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesProcessedAccuracyUndefined: Self = StObject.set(x, "totalBytesProcessedAccuracy", js.undefined)
    
    inline def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
    
    inline def setTotalPartitionsProcessed(value: String): Self = StObject.set(x, "totalPartitionsProcessed", value.asInstanceOf[js.Any])
    
    inline def setTotalPartitionsProcessedUndefined: Self = StObject.set(x, "totalPartitionsProcessed", js.undefined)
    
    inline def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
    
    inline def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
    
    inline def setUndeclaredQueryParameters(value: js.Array[SchemaQueryParameter]): Self = StObject.set(x, "undeclaredQueryParameters", value.asInstanceOf[js.Any])
    
    inline def setUndeclaredQueryParametersUndefined: Self = StObject.set(x, "undeclaredQueryParameters", js.undefined)
    
    inline def setUndeclaredQueryParametersVarargs(value: SchemaQueryParameter*): Self = StObject.set(x, "undeclaredQueryParameters", js.Array(value :_*))
  }
}
