package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionHasPart
  extends StObject
     with BackboneElement {
  
  /**
    * Number of instances of the component device in the current device.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Reference to the device that is part of the current device.
    */
  var reference: Reference
}
object DeviceDefinitionHasPart {
  
  inline def apply(reference: Reference): DeviceDefinitionHasPart = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionHasPart]
  }
  
  extension [Self <: DeviceDefinitionHasPart](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
