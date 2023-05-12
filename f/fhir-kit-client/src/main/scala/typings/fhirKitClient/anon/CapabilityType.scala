package typings.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityType extends StObject {
  
  var capabilityType: String
  
  var resourceType: js.UndefOr[typings.fhirKitClient.mod.ResourceType] = js.undefined
  
  var where: js.UndefOr[Code] = js.undefined
}
object CapabilityType {
  
  inline def apply(capabilityType: String): CapabilityType = {
    val __obj = js.Dynamic.literal(capabilityType = capabilityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilityType] (val x: Self) extends AnyVal {
    
    inline def setCapabilityType(value: String): Self = StObject.set(x, "capabilityType", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setWhere(value: Code): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
