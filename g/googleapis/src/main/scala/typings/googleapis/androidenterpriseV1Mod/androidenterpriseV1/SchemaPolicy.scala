package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The device policy for a given managed device.
  */
trait SchemaPolicy extends StObject {
  
  /**
    * The auto-update policy for apps installed on the device.
    * &quot;choiceToTheUser&quot; allows the device&#39;s user to configure the
    * app update policy. &quot;always&quot; enables auto updates.
    * &quot;never&quot; disables auto updates. &quot;wifiOnly&quot; enables
    * auto updates only when the device is connected to wifi.
    */
  var autoUpdatePolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The maintenance window defining when apps running in the foreground
    * should be updated.
    */
  var maintenanceWindow: js.UndefOr[SchemaMaintenanceWindow] = js.undefined
  
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
  var productAvailabilityPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The list of product policies.
    */
  var productPolicy: js.UndefOr[js.Array[SchemaProductPolicy]] = js.undefined
}
object SchemaPolicy {
  
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  
  @scala.inline
  implicit class SchemaPolicyMutableBuilder[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpdatePolicy(value: String): Self = StObject.set(x, "autoUpdatePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdatePolicyUndefined: Self = StObject.set(x, "autoUpdatePolicy", js.undefined)
    
    @scala.inline
    def setMaintenanceWindow(value: SchemaMaintenanceWindow): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
    
    @scala.inline
    def setProductAvailabilityPolicy(value: String): Self = StObject.set(x, "productAvailabilityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductAvailabilityPolicyUndefined: Self = StObject.set(x, "productAvailabilityPolicy", js.undefined)
    
    @scala.inline
    def setProductPolicy(value: js.Array[SchemaProductPolicy]): Self = StObject.set(x, "productPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductPolicyUndefined: Self = StObject.set(x, "productPolicy", js.undefined)
    
    @scala.inline
    def setProductPolicyVarargs(value: SchemaProductPolicy*): Self = StObject.set(x, "productPolicy", js.Array(value :_*))
  }
}
