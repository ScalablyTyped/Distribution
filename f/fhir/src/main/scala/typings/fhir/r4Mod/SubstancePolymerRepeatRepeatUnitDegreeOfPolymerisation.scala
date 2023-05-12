package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation
  extends StObject
     with BackboneElement {
  
  /**
    * Todo.
    */
  var amount: js.UndefOr[SubstanceAmount] = js.undefined
  
  /**
    * Todo.
    */
  var degree: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation {
  
  inline def apply(): SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: SubstanceAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDegree(value: CodeableConcept): Self = StObject.set(x, "degree", value.asInstanceOf[js.Any])
    
    inline def setDegreeUndefined: Self = StObject.set(x, "degree", js.undefined)
  }
}
