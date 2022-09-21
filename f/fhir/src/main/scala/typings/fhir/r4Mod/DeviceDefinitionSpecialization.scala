package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionSpecialization
  extends StObject
     with BackboneElement {
  
  var _systemType: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * The standard that is used to operate and communicate.
    */
  var systemType: String
  
  /**
    * The version of the standard that is used to operate and communicate.
    */
  var version: js.UndefOr[String] = js.undefined
}
object DeviceDefinitionSpecialization {
  
  inline def apply(systemType: String): DeviceDefinitionSpecialization = {
    val __obj = js.Dynamic.literal(systemType = systemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionSpecialization]
  }
  
  extension [Self <: DeviceDefinitionSpecialization](x: Self) {
    
    inline def setSystemType(value: String): Self = StObject.set(x, "systemType", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_systemType(value: Element): Self = StObject.set(x, "_systemType", value.asInstanceOf[js.Any])
    
    inline def set_systemTypeUndefined: Self = StObject.set(x, "_systemType", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
