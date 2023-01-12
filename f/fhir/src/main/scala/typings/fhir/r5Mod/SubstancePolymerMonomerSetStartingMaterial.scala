package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstancePolymerMonomerSetStartingMaterial
  extends StObject
     with BackboneElement {
  
  var _isDefining: js.UndefOr[Element] = js.undefined
  
  /**
    * A percentage.
    */
  var amount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Substance high level category, e.g. chemical substance.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The type of substance for this starting material.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Used to specify whether the attribute described is a defining element for the unique identification of the polymer.
    */
  var isDefining: js.UndefOr[Boolean] = js.undefined
}
object SubstancePolymerMonomerSetStartingMaterial {
  
  inline def apply(): SubstancePolymerMonomerSetStartingMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstancePolymerMonomerSetStartingMaterial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstancePolymerMonomerSetStartingMaterial] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIsDefining(value: Boolean): Self = StObject.set(x, "isDefining", value.asInstanceOf[js.Any])
    
    inline def setIsDefiningUndefined: Self = StObject.set(x, "isDefining", js.undefined)
    
    inline def set_isDefining(value: Element): Self = StObject.set(x, "_isDefining", value.asInstanceOf[js.Any])
    
    inline def set_isDefiningUndefined: Self = StObject.set(x, "_isDefining", js.undefined)
  }
}
