package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityNotAvailableTime
  extends StObject
     with Element {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * The reason will generally be provided to give the textual reason for displaying when the {item} is not available, e.g. 'Closed public holidays' or 'Independence Day'. In cases such as this, the `during` might not be included and local knowledge would be required in such cases (as don't desire to keep updating when the holiday occurs each year).
    * e.g.2: 'Closed for maintenance over the summer' for this example you would want to include the `during` period, unless this was a university hospital and the "summer" period was well known, but would recommend its inclusion anyway.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Service not available during this period.
    */
  var during: js.UndefOr[Period] = js.undefined
}
object AvailabilityNotAvailableTime {
  
  inline def apply(): AvailabilityNotAvailableTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityNotAvailableTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailabilityNotAvailableTime] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDuring(value: Period): Self = StObject.set(x, "during", value.asInstanceOf[js.Any])
    
    inline def setDuringUndefined: Self = StObject.set(x, "during", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
