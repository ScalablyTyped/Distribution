package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchemaRestrictionResponse extends StObject {
  
  /**
    * All restrictions actively enforced in creating the report. For example, `purchaseRevenue` always has the restriction type `REVENUE_DATA`. However, this active response restriction is only populated if the user's custom role disallows access to `REVENUE_DATA`.
    */
  var activeMetricRestrictions: js.UndefOr[js.Array[SchemaActiveMetricRestriction]] = js.undefined
}
object SchemaSchemaRestrictionResponse {
  
  inline def apply(): SchemaSchemaRestrictionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchemaRestrictionResponse]
  }
  
  extension [Self <: SchemaSchemaRestrictionResponse](x: Self) {
    
    inline def setActiveMetricRestrictions(value: js.Array[SchemaActiveMetricRestriction]): Self = StObject.set(x, "activeMetricRestrictions", value.asInstanceOf[js.Any])
    
    inline def setActiveMetricRestrictionsUndefined: Self = StObject.set(x, "activeMetricRestrictions", js.undefined)
    
    inline def setActiveMetricRestrictionsVarargs(value: SchemaActiveMetricRestriction*): Self = StObject.set(x, "activeMetricRestrictions", js.Array(value*))
  }
}
