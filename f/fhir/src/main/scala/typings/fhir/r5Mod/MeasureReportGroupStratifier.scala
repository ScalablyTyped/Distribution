package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReportGroupStratifier
  extends StObject
     with BackboneElement {
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  /**
    * The meaning of this stratifier, as defined in the measure definition.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The stratifier from the Measure that corresponds to this stratifier in the MeasureReport resource.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureReportGroupStratifier] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setStratum(value: js.Array[MeasureReportGroupStratifierStratum]): Self = StObject.set(x, "stratum", value.asInstanceOf[js.Any])
    
    inline def setStratumUndefined: Self = StObject.set(x, "stratum", js.undefined)
    
    inline def setStratumVarargs(value: MeasureReportGroupStratifierStratum*): Self = StObject.set(x, "stratum", js.Array(value*))
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
  }
}
