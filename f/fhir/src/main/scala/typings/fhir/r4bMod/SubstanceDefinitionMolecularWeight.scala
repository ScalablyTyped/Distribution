package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceDefinitionMolecularWeight
  extends StObject
     with BackboneElement {
  
  /**
    * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field.
    */
  var amount: Quantity
  
  /**
    * The method by which the molecular weight was determined.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Type of molecular weight such as exact, average (also known as. number average), weight average.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceDefinitionMolecularWeight {
  
  inline def apply(amount: Quantity): SubstanceDefinitionMolecularWeight = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstanceDefinitionMolecularWeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceDefinitionMolecularWeight] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
