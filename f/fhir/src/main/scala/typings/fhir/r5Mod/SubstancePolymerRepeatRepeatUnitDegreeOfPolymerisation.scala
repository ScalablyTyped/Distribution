package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation
  extends StObject
     with BackboneElement {
  
  /**
    * An average amount of polymerisation.
    */
  var average: js.UndefOr[Double] = js.undefined
  
  /**
    * A high expected limit of the amount.
    */
  var high: js.UndefOr[Double] = js.undefined
  
  /**
    * A low expected limit of the amount.
    */
  var low: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of the degree of polymerisation shall be described, e.g. SRU/Polymer Ratio.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation {
  
  inline def apply(): SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation]
  }
  
  extension [Self <: SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation](x: Self) {
    
    inline def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
