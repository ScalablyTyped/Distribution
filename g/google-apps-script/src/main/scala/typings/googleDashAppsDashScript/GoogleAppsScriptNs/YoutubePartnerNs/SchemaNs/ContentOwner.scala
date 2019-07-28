package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentOwner extends js.Object {
  var conflictNotificationEmail: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var disputeNotificationEmails: js.UndefOr[js.Array[String]] = js.undefined
  var fingerprintReportNotificationEmails: js.UndefOr[js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var primaryNotificationEmails: js.UndefOr[js.Array[String]] = js.undefined
}

object ContentOwner {
  @scala.inline
  def apply(
    conflictNotificationEmail: String = null,
    displayName: String = null,
    disputeNotificationEmails: js.Array[String] = null,
    fingerprintReportNotificationEmails: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    primaryNotificationEmails: js.Array[String] = null
  ): ContentOwner = {
    val __obj = js.Dynamic.literal()
    if (conflictNotificationEmail != null) __obj.updateDynamic("conflictNotificationEmail")(conflictNotificationEmail)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (disputeNotificationEmails != null) __obj.updateDynamic("disputeNotificationEmails")(disputeNotificationEmails)
    if (fingerprintReportNotificationEmails != null) __obj.updateDynamic("fingerprintReportNotificationEmails")(fingerprintReportNotificationEmails)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (primaryNotificationEmails != null) __obj.updateDynamic("primaryNotificationEmails")(primaryNotificationEmails)
    __obj.asInstanceOf[ContentOwner]
  }
}

