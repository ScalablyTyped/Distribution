package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFutureReservationStatusSpecificSKUProperties extends StObject {
  
  /**
    * ID of the instance template used to populate the Future Reservation properties.
    */
  var sourceInstanceTemplateId: js.UndefOr[String | Null] = js.undefined
}
object SchemaFutureReservationStatusSpecificSKUProperties {
  
  inline def apply(): SchemaFutureReservationStatusSpecificSKUProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFutureReservationStatusSpecificSKUProperties]
  }
  
  extension [Self <: SchemaFutureReservationStatusSpecificSKUProperties](x: Self) {
    
    inline def setSourceInstanceTemplateId(value: String): Self = StObject.set(x, "sourceInstanceTemplateId", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceTemplateIdNull: Self = StObject.set(x, "sourceInstanceTemplateId", null)
    
    inline def setSourceInstanceTemplateIdUndefined: Self = StObject.set(x, "sourceInstanceTemplateId", js.undefined)
  }
}
