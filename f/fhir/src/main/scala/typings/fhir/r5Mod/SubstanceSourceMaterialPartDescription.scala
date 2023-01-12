package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSourceMaterialPartDescription
  extends StObject
     with BackboneElement {
  
  /**
    * Entity of anatomical origin of source material within an organism.
    */
  var part: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The detailed anatomic location when the part can be extracted from different anatomical locations of the organism. Multiple alternative locations may apply.
    */
  var partLocation: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceSourceMaterialPartDescription {
  
  inline def apply(): SubstanceSourceMaterialPartDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceSourceMaterialPartDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSourceMaterialPartDescription] (val x: Self) extends AnyVal {
    
    inline def setPart(value: CodeableConcept): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartLocation(value: CodeableConcept): Self = StObject.set(x, "partLocation", value.asInstanceOf[js.Any])
    
    inline def setPartLocationUndefined: Self = StObject.set(x, "partLocation", js.undefined)
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
  }
}
