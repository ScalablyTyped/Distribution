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
  
  @scala.inline
  def apply(): SchemaEnterprisesSendTestPushNotificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterprisesSendTestPushNotificationResponse]
  }
  
  @scala.inline
  implicit class SchemaEnterprisesSendTestPushNotificationResponseMutableBuilder[Self <: SchemaEnterprisesSendTestPushNotificationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
