package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Link to a resource that concerns the same actual person
  */
trait PersonLink
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'assurance'.
    */
  var _assurance: js.UndefOr[Element] = js.undefined
  
  /**
    * level1 | level2 | level3 | level4
    */
  var assurance: js.UndefOr[code] = js.undefined
  
  /**
    * The resource to which this actual person is associated
    */
  var target: Reference
}
object PersonLink {
  
  inline def apply(target: Reference): PersonLink = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonLink]
  }
  
  extension [Self <: PersonLink](x: Self) {
    
    inline def setAssurance(value: code): Self = StObject.set(x, "assurance", value.asInstanceOf[js.Any])
    
    inline def setAssuranceUndefined: Self = StObject.set(x, "assurance", js.undefined)
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def set_assurance(value: Element): Self = StObject.set(x, "_assurance", value.asInstanceOf[js.Any])
    
    inline def set_assuranceUndefined: Self = StObject.set(x, "_assurance", js.undefined)
  }
}
