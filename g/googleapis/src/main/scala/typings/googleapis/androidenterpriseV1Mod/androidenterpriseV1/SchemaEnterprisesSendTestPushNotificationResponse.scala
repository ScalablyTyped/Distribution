package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnterprisesSendTestPushNotificationResponse extends StObject {
  
  /**
    * The message ID of the test push notification that was sent.
    */
  var messageId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Cloud Pub/Sub topic to which notifications for this
    * enterprise&#39;s enrolled account will be sent.
    */
  var topicName: js.UndefOr[String] = js.undefined
}
object SchemaEnterprisesSendTestPushNotificationResponse {
  
  inline def apply(): SchemaEnterprisesSendTestPushNotificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterprisesSendTestPushNotificationResponse]
  }
  
  extension [Self <: SchemaEnterprisesSendTestPushNotificationResponse](x: Self) {
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
