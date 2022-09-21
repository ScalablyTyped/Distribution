package typings.fhir.r3Mod

import typings.fhir.fhirStrings.alternate
import typings.fhir.fhirStrings.historical
import typings.fhir.fhirStrings.source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkageItem
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The resource instance being linked as part of the group.
    */
  var resource: Reference
  
  /**
    * Distinguishes which item is "source of truth" (if any) and which items are no longer considered to be current representations.
    */
  var `type`: source | alternate | historical
}
object LinkageItem {
  
  inline def apply(resource: Reference, `type`: source | alternate | historical): LinkageItem = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkageItem]
  }
  
  extension [Self <: LinkageItem](x: Self) {
    
    inline def setResource(value: Reference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setType(value: source | alternate | historical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
