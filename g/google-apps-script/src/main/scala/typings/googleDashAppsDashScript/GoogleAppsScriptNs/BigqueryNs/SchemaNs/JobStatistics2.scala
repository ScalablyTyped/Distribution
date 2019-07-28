package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics2 extends js.Object {
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
  @scala.inline
  def apply(
    billingTier: Int | Double = null,
    cacheHit: js.UndefOr[Boolean] = js.undefined,
    ddlOperationPerformed: String = null,
    ddlTargetRoutine: RoutineReference = null,
    ddlTargetTable: TableReference = null,
    estimatedBytesProcessed: String = null,
    modelTraining: BigQueryModelTraining = null,
    modelTrainingCurrentIteration: Int | Double = null,
    modelTrainingExpectedTotalIteration: String = null,
    numDmlAffectedRows: String = null,
    queryPlan: js.Array[ExplainQueryStage] = null,
    referencedTables: js.Array[TableReference] = null,
    reservationUsage: js.Array[JobStatistics2ReservationUsage] = null,
    schema: TableSchema = null,
    statementType: String = null,
    timeline: js.Array[QueryTimelineSample] = null,
    totalBytesBilled: String = null,
    totalBytesProcessed: String = null,
    totalBytesProcessedAccuracy: String = null,
    totalPartitionsProcessed: String = null,
    totalSlotMs: String = null,
    undeclaredQueryParameters: js.Array[QueryParameter] = null
  ): JobStatistics2 = {
    val __obj = js.Dynamic.literal()
    if (billingTier != null) __obj.updateDynamic("billingTier")(billingTier.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheHit)) __obj.updateDynamic("cacheHit")(cacheHit)
    if (ddlOperationPerformed != null) __obj.updateDynamic("ddlOperationPerformed")(ddlOperationPerformed)
    if (ddlTargetRoutine != null) __obj.updateDynamic("ddlTargetRoutine")(ddlTargetRoutine)
    if (ddlTargetTable != null) __obj.updateDynamic("ddlTargetTable")(ddlTargetTable)
    if (estimatedBytesProcessed != null) __obj.updateDynamic("estimatedBytesProcessed")(estimatedBytesProcessed)
    if (modelTraining != null) __obj.updateDynamic("modelTraining")(modelTraining)
    if (modelTrainingCurrentIteration != null) __obj.updateDynamic("modelTrainingCurrentIteration")(modelTrainingCurrentIteration.asInstanceOf[js.Any])
    if (modelTrainingExpectedTotalIteration != null) __obj.updateDynamic("modelTrainingExpectedTotalIteration")(modelTrainingExpectedTotalIteration)
    if (numDmlAffectedRows != null) __obj.updateDynamic("numDmlAffectedRows")(numDmlAffectedRows)
    if (queryPlan != null) __obj.updateDynamic("queryPlan")(queryPlan)
    if (referencedTables != null) __obj.updateDynamic("referencedTables")(referencedTables)
    if (reservationUsage != null) __obj.updateDynamic("reservationUsage")(reservationUsage)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (statementType != null) __obj.updateDynamic("statementType")(statementType)
    if (timeline != null) __obj.updateDynamic("timeline")(timeline)
    if (totalBytesBilled != null) __obj.updateDynamic("totalBytesBilled")(totalBytesBilled)
    if (totalBytesProcessed != null) __obj.updateDynamic("totalBytesProcessed")(totalBytesProcessed)
    if (totalBytesProcessedAccuracy != null) __obj.updateDynamic("totalBytesProcessedAccuracy")(totalBytesProcessedAccuracy)
    if (totalPartitionsProcessed != null) __obj.updateDynamic("totalPartitionsProcessed")(totalPartitionsProcessed)
    if (totalSlotMs != null) __obj.updateDynamic("totalSlotMs")(totalSlotMs)
    if (undeclaredQueryParameters != null) __obj.updateDynamic("undeclaredQueryParameters")(undeclaredQueryParameters)
    __obj.asInstanceOf[JobStatistics2]
  }
}

