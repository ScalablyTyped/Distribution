package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthcareServiceNotAvailable
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * The reason that can be presented to the user as to why this time is not available.
    */
  var description: String
  
  /**
    * Service is not available (seasonally or for a public holiday) from this date.
    */
  var during: js.UndefOr[Period] = js.undefined
}
object HealthcareServiceNotAvailable {
  
  inline def apply(description: String): HealthcareServiceNotAvailable = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthcareServiceNotAvailable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HealthcareServiceNotAvailable] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDuring(value: Period): Self = StObject.set(x, "during", value.asInstanceOf[js.Any])
    
    inline def setDuringUndefined: Self = StObject.set(x, "during", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
