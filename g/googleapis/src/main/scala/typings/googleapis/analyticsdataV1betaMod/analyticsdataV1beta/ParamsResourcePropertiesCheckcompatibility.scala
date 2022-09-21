package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesCheckcompatibility
  extends StObject
     with StandardParameters {
  
  /**
    * A Google Analytics GA4 property identifier whose events are tracked. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). `property` should be the same value as in your `runReport` request. Example: properties/1234 Set the Property ID to 0 for compatibility checking on dimensions and metrics common to all properties. In this special mode, this method will not return custom dimensions and metrics.
    */
  var property: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCheckCompatibilityRequest] = js.undefined
}
object ParamsResourcePropertiesCheckcompatibility {
  
  inline def apply(): ParamsResourcePropertiesCheckcompatibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesCheckcompatibility]
  }
  
  extension [Self <: ParamsResourcePropertiesCheckcompatibility](x: Self) {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRequestBody(value: SchemaCheckCompatibilityRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
