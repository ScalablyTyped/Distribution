package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The device policy for a given managed device.
  */
@js.native
trait SchemaPolicy extends js.Object {
  /**
    * The auto-update policy for apps installed on the device.
    * &quot;choiceToTheUser&quot; allows the device&#39;s user to configure the
    * app update policy. &quot;always&quot; enables auto updates.
    * &quot;never&quot; disables auto updates. &quot;wifiOnly&quot; enables
    * auto updates only when the device is connected to wifi.
    */
  var autoUpdatePolicy: js.UndefOr[String] = js.native
  /**
    * The maintenance window defining when apps running in the foreground
    * should be updated.
    */
  var maintenanceWindow: js.UndefOr[SchemaMaintenanceWindow] = js.native
  /**
    * The availability granted to the device for the specified products.
    * &quot;all&quot; gives the device access to all products, regardless of
    * approval status. &quot;all&quot; does not enable automatic visibility of
    * &quot;alpha&quot; or &quot;beta&quot; tracks. &quot;whitelist&quot;
    * grants the device access the products specified in productPolicy[]. Only
    * products that are approved or products that were previously approved
    * (products with revoked approval) by the enterprise can be whitelisted. If
    * no value is provided, the availability set at the user level is applied
    * by default.
    */
  var productAvailabilityPolicy: js.UndefOr[String] = js.native
  /**
    * The list of product policies.
    */
  var productPolicy: js.UndefOr[js.Array[SchemaProductPolicy]] = js.native
}

object SchemaPolicy {
  @scala.inline
  def apply(
    autoUpdatePolicy: String = null,
    maintenanceWindow: SchemaMaintenanceWindow = null,
    productAvailabilityPolicy: String = null,
    productPolicy: js.Array[SchemaProductPolicy] = null
  ): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    if (autoUpdatePolicy != null) __obj.updateDynamic("autoUpdatePolicy")(autoUpdatePolicy.asInstanceOf[js.Any])
    if (maintenanceWindow != null) __obj.updateDynamic("maintenanceWindow")(maintenanceWindow.asInstanceOf[js.Any])
    if (productAvailabilityPolicy != null) __obj.updateDynamic("productAvailabilityPolicy")(productAvailabilityPolicy.asInstanceOf[js.Any])
    if (productPolicy != null) __obj.updateDynamic("productPolicy")(productPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPolicy]
  }
}

