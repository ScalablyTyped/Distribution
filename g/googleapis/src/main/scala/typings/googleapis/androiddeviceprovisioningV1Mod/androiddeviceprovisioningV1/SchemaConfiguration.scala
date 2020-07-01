package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration collects the provisioning options for Android devices. Each
  * configuration combines the following:  * The EMM device policy controller
  * (DPC) installed on the devices. * EMM policies enforced on the devices. *
  * Metadata displayed on the device to help users during setup.  Customers can
  * add as many configurations as they need. However, zero-touch enrollment
  * works best when a customer sets a default configuration that&#39;s applied
  * to any new devices the organization purchases.
  */
@js.native
trait SchemaConfiguration extends js.Object {
  /**
    * Required. The name of the organization. Zero-touch enrollment shows this
    * organization name to device users during device provisioning.
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Output only. The ID of the configuration. Assigned by the server.
    */
  var configurationId: js.UndefOr[String] = js.native
  /**
    * Required. A short name that describes the configuration&#39;s purpose.
    * For example, _Sales team_ or _Temporary employees_. The zero-touch
    * enrollment portal displays this name to IT admins.
    */
  var configurationName: js.UndefOr[String] = js.native
  /**
    * Required. The email address that device users can contact to get help.
    * Zero-touch enrollment shows this email address to device users before
    * device provisioning. The value is validated on input.
    */
  var contactEmail: js.UndefOr[String] = js.native
  /**
    * Required. The telephone number that device users can call, using another
    * device, to get help. Zero-touch enrollment shows this number to device
    * users before device provisioning. Accepts numerals, spaces, the plus
    * sign, hyphens, and parentheses.
    */
  var contactPhone: js.UndefOr[String] = js.native
  /**
    * A message, containing one or two sentences, to help device users get help
    * or give them more details about what’s happening to their device.
    * Zero-touch enrollment shows this message before the device is
    * provisioned.
    */
  var customMessage: js.UndefOr[String] = js.native
  /**
    * The JSON-formatted EMM provisioning extras that are passed to the DPC.
    */
  var dpcExtras: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the selected DPC (device policy
    * controller) in the format `customers/[CUSTOMER_ID]/dpcs/x. To list the
    * supported DPCs, call `customers.dpcs.list`.
    */
  var dpcResourcePath: js.UndefOr[String] = js.native
  /**
    * Required. Whether this is the default configuration that zero-touch
    * enrollment applies to any new devices the organization purchases in the
    * future. Only one customer configuration can be the default. Setting this
    * value to `true`, changes the previous default configuration&#39;s
    * `isDefault` value to `false`.
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  /**
    * Output only. The API resource name in the format
    * `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. Assigned by
    * the server.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaConfiguration {
  @scala.inline
  def apply(
    companyName: String = null,
    configurationId: String = null,
    configurationName: String = null,
    contactEmail: String = null,
    contactPhone: String = null,
    customMessage: String = null,
    dpcExtras: String = null,
    dpcResourcePath: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): SchemaConfiguration = {
    val __obj = js.Dynamic.literal()
    if (companyName != null) __obj.updateDynamic("companyName")(companyName.asInstanceOf[js.Any])
    if (configurationId != null) __obj.updateDynamic("configurationId")(configurationId.asInstanceOf[js.Any])
    if (configurationName != null) __obj.updateDynamic("configurationName")(configurationName.asInstanceOf[js.Any])
    if (contactEmail != null) __obj.updateDynamic("contactEmail")(contactEmail.asInstanceOf[js.Any])
    if (contactPhone != null) __obj.updateDynamic("contactPhone")(contactPhone.asInstanceOf[js.Any])
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage.asInstanceOf[js.Any])
    if (dpcExtras != null) __obj.updateDynamic("dpcExtras")(dpcExtras.asInstanceOf[js.Any])
    if (dpcResourcePath != null) __obj.updateDynamic("dpcResourcePath")(dpcResourcePath.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConfiguration]
  }
}

