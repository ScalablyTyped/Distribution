package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource returned by the PullNotificationSet API, which contains a
  * collection of notifications for enterprises associated with the service
  * account authenticated for the request.
  */
@js.native
trait SchemaNotificationSet extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#notificationSet&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The notifications received, or empty if no notifications are present.
    */
  var notification: js.UndefOr[js.Array[SchemaNotification]] = js.native
  /**
    * The notification set ID, required to mark the notification as received
    * with the Enterprises.AcknowledgeNotification API. This will be omitted if
    * no notifications are present.
    */
  var notificationSetId: js.UndefOr[String] = js.native
}

object SchemaNotificationSet {
  @scala.inline
  def apply(
    kind: String = null,
    notification: js.Array[SchemaNotification] = null,
    notificationSetId: String = null
  ): SchemaNotificationSet = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (notificationSetId != null) __obj.updateDynamic("notificationSetId")(notificationSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNotificationSet]
  }
}

