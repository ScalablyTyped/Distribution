package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuotaExceededInfo extends StObject {
  
  /**
    * The map holding related quota dimensions.
    */
  var dimensions: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Current effective quota limit. The limit's unit depends on the quota type or metric.
    */
  var limit: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the quota limit.
    */
  var limitName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Compute Engine quota metric name.
    */
  var metricName: js.UndefOr[String | Null] = js.undefined
}
object SchemaQuotaExceededInfo {
  
  inline def apply(): SchemaQuotaExceededInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaExceededInfo]
  }
  
  extension [Self <: SchemaQuotaExceededInfo](x: Self) {
    
    inline def setDimensions(value: StringDictionary[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsNull: Self = StObject.set(x, "dimensions", null)
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitName(value: String): Self = StObject.set(x, "limitName", value.asInstanceOf[js.Any])
    
    inline def setLimitNameNull: Self = StObject.set(x, "limitName", null)
    
    inline def setLimitNameUndefined: Self = StObject.set(x, "limitName", js.undefined)
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameNull: Self = StObject.set(x, "metricName", null)
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
