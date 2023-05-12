package typings.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityTypeResourceType extends StObject {
  
  var capabilityType: Any
  
  var resourceType: typings.fhirKitClient.mod.ResourceType
}
object CapabilityTypeResourceType {
  
  inline def apply(capabilityType: Any, resourceType: typings.fhirKitClient.mod.ResourceType): CapabilityTypeResourceType = {
    val __obj = js.Dynamic.literal(capabilityType = capabilityType.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityTypeResourceType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilityTypeResourceType] (val x: Self) extends AnyVal {
    
    inline def setCapabilityType(value: Any): Self = StObject.set(x, "capabilityType", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
