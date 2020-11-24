package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaJob extends js.Object {
  
  /**
    * [Required] Describes the job configuration.
    */
  var configuration: js.UndefOr[SchemaJobConfiguration] = js.native
  
  /**
    * [Output-only] A hash of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] Opaque ID field of the job
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Optional] Reference describing the unique-per-user name of the job.
    */
  var jobReference: js.UndefOr[SchemaJobReference] = js.native
  
  /**
    * [Output-only] The type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] A URL that can be used to access this resource again.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] Information about the job, including starting time and
    * ending time of the job.
    */
  var statistics: js.UndefOr[SchemaJobStatistics] = js.native
  
  /**
    * [Output-only] The status of this job. Examine this value when polling an
    * asynchronous job to see if the job is complete.
    */
  var status: js.UndefOr[SchemaJobStatus] = js.native
  
  /**
    * [Output-only] Email address of the user who ran the job.
    */
  var user_email: js.UndefOr[String] = js.native
}
object SchemaJob {
  
  @scala.inline
  def apply(): SchemaJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJob]
  }
  
  @scala.inline
  implicit class SchemaJobOps[Self <: SchemaJob] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: SchemaJobConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
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
    def setJobReference(value: SchemaJobReference): Self = this.set("jobReference", value.asInstanceOf[js.Any])
    
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
    def setStatistics(value: SchemaJobStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaJobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUser_email(value: String): Self = this.set("user_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_email: Self = this.set("user_email", js.undefined)
  }
}
