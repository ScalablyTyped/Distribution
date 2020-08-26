package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  /** [Required] Describes the job configuration. */
  var configuration: js.UndefOr[JobConfiguration] = js.native
  /** [Output-only] A hash of this resource. */
  var etag: js.UndefOr[String] = js.native
  /** [Output-only] Opaque ID field of the job */
  var id: js.UndefOr[String] = js.native
  /** [Optional] Reference describing the unique-per-user name of the job. */
  var jobReference: js.UndefOr[JobReference] = js.native
  /** [Output-only] The type of the resource. */
  var kind: js.UndefOr[String] = js.native
  /** [Output-only] A URL that can be used to access this resource again. */
  var selfLink: js.UndefOr[String] = js.native
  /** [Output-only] Information about the job, including starting time and ending time of the job. */
  var statistics: js.UndefOr[JobStatistics] = js.native
  /** [Output-only] The status of this job. Examine this value when polling an asynchronous job to see if the job is complete. */
  var status: js.UndefOr[JobStatus] = js.native
  /** [Output-only] Email address of the user who ran the job. */
  var user_email: js.UndefOr[String] = js.native
}

object Job {
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
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
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
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

