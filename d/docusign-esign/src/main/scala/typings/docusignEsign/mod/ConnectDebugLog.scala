package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectDebugLog extends StObject {
  
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
  implicit class ConnectDebugLogMutableBuilder[Self <: ConnectDebugLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectConfig(value: String): Self = StObject.set(x, "connectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectConfigUndefined: Self = StObject.set(x, "connectConfig", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setEventDateTime(value: String): Self = StObject.set(x, "eventDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDateTimeUndefined: Self = StObject.set(x, "eventDateTime", js.undefined)
    
    @scala.inline
    def setEventDescription(value: String): Self = StObject.set(x, "eventDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDescriptionUndefined: Self = StObject.set(x, "eventDescription", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
