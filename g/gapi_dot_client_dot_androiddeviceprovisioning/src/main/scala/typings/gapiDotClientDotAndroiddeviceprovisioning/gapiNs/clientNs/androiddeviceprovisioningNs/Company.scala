package typings.gapiDotClientDotAndroiddeviceprovisioning.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Company extends js.Object {
  /**
    * Input only. Optional. Email address of customer's users in the admin role.
    * Each email address must be associated with a Google Account.
    */
  var adminEmails: js.UndefOr[js.Array[String]] = js.undefined
  /** Output only. The ID of the company. Assigned by the server. */
  var companyId: js.UndefOr[String] = js.undefined
  /**
    * Required. The name of the company. For example _XYZ Corp_. Characters
    * allowed are: Latin letters, numerals, hyphens, and spaces. Displayed to the
    * customer's employees in the zero-touch enrollment portal.
    */
  var companyName: js.UndefOr[String] = js.undefined
  /**
    * Output only. The API resource name of the company in the format
    * `partners/[PARTNER_ID]/customers/[CUSTOMER_ID]`. Assigned by the server.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Input only. Email address of customer's users in the owner role. At least
    * one `owner_email` is required. Each email address must be associated with a
    * Google Account. Owners share the same access as admins but can also add,
    * delete, and edit your organization's portal users.
    */
  var ownerEmails: js.UndefOr[js.Array[String]] = js.undefined
}

object Company {
  @scala.inline
  def apply(
    adminEmails: js.Array[String] = null,
    companyId: String = null,
    companyName: String = null,
    name: String = null,
    ownerEmails: js.Array[String] = null
  ): Company = {
    val __obj = js.Dynamic.literal()
    if (adminEmails != null) __obj.updateDynamic("adminEmails")(adminEmails)
    if (companyId != null) __obj.updateDynamic("companyId")(companyId)
    if (companyName != null) __obj.updateDynamic("companyName")(companyName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ownerEmails != null) __obj.updateDynamic("ownerEmails")(ownerEmails)
    __obj.asInstanceOf[Company]
  }
}

