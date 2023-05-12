package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionEvent
  extends StObject
     with BackboneElement {
  
  /**
    * An event can further specialize the act inherent in the typeCode, such as where it is simply "Procedure Report" and the procedure was a "colonoscopy". If one or more events are included, they SHALL NOT conflict with the values inherent in the classCode, practiceSettingCode or typeCode, as such a conflict would create an ambiguous situation. This short list of codes is provided to be used as key words for certain types of queries.
    */
  var detail: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositionEvent] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: js.Array[CodeableReference]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: CodeableReference*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
