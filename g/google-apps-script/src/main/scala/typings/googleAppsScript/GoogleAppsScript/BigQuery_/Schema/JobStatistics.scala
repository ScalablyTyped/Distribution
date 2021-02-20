package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatistics extends StObject {
  
  var completionRatio: js.UndefOr[Double] = js.native
  
  var creationTime: js.UndefOr[String] = js.native
  
  var endTime: js.UndefOr[String] = js.native
  
  var extract: js.UndefOr[JobStatistics4] = js.native
  
  var load: js.UndefOr[JobStatistics3] = js.native
  
  var numChildJobs: js.UndefOr[String] = js.native
  
  var parentJobId: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[JobStatistics2] = js.native
  
  var quotaDeferments: js.UndefOr[js.Array[String]] = js.native
  
  var reservationUsage: js.UndefOr[js.Array[JobStatisticsReservationUsage]] = js.native
  
  var startTime: js.UndefOr[String] = js.native
  
  var totalBytesProcessed: js.UndefOr[String] = js.native
  
  var totalSlotMs: js.UndefOr[String] = js.native
}
object JobStatistics {
  
  @scala.inline
  def apply(): JobStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics]
  }
  
  @scala.inline
  implicit class JobStatisticsMutableBuilder[Self <: JobStatistics] (val x: Self) extends AnyVal {
    
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
    def setExtract(value: JobStatistics4): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    
    @scala.inline
    def setLoad(value: JobStatistics3): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
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
    def setQuery(value: JobStatistics2): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setQuotaDeferments(value: js.Array[String]): Self = StObject.set(x, "quotaDeferments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaDefermentsUndefined: Self = StObject.set(x, "quotaDeferments", js.undefined)
    
    @scala.inline
    def setQuotaDefermentsVarargs(value: String*): Self = StObject.set(x, "quotaDeferments", js.Array(value :_*))
    
    @scala.inline
    def setReservationUsage(value: js.Array[JobStatisticsReservationUsage]): Self = StObject.set(x, "reservationUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationUsageUndefined: Self = StObject.set(x, "reservationUsage", js.undefined)
    
    @scala.inline
    def setReservationUsageVarargs(value: JobStatisticsReservationUsage*): Self = StObject.set(x, "reservationUsage", js.Array(value :_*))
    
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
