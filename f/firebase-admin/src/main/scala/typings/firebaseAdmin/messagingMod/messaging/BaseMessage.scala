package typings.firebaseAdmin.messagingMod.messaging

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
  
  @scala.inline
  def apply(): BaseMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMessage]
  }
  
  @scala.inline
  implicit class BaseMessageMutableBuilder[Self <: BaseMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: AndroidConfig): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setApns(value: ApnsConfig): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApnsUndefined: Self = StObject.set(x, "apns", js.undefined)
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFcmOptions(value: FcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    @scala.inline
    def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setWebpush(value: WebpushConfig): Self = StObject.set(x, "webpush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebpushUndefined: Self = StObject.set(x, "webpush", js.undefined)
  }
}
