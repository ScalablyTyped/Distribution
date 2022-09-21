package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActiveMetricRestriction extends StObject {
  
  /**
    * The name of the restricted metric.
    */
  var metricName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason for this metric's restriction.
    */
  var restrictedMetricTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaActiveMetricRestriction {
  
  inline def apply(): SchemaActiveMetricRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActiveMetricRestriction]
  }
  
  extension [Self <: SchemaActiveMetricRestriction](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameNull: Self = StObject.set(x, "metricName", null)
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setRestrictedMetricTypes(value: js.Array[String]): Self = StObject.set(x, "restrictedMetricTypes", value.asInstanceOf[js.Any])
    
    inline def setRestrictedMetricTypesNull: Self = StObject.set(x, "restrictedMetricTypes", null)
    
    inline def setRestrictedMetricTypesUndefined: Self = StObject.set(x, "restrictedMetricTypes", js.undefined)
    
    inline def setRestrictedMetricTypesVarargs(value: String*): Self = StObject.set(x, "restrictedMetricTypes", js.Array(value*))
  }
}
