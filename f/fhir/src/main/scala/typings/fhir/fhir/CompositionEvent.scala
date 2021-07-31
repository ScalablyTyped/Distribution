package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The clinical service(s) being documented
  */
trait CompositionEvent
  extends StObject
     with BackboneElement {
  
  /**
    * Code(s) that apply to the event being documented
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The event(s) being documented
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The period covered by the documentation
    */
  var period: js.UndefOr[Period] = js.undefined
}
object CompositionEvent {
  
  @scala.inline
  def apply(): CompositionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionEvent]
  }
  
  @scala.inline
  implicit class CompositionEventMutableBuilder[Self <: CompositionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value :_*))
    
    @scala.inline
    def setDetail(value: js.Array[Reference]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setDetailVarargs(value: Reference*): Self = StObject.set(x, "detail", js.Array(value :_*))
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
