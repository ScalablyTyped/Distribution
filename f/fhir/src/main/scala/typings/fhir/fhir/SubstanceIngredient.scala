package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Composition information about the substance
  */
@js.native
trait SubstanceIngredient extends BackboneElement {
  
  /**
    * Optional amount (concentration)
    */
  var quantity: js.UndefOr[Ratio] = js.native
  
  /**
    * A component of the substance
    */
  var substanceCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * A component of the substance
    */
  var substanceReference: js.UndefOr[Reference] = js.native
}
object SubstanceIngredient {
  
  @scala.inline
  def apply(): SubstanceIngredient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceIngredient]
  }
  
  @scala.inline
  implicit class SubstanceIngredientMutableBuilder[Self <: SubstanceIngredient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuantity(value: Ratio): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setSubstanceCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "substanceCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstanceCodeableConceptUndefined: Self = StObject.set(x, "substanceCodeableConcept", js.undefined)
    
    @scala.inline
    def setSubstanceReference(value: Reference): Self = StObject.set(x, "substanceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstanceReferenceUndefined: Self = StObject.set(x, "substanceReference", js.undefined)
  }
}
