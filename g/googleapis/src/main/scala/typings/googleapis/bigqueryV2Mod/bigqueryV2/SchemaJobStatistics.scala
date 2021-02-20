package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.SlotMs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaJobStatistics extends StObject {
  
  /**
    * [TrustedTester] [Output-only] Job progress (0.0 -&gt; 1.0) for LOAD and
    * EXTRACT jobs.
    */
  var completionRatio: js.UndefOr[Double] = js.native
  
  /**
    * [Output-only] Creation time of this job, in milliseconds since the epoch.
    * This field will be present on all jobs.
    */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] End time of this job, in milliseconds since the epoch. This
    * field will be present whenever a job is in the DONE state.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] Statistics for an extract job.
    */
  var extract: js.UndefOr[SchemaJobStatistics4] = js.native
  
  /**
    * [Output-only] Statistics for a load job.
    */
  var load: js.UndefOr[SchemaJobStatistics3] = js.native
  
  /**
    * [Output-only] Number of child jobs executed.
    */
  var numChildJobs: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] If this is a child job, the id of the parent.
    */
  var parentJobId: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] Statistics for a query job.
    */
  var query: js.UndefOr[SchemaJobStatistics2] = js.native
  
  /**
    * [Output-only] Quotas which delayed this job&#39;s start time.
    */
  var quotaDeferments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [Output-only] Job resource usage breakdown by reservation.
    */
  var reservationUsage: js.UndefOr[js.Array[SlotMs]] = js.native
  
  /**
    * [Output-only] Start time of this job, in milliseconds since the epoch.
    * This field will be present when the job transitions from the PENDING
    * state to either RUNNING or DONE.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] [Deprecated] Use the bytes processed in the query
    * statistics instead.
    */
  var totalBytesProcessed: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] Slot-milliseconds for the job.
    */
  var totalSlotMs: js.UndefOr[String] = js.native
}
object SchemaJobStatistics {
  
  @scala.inline
  def apply(): SchemaJobStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics]
  }
  
  @scala.inline
  implicit class SchemaJobStatisticsMutableBuilder[Self <: SchemaJobStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionRatio(value: Double): Self = StObject.set(x, "completionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionRatioUndefined: Self = StObject.set(x, "completionRatio", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setExtract(value: SchemaJobStatistics4): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    
    @scala.inline
    def setLoad(value: SchemaJobStatistics3): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setNumChildJobs(value: String): Self = StObject.set(x, "numChildJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumChildJobsUndefined: Self = StObject.set(x, "numChildJobs", js.undefined)
    
    @scala.inline
    def setParentJobId(value: String): Self = StObject.set(x, "parentJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentJobIdUndefined: Self = StObject.set(x, "parentJobId", js.undefined)
    
    @scala.inline
    def setQuery(value: SchemaJobStatistics2): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setQuotaDeferments(value: js.Array[String]): Self = StObject.set(x, "quotaDeferments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaDefermentsUndefined: Self = StObject.set(x, "quotaDeferments", js.undefined)
    
    @scala.inline
    def setQuotaDefermentsVarargs(value: String*): Self = StObject.set(x, "quotaDeferments", js.Array(value :_*))
    
    @scala.inline
    def setReservationUsage(value: js.Array[SlotMs]): Self = StObject.set(x, "reservationUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationUsageUndefined: Self = StObject.set(x, "reservationUsage", js.undefined)
    
    @scala.inline
    def setReservationUsageVarargs(value: SlotMs*): Self = StObject.set(x, "reservationUsage", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
    
    @scala.inline
    def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
  }
}
