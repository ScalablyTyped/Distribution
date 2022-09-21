package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstancePolymerRepeatRepeatUnit
  extends StObject
     with BackboneElement {
  
  var _unit: js.UndefOr[Element] = js.undefined
  
  /**
    * Number of repeats of this unit.
    */
  var amount: js.UndefOr[Double] = js.undefined
  
  /**
    * Applies to homopolymer and block co-polymers where the degree of polymerisation within a block can be described.
    */
  var degreeOfPolymerisation: js.UndefOr[js.Array[SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation]] = js.undefined
  
  /**
    * The orientation of the polymerisation, e.g. head-tail, head-head, random.
    */
  var orientation: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A graphical structure for this SRU.
    */
  var structuralRepresentation: js.UndefOr[js.Array[SubstancePolymerRepeatRepeatUnitStructuralRepresentation]] = js.undefined
  
  /**
    * Structural repeat units are essential elements for defining polymers.
    */
  var unit: js.UndefOr[String] = js.undefined
}
object SubstancePolymerRepeatRepeatUnit {
  
  inline def apply(): SubstancePolymerRepeatRepeatUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstancePolymerRepeatRepeatUnit]
  }
  
  extension [Self <: SubstancePolymerRepeatRepeatUnit](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDegreeOfPolymerisation(value: js.Array[SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation]): Self = StObject.set(x, "degreeOfPolymerisation", value.asInstanceOf[js.Any])
    
    inline def setDegreeOfPolymerisationUndefined: Self = StObject.set(x, "degreeOfPolymerisation", js.undefined)
    
    inline def setDegreeOfPolymerisationVarargs(value: SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation*): Self = StObject.set(x, "degreeOfPolymerisation", js.Array(value*))
    
    inline def setOrientation(value: CodeableConcept): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setStructuralRepresentation(value: js.Array[SubstancePolymerRepeatRepeatUnitStructuralRepresentation]): Self = StObject.set(x, "structuralRepresentation", value.asInstanceOf[js.Any])
    
    inline def setStructuralRepresentationUndefined: Self = StObject.set(x, "structuralRepresentation", js.undefined)
    
    inline def setStructuralRepresentationVarargs(value: SubstancePolymerRepeatRepeatUnitStructuralRepresentation*): Self = StObject.set(x, "structuralRepresentation", js.Array(value*))
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def set_unit(value: Element): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    
    inline def set_unitUndefined: Self = StObject.set(x, "_unit", js.undefined)
  }
}
