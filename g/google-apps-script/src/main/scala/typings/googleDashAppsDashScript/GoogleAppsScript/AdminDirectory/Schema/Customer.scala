package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Customer extends js.Object {
  var alternateEmail: js.UndefOr[String] = js.undefined
  var customerCreationTime: js.UndefOr[String] = js.undefined
  var customerDomain: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var postalAddress: js.UndefOr[CustomerPostalAddress] = js.undefined
}

object Customer {
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
    postalAddress: CustomerPostalAddress = null
  ): Customer = {
    val __obj = js.Dynamic.literal()
    if (alternateEmail != null) __obj.updateDynamic("alternateEmail")(alternateEmail)
    if (customerCreationTime != null) __obj.updateDynamic("customerCreationTime")(customerCreationTime)
    if (customerDomain != null) __obj.updateDynamic("customerDomain")(customerDomain)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (language != null) __obj.updateDynamic("language")(language)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress)
    __obj.asInstanceOf[Customer]
  }
}

