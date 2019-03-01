package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingSettings extends js.Object {
  /** The ID of the account to which these account shipping settings belong. Ignored upon update, always present in get request responses. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** A list of postal code groups that can be referred to in services. Optional. */
  var postalCodeGroups: js.UndefOr[js.Array[PostalCodeGroup]] = js.undefined
  /** The target account's list of services. Optional. */
  var services: js.UndefOr[js.Array[Service]] = js.undefined
}

object ShippingSettings {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
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

