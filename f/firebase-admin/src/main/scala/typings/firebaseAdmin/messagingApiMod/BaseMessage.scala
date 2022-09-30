package typings.firebaseAdmin.messagingApiMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMessage extends StObject {
  
  var android: js.UndefOr[AndroidConfig] = js.undefined
  
  var apns: js.UndefOr[ApnsConfig] = js.undefined
  
  var data: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var fcmOptions: js.UndefOr[FcmOptions] = js.undefined
  
  var notification: js.UndefOr[Notification] = js.undefined
  
  var webpush: js.UndefOr[WebpushConfig] = js.undefined
}
object BaseMessage {
  
  inline def apply(): BaseMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMessage]
  }
  
  extension [Self <: BaseMessage](x: Self) {
    
    inline def setAndroid(value: AndroidConfig): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setApns(value: ApnsConfig): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    inline def setApnsUndefined: Self = StObject.set(x, "apns", js.undefined)
    
    inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFcmOptions(value: FcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setWebpush(value: WebpushConfig): Self = StObject.set(x, "webpush", value.asInstanceOf[js.Any])
    
    inline def setWebpushUndefined: Self = StObject.set(x, "webpush", js.undefined)
  }
}
