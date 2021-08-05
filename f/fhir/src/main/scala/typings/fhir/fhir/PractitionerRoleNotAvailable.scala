package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Not available during this time due to provided reason
  */
trait PractitionerRoleNotAvailable
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Reason presented to the user explaining why time not available
    */
  var description: String
  
  /**
    * Service not availablefrom this date
    */
  var during: js.UndefOr[Period] = js.undefined
}
object PractitionerRoleNotAvailable {
  
  inline def apply(description: String): PractitionerRoleNotAvailable = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PractitionerRoleNotAvailable]
  }
  
  extension [Self <: PractitionerRoleNotAvailable](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDuring(value: Period): Self = StObject.set(x, "during", value.asInstanceOf[js.Any])
    
    inline def setDuringUndefined: Self = StObject.set(x, "during", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
