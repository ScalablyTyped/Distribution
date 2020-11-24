package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCreateConferenceRequest extends js.Object {
  
  /**
    * The conference solution, such as Hangouts or Hangouts Meet.
    */
  var conferenceSolutionKey: js.UndefOr[SchemaConferenceSolutionKey] = js.native
  
  /**
    * The client-generated unique ID for this request. Clients should
    * regenerate this ID for every new request. If an ID provided is the same
    * as for the previous request, the request is ignored.
    */
  var requestId: js.UndefOr[String] = js.native
  
  /**
    * The status of the conference create request.
    */
  var status: js.UndefOr[SchemaConferenceRequestStatus] = js.native
}
object SchemaCreateConferenceRequest {
  
  @scala.inline
  def apply(): SchemaCreateConferenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateConferenceRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateConferenceRequestOps[Self <: SchemaCreateConferenceRequest] (val x: Self) extends AnyVal {
    
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
    def setConferenceSolutionKey(value: SchemaConferenceSolutionKey): Self = this.set("conferenceSolutionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceSolutionKey: Self = this.set("conferenceSolutionKey", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaConferenceRequestStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
