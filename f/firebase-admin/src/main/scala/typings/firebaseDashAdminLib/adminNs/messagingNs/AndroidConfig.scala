package typings
package firebaseDashAdminLib.adminNs.messagingNs

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
  var collapseKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A collection of data fields to be included in the message. All values must
    * be strings. When provided, overrides any data fields set on the top-level
    * `admin.messaging.Message`.}
    */
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Android notification to be included in the message.
    */
  var notification: js.UndefOr[AndroidNotification] = js.undefined
  /**
    * Priority of the message. Must be either `normal` or `high`.
    */
  var priority: js.UndefOr[
    firebaseDashAdminLib.firebaseDashAdminLibStrings.high | firebaseDashAdminLib.firebaseDashAdminLibStrings.normal
  ] = js.undefined
  /**
    * Package name of the application where the registration tokens must match
    * in order to receive the message.
    */
  var restrictedPackageName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Time-to-live duration of the message in milliseconds.
    */
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object AndroidConfig {
  @scala.inline
  def apply(
    collapseKey: java.lang.String = null,
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    notification: AndroidNotification = null,
    priority: firebaseDashAdminLib.firebaseDashAdminLibStrings.high | firebaseDashAdminLib.firebaseDashAdminLibStrings.normal = null,
    restrictedPackageName: java.lang.String = null,
    ttl: scala.Int | scala.Double = null
  ): AndroidConfig = {
    val __obj = js.Dynamic.literal()
    if (collapseKey != null) __obj.updateDynamic("collapseKey")(collapseKey)
    if (data != null) __obj.updateDynamic("data")(data)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (restrictedPackageName != null) __obj.updateDynamic("restrictedPackageName")(restrictedPackageName)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidConfig]
  }
}

