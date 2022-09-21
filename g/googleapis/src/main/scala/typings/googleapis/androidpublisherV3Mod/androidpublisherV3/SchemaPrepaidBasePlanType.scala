package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrepaidBasePlanType extends StObject {
  
  /**
    * Required. Subscription period, specified in ISO 8601 format. For a list of acceptable billing periods, refer to the help center.
    */
  var billingPeriodDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether users should be able to extend this prepaid base plan in Google Play surfaces. Defaults to TIME_EXTENSION_ACTIVE if not specified.
    */
  var timeExtension: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrepaidBasePlanType {
  
  inline def apply(): SchemaPrepaidBasePlanType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrepaidBasePlanType]
  }
  
  extension [Self <: SchemaPrepaidBasePlanType](x: Self) {
    
    inline def setBillingPeriodDuration(value: String): Self = StObject.set(x, "billingPeriodDuration", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodDurationNull: Self = StObject.set(x, "billingPeriodDuration", null)
    
    inline def setBillingPeriodDurationUndefined: Self = StObject.set(x, "billingPeriodDuration", js.undefined)
    
    inline def setTimeExtension(value: String): Self = StObject.set(x, "timeExtension", value.asInstanceOf[js.Any])
    
    inline def setTimeExtensionNull: Self = StObject.set(x, "timeExtension", null)
    
    inline def setTimeExtensionUndefined: Self = StObject.set(x, "timeExtension", js.undefined)
  }
}
