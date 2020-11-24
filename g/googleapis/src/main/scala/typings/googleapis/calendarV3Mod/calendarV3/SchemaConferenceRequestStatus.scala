package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaConferenceRequestStatus extends js.Object {
  
  /**
    * The current status of the conference create request. Read-only. The
    * possible values are:   - &quot;pending&quot;: the conference create
    * request is still being processed. - &quot;success&quot;: the conference
    * create request succeeded, the entry points are populated. -
    * &quot;failure&quot;: the conference create request failed, there are no
    * entry points.
    */
  var statusCode: js.UndefOr[String] = js.native
}
object SchemaConferenceRequestStatus {
  
  @scala.inline
  def apply(): SchemaConferenceRequestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceRequestStatus]
  }
  
  @scala.inline
  implicit class SchemaConferenceRequestStatusOps[Self <: SchemaConferenceRequestStatus] (val x: Self) extends AnyVal {
    
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
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}
