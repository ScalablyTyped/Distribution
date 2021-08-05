package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stratification results
  */
trait MeasureReportGroupStratifier
  extends StObject
     with BackboneElement {
  
  /**
    * What stratifier of the group
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Stratum results, one for each unique value in the stratifier
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
    
    inline def setStratumVarargs(value: MeasureReportGroupStratifierStratum*): Self = StObject.set(x, "stratum", js.Array(value :_*))
  }
}
