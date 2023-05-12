package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSpecialization
  extends StObject
     with BackboneElement {
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * The standard that is used to operate and communicate.
    */
  var systemType: CodeableConcept
  
  /**
    * The version of the standard that is used to operate and communicate.
    */
  var version: js.UndefOr[String] = js.undefined
}
object DeviceSpecialization {
  
  inline def apply(systemType: CodeableConcept): DeviceSpecialization = {
    val __obj = js.Dynamic.literal(systemType = systemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSpecialization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceSpecialization] (val x: Self) extends AnyVal {
    
    inline def setSystemType(value: CodeableConcept): Self = StObject.set(x, "systemType", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
