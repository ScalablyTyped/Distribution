package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaJobStatus extends js.Object {
  
  /**
    * [Output-only] Final error result of the job. If present, indicates that
    * the job has completed and was unsuccessful.
    */
  var errorResult: js.UndefOr[SchemaErrorProto] = js.native
  
  /**
    * [Output-only] The first errors encountered during the running of the job.
    * The final message includes the number of errors that caused the process
    * to stop. Errors here do not necessarily mean that the job has completed
    * or was unsuccessful.
    */
  var errors: js.UndefOr[js.Array[SchemaErrorProto]] = js.native
  
  /**
    * [Output-only] Running state of the job.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaJobStatus {
  
  @scala.inline
  def apply(): SchemaJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatus]
  }
  
  @scala.inline
  implicit class SchemaJobStatusOps[Self <: SchemaJobStatus] (val x: Self) extends AnyVal {
    
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
    def setErrorResult(value: SchemaErrorProto): Self = this.set("errorResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorResult: Self = this.set("errorResult", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaErrorProto*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[SchemaErrorProto]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
