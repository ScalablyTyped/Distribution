package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionLink
  extends StObject
     with BackboneElement {
  
  /**
    * A reference to the linked device.
    */
  var relatedDevice: CodeableReference
  
  /**
    * The type indicates the relationship of the related device to the device instance.
    */
  var relation: Coding
}
object DeviceDefinitionLink {
  
  inline def apply(relatedDevice: CodeableReference, relation: Coding): DeviceDefinitionLink = {
    val __obj = js.Dynamic.literal(relatedDevice = relatedDevice.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDefinitionLink] (val x: Self) extends AnyVal {
    
    inline def setRelatedDevice(value: CodeableReference): Self = StObject.set(x, "relatedDevice", value.asInstanceOf[js.Any])
    
    inline def setRelation(value: Coding): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
  }
}
