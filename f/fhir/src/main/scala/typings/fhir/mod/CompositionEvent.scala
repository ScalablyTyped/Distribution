package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionEvent
  extends StObject
     with BackboneElement {
  
  /**
    * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.
    */
  var period: js.UndefOr[Period] = js.undefined
}
object CompositionEvent {
  
  inline def apply(): CompositionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionEvent]
  }
  
  extension [Self <: CompositionEvent](x: Self) {
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setDetail(value: js.Array[Reference]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: Reference*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
