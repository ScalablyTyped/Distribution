package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.completed
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
  
  var _notGiven: js.UndefOr[Element] = js.undefined
  
  var _primarySource: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * When immunizations are given a specific date and time should always be known.   When immunizations are patient reported, a specific date might not be known.  Although partial dates are allowed, an adult patient might not be able to recall the year a childhood immunization was given.
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
    * This element is labeled as a modifier because it indicates that an immunization didn't happen.
    */
  var notGiven: Boolean
  
  /**
    * Extra information about the immunization that is not conveyed by the other attributes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The patient who either received or did not receive the immunization.
    */
  var patient: Reference
  
  /**
    * Indicates who or what performed the event.
    */
  var practitioner: js.UndefOr[js.Array[ImmunizationPractitioner]] = js.undefined
  
  /**
    * Reflects the “reliability” of the content.
    */
  var primarySource: Boolean
  
  /**
    * A reaction may be an indication of an allergy or intolerance and, if this is determined to be the case,  it should be recorded as a new [AllergyIntolerance](allergyintolerance.html) resource instance as most systems will not query against  past Immunization.reaction elements.
    */
  var reaction: js.UndefOr[js.Array[ImmunizationReaction]] = js.undefined
  
  /**
    * Should not be populated if primarySource = True, will not be required even if primarySource = False.
    */
  var reportOrigin: js.UndefOr[CodeableConcept] = js.undefined
  
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
    * Will generally be set to show that the immunization has been completed.
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: completed | `entered-in-error`
  
  /**
    * Contains information about the protocol(s) under which the vaccine was administered.
    */
  var vaccinationProtocol: js.UndefOr[js.Array[ImmunizationVaccinationProtocol]] = js.undefined
  
  /**
    * Vaccine that was administered or was to be administered.
    */
  var vaccineCode: CodeableConcept
}
object Immunization {
  
  inline def apply(
    notGiven: Boolean,
    patient: Reference,
    primarySource: Boolean,
    status: completed | `entered-in-error`,
    vaccineCode: CodeableConcept
  ): Immunization = {
    val __obj = js.Dynamic.literal(notGiven = notGiven.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], primarySource = primarySource.asInstanceOf[js.Any], resourceType = "Immunization", status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immunization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Immunization] (val x: Self) extends AnyVal {
    
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
    
    inline def setNotGiven(value: Boolean): Self = StObject.set(x, "notGiven", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPractitioner(value: js.Array[ImmunizationPractitioner]): Self = StObject.set(x, "practitioner", value.asInstanceOf[js.Any])
    
    inline def setPractitionerUndefined: Self = StObject.set(x, "practitioner", js.undefined)
    
    inline def setPractitionerVarargs(value: ImmunizationPractitioner*): Self = StObject.set(x, "practitioner", js.Array(value*))
    
    inline def setPrimarySource(value: Boolean): Self = StObject.set(x, "primarySource", value.asInstanceOf[js.Any])
    
    inline def setReaction(value: js.Array[ImmunizationReaction]): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    inline def setReactionUndefined: Self = StObject.set(x, "reaction", js.undefined)
    
    inline def setReactionVarargs(value: ImmunizationReaction*): Self = StObject.set(x, "reaction", js.Array(value*))
    
    inline def setReportOrigin(value: CodeableConcept): Self = StObject.set(x, "reportOrigin", value.asInstanceOf[js.Any])
    
    inline def setReportOriginUndefined: Self = StObject.set(x, "reportOrigin", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Immunization): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: CodeableConcept): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setSite(value: CodeableConcept): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setStatus(value: completed | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVaccinationProtocol(value: js.Array[ImmunizationVaccinationProtocol]): Self = StObject.set(x, "vaccinationProtocol", value.asInstanceOf[js.Any])
    
    inline def setVaccinationProtocolUndefined: Self = StObject.set(x, "vaccinationProtocol", js.undefined)
    
    inline def setVaccinationProtocolVarargs(value: ImmunizationVaccinationProtocol*): Self = StObject.set(x, "vaccinationProtocol", js.Array(value*))
    
    inline def setVaccineCode(value: CodeableConcept): Self = StObject.set(x, "vaccineCode", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_expirationDate(value: Element): Self = StObject.set(x, "_expirationDate", value.asInstanceOf[js.Any])
    
    inline def set_expirationDateUndefined: Self = StObject.set(x, "_expirationDate", js.undefined)
    
    inline def set_lotNumber(value: Element): Self = StObject.set(x, "_lotNumber", value.asInstanceOf[js.Any])
    
    inline def set_lotNumberUndefined: Self = StObject.set(x, "_lotNumber", js.undefined)
    
    inline def set_notGiven(value: Element): Self = StObject.set(x, "_notGiven", value.asInstanceOf[js.Any])
    
    inline def set_notGivenUndefined: Self = StObject.set(x, "_notGiven", js.undefined)
    
    inline def set_primarySource(value: Element): Self = StObject.set(x, "_primarySource", value.asInstanceOf[js.Any])
    
    inline def set_primarySourceUndefined: Self = StObject.set(x, "_primarySource", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
