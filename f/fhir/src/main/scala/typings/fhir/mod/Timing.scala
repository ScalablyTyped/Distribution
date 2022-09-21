package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timing
  extends StObject
     with Element {
  
  var _event: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * A code for the timing pattern. Some codes such as BID are ubiquitous, but many institutions define their own additional codes.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * In an MAR, for instance, you need to take a general specification, and turn it into a precise specification.
    */
  var event: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Many timing schedules are determined by regular repetitions.
    */
  var repeat: js.UndefOr[TimingRepeat] = js.undefined
}
object Timing {
  
  inline def apply(): Timing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timing]
  }
  
  extension [Self <: Timing](x: Self) {
    
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
