package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceVersion
  extends StObject
     with BackboneElement {
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Note that the module of the device would not need to be tracked as a separate device, e.g., using different UDI, thus would typically involve one or more software modules. For example, a device may involve two software modules each on a different version.
    */
  var component: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The type of the device version, e.g. manufacturer, approved, internal.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The version text.
    */
  var value: String
}
object DeviceVersion {
  
  inline def apply(value: String): DeviceVersion = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceVersion]
  }
  
  extension [Self <: DeviceVersion](x: Self) {
    
    inline def setComponent(value: Identifier): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
