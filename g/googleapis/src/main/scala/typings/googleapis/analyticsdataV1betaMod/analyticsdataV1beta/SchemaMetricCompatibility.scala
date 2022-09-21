package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricCompatibility extends StObject {
  
  /**
    * The compatibility of this metric. If the compatibility is COMPATIBLE, this metric can be successfully added to the report.
    */
  var compatibility: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The metric metadata contains the API name for this compatibility information. The metric metadata also contains other helpful information like the UI name and description.
    */
  var metricMetadata: js.UndefOr[SchemaMetricMetadata] = js.undefined
}
object SchemaMetricCompatibility {
  
  inline def apply(): SchemaMetricCompatibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricCompatibility]
  }
  
  extension [Self <: SchemaMetricCompatibility](x: Self) {
    
    inline def setCompatibility(value: String): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityNull: Self = StObject.set(x, "compatibility", null)
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    inline def setMetricMetadata(value: SchemaMetricMetadata): Self = StObject.set(x, "metricMetadata", value.asInstanceOf[js.Any])
    
    inline def setMetricMetadataUndefined: Self = StObject.set(x, "metricMetadata", js.undefined)
  }
}
