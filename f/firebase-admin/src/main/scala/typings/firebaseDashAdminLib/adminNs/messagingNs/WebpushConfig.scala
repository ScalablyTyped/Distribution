package typings
package firebaseDashAdminLib.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the WebPush protocol options that can be included in an
  * {@link admin.messaging.Message}.
  */
trait WebpushConfig extends js.Object {
  /**
    * A collection of data fields.
    */
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
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
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * A WebPush notification payload to be included in the message.
    */
  var notification: js.UndefOr[WebpushNotification] = js.undefined
}

object WebpushConfig {
  @scala.inline
  def apply(
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    fcmOptions: WebpushFcmOptions = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    notification: WebpushNotification = null
  ): WebpushConfig = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    __obj.asInstanceOf[WebpushConfig]
  }
}

