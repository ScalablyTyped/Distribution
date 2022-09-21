package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckCompatibilityResponse extends StObject {
  
  /**
    * The compatibility of each dimension.
    */
  var dimensionCompatibilities: js.UndefOr[js.Array[SchemaDimensionCompatibility]] = js.undefined
  
  /**
    * The compatibility of each metric.
    */
  var metricCompatibilities: js.UndefOr[js.Array[SchemaMetricCompatibility]] = js.undefined
}
object SchemaCheckCompatibilityResponse {
  
  inline def apply(): SchemaCheckCompatibilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckCompatibilityResponse]
  }
  
  extension [Self <: SchemaCheckCompatibilityResponse](x: Self) {
    
    inline def setDimensionCompatibilities(value: js.Array[SchemaDimensionCompatibility]): Self = StObject.set(x, "dimensionCompatibilities", value.asInstanceOf[js.Any])
    
    inline def setDimensionCompatibilitiesUndefined: Self = StObject.set(x, "dimensionCompatibilities", js.undefined)
    
    inline def setDimensionCompatibilitiesVarargs(value: SchemaDimensionCompatibility*): Self = StObject.set(x, "dimensionCompatibilities", js.Array(value*))
    
    inline def setMetricCompatibilities(value: js.Array[SchemaMetricCompatibility]): Self = StObject.set(x, "metricCompatibilities", value.asInstanceOf[js.Any])
    
    inline def setMetricCompatibilitiesUndefined: Self = StObject.set(x, "metricCompatibilities", js.undefined)
    
    inline def setMetricCompatibilitiesVarargs(value: SchemaMetricCompatibility*): Self = StObject.set(x, "metricCompatibilities", js.Array(value*))
  }
}
