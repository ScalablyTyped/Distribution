package typings.googleapis.billingbudgetsV1Mod.billingbudgetsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBillingBudgetsV1CustomPeriod extends StObject {
  
  /**
    * Optional. The end date of the time period. Budgets with elapsed end date won't be processed. If unset, specifies to track all usage incurred since the start_date.
    */
  var endDate: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * Required. The start date must be after January 1, 2017.
    */
  var startDate: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
}
object SchemaGoogleCloudBillingBudgetsV1CustomPeriod {
  
  inline def apply(): SchemaGoogleCloudBillingBudgetsV1CustomPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBillingBudgetsV1CustomPeriod]
  }
  
  extension [Self <: SchemaGoogleCloudBillingBudgetsV1CustomPeriod](x: Self) {
    
    inline def setEndDate(value: SchemaGoogleTypeDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: SchemaGoogleTypeDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
