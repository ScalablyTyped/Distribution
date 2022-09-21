package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterAdvertisedIpRange extends StObject {
  
  /**
    * User-specified description for the IP range.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IP range to advertise. The value must be a CIDR-formatted string.
    */
  var range: js.UndefOr[String | Null] = js.undefined
}
object SchemaRouterAdvertisedIpRange {
  
  inline def apply(): SchemaRouterAdvertisedIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterAdvertisedIpRange]
  }
  
  extension [Self <: SchemaRouterAdvertisedIpRange](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeNull: Self = StObject.set(x, "range", null)
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
