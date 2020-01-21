package typings.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccountId extends js.Object {
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Internal ID for the web property to which this view (profile) belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  /** View (Profile) ID. */
  var profileId: js.UndefOr[String] = js.undefined
  /** View (Profile) name. */
  var profileName: js.UndefOr[String] = js.undefined
  /** Table ID for view (profile). */
  var tableId: js.UndefOr[String] = js.undefined
  /** Web Property ID to which this view (profile) belongs. */
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object AnonAccountId {
  @scala.inline
  def apply(
    accountId: String = null,
    internalWebPropertyId: String = null,
    profileId: String = null,
    profileName: String = null,
    tableId: String = null,
    webPropertyId: String = null
  ): AnonAccountId = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (profileName != null) __obj.updateDynamic("profileName")(profileName.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccountId]
  }
}

