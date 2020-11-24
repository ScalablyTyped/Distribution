package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information related to tracking the progress on resolving the error.
  */
@js.native
trait SchemaTrackingIssue extends js.Object {
  
  /**
    * A URL pointing to a related entry in an issue tracking system. Example:
    * https://github.com/user/project/issues/4
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaTrackingIssue {
  
  @scala.inline
  def apply(): SchemaTrackingIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrackingIssue]
  }
  
  @scala.inline
  implicit class SchemaTrackingIssueOps[Self <: SchemaTrackingIssue] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
