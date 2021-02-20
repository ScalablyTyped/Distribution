package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatistics2 extends StObject {
  
  var billingTier: js.UndefOr[Double] = js.native
  
  var cacheHit: js.UndefOr[Boolean] = js.native
  
  var ddlOperationPerformed: js.UndefOr[String] = js.native
  
  var ddlTargetRoutine: js.UndefOr[RoutineReference] = js.native
  
  var ddlTargetTable: js.UndefOr[TableReference] = js.native
  
  var estimatedBytesProcessed: js.UndefOr[String] = js.native
  
  var modelTraining: js.UndefOr[BigQueryModelTraining] = js.native
  
  var modelTrainingCurrentIteration: js.UndefOr[Double] = js.native
  
  var modelTrainingExpectedTotalIteration: js.UndefOr[String] = js.native
  
  var numDmlAffectedRows: js.UndefOr[String] = js.native
  
  var queryPlan: js.UndefOr[js.Array[ExplainQueryStage]] = js.native
  
  var referencedTables: js.UndefOr[js.Array[TableReference]] = js.native
  
  var reservationUsage: js.UndefOr[js.Array[JobStatistics2ReservationUsage]] = js.native
  
  var schema: js.UndefOr[TableSchema] = js.native
  
  var statementType: js.UndefOr[String] = js.native
  
  var timeline: js.UndefOr[js.Array[QueryTimelineSample]] = js.native
  
  var totalBytesBilled: js.UndefOr[String] = js.native
  
  var totalBytesProcessed: js.UndefOr[String] = js.native
  
  var totalBytesProcessedAccuracy: js.UndefOr[String] = js.native
  
  var totalPartitionsProcessed: js.UndefOr[String] = js.native
  
  var totalSlotMs: js.UndefOr[String] = js.native
  
  var undeclaredQueryParameters: js.UndefOr[js.Array[QueryParameter]] = js.native
}
object JobStatistics2 {
  
  @scala.inline
  def apply(): JobStatistics2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics2]
  }
  
  @scala.inline
  implicit class JobStatistics2MutableBuilder[Self <: JobStatistics2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingTier(value: Double): Self = StObject.set(x, "billingTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingTierUndefined: Self = StObject.set(x, "billingTier", js.undefined)
    
    @scala.inline
    def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
    
    @scala.inline
    def setDdlOperationPerformed(value: String): Self = StObject.set(x, "ddlOperationPerformed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdlOperationPerformedUndefined: Self = StObject.set(x, "ddlOperationPerformed", js.undefined)
    
    @scala.inline
    def setDdlTargetRoutine(value: RoutineReference): Self = StObject.set(x, "ddlTargetRoutine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdlTargetRoutineUndefined: Self = StObject.set(x, "ddlTargetRoutine", js.undefined)
    
    @scala.inline
    def setDdlTargetTable(value: TableReference): Self = StObject.set(x, "ddlTargetTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdlTargetTableUndefined: Self = StObject.set(x, "ddlTargetTable", js.undefined)
    
    @scala.inline
    def setEstimatedBytesProcessed(value: String): Self = StObject.set(x, "estimatedBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedBytesProcessedUndefined: Self = StObject.set(x, "estimatedBytesProcessed", js.undefined)
    
    @scala.inline
    def setModelTraining(value: BigQueryModelTraining): Self = StObject.set(x, "modelTraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTrainingCurrentIteration(value: Double): Self = StObject.set(x, "modelTrainingCurrentIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTrainingCurrentIterationUndefined: Self = StObject.set(x, "modelTrainingCurrentIteration", js.undefined)
    
    @scala.inline
    def setModelTrainingExpectedTotalIteration(value: String): Self = StObject.set(x, "modelTrainingExpectedTotalIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTrainingExpectedTotalIterationUndefined: Self = StObject.set(x, "modelTrainingExpectedTotalIteration", js.undefined)
    
    @scala.inline
    def setModelTrainingUndefined: Self = StObject.set(x, "modelTraining", js.undefined)
    
    @scala.inline
    def setNumDmlAffectedRows(value: String): Self = StObject.set(x, "numDmlAffectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumDmlAffectedRowsUndefined: Self = StObject.set(x, "numDmlAffectedRows", js.undefined)
    
    @scala.inline
    def setQueryPlan(value: js.Array[ExplainQueryStage]): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    @scala.inline
    def setQueryPlanVarargs(value: ExplainQueryStage*): Self = StObject.set(x, "queryPlan", js.Array(value :_*))
    
    @scala.inline
    def setReferencedTables(value: js.Array[TableReference]): Self = StObject.set(x, "referencedTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedTablesUndefined: Self = StObject.set(x, "referencedTables", js.undefined)
    
    @scala.inline
    def setReferencedTablesVarargs(value: TableReference*): Self = StObject.set(x, "referencedTables", js.Array(value :_*))
    
    @scala.inline
    def setReservationUsage(value: js.Array[JobStatistics2ReservationUsage]): Self = StObject.set(x, "reservationUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationUsageUndefined: Self = StObject.set(x, "reservationUsage", js.undefined)
    
    @scala.inline
    def setReservationUsageVarargs(value: JobStatistics2ReservationUsage*): Self = StObject.set(x, "reservationUsage", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setStatementType(value: String): Self = StObject.set(x, "statementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementTypeUndefined: Self = StObject.set(x, "statementType", js.undefined)
    
    @scala.inline
    def setTimeline(value: js.Array[QueryTimelineSample]): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    
    @scala.inline
    def setTimelineVarargs(value: QueryTimelineSample*): Self = StObject.set(x, "timeline", js.Array(value :_*))
    
    @scala.inline
    def setTotalBytesBilled(value: String): Self = StObject.set(x, "totalBytesBilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesBilledUndefined: Self = StObject.set(x, "totalBytesBilled", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesProcessedAccuracy(value: String): Self = StObject.set(x, "totalBytesProcessedAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesProcessedAccuracyUndefined: Self = StObject.set(x, "totalBytesProcessedAccuracy", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
    
    @scala.inline
    def setTotalPartitionsProcessed(value: String): Self = StObject.set(x, "totalPartitionsProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPartitionsProcessedUndefined: Self = StObject.set(x, "totalPartitionsProcessed", js.undefined)
    
    @scala.inline
    def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
    
    @scala.inline
    def setUndeclaredQueryParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "undeclaredQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndeclaredQueryParametersUndefined: Self = StObject.set(x, "undeclaredQueryParameters", js.undefined)
    
    @scala.inline
    def setUndeclaredQueryParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "undeclaredQueryParameters", js.Array(value :_*))
  }
}
