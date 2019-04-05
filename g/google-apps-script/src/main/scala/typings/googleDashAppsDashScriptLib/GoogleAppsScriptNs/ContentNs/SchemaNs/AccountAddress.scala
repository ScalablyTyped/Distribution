package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAddress extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var locality: js.UndefOr[java.lang.String] = js.undefined
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var streetAddress: js.UndefOr[java.lang.String] = js.undefined
}

object AccountAddress {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    locality: java.lang.String = null,
    postalCode: java.lang.String = null,
    region: java.lang.String = null,
    streetAddress: java.lang.String = null
  ): AccountAddress = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (region != null) __obj.updateDynamic("region")(region)
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress)
    __obj.asInstanceOf[AccountAddress]
  }
}

