package typings.firebaseDashAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the options that can be provided when sending a
  * message via the FCM legacy APIs.
  *
  * See [Build send requests](/docs/cloud-messaging/send-message)
  * for code samples and detailed documentation.
  */
trait MessagingOptions
  extends /* key */ StringDictionary[js.UndefOr[js.Any]] {
  /**
    * String identifying a group of messages (for example, "Updates Available")
    * that can be collapsed, so that only the last message gets sent when delivery
    * can be resumed. This is used to avoid sending too many of the same messages
    * when the device comes back online or becomes active.
    *
    * There is no guarantee of the order in which messages get sent.
    *
    * A maximum of four different collapse keys is allowed at any given time. This
    * means FCM server can simultaneously store four different
    * send-to-sync messages per client app. If you exceed this number, there is no
    * guarantee which four collapse keys the FCM server will keep.
    *
    * **Default value:** None
    */
  var collapseKey: js.UndefOr[String] = js.undefined
  /**
    * On iOS, use this field to represent `content-available` in the APNs payload.
    * When a notification or data message is sent and this is set to `true`, an
    * inactive client app is awoken. On Android, data messages wake the app by
    * default. On Chrome, this flag is currently not supported.
    *
    * **Default value:** `false`
    */
  var contentAvailable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the message should actually be sent. When set to `true`,
    * allows developers to test a request without actually sending a message. When
    * set to `false`, the message will be sent.
    *
    * **Default value:** `false`
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * On iOS, use this field to represent `mutable-content` in the APNs payload.
    * When a notification is sent and this is set to `true`, the content of the
    * notification can be modified before it is displayed, using a
    * [Notification Service app extension](https://developer.apple.com/reference/usernotifications/unnotificationserviceextension)
    *
    * On Android and Web, this parameter will be ignored.
    *
    * **Default value:** `false`
    */
  var mutableContent: js.UndefOr[Boolean] = js.undefined
  /**
    * The priority of the message. Valid values are `"normal"` and `"high".` On
    * iOS, these correspond to APNs priorities `5` and `10`.
    *
    * By default, notification messages are sent with high priority, and data
    * messages are sent with normal priority. Normal priority optimizes the client
    * app's battery consumption and should be used unless immediate delivery is
    * required. For messages with normal priority, the app may receive the message
    * with unspecified delay.
    *
    * When a message is sent with high priority, it is sent immediately, and the
    * app can wake a sleeping device and open a network connection to your server.
    *
    * For more information, see
    * [Setting the priority of a message](/docs/cloud-messaging/concept-options#setting-the-priority-of-a-message).
    *
    * **Default value:** `"high"` for notification messages, `"normal"` for data
    * messages
    */
  var priority: js.UndefOr[String] = js.undefined
  /**
    * The package name of the application which the registration tokens must match
    * in order to receive the message.
    *
    * **Default value:** None
    */
  var restrictedPackageName: js.UndefOr[String] = js.undefined
  /**
    * How long (in seconds) the message should be kept in FCM storage if the device
    * is offline. The maximum time to live supported is four weeks, and the default
    * value is also four weeks. For more information, see
    * [Setting the lifespan of a message](/docs/cloud-messaging/concept-options#ttl).
    *
    * **Default value:** `2419200` (representing four weeks, in seconds)
    */
  var timeToLive: js.UndefOr[Double] = js.undefined
}

object MessagingOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[js.Any]] = null,
    collapseKey: String = null,
    contentAvailable: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    mutableContent: js.UndefOr[Boolean] = js.undefined,
    priority: String = null,
    restrictedPackageName: String = null,
    timeToLive: Int | Double = null
  ): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapseKey != null) __obj.updateDynamic("collapseKey")(collapseKey.asInstanceOf[js.Any])
    if (!js.isUndefined(contentAvailable)) __obj.updateDynamic("contentAvailable")(contentAvailable.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(mutableContent)) __obj.updateDynamic("mutableContent")(mutableContent.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (restrictedPackageName != null) __obj.updateDynamic("restrictedPackageName")(restrictedPackageName.asInstanceOf[js.Any])
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingOptions]
  }
}

