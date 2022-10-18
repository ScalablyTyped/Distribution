package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Immunization
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _expirationDate: js.UndefOr[Element] = js.undefined
  
  var _lotNumber: js.UndefOr[Element] = js.undefined
  
  var _reported: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _wasNotGiven: js.UndefOr[Element] = js.undefined
  
  /**
    * Date vaccine administered or was to be administered.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity of vaccine product that was administered.
    */
  var doseQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The visit or admission or other contact between patient and health care provider the immunization was performed as part of.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Date vaccine batch expires.
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * Reasons why a vaccine was or was not administered.
    */
  var explanation: js.UndefOr[ImmunizationExplanation] = js.undefined
  
  /**
    * A unique identifier assigned to this immunization record.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The service delivery location where the vaccine administration occurred.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Lot number of the  vaccine product.
    */
  var lotNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Name of vaccine manufacturer.
    */
  var manufacturer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Extra information about the immunization that is not conveyed by the other attributes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The patient who either received or did not receive the immunization.
    */
  var patient: Reference
  
  /**
    * Clinician who administered the vaccine.
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Categorical data indicating that an adverse event is associated in time to an immunization.
    */
  var reaction: js.UndefOr[js.Array[ImmunizationReaction]] = js.undefined
  
  /**
    * True if this administration was reported rather than directly administered.
    */
  var reported: Boolean
  
  /**
    * Clinician who ordered the vaccination.
    */
  var requester: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Immunization: typings.fhir.fhirStrings.Immunization
  
  /**
    * The path by which the vaccine product is taken into the body.
    */
  var route: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Body site where vaccine was administered.
    */
  var site: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates the current status of the vaccination event.
    */
  var status: `in-progress` | `on-hold` | completed | `entered-in-error` | stopped
  
  /**
    * Contains information about the protocol(s) under which the vaccine was administered.
    */
  var vaccinationProtocol: js.UndefOr[js.Array[ImmunizationVaccinationProtocol]] = js.undefined
  
  /**
    * Vaccine that was administered or was to be administered.
    */
  var vaccineCode: CodeableConcept
  
  /**
    * Indicates if the vaccination was or was not given.
    */
  var wasNotGiven: Boolean
}
object Immunization {
  
  inline def apply(
    patient: Reference,
    reported: Boolean,
    status: `in-progress` | `on-hold` | completed | `entered-in-error` | stopped,
    vaccineCode: CodeableConcept,
    wasNotGiven: Boolean
  ): Immunization = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], reported = reported.asInstanceOf[js.Any], resourceType = "Immunization", status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any], wasNotGiven = wasNotGiven.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immunization]
  }
  
  extension [Self <: Immunization](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDoseQuantity(value: Quantity): Self = StObject.set(x, "doseQuantity", value.asInstanceOf[js.Any])
    
    inline def setDoseQuantityUndefined: Self = StObject.set(x, "doseQuantity", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setExplanation(value: ImmunizationExplanation): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLotNumber(value: String): Self = StObject.set(x, "lotNumber", value.asInstanceOf[js.Any])
    
    inline def setLotNumberUndefined: Self = StObject.set(x, "lotNumber", js.undefined)
    
    inline def setManufacturer(value: Reference): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setReaction(value: js.Array[ImmunizationReaction]): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    inline def setReactionUndefined: Self = StObject.set(x, "reaction", js.undefined)
    
    inline def setReactionVarargs(value: ImmunizationReaction*): Self = StObject.set(x, "reaction", js.Array(value*))
    
    inline def setReported(value: Boolean): Self = StObject.set(x, "reported", value.asInstanceOf[js.Any])
    
    inline def setRequester(value: Reference): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Immunization): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: CodeableConcept): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setSite(value: CodeableConcept): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setStatus(value: `in-progress` | `on-hold` | completed | `entered-in-error` | stopped): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVaccinationProtocol(value: js.Array[ImmunizationVaccinationProtocol]): Self = StObject.set(x, "vaccinationProtocol", value.asInstanceOf[js.Any])
    
    inline def setVaccinationProtocolUndefined: Self = StObject.set(x, "vaccinationProtocol", js.undefined)
    
    inline def setVaccinationProtocolVarargs(value: ImmunizationVaccinationProtocol*): Self = StObject.set(x, "vaccinationProtocol", js.Array(value*))
    
    inline def setVaccineCode(value: CodeableConcept): Self = StObject.set(x, "vaccineCode", value.asInstanceOf[js.Any])
    
    inline def setWasNotGiven(value: Boolean): Self = StObject.set(x, "wasNotGiven", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_expirationDate(value: Element): Self = StObject.set(x, "_expirationDate", value.asInstanceOf[js.Any])
    
    inline def set_expirationDateUndefined: Self = StObject.set(x, "_expirationDate", js.undefined)
    
    inline def set_lotNumber(value: Element): Self = StObject.set(x, "_lotNumber", value.asInstanceOf[js.Any])
    
    inline def set_lotNumberUndefined: Self = StObject.set(x, "_lotNumber", js.undefined)
    
    inline def set_reported(value: Element): Self = StObject.set(x, "_reported", value.asInstanceOf[js.Any])
    
    inline def set_reportedUndefined: Self = StObject.set(x, "_reported", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_wasNotGiven(value: Element): Self = StObject.set(x, "_wasNotGiven", value.asInstanceOf[js.Any])
    
    inline def set_wasNotGivenUndefined: Self = StObject.set(x, "_wasNotGiven", js.undefined)
  }
}
