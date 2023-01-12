package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`not-done`
import typings.fhir.fhirStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Immunization
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _expirationDate: js.UndefOr[Element] = js.undefined
  
  var _instantiatesCanonical: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiatesUri: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _isSubpotent: js.UndefOr[Element] = js.undefined
  
  var _lotNumber: js.UndefOr[Element] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _occurrenceString: js.UndefOr[Element] = js.undefined
  
  var _primarySource: js.UndefOr[Element] = js.undefined
  
  var _recorded: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Allows tracing of an authorization for the Immunization.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The quantity of vaccine product that was administered.
    */
  var doseQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Educational material presented to the patient (or guardian) at the time of vaccine administration.
    */
  var education: js.UndefOr[js.Array[ImmunizationEducation]] = js.undefined
  
  /**
    * The visit or admission or other contact between patient and health care provider the immunization was performed as part of.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Date vaccine batch expires.
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the source of the vaccine actually administered. This may be different than the patient eligibility (e.g. the patient may be eligible for a publically purchased vaccine but due to inventory issues, vaccine purchased with private funds was actually administered).
    */
  var fundingSource: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A unique identifier assigned to this immunization record.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Typically will not be populated if primarySource = True, not required even if primarySource = False.
    */
  var informationSourceCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Typically will not be populated if primarySource = True, not required even if primarySource = False.
    */
  var informationSourceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Immunization.
    */
  var instantiatesCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This might be an HTML page, PDF, etc. or could just be a non-resolvable URI identifier.
    */
  var instantiatesUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Typically, the recognition of the dose being sub-potent is retrospective, after the administration (ex. notification of a manufacturer recall after administration). However, in the case of a partial administration (the patient moves unexpectedly and only some of the dose is actually administered), subpotency may be recognized immediately, but it is still important to record the event.
    */
  var isSubpotent: js.UndefOr[Boolean] = js.undefined
  
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
    * When immunizations are given a specific date and time should always be known.   When immunizations are patient reported, a specific date might not be known.  Although partial dates are allowed, an adult patient might not be able to recall the year a childhood immunization was given. An exact date is always preferable, but the use of the String data type is acceptable when an exact date is not known. A small number of vaccines (e.g. live oral typhoid vaccine) are given as a series of patient self-administered dose over a span of time. In cases like this, often, only the first dose (typically a provider supervised dose) is recorded with the occurrence indicating the date/time of the first dose.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * When immunizations are given a specific date and time should always be known.   When immunizations are patient reported, a specific date might not be known.  Although partial dates are allowed, an adult patient might not be able to recall the year a childhood immunization was given. An exact date is always preferable, but the use of the String data type is acceptable when an exact date is not known. A small number of vaccines (e.g. live oral typhoid vaccine) are given as a series of patient self-administered dose over a span of time. In cases like this, often, only the first dose (typically a provider supervised dose) is recorded with the occurrence indicating the date/time of the first dose.
    */
  var occurrenceString: js.UndefOr[String] = js.undefined
  
  /**
    * The patient who either received or did not receive the immunization.
    */
  var patient: Reference
  
  /**
    * Indicates who performed the immunization event.
    */
  var performer: js.UndefOr[js.Array[ImmunizationPerformer]] = js.undefined
  
  /**
    * Reflects the “reliability” of the content.
    */
  var primarySource: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates a patient's eligibility for a funding program.
    */
  var programEligibility: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The protocol (set of recommendations) being followed by the provider who administered the dose.
    */
  var protocolApplied: js.UndefOr[js.Array[ImmunizationProtocolApplied]] = js.undefined
  
  /**
    * A reaction may be an indication of an allergy or intolerance and, if this is determined to be the case, it should be recorded as a new AllergyIntolerance resource instance as most systems will not query against past Immunization.reaction elements.
    */
  var reaction: js.UndefOr[js.Array[ImmunizationReaction]] = js.undefined
  
  /**
    * Describes why the immunization occurred in coded or textual form, or Indicates another resource (Condition, Observation or DiagnosticReport) whose existence justifies this immunization.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The date the occurrence of the immunization was first captured in the record - potentially significantly after the occurrence of the event.
    */
  var recorded: js.UndefOr[String] = js.undefined
  
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
    * Will generally be set to show that the immunization has been completed or not done.  This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: completed | `entered-in-error` | `not-done`
  
  /**
    * This is generally only used for the status of "not-done". The reason for performing the immunization event is captured in reasonCode, not here.
    */
  var statusReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Reason why a dose is considered to be subpotent.
    */
  var subpotentReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The code for the administered vaccine may be reported at various levels of granularity from a very generic code for a general type of vaccine (e.g. the SNOMED or CVX code for the flu vaccine) to a very discrete code for a specific product including the form and packaging (e.g. an NDC code). Because vaccineCode uses the CodeableConcept data type, multiple codes at different levels of granularity may be reported for a single immunization event provided that all codes are appropriate for the same vaccine. For example, both NDC and CVX codes may be provided for a given immunization event by repeating the coding element within vaccineCode.
    */
  var vaccineCode: CodeableConcept
}
object Immunization {
  
