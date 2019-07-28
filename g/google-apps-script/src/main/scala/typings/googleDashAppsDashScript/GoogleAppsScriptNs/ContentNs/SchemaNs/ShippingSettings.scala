package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingSettings extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var postalCodeGroups: js.UndefOr[js.Array[PostalCodeGroup]] = js.undefined
  var services: js.UndefOr[js.Array[Service]] = js.undefined
}

object ShippingSettings {
  @scala.inline
  def apply(
    accountId: String = null,
    postalCodeGroups: js.Array[PostalCodeGroup] = null,
    services: js.Array[Service] = null
  ): ShippingSettings = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (postalCodeGroups != null) __obj.updateDynamic("postalCodeGroups")(postalCodeGroups)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[ShippingSettings]
  }
}

