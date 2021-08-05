package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Immunization event information
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Immunization
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'expirationDate'.
    */
  var _expirationDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'lotNumber'.
    */
  var _lotNumber: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'notGiven'.
    */
  var _notGiven: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'primarySource'.
    */
  var _primarySource: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Vaccination administration date
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Amount of vaccine administered
    */
  var doseQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Encounter administered as part of
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Vaccine expiration date
    */
  var expirationDate: js.UndefOr[date] = js.undefined
  
  /**
    * Administration/non-administration reasons
    */
  var explanation: js.UndefOr[ImmunizationExplanation] = js.undefined
  
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Where vaccination occurred
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Vaccine lot number
    */
  var lotNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Vaccine manufacturer
    */
  var manufacturer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Flag for whether immunization was given
    */
  var notGiven: Boolean
  
  /**
    * Vaccination notes
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Who was immunized
    */
  var patient: Reference
  
  /**
    * Who performed event
    */
  var practitioner: js.UndefOr[js.Array[ImmunizationPractitioner]] = js.undefined
  
  /**
    * Indicates context the data was recorded in
    */
  var primarySource: Boolean
  
  /**
    * Details of a reaction that follows immunization
    */
  var reaction: js.UndefOr[js.Array[ImmunizationReaction]] = js.undefined
  
  /**
    * Indicates the source of a secondarily reported record
    */
  var reportOrigin: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * How vaccine entered body
    */
  var route: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Body site vaccine  was administered
    */
  var site: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * completed | entered-in-error
    */
  var status: code
  
  /**
    * What protocol was followed
    */
  var vaccinationProtocol: js.UndefOr[js.Array[ImmunizationVaccinationProtocol]] = js.undefined
  
  /**
    * Vaccine product administered
    */
  var vaccineCode: CodeableConcept
}
object Immunization {
  
  inline def apply(
    notGiven: Boolean,
    patient: Reference,
    primarySource: Boolean,
    status: code,
    vaccineCode: CodeableConcept
  ): Immunization = {
    val __obj = js.Dynamic.literal(notGiven = notGiven.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], primarySource = primarySource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immunization]
  }
  
  extension [Self <: Immunization](x: Self) {
    
    inline def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDoseQuantity(value: Quantity): Self = StObject.set(x, "doseQuantity", value.asInstanceOf[js.Any])
    
    inline def setDoseQuantityUndefined: Self = StObject.set(x, "doseQuantity", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setExpirationDate(value: date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setExplanation(value: ImmunizationExplanation): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLotNumber(value: String): Self = StObject.set(x, "lotNumber", value.asInstanceOf[js.Any])
    
    inline def setLotNumberUndefined: Self = StObject.set(x, "lotNumber", js.undefined)
    
    inline def setManufacturer(value: Reference): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setNotGiven(value: Boolean): Self = StObject.set(x, "notGiven", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPractitioner(value: js.Array[ImmunizationPractitioner]): Self = StObject.set(x, "practitioner", value.asInstanceOf[js.Any])
    
    inline def setPractitionerUndefined: Self = StObject.set(x, "practitioner", js.undefined)
    
    inline def setPractitionerVarargs(value: ImmunizationPractitioner*): Self = StObject.set(x, "practitioner", js.Array(value :_*))
    
    inline def setPrimarySource(value: Boolean): Self = StObject.set(x, "primarySource", value.asInstanceOf[js.Any])
    
    inline def setReaction(value: js.Array[ImmunizationReaction]): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    inline def setReactionUndefined: Self = StObject.set(x, "reaction", js.undefined)
    
    inline def setReactionVarargs(value: ImmunizationReaction*): Self = StObject.set(x, "reaction", js.Array(value :_*))
    
    inline def setReportOrigin(value: CodeableConcept): Self = StObject.set(x, "reportOrigin", value.asInstanceOf[js.Any])
    
    inline def setReportOriginUndefined: Self = StObject.set(x, "reportOrigin", js.undefined)
    
    inline def setRoute(value: CodeableConcept): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setSite(value: CodeableConcept): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVaccinationProtocol(value: js.Array[ImmunizationVaccinationProtocol]): Self = StObject.set(x, "vaccinationProtocol", value.asInstanceOf[js.Any])
    
    inline def setVaccinationProtocolUndefined: Self = StObject.set(x, "vaccinationProtocol", js.undefined)
    
    inline def setVaccinationProtocolVarargs(value: ImmunizationVaccinationProtocol*): Self = StObject.set(x, "vaccinationProtocol", js.Array(value :_*))
    
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
