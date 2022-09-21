package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesGetmetadata
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the metadata to retrieve. This name field is specified in the URL path and not URL parameters. Property is a numeric Google Analytics GA4 Property identifier. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id). Example: properties/1234/metadata Set the Property ID to 0 for dimensions and metrics common to all properties. In this special mode, this method will not return custom dimensions and metrics.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesGetmetadata {
  
  inline def apply(): ParamsResourcePropertiesGetmetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesGetmetadata]
  }
  
  extension [Self <: ParamsResourcePropertiesGetmetadata](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
