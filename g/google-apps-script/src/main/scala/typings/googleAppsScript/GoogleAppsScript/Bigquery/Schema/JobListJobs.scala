package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobListJobs extends js.Object {
  var configuration: js.UndefOr[JobConfiguration] = js.native
  var errorResult: js.UndefOr[ErrorProto] = js.native
  var id: js.UndefOr[String] = js.native
  var jobReference: js.UndefOr[JobReference] = js.native
  var kind: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var statistics: js.UndefOr[JobStatistics] = js.native
  var status: js.UndefOr[JobStatus] = js.native
  var user_email: js.UndefOr[String] = js.native
}

object JobListJobs {
  @scala.inline
  def apply(): JobListJobs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobListJobs]
  }
  @scala.inline
  implicit class JobListJobsOps[Self <: JobListJobs] (val x: Self) extends AnyVal {
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
    def setConfiguration(value: JobConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setErrorResult(value: ErrorProto): Self = this.set("errorResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorResult: Self = this.set("errorResult", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setJobReference(value: JobReference): Self = this.set("jobReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobReference: Self = this.set("jobReference", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStatistics(value: JobStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUser_email(value: String): Self = this.set("user_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_email: Self = this.set("user_email", js.undefined)
  }
  
}

