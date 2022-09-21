package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFutureReservationSpecificSKUProperties extends StObject {
  
  /**
    * Properties of the SKU instances being reserved.
    */
  var instanceProperties: js.UndefOr[SchemaAllocationSpecificSKUAllocationReservedInstanceProperties] = js.undefined
  
  /**
    * The instance template that will be used to populate the ReservedInstanceProperties of the future reservation
    */
  var sourceInstanceTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total number of instances for which capacity assurance is requested at a future time period.
    */
  var totalCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaFutureReservationSpecificSKUProperties {
  
  inline def apply(): SchemaFutureReservationSpecificSKUProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFutureReservationSpecificSKUProperties]
  }
  
  extension [Self <: SchemaFutureReservationSpecificSKUProperties](x: Self) {
    
    inline def setInstanceProperties(value: SchemaAllocationSpecificSKUAllocationReservedInstanceProperties): Self = StObject.set(x, "instanceProperties", value.asInstanceOf[js.Any])
    
    inline def setInstancePropertiesUndefined: Self = StObject.set(x, "instanceProperties", js.undefined)
    
    inline def setSourceInstanceTemplate(value: String): Self = StObject.set(x, "sourceInstanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceTemplateNull: Self = StObject.set(x, "sourceInstanceTemplate", null)
    
    inline def setSourceInstanceTemplateUndefined: Self = StObject.set(x, "sourceInstanceTemplate", js.undefined)
    
    inline def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountNull: Self = StObject.set(x, "totalCount", null)
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
