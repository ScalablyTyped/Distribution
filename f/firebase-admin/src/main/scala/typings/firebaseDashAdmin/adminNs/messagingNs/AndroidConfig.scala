package typings.firebaseDashAdmin.adminNs.messagingNs

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDashAdmin.firebaseDashAdminStrings.high
import typings.firebaseDashAdmin.firebaseDashAdminStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the Android-specific options that can be included in an
  * {@link admin.messaging.Message}.
  */
trait AndroidConfig extends js.Object {
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
  @scala.inline
  def apply(
    collapseKey: String = null,
    data: StringDictionary[String] = null,
    fcmOptions: AndroidFcmOptions = null,
    notification: AndroidNotification = null,
    priority: high | normal = null,
    restrictedPackageName: String = null,
    ttl: Int | Double = null
  ): AndroidConfig = {
    val __obj = js.Dynamic.literal()
    if (collapseKey != null) __obj.updateDynamic("collapseKey")(collapseKey)
    if (data != null) __obj.updateDynamic("data")(data)
    if (fcmOptions != null) __obj.updateDynamic("fcmOptions")(fcmOptions)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (restrictedPackageName != null) __obj.updateDynamic("restrictedPackageName")(restrictedPackageName)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidConfig]
  }
}

