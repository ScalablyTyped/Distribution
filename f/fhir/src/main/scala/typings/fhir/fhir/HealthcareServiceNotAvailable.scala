package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Not available during this time due to provided reason
  */
trait HealthcareServiceNotAvailable
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
object HealthcareServiceNotAvailable {
  
  @scala.inline
  def apply(description: String): HealthcareServiceNotAvailable = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthcareServiceNotAvailable]
  }
  
  @scala.inline
  implicit class HealthcareServiceNotAvailableMutableBuilder[Self <: HealthcareServiceNotAvailable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuring(value: Period): Self = StObject.set(x, "during", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuringUndefined: Self = StObject.set(x, "during", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
