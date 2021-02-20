package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A timing schedule that specifies an event that may occur multiple times
  */
@js.native
trait Timing extends Element {
  
  /**
    * Contains extended information for property 'event'.
    */
  var _event: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * BID | TID | QID | AM | PM | QD | QOD | Q4H | Q6H +
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * When the event occurs
    */
  var event: js.UndefOr[js.Array[dateTime]] = js.native
  
  /**
    * When the event is to occur
    */
  var repeat: js.UndefOr[TimingRepeat] = js.native
}
object Timing {
  
  @scala.inline
  def apply(): Timing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timing]
  }
  
  @scala.inline
  implicit class TimingMutableBuilder[Self <: Timing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Array[dateTime]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setEventVarargs(value: dateTime*): Self = StObject.set(x, "event", js.Array(value :_*))
    
    @scala.inline
    def setRepeat(value: TimingRepeat): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def set_event(value: js.Array[Element]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventUndefined: Self = StObject.set(x, "_event", js.undefined)
    
    @scala.inline
    def set_eventVarargs(value: Element*): Self = StObject.set(x, "_event", js.Array(value :_*))
  }
}
