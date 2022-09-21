package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllocationSpecificSKUReservation extends StObject {
  
  /**
    * [Output Only] Indicates how many instances are actually usable currently.
    */
  var assuredCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the number of resources that are allocated.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Indicates how many instances are in use.
    */
  var inUseCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The instance properties for the reservation.
    */
  var instanceProperties: js.UndefOr[SchemaAllocationSpecificSKUAllocationReservedInstanceProperties] = js.undefined
}
object SchemaAllocationSpecificSKUReservation {
  
  inline def apply(): SchemaAllocationSpecificSKUReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationSpecificSKUReservation]
  }
  
  extension [Self <: SchemaAllocationSpecificSKUReservation](x: Self) {
    
    inline def setAssuredCount(value: String): Self = StObject.set(x, "assuredCount", value.asInstanceOf[js.Any])
    
    inline def setAssuredCountNull: Self = StObject.set(x, "assuredCount", null)
    
    inline def setAssuredCountUndefined: Self = StObject.set(x, "assuredCount", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setInUseCount(value: String): Self = StObject.set(x, "inUseCount", value.asInstanceOf[js.Any])
    
    inline def setInUseCountNull: Self = StObject.set(x, "inUseCount", null)
    
    inline def setInUseCountUndefined: Self = StObject.set(x, "inUseCount", js.undefined)
    
    inline def setInstanceProperties(value: SchemaAllocationSpecificSKUAllocationReservedInstanceProperties): Self = StObject.set(x, "instanceProperties", value.asInstanceOf[js.Any])
    
    inline def setInstancePropertiesUndefined: Self = StObject.set(x, "instanceProperties", js.undefined)
  }
}
