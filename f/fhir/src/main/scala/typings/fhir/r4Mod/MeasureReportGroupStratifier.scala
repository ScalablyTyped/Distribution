package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroupStratifier
  extends StObject
     with BackboneElement {
  
  /**
    * The meaning of this stratifier, as defined in the measure definition.
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This element contains the results for a single stratum within the stratifier. For example, when stratifying on administrative gender, there will be four strata, one for each possible gender value.
    */
  var stratum: js.UndefOr[js.Array[MeasureReportGroupStratifierStratum]] = js.undefined
}
object MeasureReportGroupStratifier {
  
  inline def apply(): MeasureReportGroupStratifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroupStratifier]
  }
  
  extension [Self <: MeasureReportGroupStratifier](x: Self) {
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setStratum(value: js.Array[MeasureReportGroupStratifierStratum]): Self = StObject.set(x, "stratum", value.asInstanceOf[js.Any])
    
    inline def setStratumUndefined: Self = StObject.set(x, "stratum", js.undefined)
    
    inline def setStratumVarargs(value: MeasureReportGroupStratifierStratum*): Self = StObject.set(x, "stratum", js.Array(value*))
  }
}
