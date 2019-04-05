package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Site extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var approved: js.UndefOr[scala.Boolean] = js.undefined
  var directorySiteId: js.UndefOr[java.lang.String] = js.undefined
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var keyName: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var siteContacts: js.UndefOr[js.Array[SiteContact]] = js.undefined
  var siteSettings: js.UndefOr[SiteSettings] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  var videoSettings: js.UndefOr[SiteVideoSettings] = js.undefined
}

object Site {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    approved: js.UndefOr[scala.Boolean] = js.undefined,
    directorySiteId: java.lang.String = null,
    directorySiteIdDimensionValue: DimensionValue = null,
    id: java.lang.String = null,
    idDimensionValue: DimensionValue = null,
    keyName: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    siteContacts: js.Array[SiteContact] = null,
    siteSettings: SiteSettings = null,
    subaccountId: java.lang.String = null,
    videoSettings: SiteVideoSettings = null
  ): Site = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(approved)) __obj.updateDynamic("approved")(approved)
    if (directorySiteId != null) __obj.updateDynamic("directorySiteId")(directorySiteId)
    if (directorySiteIdDimensionValue != null) __obj.updateDynamic("directorySiteIdDimensionValue")(directorySiteIdDimensionValue)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (keyName != null) __obj.updateDynamic("keyName")(keyName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (siteContacts != null) __obj.updateDynamic("siteContacts")(siteContacts)
    if (siteSettings != null) __obj.updateDynamic("siteSettings")(siteSettings)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (videoSettings != null) __obj.updateDynamic("videoSettings")(videoSettings)
    __obj.asInstanceOf[Site]
  }
}

