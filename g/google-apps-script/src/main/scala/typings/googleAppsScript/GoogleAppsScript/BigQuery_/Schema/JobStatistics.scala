package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatistics extends js.Object {
  
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
  implicit class JobStatisticsOps[Self <: JobStatistics] (val x: Self) extends AnyVal {
    
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
    def setCompletionRatio(value: Double): Self = this.set("completionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionRatio: Self = this.set("completionRatio", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setExtract(value: JobStatistics4): Self = this.set("extract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtract: Self = this.set("extract", js.undefined)
    
    @scala.inline
    def setLoad(value: JobStatistics3): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setNumChildJobs(value: String): Self = this.set("numChildJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumChildJobs: Self = this.set("numChildJobs", js.undefined)
    
    @scala.inline
    def setParentJobId(value: String): Self = this.set("parentJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentJobId: Self = this.set("parentJobId", js.undefined)
    
    @scala.inline
    def setQuery(value: JobStatistics2): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQuotaDefermentsVarargs(value: String*): Self = this.set("quotaDeferments", js.Array(value :_*))
    
    @scala.inline
    def setQuotaDeferments(value: js.Array[String]): Self = this.set("quotaDeferments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaDeferments: Self = this.set("quotaDeferments", js.undefined)
    
    @scala.inline
    def setReservationUsageVarargs(value: JobStatisticsReservationUsage*): Self = this.set("reservationUsage", js.Array(value :_*))
    
    @scala.inline
    def setReservationUsage(value: js.Array[JobStatisticsReservationUsage]): Self = this.set("reservationUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationUsage: Self = this.set("reservationUsage", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessed(value: String): Self = this.set("totalBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesProcessed: Self = this.set("totalBytesProcessed", js.undefined)
    
    @scala.inline
    def setTotalSlotMs(value: String): Self = this.set("totalSlotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSlotMs: Self = this.set("totalSlotMs", js.undefined)
  }
}
