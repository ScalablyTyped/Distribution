package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  /** The list of crm experiment ids. */
  var crmExperimentIds: js.UndefOr[js.Array[String]] = js.undefined
  var doc_id: js.UndefOr[String] = js.undefined
  var doc_type: js.UndefOr[String] = js.undefined
  var dont_show_notification: js.UndefOr[Boolean] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  var notificationGroup: js.UndefOr[String] = js.undefined
  var notification_type: js.UndefOr[String] = js.undefined
  var pcampaign_id: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var show_notification_settings_action: js.UndefOr[Boolean] = js.undefined
  var targetUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    body: String = null,
    crmExperimentIds: js.Array[String] = null,
    doc_id: String = null,
    doc_type: String = null,
    dont_show_notification: js.UndefOr[Boolean] = js.undefined,
    iconUrl: String = null,
    kind: String = null,
    notificationGroup: String = null,
    notification_type: String = null,
    pcampaign_id: String = null,
    reason: String = null,
    show_notification_settings_action: js.UndefOr[Boolean] = js.undefined,
    targetUrl: String = null,
    title: String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (crmExperimentIds != null) __obj.updateDynamic("crmExperimentIds")(crmExperimentIds)
    if (doc_id != null) __obj.updateDynamic("doc_id")(doc_id)
    if (doc_type != null) __obj.updateDynamic("doc_type")(doc_type)
    if (!js.isUndefined(dont_show_notification)) __obj.updateDynamic("dont_show_notification")(dont_show_notification)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (notificationGroup != null) __obj.updateDynamic("notificationGroup")(notificationGroup)
    if (notification_type != null) __obj.updateDynamic("notification_type")(notification_type)
    if (pcampaign_id != null) __obj.updateDynamic("pcampaign_id")(pcampaign_id)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (!js.isUndefined(show_notification_settings_action)) __obj.updateDynamic("show_notification_settings_action")(show_notification_settings_action)
    if (targetUrl != null) __obj.updateDynamic("targetUrl")(targetUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Notification]
  }
}

