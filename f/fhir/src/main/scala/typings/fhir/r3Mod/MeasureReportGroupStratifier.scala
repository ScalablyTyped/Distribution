package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroupStratifier
  extends StObject
     with BackboneElement {
  
  /**
    * The identifier of this stratifier, as defined in the measure definition.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
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
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setStratum(value: js.Array[MeasureReportGroupStratifierStratum]): Self = StObject.set(x, "stratum", value.asInstanceOf[js.Any])
    
    inline def setStratumUndefined: Self = StObject.set(x, "stratum", js.undefined)
    
    inline def setStratumVarargs(value: MeasureReportGroupStratifierStratum*): Self = StObject.set(x, "stratum", js.Array(value*))
  }
}
