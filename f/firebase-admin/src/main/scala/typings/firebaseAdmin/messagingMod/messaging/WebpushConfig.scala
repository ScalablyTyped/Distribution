package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpushConfig extends StObject {
  
  /**
    * A collection of data fields.
    */
  var data: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Options for features provided by the FCM SDK for Web.
    */
  var fcmOptions: js.UndefOr[WebpushFcmOptions] = js.undefined
  
  /**
    * A collection of WebPush headers. Header values must be strings.
    *
    * See [WebPush specification](https://tools.ietf.org/html/rfc8030#section-5)
    * for supported headers.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * A WebPush notification payload to be included in the message.
    */
  var notification: js.UndefOr[WebpushNotification] = js.undefined
}
object WebpushConfig {
  
  inline def apply(): WebpushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpushConfig]
  }
  
  extension [Self <: WebpushConfig](x: Self) {
    
    inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFcmOptions(value: WebpushFcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setNotification(value: WebpushNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
  }
}
