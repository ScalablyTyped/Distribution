package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaDataProfileInfo extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  var profileId: js.UndefOr[String] = js.undefined
  var profileName: js.UndefOr[String] = js.undefined
  var tableId: js.UndefOr[String] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object GaDataProfileInfo {
  @scala.inline
  def apply(
    accountId: String = null,
    internalWebPropertyId: String = null,
    profileId: String = null,
    profileName: String = null,
    tableId: String = null,
    webPropertyId: String = null
  ): GaDataProfileInfo = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (profileName != null) __obj.updateDynamic("profileName")(profileName.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaDataProfileInfo]
  }
}

