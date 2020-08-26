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
  def apply(): SchemaNotificationSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationSet]
  }
  @scala.inline
  implicit class SchemaNotificationSetOps[Self <: SchemaNotificationSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNotificationVarargs(value: SchemaNotification*): Self = this.set("notification", js.Array(value :_*))
    @scala.inline
    def setNotification(value: js.Array[SchemaNotification]): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setNotificationSetId(value: String): Self = this.set("notificationSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationSetId: Self = this.set("notificationSetId", js.undefined)
  }
  
}

