package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterprisesSendTestPushNotificationResponse extends js.Object {
  /** The message ID of the test push notification that was sent. */
  var messageId: js.UndefOr[String] = js.undefined
  /** The name of the Cloud Pub/Sub topic to which notifications for this enterprise's enrolled account will be sent. */
  var topicName: js.UndefOr[String] = js.undefined
}

object EnterprisesSendTestPushNotificationResponse {
  @scala.inline
  def apply(messageId: String = null, topicName: String = null): EnterprisesSendTestPushNotificationResponse = {
    val __obj = js.Dynamic.literal()
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (topicName != null) __obj.updateDynamic("topicName")(topicName)
    __obj.asInstanceOf[EnterprisesSendTestPushNotificationResponse]
  }
}

