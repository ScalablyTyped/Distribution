package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicy extends StObject {
  
  /**
    * Deprecated. Use autoUpdateMode instead. When autoUpdateMode is set to AUTO_UPDATE_POSTPONED or AUTO_UPDATE_HIGH_PRIORITY, this field has no effect. "choiceToTheUser" allows the device's user to configure the app update policy. "always" enables auto updates. "never" disables auto updates. "wifiOnly" enables auto updates only when the device is connected to wifi.
    */
  var autoUpdatePolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the device reports app states to the EMM. The default value is "deviceReportDisabled".
    */
  var deviceReportPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maintenance window defining when apps running in the foreground should be updated.
    */
  var maintenanceWindow: js.UndefOr[SchemaMaintenanceWindow] = js.undefined
  
  /**
    * The availability granted to the device for the specified products. "all" gives the device access to all products, regardless of approval status. "all" does not enable automatic visibility of "alpha" or "beta" tracks. "whitelist" grants the device access the products specified in productPolicy[]. Only products that are approved or products that were previously approved (products with revoked approval) by the enterprise can be whitelisted. If no value is provided, the availability set at the user level is applied by default.
    */
  var productAvailabilityPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of product policies. The productAvailabilityPolicy needs to be set to WHITELIST or ALL for the product policies to be applied.
    */
  var productPolicy: js.UndefOr[js.Array[SchemaProductPolicy]] = js.undefined
}
object SchemaPolicy {
  
  inline def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  
  extension [Self <: SchemaPolicy](x: Self) {
    
    inline def setAutoUpdatePolicy(value: String): Self = StObject.set(x, "autoUpdatePolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdatePolicyNull: Self = StObject.set(x, "autoUpdatePolicy", null)
    
    inline def setAutoUpdatePolicyUndefined: Self = StObject.set(x, "autoUpdatePolicy", js.undefined)
    
    inline def setDeviceReportPolicy(value: String): Self = StObject.set(x, "deviceReportPolicy", value.asInstanceOf[js.Any])
    
    inline def setDeviceReportPolicyNull: Self = StObject.set(x, "deviceReportPolicy", null)
    
    inline def setDeviceReportPolicyUndefined: Self = StObject.set(x, "deviceReportPolicy", js.undefined)
    
    inline def setMaintenanceWindow(value: SchemaMaintenanceWindow): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
    
    inline def setProductAvailabilityPolicy(value: String): Self = StObject.set(x, "productAvailabilityPolicy", value.asInstanceOf[js.Any])
    
    inline def setProductAvailabilityPolicyNull: Self = StObject.set(x, "productAvailabilityPolicy", null)
    
    inline def setProductAvailabilityPolicyUndefined: Self = StObject.set(x, "productAvailabilityPolicy", js.undefined)
    
    inline def setProductPolicy(value: js.Array[SchemaProductPolicy]): Self = StObject.set(x, "productPolicy", value.asInstanceOf[js.Any])
    
    inline def setProductPolicyUndefined: Self = StObject.set(x, "productPolicy", js.undefined)
    
    inline def setProductPolicyVarargs(value: SchemaProductPolicy*): Self = StObject.set(x, "productPolicy", js.Array(value*))
  }
}
