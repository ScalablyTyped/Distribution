package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Customer Resource object in Directory API.
  */
@js.native
trait Schema$Customer extends js.Object {
  /**
    * The customer&#39;s secondary contact email address. This email address
    * cannot be on the same domain as the customerDomain
    */
  var alternateEmail: js.UndefOr[String] = js.native
  /**
    * The customer&#39;s creation time (Readonly)
    */
  var customerCreationTime: js.UndefOr[String] = js.native
  /**
    * The customer&#39;s primary domain name string. Do not include the www
    * prefix when creating a new customer.
    */
  var customerDomain: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The unique ID for the customer&#39;s G Suite account. (Readonly)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a customer. Value: admin#directory#customer
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The customer&#39;s ISO 639-2 language code. The default value is en-US
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The customer&#39;s contact phone number in E.164 format.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * The customer&#39;s postal address information.
    */
  var postalAddress: js.UndefOr[Schema$CustomerPostalAddress] = js.native
}

object Schema$Customer {
  @scala.inline
  def apply(
    alternateEmail: String = null,
    customerCreationTime: String = null,
    customerDomain: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    language: String = null,
    phoneNumber: String = null,
    postalAddress: Schema$CustomerPostalAddress = null
  ): Schema$Customer = {
    val __obj = js.Dynamic.literal()
    if (alternateEmail != null) __obj.updateDynamic("alternateEmail")(alternateEmail.asInstanceOf[js.Any])
    if (customerCreationTime != null) __obj.updateDynamic("customerCreationTime")(customerCreationTime.asInstanceOf[js.Any])
    if (customerDomain != null) __obj.updateDynamic("customerDomain")(customerDomain.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Customer]
  }
}

