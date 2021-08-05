package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.firebaseAdminStrings.high
import typings.firebaseAdmin.firebaseAdminStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidConfig extends StObject {
  
  /**
    * Collapse key for the message. Collapse key serves as an identifier for a
    * group of messages that can be collapsed, so that only the last message gets
    * sent when delivery can be resumed. A maximum of four different collapse keys
    * may be active at any given time.
    */
  var collapseKey: js.UndefOr[String] = js.undefined
  
  /**
    * A collection of data fields to be included in the message. All values must
    * be strings. When provided, overrides any data fields set on the top-level
    * `admin.messaging.Message`.}
    */
  var data: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Options for features provided by the FCM SDK for Android.
    */
  var fcmOptions: js.UndefOr[AndroidFcmOptions] = js.undefined
  
  /**
    * Android notification to be included in the message.
    */
  var notification: js.UndefOr[AndroidNotification] = js.undefined
  
  /**
    * Priority of the message. Must be either `normal` or `high`.
    */
  var priority: js.UndefOr[high | normal] = js.undefined
  
  /**
    * Package name of the application where the registration tokens must match
    * in order to receive the message.
    */
  var restrictedPackageName: js.UndefOr[String] = js.undefined
  
  /**
    * Time-to-live duration of the message in milliseconds.
    */
  var ttl: js.UndefOr[Double] = js.undefined
}
object AndroidConfig {
  
  inline def apply(): AndroidConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidConfig]
  }
  
  extension [Self <: AndroidConfig](x: Self) {
    
    inline def setCollapseKey(value: String): Self = StObject.set(x, "collapseKey", value.asInstanceOf[js.Any])
    
    inline def setCollapseKeyUndefined: Self = StObject.set(x, "collapseKey", js.undefined)
    
    inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFcmOptions(value: AndroidFcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    inline def setNotification(value: AndroidNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setPriority(value: high | normal): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRestrictedPackageName(value: String): Self = StObject.set(x, "restrictedPackageName", value.asInstanceOf[js.Any])
    
    inline def setRestrictedPackageNameUndefined: Self = StObject.set(x, "restrictedPackageName", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
