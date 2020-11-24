package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaJobReference extends js.Object {
  
  /**
    * [Required] The ID of the job. The ID must contain only letters (a-z,
    * A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length
    * is 1,024 characters.
    */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * The geographic location of the job. See details at
    * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * [Required] The ID of the project containing this job.
    */
  var projectId: js.UndefOr[String] = js.native
}
object SchemaJobReference {
  
  @scala.inline
  def apply(): SchemaJobReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobReference]
  }
  
  @scala.inline
  implicit class SchemaJobReferenceOps[Self <: SchemaJobReference] (val x: Self) extends AnyVal {
    
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
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
}
