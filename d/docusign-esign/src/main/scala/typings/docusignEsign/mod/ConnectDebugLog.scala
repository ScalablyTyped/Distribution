package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectDebugLog extends js.Object {
  
  /**
    * The name of the Connect configuration.
    */
  var connectConfig: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The UTC date and time of the event.
    */
  var eventDateTime: js.UndefOr[String] = js.native
  
  /**
    * A description of the event.
    */
  var eventDescription: js.UndefOr[String] = js.native
  
  /**
    * Log output.
    */
  var payload: js.UndefOr[String] = js.native
}
object ConnectDebugLog {
  
  @scala.inline
  def apply(): ConnectDebugLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectDebugLog]
  }
  
  @scala.inline
  implicit class ConnectDebugLogOps[Self <: ConnectDebugLog] (val x: Self) extends AnyVal {
    
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
    def setConnectConfig(value: String): Self = this.set("connectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectConfig: Self = this.set("connectConfig", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setEventDateTime(value: String): Self = this.set("eventDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDateTime: Self = this.set("eventDateTime", js.undefined)
    
    @scala.inline
    def setEventDescription(value: String): Self = this.set("eventDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDescription: Self = this.set("eventDescription", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
