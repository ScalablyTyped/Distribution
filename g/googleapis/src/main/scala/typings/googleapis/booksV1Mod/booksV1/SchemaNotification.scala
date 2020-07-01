package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNotification extends js.Object {
  var body: js.UndefOr[String] = js.native
  /**
    * The list of crm experiment ids.
    */
  var crmExperimentIds: js.UndefOr[js.Array[String]] = js.native
  var doc_id: js.UndefOr[String] = js.native
  var doc_type: js.UndefOr[String] = js.native
  var dont_show_notification: js.UndefOr[Boolean] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var is_document_mature: js.UndefOr[Boolean] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  var notificationGroup: js.UndefOr[String] = js.native
  var notification_type: js.UndefOr[String] = js.native
  var pcampaign_id: js.UndefOr[String] = js.native
  var reason: js.UndefOr[String] = js.native
  var show_notification_settings_action: js.UndefOr[Boolean] = js.native
  var targetUrl: js.UndefOr[String] = js.native
  var timeToExpireMs: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object SchemaNotification {
  @scala.inline
  def apply(
    body: String = null,
    crmExperimentIds: js.Array[String] = null,
    doc_id: String = null,
    doc_type: String = null,
    dont_show_notification: js.UndefOr[Boolean] = js.undefined,
    iconUrl: String = null,
    is_document_mature: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    notificationGroup: String = null,
    notification_type: String = null,
    pcampaign_id: String = null,
    reason: String = null,
    show_notification_settings_action: js.UndefOr[Boolean] = js.undefined,
    targetUrl: String = null,
    timeToExpireMs: String = null,
    title: String = null
  ): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (crmExperimentIds != null) __obj.updateDynamic("crmExperimentIds")(crmExperimentIds.asInstanceOf[js.Any])
    if (doc_id != null) __obj.updateDynamic("doc_id")(doc_id.asInstanceOf[js.Any])
    if (doc_type != null) __obj.updateDynamic("doc_type")(doc_type.asInstanceOf[js.Any])
    if (!js.isUndefined(dont_show_notification)) __obj.updateDynamic("dont_show_notification")(dont_show_notification.get.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(is_document_mature)) __obj.updateDynamic("is_document_mature")(is_document_mature.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notificationGroup != null) __obj.updateDynamic("notificationGroup")(notificationGroup.asInstanceOf[js.Any])
    if (notification_type != null) __obj.updateDynamic("notification_type")(notification_type.asInstanceOf[js.Any])
    if (pcampaign_id != null) __obj.updateDynamic("pcampaign_id")(pcampaign_id.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (!js.isUndefined(show_notification_settings_action)) __obj.updateDynamic("show_notification_settings_action")(show_notification_settings_action.get.asInstanceOf[js.Any])
    if (targetUrl != null) __obj.updateDynamic("targetUrl")(targetUrl.asInstanceOf[js.Any])
    if (timeToExpireMs != null) __obj.updateDynamic("timeToExpireMs")(timeToExpireMs.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNotification]
  }
}

