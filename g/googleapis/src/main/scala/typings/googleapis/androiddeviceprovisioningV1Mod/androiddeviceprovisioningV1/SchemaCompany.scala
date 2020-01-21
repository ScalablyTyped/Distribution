package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reseller, vendor, or customer in the zero-touch reseller and customer
  * APIs.
  */
@js.native
trait SchemaCompany extends js.Object {
  /**
    * Input only. Optional. Email address of customer&#39;s users in the admin
    * role. Each email address must be associated with a Google Account.
    */
  var adminEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The ID of the company. Assigned by the server.
    */
  var companyId: js.UndefOr[String] = js.native
  /**
    * Required. The name of the company. For example _XYZ Corp_. Displayed to
    * the company&#39;s employees in the zero-touch enrollment portal.
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Output only. The API resource name of the company. The resource name is
    * one of the following formats:  *
    * `partners/[PARTNER_ID]/customers/[CUSTOMER_ID]` *
    * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]` *
    * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]/customers/[CUSTOMER_ID]`
    * Assigned by the server.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Input only. Email address of customer&#39;s users in the owner role. At
    * least one `owner_email` is required. Each email address must be
    * associated with a Google Account. Owners share the same access as admins
    * but can also add, delete, and edit your organization&#39;s portal users.
    */
  var ownerEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. Whether any user from the company has accepted the latest
    * Terms of Service (ToS). See TermsStatus.
    */
  var termsStatus: js.UndefOr[String] = js.native
}

object SchemaCompany {
  @scala.inline
  def apply(
    adminEmails: js.Array[String] = null,
    companyId: String = null,
    companyName: String = null,
    name: String = null,
    ownerEmails: js.Array[String] = null,
    termsStatus: String = null
  ): SchemaCompany = {
    val __obj = js.Dynamic.literal()
    if (adminEmails != null) __obj.updateDynamic("adminEmails")(adminEmails.asInstanceOf[js.Any])
    if (companyId != null) __obj.updateDynamic("companyId")(companyId.asInstanceOf[js.Any])
    if (companyName != null) __obj.updateDynamic("companyName")(companyName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerEmails != null) __obj.updateDynamic("ownerEmails")(ownerEmails.asInstanceOf[js.Any])
    if (termsStatus != null) __obj.updateDynamic("termsStatus")(termsStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompany]
  }
}

