package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectDebugLog extends StObject {
  
  /**
    * The name of the Connect configuration.
    */
  var connectConfig: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The UTC date and time of the event.
    */
  var eventDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the event.
    */
  var eventDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Log output.
    */
  var payload: js.UndefOr[String] = js.undefined
}
object ConnectDebugLog {
  
  inline def apply(): ConnectDebugLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectDebugLog]
  }
  
  extension [Self <: ConnectDebugLog](x: Self) {
    
    inline def setConnectConfig(value: String): Self = StObject.set(x, "connectConfig", value.asInstanceOf[js.Any])
    
    inline def setConnectConfigUndefined: Self = StObject.set(x, "connectConfig", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setEventDateTime(value: String): Self = StObject.set(x, "eventDateTime", value.asInstanceOf[js.Any])
    
    inline def setEventDateTimeUndefined: Self = StObject.set(x, "eventDateTime", js.undefined)
    
    inline def setEventDescription(value: String): Self = StObject.set(x, "eventDescription", value.asInstanceOf[js.Any])
    
    inline def setEventDescriptionUndefined: Self = StObject.set(x, "eventDescription", js.undefined)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
