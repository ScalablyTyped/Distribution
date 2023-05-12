package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstancePolymerRepeatRepeatUnit
  extends StObject
     with BackboneElement {
  
  var _repeatUnit: js.UndefOr[Element] = js.undefined
  
  /**
    * Todo.
    */
  var amount: js.UndefOr[SubstanceAmount] = js.undefined
  
  /**
    * Todo.
    */
  var degreeOfPolymerisation: js.UndefOr[js.Array[SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation]] = js.undefined
  
  /**
    * Todo.
    */
  var orientationOfPolymerisation: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Todo.
    */
  var repeatUnit: js.UndefOr[String] = js.undefined
  
  /**
    * Todo.
    */
  var structuralRepresentation: js.UndefOr[js.Array[SubstancePolymerRepeatRepeatUnitStructuralRepresentation]] = js.undefined
}
object SubstancePolymerRepeatRepeatUnit {
  
  inline def apply(): SubstancePolymerRepeatRepeatUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstancePolymerRepeatRepeatUnit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstancePolymerRepeatRepeatUnit] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: SubstanceAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDegreeOfPolymerisation(value: js.Array[SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation]): Self = StObject.set(x, "degreeOfPolymerisation", value.asInstanceOf[js.Any])
    
    inline def setDegreeOfPolymerisationUndefined: Self = StObject.set(x, "degreeOfPolymerisation", js.undefined)
    
    inline def setDegreeOfPolymerisationVarargs(value: SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation*): Self = StObject.set(x, "degreeOfPolymerisation", js.Array(value*))
    
    inline def setOrientationOfPolymerisation(value: CodeableConcept): Self = StObject.set(x, "orientationOfPolymerisation", value.asInstanceOf[js.Any])
    
    inline def setOrientationOfPolymerisationUndefined: Self = StObject.set(x, "orientationOfPolymerisation", js.undefined)
    
    inline def setRepeatUnit(value: String): Self = StObject.set(x, "repeatUnit", value.asInstanceOf[js.Any])
    
    inline def setRepeatUnitUndefined: Self = StObject.set(x, "repeatUnit", js.undefined)
    
    inline def setStructuralRepresentation(value: js.Array[SubstancePolymerRepeatRepeatUnitStructuralRepresentation]): Self = StObject.set(x, "structuralRepresentation", value.asInstanceOf[js.Any])
    
    inline def setStructuralRepresentationUndefined: Self = StObject.set(x, "structuralRepresentation", js.undefined)
    
    inline def setStructuralRepresentationVarargs(value: SubstancePolymerRepeatRepeatUnitStructuralRepresentation*): Self = StObject.set(x, "structuralRepresentation", js.Array(value*))
    
    inline def set_repeatUnit(value: Element): Self = StObject.set(x, "_repeatUnit", value.asInstanceOf[js.Any])
    
    inline def set_repeatUnitUndefined: Self = StObject.set(x, "_repeatUnit", js.undefined)
  }
}
