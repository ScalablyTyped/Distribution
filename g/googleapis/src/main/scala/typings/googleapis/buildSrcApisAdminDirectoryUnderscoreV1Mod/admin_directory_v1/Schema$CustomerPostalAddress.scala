package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for postal address of a customer.
  */
@js.native
trait Schema$CustomerPostalAddress extends js.Object {
  /**
    * A customer&#39;s physical address. The address can be composed of one to
    * three lines.
    */
  var addressLine1: js.UndefOr[String] = js.native
  /**
    * Address line 2 of the address.
    */
  var addressLine2: js.UndefOr[String] = js.native
  /**
    * Address line 3 of the address.
    */
  var addressLine3: js.UndefOr[String] = js.native
  /**
    * The customer contact&#39;s name.
    */
  var contactName: js.UndefOr[String] = js.native
  /**
    * This is a required property. For countryCode information see the ISO 3166
    * country code elements.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * Name of the locality. An example of a locality value is the city of San
    * Francisco.
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * The company or company division name.
    */
  var organizationName: js.UndefOr[String] = js.native
  /**
    * The postal code. A postalCode example is a postal zip code such as 10009.
    * This is in accordance with -
    * http://portablecontacts.net/draft-spec.html#address_element.
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * Name of the region. An example of a region value is NY for the state of
    * New York.
    */
  var region: js.UndefOr[String] = js.native
}

object Schema$CustomerPostalAddress {
  @scala.inline
  def apply(
    addressLine1: String = null,
    addressLine2: String = null,
    addressLine3: String = null,
    contactName: String = null,
    countryCode: String = null,
    locality: String = null,
    organizationName: String = null,
    postalCode: String = null,
    region: String = null
  ): Schema$CustomerPostalAddress = {
    val __obj = js.Dynamic.literal()
    if (addressLine1 != null) __obj.updateDynamic("addressLine1")(addressLine1.asInstanceOf[js.Any])
    if (addressLine2 != null) __obj.updateDynamic("addressLine2")(addressLine2.asInstanceOf[js.Any])
    if (addressLine3 != null) __obj.updateDynamic("addressLine3")(addressLine3.asInstanceOf[js.Any])
    if (contactName != null) __obj.updateDynamic("contactName")(contactName.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (organizationName != null) __obj.updateDynamic("organizationName")(organizationName.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerPostalAddress]
  }
}

