package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobStatistics extends js.Object {
  /** [Output-only] Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs. */
  var creationTime: js.UndefOr[String] = js.native
  /** [Output-only] End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state. */
  var endTime: js.UndefOr[String] = js.native
  /** [Output-only] Statistics for an extract job. */
  var extract: js.UndefOr[JobStatistics4] = js.native
  /** [Output-only] Statistics for a load job. */
  var load: js.UndefOr[JobStatistics3] = js.native
  /** [Output-only] Statistics for a query job. */
  var query: js.UndefOr[JobStatistics2] = js.native
  /**
    * [Output-only] Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to
    * either RUNNING or DONE.
    */
  var startTime: js.UndefOr[String] = js.native
  /** [Output-only] [Deprecated] Use the bytes processed in the query statistics instead. */
  var totalBytesProcessed: js.UndefOr[String] = js.native
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
    def setQuery(value: JobStatistics2): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setTotalBytesProcessed(value: String): Self = this.set("totalBytesProcessed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalBytesProcessed: Self = this.set("totalBytesProcessed", js.undefined)
  }
  
}

