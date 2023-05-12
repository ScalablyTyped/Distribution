package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timing
  extends StObject
     with BackboneElement {
  
  var _event: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * BID etc. are defined as 'at institutionally specified times'. For example, an institution may choose that BID is "always at 7am and 6pm".  If it is inappropriate for this choice to be made, the code BID should not be used. Instead, a distinct organization-specific code should be used in place of the HL7-defined BID code and/or a structured representation should be used (in this case, specifying the two event times).
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies specific times when the event occurs.
    */
  var event: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A set of rules that describe when the event is scheduled.
    */
  var repeat: js.UndefOr[TimingRepeat] = js.undefined
}
object Timing {
  
  inline def apply(): Timing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timing] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setEvent(value: js.Array[String]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: String*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setRepeat(value: TimingRepeat): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def set_event(value: js.Array[Element]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
    
    inline def set_eventUndefined: Self = StObject.set(x, "_event", js.undefined)
    
    inline def set_eventVarargs(value: Element*): Self = StObject.set(x, "_event", js.Array(value*))
  }
}
