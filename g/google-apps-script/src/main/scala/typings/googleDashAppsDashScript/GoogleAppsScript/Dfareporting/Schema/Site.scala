package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Site extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var approved: js.UndefOr[Boolean] = js.undefined
  var directorySiteId: js.UndefOr[String] = js.undefined
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var keyName: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var siteContacts: js.UndefOr[js.Array[SiteContact]] = js.undefined
  var siteSettings: js.UndefOr[SiteSettings] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var videoSettings: js.UndefOr[SiteVideoSettings] = js.undefined
}

object Site {
  @scala.inline
  def apply(
    accountId: String = null,
    approved: js.UndefOr[Boolean] = js.undefined,
    directorySiteId: String = null,
    directorySiteIdDimensionValue: DimensionValue = null,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    keyName: String = null,
    kind: String = null,
    name: String = null,
    siteContacts: js.Array[SiteContact] = null,
    siteSettings: SiteSettings = null,
    subaccountId: String = null,
    videoSettings: SiteVideoSettings = null
  ): Site = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(approved)) __obj.updateDynamic("approved")(approved.asInstanceOf[js.Any])
    if (directorySiteId != null) __obj.updateDynamic("directorySiteId")(directorySiteId.asInstanceOf[js.Any])
    if (directorySiteIdDimensionValue != null) __obj.updateDynamic("directorySiteIdDimensionValue")(directorySiteIdDimensionValue.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (siteContacts != null) __obj.updateDynamic("siteContacts")(siteContacts.asInstanceOf[js.Any])
    if (siteSettings != null) __obj.updateDynamic("siteSettings")(siteSettings.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (videoSettings != null) __obj.updateDynamic("videoSettings")(videoSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
}

