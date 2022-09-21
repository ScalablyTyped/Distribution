package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.SlotMs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobStatistics extends StObject {
  
  /**
    * [TrustedTester] [Output-only] Job progress (0.0 -\> 1.0) for LOAD and EXTRACT jobs.
    */
  var completionRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output-only] Statistics for a copy job.
    */
  var copy: js.UndefOr[SchemaJobStatistics5] = js.undefined
  
  /**
    * [Output-only] Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Statistics for an extract job.
    */
  var extract: js.UndefOr[SchemaJobStatistics4] = js.undefined
  
  /**
    * [Output-only] Statistics for a load job.
    */
  var load: js.UndefOr[SchemaJobStatistics3] = js.undefined
  
  /**
    * [Output-only] Number of child jobs executed.
    */
  var numChildJobs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] If this is a child job, the id of the parent.
    */
  var parentJobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Statistics for a query job.
    */
  var query: js.UndefOr[SchemaJobStatistics2] = js.undefined
  
  /**
    * [Output-only] Quotas which delayed this job's start time.
    */
  var quotaDeferments: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * [Output-only] Job resource usage breakdown by reservation.
    */
  var reservationUsage: js.UndefOr[js.Array[SlotMs] | Null] = js.undefined
  
  /**
    * [Output-only] Name of the primary reservation assigned to this job. Note that this could be different than reservations reported in the reservation usage field if parent reservations were used to execute this job.
    */
  var reservation_id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] [Preview] Statistics for row-level security. Present only for query and extract jobs.
    */
  var rowLevelSecurityStatistics: js.UndefOr[SchemaRowLevelSecurityStatistics] = js.undefined
  
  /**
    * [Output-only] Statistics for a child job of a script.
    */
  var scriptStatistics: js.UndefOr[SchemaScriptStatistics] = js.undefined
  
  /**
    * [Output-only] [Preview] Information of the session if this job is part of one.
    */
  var sessionInfo: js.UndefOr[SchemaSessionInfo] = js.undefined
  
  /**
    * [Output-only] Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to either RUNNING or DONE.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] [Deprecated] Use the bytes processed in the query statistics instead.
    */
  var totalBytesProcessed: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Slot-milliseconds for the job.
    */
  var totalSlotMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] [Alpha] Information of the multi-statement transaction if this job is part of one.
    */
  var transactionInfo: js.UndefOr[SchemaTransactionInfo] = js.undefined
}
object SchemaJobStatistics {
  
  inline def apply(): SchemaJobStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics]
  }
  
  extension [Self <: SchemaJobStatistics](x: Self) {
    
    inline def setCompletionRatio(value: Double): Self = StObject.set(x, "completionRatio", value.asInstanceOf[js.Any])
    
    inline def setCompletionRatioNull: Self = StObject.set(x, "completionRatio", null)
    
    inline def setCompletionRatioUndefined: Self = StObject.set(x, "completionRatio", js.undefined)
    
    inline def setCopy(value: SchemaJobStatistics5): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setExtract(value: SchemaJobStatistics4): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    
    inline def setLoad(value: SchemaJobStatistics3): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setNumChildJobs(value: String): Self = StObject.set(x, "numChildJobs", value.asInstanceOf[js.Any])
    
    inline def setNumChildJobsNull: Self = StObject.set(x, "numChildJobs", null)
    
    inline def setNumChildJobsUndefined: Self = StObject.set(x, "numChildJobs", js.undefined)
    
    inline def setParentJobId(value: String): Self = StObject.set(x, "parentJobId", value.asInstanceOf[js.Any])
    
    inline def setParentJobIdNull: Self = StObject.set(x, "parentJobId", null)
    
    inline def setParentJobIdUndefined: Self = StObject.set(x, "parentJobId", js.undefined)
    
    inline def setQuery(value: SchemaJobStatistics2): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setQuotaDeferments(value: js.Array[String]): Self = StObject.set(x, "quotaDeferments", value.asInstanceOf[js.Any])
    
    inline def setQuotaDefermentsNull: Self = StObject.set(x, "quotaDeferments", null)
    
    inline def setQuotaDefermentsUndefined: Self = StObject.set(x, "quotaDeferments", js.undefined)
    
    inline def setQuotaDefermentsVarargs(value: String*): Self = StObject.set(x, "quotaDeferments", js.Array(value*))
    
    inline def setReservationUsage(value: js.Array[SlotMs]): Self = StObject.set(x, "reservationUsage", value.asInstanceOf[js.Any])
    
    inline def setReservationUsageNull: Self = StObject.set(x, "reservationUsage", null)
    
    inline def setReservationUsageUndefined: Self = StObject.set(x, "reservationUsage", js.undefined)
    
    inline def setReservationUsageVarargs(value: SlotMs*): Self = StObject.set(x, "reservationUsage", js.Array(value*))
    
    inline def setReservation_id(value: String): Self = StObject.set(x, "reservation_id", value.asInstanceOf[js.Any])
    
    inline def setReservation_idNull: Self = StObject.set(x, "reservation_id", null)
    
    inline def setReservation_idUndefined: Self = StObject.set(x, "reservation_id", js.undefined)
    
    inline def setRowLevelSecurityStatistics(value: SchemaRowLevelSecurityStatistics): Self = StObject.set(x, "rowLevelSecurityStatistics", value.asInstanceOf[js.Any])
    
    inline def setRowLevelSecurityStatisticsUndefined: Self = StObject.set(x, "rowLevelSecurityStatistics", js.undefined)
    
    inline def setScriptStatistics(value: SchemaScriptStatistics): Self = StObject.set(x, "scriptStatistics", value.asInstanceOf[js.Any])
    
    inline def setScriptStatisticsUndefined: Self = StObject.set(x, "scriptStatistics", js.undefined)
    
    inline def setSessionInfo(value: SchemaSessionInfo): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesProcessedNull: Self = StObject.set(x, "totalBytesProcessed", null)
    
    inline def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
    
    inline def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
    
    inline def setTotalSlotMsNull: Self = StObject.set(x, "totalSlotMs", null)
    
    inline def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
    
    inline def setTransactionInfo(value: SchemaTransactionInfo): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
    
    inline def setTransactionInfoUndefined: Self = StObject.set(x, "transactionInfo", js.undefined)
  }
}
