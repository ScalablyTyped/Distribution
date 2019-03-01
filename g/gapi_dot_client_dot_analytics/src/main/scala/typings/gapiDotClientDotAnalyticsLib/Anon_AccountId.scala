package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountId extends js.Object {
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for the web property to which this view (profile) belongs. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** View (Profile) ID. */
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  /** View (Profile) name. */
  var profileName: js.UndefOr[java.lang.String] = js.undefined
  /** Table ID for view (profile). */
  var tableId: js.UndefOr[java.lang.String] = js.undefined
  /** Web Property ID to which this view (profile) belongs. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccountId {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    profileId: java.lang.String = null,
    profileName: java.lang.String = null,
    tableId: java.lang.String = null,
    webPropertyId: java.lang.String = null
  ): Anon_AccountId = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    if (profileName != null) __obj.updateDynamic("profileName")(profileName)
    if (tableId != null) __obj.updateDynamic("tableId")(tableId)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[Anon_AccountId]
  }
}

