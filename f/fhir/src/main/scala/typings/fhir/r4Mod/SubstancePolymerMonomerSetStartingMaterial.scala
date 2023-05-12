package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstancePolymerMonomerSetStartingMaterial
  extends StObject
     with BackboneElement {
  
  var _isDefining: js.UndefOr[Element] = js.undefined
  
  /**
    * Todo.
    */
  var amount: js.UndefOr[SubstanceAmount] = js.undefined
  
  /**
    * Todo.
    */
  var isDefining: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Todo.
    */
  var material: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Todo.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstancePolymerMonomerSetStartingMaterial {
  
  inline def apply(): SubstancePolymerMonomerSetStartingMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstancePolymerMonomerSetStartingMaterial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstancePolymerMonomerSetStartingMaterial] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: SubstanceAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setIsDefining(value: Boolean): Self = StObject.set(x, "isDefining", value.asInstanceOf[js.Any])
    
    inline def setIsDefiningUndefined: Self = StObject.set(x, "isDefining", js.undefined)
    
    inline def setMaterial(value: CodeableConcept): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_isDefining(value: Element): Self = StObject.set(x, "_isDefining", value.asInstanceOf[js.Any])
    
    inline def set_isDefiningUndefined: Self = StObject.set(x, "_isDefining", js.undefined)
  }
}
