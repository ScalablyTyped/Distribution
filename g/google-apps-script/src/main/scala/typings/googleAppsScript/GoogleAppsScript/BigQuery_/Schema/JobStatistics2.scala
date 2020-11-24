package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatistics2 extends js.Object {
  
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
    def setDdlOperationPerformed(value: String): Self = this.set("ddlOperationPerformed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlOperationPerformed: Self = this.set("ddlOperationPerformed", js.undefined)
    
    @scala.inline
    def setDdlTargetRoutine(value: RoutineReference): Self = this.set("ddlTargetRoutine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlTargetRoutine: Self = this.set("ddlTargetRoutine", js.undefined)
    
    @scala.inline
    def setDdlTargetTable(value: TableReference): Self = this.set("ddlTargetTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlTargetTable: Self = this.set("ddlTargetTable", js.undefined)
    
    @scala.inline
    def setEstimatedBytesProcessed(value: String): Self = this.set("estimatedBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedBytesProcessed: Self = this.set("estimatedBytesProcessed", js.undefined)
    
    @scala.inline
    def setModelTraining(value: BigQueryModelTraining): Self = this.set("modelTraining", value.asInstanceOf[js.Any])
    
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
    def setReservationUsageVarargs(value: JobStatistics2ReservationUsage*): Self = this.set("reservationUsage", js.Array(value :_*))
    
    @scala.inline
    def setReservationUsage(value: js.Array[JobStatistics2ReservationUsage]): Self = this.set("reservationUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationUsage: Self = this.set("reservationUsage", js.undefined)
    
    @scala.inline
    def setSchema(value: TableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setStatementType(value: String): Self = this.set("statementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatementType: Self = this.set("statementType", js.undefined)
    
    @scala.inline
    def setTimelineVarargs(value: QueryTimelineSample*): Self = this.set("timeline", js.Array(value :_*))
    
    @scala.inline
    def setTimeline(value: js.Array[QueryTimelineSample]): Self = this.set("timeline", value.asInstanceOf[js.Any])
    
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
    def setUndeclaredQueryParametersVarargs(value: QueryParameter*): Self = this.set("undeclaredQueryParameters", js.Array(value :_*))
    
    @scala.inline
    def setUndeclaredQueryParameters(value: js.Array[QueryParameter]): Self = this.set("undeclaredQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndeclaredQueryParameters: Self = this.set("undeclaredQueryParameters", js.undefined)
  }
}
