package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManufacturedItemDefinitionComponentConstituent
  extends StObject
     with BackboneElement {
  
  /**
    * The measurable amount of the substance, expressable in different ways (e.g. by mass or volume).
    */
  var amount: js.UndefOr[js.Array[Quantity]] = js.undefined
  
  /**
    * The function of this constituent within the component e.g. binder.
    */
  var function: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The ingredient that is the constituent of the given component.
    */
  var hasIngredient: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The physical location of the constituent/ingredient within the component. Example – if the component is the bead in the capsule, then the location would be where the ingredient resides within the product part – intragranular, extra-granular, etc.
    */
  var location: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ManufacturedItemDefinitionComponentConstituent {
  
  inline def apply(): ManufacturedItemDefinitionComponentConstituent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManufacturedItemDefinitionComponentConstituent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManufacturedItemDefinitionComponentConstituent] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: js.Array[Quantity]): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setAmountVarargs(value: Quantity*): Self = StObject.set(x, "amount", js.Array(value*))
    
    inline def setFunction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setFunctionVarargs(value: CodeableConcept*): Self = StObject.set(x, "function", js.Array(value*))
    
    inline def setHasIngredient(value: js.Array[CodeableReference]): Self = StObject.set(x, "hasIngredient", value.asInstanceOf[js.Any])
    
    inline def setHasIngredientUndefined: Self = StObject.set(x, "hasIngredient", js.undefined)
    
    inline def setHasIngredientVarargs(value: CodeableReference*): Self = StObject.set(x, "hasIngredient", js.Array(value*))
    
    inline def setLocation(value: js.Array[CodeableConcept]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: CodeableConcept*): Self = StObject.set(x, "location", js.Array(value*))
  }
}
