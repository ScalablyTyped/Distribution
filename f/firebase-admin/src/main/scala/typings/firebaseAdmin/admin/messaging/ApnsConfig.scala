package typings.firebaseAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the APNs-specific options that can be included in an
  * {@link admin.messaging.Message}. Refer to
  * [Apple documentation](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CommunicatingwithAPNs.html)
  * for various headers and payload fields supported by APNs.
  */
trait ApnsConfig extends js.Object {
  /**
    * Options for features provided by the FCM SDK for iOS.
    */
  var fcmOptions: js.UndefOr[typings.firebaseAdmin.messagingMod.admin.messaging.ApnsFcmOptions] = js.undefined
  /**
    * A collection of APNs headers. Header values must be strings.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * An APNs payload to be included in the message.
    */
  var payload: js.UndefOr[typings.firebaseAdmin.messagingMod.admin.messaging.ApnsPayload] = js.undefined
}

object ApnsConfig {
  @scala.inline
  def apply(
    fcmOptions: typings.firebaseAdmin.messagingMod.admin.messaging.ApnsFcmOptions = null,
    headers: StringDictionary[String] = null,
    payload: typings.firebaseAdmin.messagingMod.admin.messaging.ApnsPayload = null
  ): ApnsConfig = {
    val __obj = js.Dynamic.literal()
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApnsConfig]
  }
}

