package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimEvent
  extends StObject
     with BackboneElement {
  
  var _whenDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * A coded event such as when a service is expected or a card printed.
    */
  var `type`: CodeableConcept
  
  /**
    * A date or period in the past or future indicating when the event occurred or is expectd to occur.
    */
  var whenDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * A date or period in the past or future indicating when the event occurred or is expectd to occur.
    */
  var whenPeriod: js.UndefOr[Period] = js.undefined
}
object ClaimEvent {
  
  inline def apply(`type`: CodeableConcept): ClaimEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWhenDateTime(value: String): Self = StObject.set(x, "whenDateTime", value.asInstanceOf[js.Any])
    
    inline def setWhenDateTimeUndefined: Self = StObject.set(x, "whenDateTime", js.undefined)
    
    inline def setWhenPeriod(value: Period): Self = StObject.set(x, "whenPeriod", value.asInstanceOf[js.Any])
    
    inline def setWhenPeriodUndefined: Self = StObject.set(x, "whenPeriod", js.undefined)
    
    inline def set_whenDateTime(value: Element): Self = StObject.set(x, "_whenDateTime", value.asInstanceOf[js.Any])
    
    inline def set_whenDateTimeUndefined: Self = StObject.set(x, "_whenDateTime", js.undefined)
  }
}
