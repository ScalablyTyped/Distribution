package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  /** The list of crm experiment ids. */
  var crmExperimentIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var doc_id: js.UndefOr[java.lang.String] = js.undefined
  var doc_type: js.UndefOr[java.lang.String] = js.undefined
  var dont_show_notification: js.UndefOr[scala.Boolean] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var notificationGroup: js.UndefOr[java.lang.String] = js.undefined
  var notification_type: js.UndefOr[java.lang.String] = js.undefined
  var pcampaign_id: js.UndefOr[java.lang.String] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var show_notification_settings_action: js.UndefOr[scala.Boolean] = js.undefined
  var targetUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    crmExperimentIds: js.Array[java.lang.String] = null,
    doc_id: java.lang.String = null,
    doc_type: java.lang.String = null,
    dont_show_notification: js.UndefOr[scala.Boolean] = js.undefined,
    iconUrl: java.lang.String = null,
    kind: java.lang.String = null,
    notificationGroup: java.lang.String = null,
    notification_type: java.lang.String = null,
    pcampaign_id: java.lang.String = null,
    reason: java.lang.String = null,
    show_notification_settings_action: js.UndefOr[scala.Boolean] = js.undefined,
    targetUrl: java.lang.String = null,
    title: java.lang.String = null
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

