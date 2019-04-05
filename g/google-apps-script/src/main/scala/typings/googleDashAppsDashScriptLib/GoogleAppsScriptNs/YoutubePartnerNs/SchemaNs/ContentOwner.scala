package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentOwner extends js.Object {
  var conflictNotificationEmail: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var disputeNotificationEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var fingerprintReportNotificationEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var primaryNotificationEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ContentOwner {
  @scala.inline
  def apply(
    conflictNotificationEmail: java.lang.String = null,
    displayName: java.lang.String = null,
    disputeNotificationEmails: js.Array[java.lang.String] = null,
    fingerprintReportNotificationEmails: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    primaryNotificationEmails: js.Array[java.lang.String] = null
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

