package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventResult extends js.Object {
  
  /**
    * Date/time of the event.
    */
  var eventTimestamp: js.UndefOr[String] = js.native
  
  /**
    * Reason for failure, if the event failed.
    */
  var failureDescription: js.UndefOr[String] = js.native
  
  /**
    * Event status.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Failure status code, if the event failed.
    */
  var vendorFailureStatusCode: js.UndefOr[String] = js.native
}
object EventResult {
  
  @scala.inline
  def apply(): EventResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventResult]
  }
  
  @scala.inline
  implicit class EventResultOps[Self <: EventResult] (val x: Self) extends AnyVal {
    
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
    def setEventTimestamp(value: String): Self = this.set("eventTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTimestamp: Self = this.set("eventTimestamp", js.undefined)
    
    @scala.inline
    def setFailureDescription(value: String): Self = this.set("failureDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureDescription: Self = this.set("failureDescription", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setVendorFailureStatusCode(value: String): Self = this.set("vendorFailureStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorFailureStatusCode: Self = this.set("vendorFailureStatusCode", js.undefined)
  }
}