  inline def apply(
    patient: Reference,
    status: completed | `entered-in-error` | `not-done`,
    vaccineCode: CodeableConcept
  ): Immunization = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "Immunization", status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immunization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Immunization] (val x: Self) extends AnyVal {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setDoseQuantity(value: Quantity): Self = StObject.set(x, "doseQuantity", value.asInstanceOf[js.Any])
    
    inline def setDoseQuantityUndefined: Self = StObject.set(x, "doseQuantity", js.undefined)
    
    inline def setEducation(value: js.Array[ImmunizationEducation]): Self = StObject.set(x, "education", value.asInstanceOf[js.Any])
    
    inline def setEducationUndefined: Self = StObject.set(x, "education", js.undefined)
    
    inline def setEducationVarargs(value: ImmunizationEducation*): Self = StObject.set(x, "education", js.Array(value*))
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setFundingSource(value: CodeableConcept): Self = StObject.set(x, "fundingSource", value.asInstanceOf[js.Any])
    
    inline def setFundingSourceUndefined: Self = StObject.set(x, "fundingSource", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInformationSourceCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "informationSourceCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setInformationSourceCodeableConceptUndefined: Self = StObject.set(x, "informationSourceCodeableConcept", js.undefined)
    
    inline def setInformationSourceReference(value: Reference): Self = StObject.set(x, "informationSourceReference", value.asInstanceOf[js.Any])
    
    inline def setInformationSourceReferenceUndefined: Self = StObject.set(x, "informationSourceReference", js.undefined)
    
    inline def setInstantiatesCanonical(value: js.Array[String]): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesCanonicalVarargs(value: String*): Self = StObject.set(x, "instantiatesCanonical", js.Array(value*))
    
    inline def setInstantiatesUri(value: js.Array[String]): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInstantiatesUriVarargs(value: String*): Self = StObject.set(x, "instantiatesUri", js.Array(value*))
    
    inline def setIsSubpotent(value: Boolean): Self = StObject.set(x, "isSubpotent", value.asInstanceOf[js.Any])
    
    inline def setIsSubpotentUndefined: Self = StObject.set(x, "isSubpotent", js.undefined)
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLotNumber(value: String): Self = StObject.set(x, "lotNumber", value.asInstanceOf[js.Any])
    
    inline def setLotNumberUndefined: Self = StObject.set(x, "lotNumber", js.undefined)
    
    inline def setManufacturer(value: Reference): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrenceString(value: String): Self = StObject.set(x, "occurrenceString", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceStringUndefined: Self = StObject.set(x, "occurrenceString", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPerformer(value: js.Array[ImmunizationPerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: ImmunizationPerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setPrimarySource(value: Boolean): Self = StObject.set(x, "primarySource", value.asInstanceOf[js.Any])
    
    inline def setPrimarySourceUndefined: Self = StObject.set(x, "primarySource", js.undefined)
    
    inline def setProgramEligibility(value: js.Array[CodeableConcept]): Self = StObject.set(x, "programEligibility", value.asInstanceOf[js.Any])
    
    inline def setProgramEligibilityUndefined: Self = StObject.set(x, "programEligibility", js.undefined)
    
    inline def setProgramEligibilityVarargs(value: CodeableConcept*): Self = StObject.set(x, "programEligibility", js.Array(value*))
    
    inline def setProtocolApplied(value: js.Array[ImmunizationProtocolApplied]): Self = StObject.set(x, "protocolApplied", value.asInstanceOf[js.Any])
    
    inline def setProtocolAppliedUndefined: Self = StObject.set(x, "protocolApplied", js.undefined)
    
    inline def setProtocolAppliedVarargs(value: ImmunizationProtocolApplied*): Self = StObject.set(x, "protocolApplied", js.Array(value*))
    
    inline def setReaction(value: js.Array[ImmunizationReaction]): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    inline def setReactionUndefined: Self = StObject.set(x, "reaction", js.undefined)
    
    inline def setReactionVarargs(value: ImmunizationReaction*): Self = StObject.set(x, "reaction", js.Array(value*))
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRecorded(value: String): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    inline def setRecordedUndefined: Self = StObject.set(x, "recorded", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Immunization): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: CodeableConcept): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setSite(value: CodeableConcept): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setStatus(value: completed | `entered-in-error` | `not-done`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: CodeableConcept): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setSubpotentReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subpotentReason", value.asInstanceOf[js.Any])
    
    inline def setSubpotentReasonUndefined: Self = StObject.set(x, "subpotentReason", js.undefined)
    
    inline def setSubpotentReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "subpotentReason", js.Array(value*))
    
    inline def setVaccineCode(value: CodeableConcept): Self = StObject.set(x, "vaccineCode", value.asInstanceOf[js.Any])
    
    inline def set_expirationDate(value: Element): Self = StObject.set(x, "_expirationDate", value.asInstanceOf[js.Any])
    
    inline def set_expirationDateUndefined: Self = StObject.set(x, "_expirationDate", js.undefined)
    
    inline def set_instantiatesCanonical(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesCanonicalVarargs(value: Element*): Self = StObject.set(x, "_instantiatesCanonical", js.Array(value*))
    
    inline def set_instantiatesUri(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_instantiatesUriVarargs(value: Element*): Self = StObject.set(x, "_instantiatesUri", js.Array(value*))
    
    inline def set_isSubpotent(value: Element): Self = StObject.set(x, "_isSubpotent", value.asInstanceOf[js.Any])
    
    inline def set_isSubpotentUndefined: Self = StObject.set(x, "_isSubpotent", js.undefined)
    
    inline def set_lotNumber(value: Element): Self = StObject.set(x, "_lotNumber", value.asInstanceOf[js.Any])
    
    inline def set_lotNumberUndefined: Self = StObject.set(x, "_lotNumber", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_occurrenceString(value: Element): Self = StObject.set(x, "_occurrenceString", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceStringUndefined: Self = StObject.set(x, "_occurrenceString", js.undefined)
    
    inline def set_primarySource(value: Element): Self = StObject.set(x, "_primarySource", value.asInstanceOf[js.Any])
    
    inline def set_primarySourceUndefined: Self = StObject.set(x, "_primarySource", js.undefined)
    
    inline def set_recorded(value: Element): Self = StObject.set(x, "_recorded", value.asInstanceOf[js.Any])
    
    inline def set_recordedUndefined: Self = StObject.set(x, "_recorded", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
