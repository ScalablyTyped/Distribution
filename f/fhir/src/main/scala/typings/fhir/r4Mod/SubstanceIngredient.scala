package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceIngredient
  extends StObject
     with BackboneElement {
  
  /**
    * The amount of the ingredient in the substance - a concentration ratio.
    */
  var quantity: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Another substance that is a component of this substance.
    */
  var substanceCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Another substance that is a component of this substance.
    */
  var substanceReference: js.UndefOr[Reference] = js.undefined
}
object SubstanceIngredient {
  
  inline def apply(): SubstanceIngredient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceIngredient]
  }
  
  extension [Self <: SubstanceIngredient](x: Self) {
    
    inline def setQuantity(value: Ratio): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSubstanceCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "substanceCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setSubstanceCodeableConceptUndefined: Self = StObject.set(x, "substanceCodeableConcept", js.undefined)
    
    inline def setSubstanceReference(value: Reference): Self = StObject.set(x, "substanceReference", value.asInstanceOf[js.Any])
    
    inline def setSubstanceReferenceUndefined: Self = StObject.set(x, "substanceReference", js.undefined)
  }
}
