package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingSettings extends js.Object {
  /** The ID of the account to which these account shipping settings belong. Ignored upon update, always present in get request responses. */
  var accountId: js.UndefOr[String] = js.undefined
  /** A list of postal code groups that can be referred to in services. Optional. */
  var postalCodeGroups: js.UndefOr[js.Array[PostalCodeGroup]] = js.undefined
  /** The target account's list of services. Optional. */
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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (postalCodeGroups != null) __obj.updateDynamic("postalCodeGroups")(postalCodeGroups.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingSettings]
  }
}

