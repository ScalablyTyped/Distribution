package typings.firebaseDashAdmin.adminNs.messagingNs

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
    * A collection of APNs headers. Header values must be strings.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * An APNs payload to be included in the message.
    */
  var payload: js.UndefOr[ApnsPayload] = js.undefined
}

object ApnsConfig {
  @scala.inline
  def apply(headers: StringDictionary[String] = null, payload: ApnsPayload = null): ApnsConfig = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[ApnsConfig]
  }
}

