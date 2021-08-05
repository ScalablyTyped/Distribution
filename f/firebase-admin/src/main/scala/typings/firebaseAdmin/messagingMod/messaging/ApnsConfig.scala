package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApnsConfig extends StObject {
  
  /**
    * Options for features provided by the FCM SDK for iOS.
    */
  var fcmOptions: js.UndefOr[ApnsFcmOptions] = js.undefined
  
  /**
    * A collection of APNs headers. Header values must be strings.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * An APNs payload to be included in the message.
    */
  var payload: js.UndefOr[ApnsPayload] = js.undefined
}
object ApnsConfig {
  
  inline def apply(): ApnsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApnsConfig]
  }
  
  extension [Self <: ApnsConfig](x: Self) {
    
    inline def setFcmOptions(value: ApnsFcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setPayload(value: ApnsPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
