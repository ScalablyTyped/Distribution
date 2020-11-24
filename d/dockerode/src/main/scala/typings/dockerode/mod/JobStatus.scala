package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatus extends js.Object {
  
  var JobIteration: Version = js.native
  
  var LastExecution: js.UndefOr[String] = js.native
}
object JobStatus {
  
  @scala.inline
  def apply(JobIteration: Version): JobStatus = {
    val __obj = js.Dynamic.literal(JobIteration = JobIteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatus]
  }
  
  @scala.inline
  implicit class JobStatusOps[Self <: JobStatus] (val x: Self) extends AnyVal {
    
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
    def setJobIteration(value: Version): Self = this.set("JobIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastExecution(value: String): Self = this.set("LastExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastExecution: Self = this.set("LastExecution", js.undefined)
  }
}
