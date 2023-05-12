package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterAdmission
  extends StObject
     with BackboneElement {
  
  /**
    * From where patient was admitted (physician referral, transfer).
    */
  var admitSource: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Location/organization to which the patient is discharged.
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * Category or kind of location after discharge.
    */
  var dischargeDisposition: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The location/organization from which the patient came before admission.
    */
  var origin: js.UndefOr[Reference] = js.undefined
  
  /**
    * Pre-admission identifier.
    */
  var preAdmissionIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Indicates that this encounter is directly related to a prior admission, often because the conditions addressed in the prior admission were not fully addressed.
    */
  var reAdmission: js.UndefOr[CodeableConcept] = js.undefined
}
object EncounterAdmission {
  
  inline def apply(): EncounterAdmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounterAdmission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncounterAdmission] (val x: Self) extends AnyVal {
    
    inline def setAdmitSource(value: CodeableConcept): Self = StObject.set(x, "admitSource", value.asInstanceOf[js.Any])
    
    inline def setAdmitSourceUndefined: Self = StObject.set(x, "admitSource", js.undefined)
    
    inline def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDischargeDisposition(value: CodeableConcept): Self = StObject.set(x, "dischargeDisposition", value.asInstanceOf[js.Any])
    
    inline def setDischargeDispositionUndefined: Self = StObject.set(x, "dischargeDisposition", js.undefined)
    
    inline def setOrigin(value: Reference): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPreAdmissionIdentifier(value: Identifier): Self = StObject.set(x, "preAdmissionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPreAdmissionIdentifierUndefined: Self = StObject.set(x, "preAdmissionIdentifier", js.undefined)
    
    inline def setReAdmission(value: CodeableConcept): Self = StObject.set(x, "reAdmission", value.asInstanceOf[js.Any])
    
    inline def setReAdmissionUndefined: Self = StObject.set(x, "reAdmission", js.undefined)
  }
}
