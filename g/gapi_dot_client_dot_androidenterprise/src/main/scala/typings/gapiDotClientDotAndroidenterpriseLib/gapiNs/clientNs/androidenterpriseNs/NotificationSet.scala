package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NotificationSet extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#notificationSet". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The notifications received, or empty if no notifications are present. */
  var notification: js.UndefOr[js.Array[Notification]] = js.undefined
  /**
               * The notification set ID, required to mark the notification as received with the Enterprises.AcknowledgeNotification API. This will be omitted if no
               * notifications are present.
               */
  var notificationSetId: js.UndefOr[java.lang.String] = js.undefined
}

