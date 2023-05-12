package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchStudyProgressStatus
  extends StObject
     with BackboneElement {
  
  var _actual: js.UndefOr[Element] = js.undefined
  
  /**
    * An indication of whether or not the date is a known date when the state changed or will change. A value of true indicates a known date. A value of false indicates an estimated date.
    */
  var actual: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Date range.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Label for status or state (e.g. recruitment status).
    */
  var state: CodeableConcept
}
object ResearchStudyProgressStatus {
  
  inline def apply(state: CodeableConcept): ResearchStudyProgressStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchStudyProgressStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResearchStudyProgressStatus] (val x: Self) extends AnyVal {
    
    inline def setActual(value: Boolean): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setState(value: CodeableConcept): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def set_actual(value: Element): Self = StObject.set(x, "_actual", value.asInstanceOf[js.Any])
    
    inline def set_actualUndefined: Self = StObject.set(x, "_actual", js.undefined)
  }
}
