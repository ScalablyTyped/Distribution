package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationResultPrimarySource
  extends StObject
     with BackboneElement {
  
  var _validationDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Ability of the primary source to push updates/alerts (yes; no; undetermined).
    */
  var canPushUpdates: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Method for communicating with the primary source (manual; API; Push).
    */
  var communicationMethod: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Type of alerts/updates the primary source can send (specific requested changes; any changes; as defined by source).
    */
  var pushTypeAvailable: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Type of primary source (License Board; Primary Education; Continuing Education; Postal Service; Relationship owner; Registration Authority; legal source; issuing source; authoritative source).
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * When the target was validated against the primary source.
    */
  var validationDate: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the validation of the target against the primary source (successful; failed; unknown).
    */
  var validationStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Reference to the primary source.
    */
  var who: js.UndefOr[Reference] = js.undefined
}
object VerificationResultPrimarySource {
  
  inline def apply(): VerificationResultPrimarySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationResultPrimarySource]
  }
  
  extension [Self <: VerificationResultPrimarySource](x: Self) {
    
    inline def setCanPushUpdates(value: CodeableConcept): Self = StObject.set(x, "canPushUpdates", value.asInstanceOf[js.Any])
    
    inline def setCanPushUpdatesUndefined: Self = StObject.set(x, "canPushUpdates", js.undefined)
    
    inline def setCommunicationMethod(value: js.Array[CodeableConcept]): Self = StObject.set(x, "communicationMethod", value.asInstanceOf[js.Any])
    
    inline def setCommunicationMethodUndefined: Self = StObject.set(x, "communicationMethod", js.undefined)
    
    inline def setCommunicationMethodVarargs(value: CodeableConcept*): Self = StObject.set(x, "communicationMethod", js.Array(value*))
    
    inline def setPushTypeAvailable(value: js.Array[CodeableConcept]): Self = StObject.set(x, "pushTypeAvailable", value.asInstanceOf[js.Any])
    
    inline def setPushTypeAvailableUndefined: Self = StObject.set(x, "pushTypeAvailable", js.undefined)
    
    inline def setPushTypeAvailableVarargs(value: CodeableConcept*): Self = StObject.set(x, "pushTypeAvailable", js.Array(value*))
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setValidationDate(value: String): Self = StObject.set(x, "validationDate", value.asInstanceOf[js.Any])
    
    inline def setValidationDateUndefined: Self = StObject.set(x, "validationDate", js.undefined)
    
    inline def setValidationStatus(value: CodeableConcept): Self = StObject.set(x, "validationStatus", value.asInstanceOf[js.Any])
    
    inline def setValidationStatusUndefined: Self = StObject.set(x, "validationStatus", js.undefined)
    
    inline def setWho(value: Reference): Self = StObject.set(x, "who", value.asInstanceOf[js.Any])
    
    inline def setWhoUndefined: Self = StObject.set(x, "who", js.undefined)
    
    inline def set_validationDate(value: Element): Self = StObject.set(x, "_validationDate", value.asInstanceOf[js.Any])
    
    inline def set_validationDateUndefined: Self = StObject.set(x, "_validationDate", js.undefined)
  }
}
