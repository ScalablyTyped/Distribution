package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstancePolymerRepeat
  extends StObject
     with BackboneElement {
  
  var _averageMolecularFormula: js.UndefOr[Element] = js.undefined
  
  /**
    * Todo.
    */
  var averageMolecularFormula: js.UndefOr[String] = js.undefined
  
  /**
    * Todo.
    */
  var numberOfUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * Todo.
    */
  var repeatUnit: js.UndefOr[js.Array[SubstancePolymerRepeatRepeatUnit]] = js.undefined
  
  /**
    * Todo.
    */
  var repeatUnitAmountType: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstancePolymerRepeat {
  
  inline def apply(): SubstancePolymerRepeat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstancePolymerRepeat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstancePolymerRepeat] (val x: Self) extends AnyVal {
    
    inline def setAverageMolecularFormula(value: String): Self = StObject.set(x, "averageMolecularFormula", value.asInstanceOf[js.Any])
    
    inline def setAverageMolecularFormulaUndefined: Self = StObject.set(x, "averageMolecularFormula", js.undefined)
    
    inline def setNumberOfUnits(value: Double): Self = StObject.set(x, "numberOfUnits", value.asInstanceOf[js.Any])
    
    inline def setNumberOfUnitsUndefined: Self = StObject.set(x, "numberOfUnits", js.undefined)
    
    inline def setRepeatUnit(value: js.Array[SubstancePolymerRepeatRepeatUnit]): Self = StObject.set(x, "repeatUnit", value.asInstanceOf[js.Any])
    
    inline def setRepeatUnitAmountType(value: CodeableConcept): Self = StObject.set(x, "repeatUnitAmountType", value.asInstanceOf[js.Any])
    
    inline def setRepeatUnitAmountTypeUndefined: Self = StObject.set(x, "repeatUnitAmountType", js.undefined)
    
    inline def setRepeatUnitUndefined: Self = StObject.set(x, "repeatUnit", js.undefined)
    
    inline def setRepeatUnitVarargs(value: SubstancePolymerRepeatRepeatUnit*): Self = StObject.set(x, "repeatUnit", js.Array(value*))
    
    inline def set_averageMolecularFormula(value: Element): Self = StObject.set(x, "_averageMolecularFormula", value.asInstanceOf[js.Any])
    
    inline def set_averageMolecularFormulaUndefined: Self = StObject.set(x, "_averageMolecularFormula", js.undefined)
  }
}
