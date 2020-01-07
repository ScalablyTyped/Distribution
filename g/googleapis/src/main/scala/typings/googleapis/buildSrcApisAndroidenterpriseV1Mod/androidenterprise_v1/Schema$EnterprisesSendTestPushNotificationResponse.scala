package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$EnterprisesSendTestPushNotificationResponse extends js.Object {
  /**
    * The message ID of the test push notification that was sent.
    */
  var messageId: js.UndefOr[String] = js.native
  /**
    * The name of the Cloud Pub/Sub topic to which notifications for this
    * enterprise&#39;s enrolled account will be sent.
    */
  var topicName: js.UndefOr[String] = js.native
}

object Schema$EnterprisesSendTestPushNotificationResponse {
  @scala.inline
  def apply(messageId: String = null, topicName: String = null): Schema$EnterprisesSendTestPushNotificationResponse = {
    val __obj = js.Dynamic.literal()
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EnterprisesSendTestPushNotificationResponse]
  }
}

