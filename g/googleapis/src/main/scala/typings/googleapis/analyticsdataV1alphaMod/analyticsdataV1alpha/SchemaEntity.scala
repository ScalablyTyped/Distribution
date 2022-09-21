package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntity extends StObject {
  
  /**
    * A Google Analytics GA4 property id. To learn more, see [where to find your Property ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id).
    */
  var propertyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaEntity {
  
  inline def apply(): SchemaEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntity]
  }
  
  extension [Self <: SchemaEntity](x: Self) {
    
    inline def setPropertyId(value: String): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIdNull: Self = StObject.set(x, "propertyId", null)
    
    inline def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
  }
}
