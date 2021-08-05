package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This reservation type allows to pre allocate specific instance
  * configuration.
  */
trait SchemaAllocationSpecificSKUReservation extends StObject {
  
  /**
    * Specifies number of resources that are allocated.
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * [OutputOnly] Indicates how many resource are in use.
    */
  var inUseCount: js.UndefOr[String] = js.undefined
  
  /**
    * The instance properties for this specific sku reservation.
    */
  var instanceProperties: js.UndefOr[SchemaAllocationSpecificSKUAllocationReservedInstanceProperties] = js.undefined
}
object SchemaAllocationSpecificSKUReservation {
  
  inline def apply(): SchemaAllocationSpecificSKUReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationSpecificSKUReservation]
  }
  
  extension [Self <: SchemaAllocationSpecificSKUReservation](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setInUseCount(value: String): Self = StObject.set(x, "inUseCount", value.asInstanceOf[js.Any])
    
    inline def setInUseCountUndefined: Self = StObject.set(x, "inUseCount", js.undefined)
    
    inline def setInstanceProperties(value: SchemaAllocationSpecificSKUAllocationReservedInstanceProperties): Self = StObject.set(x, "instanceProperties", value.asInstanceOf[js.Any])
    
    inline def setInstancePropertiesUndefined: Self = StObject.set(x, "instanceProperties", js.undefined)
  }
}
