package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStatistics2 extends StObject {
  
  var billingTier: js.UndefOr[Double] = js.undefined
  
  var cacheHit: js.UndefOr[Boolean] = js.undefined
  
  var ddlOperationPerformed: js.UndefOr[String] = js.undefined
  
  var ddlTargetRoutine: js.UndefOr[RoutineReference] = js.undefined
  
  var ddlTargetTable: js.UndefOr[TableReference] = js.undefined
  
  var estimatedBytesProcessed: js.UndefOr[String] = js.undefined
  
  var modelTraining: js.UndefOr[BigQueryModelTraining] = js.undefined
  
  var modelTrainingCurrentIteration: js.UndefOr[Double] = js.undefined
  
  var modelTrainingExpectedTotalIteration: js.UndefOr[String] = js.undefined
  
  var numDmlAffectedRows: js.UndefOr[String] = js.undefined
  
  var queryPlan: js.UndefOr[js.Array[ExplainQueryStage]] = js.undefined
  
  var referencedTables: js.UndefOr[js.Array[TableReference]] = js.undefined
  
  var reservationUsage: js.UndefOr[js.Array[JobStatistics2ReservationUsage]] = js.undefined
  
  var schema: js.UndefOr[TableSchema] = js.undefined
  
  var statementType: js.UndefOr[String] = js.undefined
  
  var timeline: js.UndefOr[js.Array[QueryTimelineSample]] = js.undefined
  
  var totalBytesBilled: js.UndefOr[String] = js.undefined
  
  var totalBytesProcessed: js.UndefOr[String] = js.undefined
  
  var totalBytesProcessedAccuracy: js.UndefOr[String] = js.undefined
  
  var totalPartitionsProcessed: js.UndefOr[String] = js.undefined
  
  var totalSlotMs: js.UndefOr[String] = js.undefined
  
  var undeclaredQueryParameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
}
object JobStatistics2 {
  
  inline def apply(): JobStatistics2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics2]
  }
  
  extension [Self <: JobStatistics2](x: Self) {
    
    inline def setBillingTier(value: Double): Self = StObject.set(x, "billingTier", value.asInstanceOf[js.Any])
    
    inline def setBillingTierUndefined: Self = StObject.set(x, "billingTier", js.undefined)
    
    inline def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
    
    inline def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
    
    inline def setDdlOperationPerformed(value: String): Self = StObject.set(x, "ddlOperationPerformed", value.asInstanceOf[js.Any])
    
    inline def setDdlOperationPerformedUndefined: Self = StObject.set(x, "ddlOperationPerformed", js.undefined)
    
    inline def setDdlTargetRoutine(value: RoutineReference): Self = StObject.set(x, "ddlTargetRoutine", value.asInstanceOf[js.Any])
    
    inline def setDdlTargetRoutineUndefined: Self = StObject.set(x, "ddlTargetRoutine", js.undefined)
    
    inline def setDdlTargetTable(value: TableReference): Self = StObject.set(x, "ddlTargetTable", value.asInstanceOf[js.Any])
    
    inline def setDdlTargetTableUndefined: Self = StObject.set(x, "ddlTargetTable", js.undefined)
    
    inline def setEstimatedBytesProcessed(value: String): Self = StObject.set(x, "estimatedBytesProcessed", value.asInstanceOf[js.Any])
    
    inline def setEstimatedBytesProcessedUndefined: Self = StObject.set(x, "estimatedBytesProcessed", js.undefined)
    
    inline def setModelTraining(value: BigQueryModelTraining): Self = StObject.set(x, "modelTraining", value.asInstanceOf[js.Any])
    
    inline def setModelTrainingCurrentIteration(value: Double): Self = StObject.set(x, "modelTrainingCurrentIteration", value.asInstanceOf[js.Any])
    
    inline def setModelTrainingCurrentIterationUndefined: Self = StObject.set(x, "modelTrainingCurrentIteration", js.undefined)
    
    inline def setModelTrainingExpectedTotalIteration(value: String): Self = StObject.set(x, "modelTrainingExpectedTotalIteration", value.asInstanceOf[js.Any])
    
    inline def setModelTrainingExpectedTotalIterationUndefined: Self = StObject.set(x, "modelTrainingExpectedTotalIteration", js.undefined)
    
    inline def setModelTrainingUndefined: Self = StObject.set(x, "modelTraining", js.undefined)
    
    inline def setNumDmlAffectedRows(value: String): Self = StObject.set(x, "numDmlAffectedRows", value.asInstanceOf[js.Any])
    
    inline def setNumDmlAffectedRowsUndefined: Self = StObject.set(x, "numDmlAffectedRows", js.undefined)
    
    inline def setQueryPlan(value: js.Array[ExplainQueryStage]): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    inline def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    inline def setQueryPlanVarargs(value: ExplainQueryStage*): Self = StObject.set(x, "queryPlan", js.Array(value :_*))
    
    inline def setReferencedTables(value: js.Array[TableReference]): Self = StObject.set(x, "referencedTables", value.asInstanceOf[js.Any])
    
    inline def setReferencedTablesUndefined: Self = StObject.set(x, "referencedTables", js.undefined)
    
    inline def setReferencedTablesVarargs(value: TableReference*): Self = StObject.set(x, "referencedTables", js.Array(value :_*))
    
    inline def setReservationUsage(value: js.Array[JobStatistics2ReservationUsage]): Self = StObject.set(x, "reservationUsage", value.asInstanceOf[js.Any])
    
    inline def setReservationUsageUndefined: Self = StObject.set(x, "reservationUsage", js.undefined)
    
    inline def setReservationUsageVarargs(value: JobStatistics2ReservationUsage*): Self = StObject.set(x, "reservationUsage", js.Array(value :_*))
    
    inline def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setStatementType(value: String): Self = StObject.set(x, "statementType", value.asInstanceOf[js.Any])
    
    inline def setStatementTypeUndefined: Self = StObject.set(x, "statementType", js.undefined)
    
    inline def setTimeline(value: js.Array[QueryTimelineSample]): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    
    inline def setTimelineVarargs(value: QueryTimelineSample*): Self = StObject.set(x, "timeline", js.Array(value :_*))
    
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
    
    inline def setUndeclaredQueryParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "undeclaredQueryParameters", value.asInstanceOf[js.Any])
    
    inline def setUndeclaredQueryParametersUndefined: Self = StObject.set(x, "undeclaredQueryParameters", js.undefined)
    
    inline def setUndeclaredQueryParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "undeclaredQueryParameters", js.Array(value :_*))
  }
}
