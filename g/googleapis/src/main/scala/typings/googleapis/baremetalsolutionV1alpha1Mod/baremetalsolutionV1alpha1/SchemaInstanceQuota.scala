package typings.googleapis.baremetalsolutionV1alpha1Mod.baremetalsolutionV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceQuota extends StObject {
  
  /**
    * Number of machines than can be created for the given location and instance_type.
    */
  var availableMachineCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Instance type.
    */
  var instanceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Location where the quota applies.
    */
  var location: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceQuota {
  
  inline def apply(): SchemaInstanceQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceQuota]
  }
  
  extension [Self <: SchemaInstanceQuota](x: Self) {
    
    inline def setAvailableMachineCount(value: Double): Self = StObject.set(x, "availableMachineCount", value.asInstanceOf[js.Any])
    
    inline def setAvailableMachineCountNull: Self = StObject.set(x, "availableMachineCount", null)
    
    inline def setAvailableMachineCountUndefined: Self = StObject.set(x, "availableMachineCount", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeNull: Self = StObject.set(x, "instanceType", null)
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
