package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroupStratifierStratumComponent
  extends StObject
     with BackboneElement {
  
  /**
    * The code for the stratum component value.
    */
  var code: CodeableConcept
  
  /**
    * The stratum component value.
    */
  var value: CodeableConcept
}
object MeasureReportGroupStratifierStratumComponent {
  
  inline def apply(code: CodeableConcept, value: CodeableConcept): MeasureReportGroupStratifierStratumComponent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroupStratifierStratumComponent]
  }
  
  extension [Self <: MeasureReportGroupStratifierStratumComponent](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CodeableConcept): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
