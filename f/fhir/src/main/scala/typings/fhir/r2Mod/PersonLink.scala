package typings.fhir.r2Mod

import typings.fhir.fhirStrings.level1
import typings.fhir.fhirStrings.level2
import typings.fhir.fhirStrings.level3
import typings.fhir.fhirStrings.level4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonLink
  extends StObject
     with BackboneElement {
  
  var _assurance: js.UndefOr[Element] = js.undefined
  
  /**
    * Level of assurance that this link is actually associated with the target resource.
    */
  var assurance: js.UndefOr[level1 | level2 | level3 | level4] = js.undefined
  
  /**
    * The resource to which this actual person is associated.
    */
  var target: Reference
}
object PersonLink {
  
  inline def apply(target: Reference): PersonLink = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonLink]
  }
  
  extension [Self <: PersonLink](x: Self) {
    
    inline def setAssurance(value: level1 | level2 | level3 | level4): Self = StObject.set(x, "assurance", value.asInstanceOf[js.Any])
    
    inline def setAssuranceUndefined: Self = StObject.set(x, "assurance", js.undefined)
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def set_assurance(value: Element): Self = StObject.set(x, "_assurance", value.asInstanceOf[js.Any])
    
    inline def set_assuranceUndefined: Self = StObject.set(x, "_assurance", js.undefined)
  }
}
