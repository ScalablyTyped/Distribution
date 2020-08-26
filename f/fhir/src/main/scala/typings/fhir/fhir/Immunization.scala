package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Immunization event information
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Immunization extends DomainResource {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'expirationDate'.
    */
  var _expirationDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'lotNumber'.
    */
  var _lotNumber: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'notGiven'.
    */
  var _notGiven: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'primarySource'.
    */
  var _primarySource: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Vaccination administration date
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Amount of vaccine administered
    */
  var doseQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Encounter administered as part of
    */
  var encounter: js.UndefOr[Reference] = js.native
  /**
    * Vaccine expiration date
    */
  var expirationDate: js.UndefOr[date] = js.native
  /**
    * Administration/non-administration reasons
    */
  var explanation: js.UndefOr[ImmunizationExplanation] = js.native
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Where vaccination occurred
    */
  var location: js.UndefOr[Reference] = js.native
  /**
    * Vaccine lot number
    */
  var lotNumber: js.UndefOr[String] = js.native
  /**
    * Vaccine manufacturer
    */
  var manufacturer: js.UndefOr[Reference] = js.native
  /**
    * Flag for whether immunization was given
    */
  var notGiven: Boolean = js.native
  /**
    * Vaccination notes
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Who was immunized
    */
  var patient: Reference = js.native
  /**
    * Who performed event
    */
  var practitioner: js.UndefOr[js.Array[ImmunizationPractitioner]] = js.native
  /**
    * Indicates context the data was recorded in
    */
  var primarySource: Boolean = js.native
  /**
    * Details of a reaction that follows immunization
    */
  var reaction: js.UndefOr[js.Array[ImmunizationReaction]] = js.native
  /**
    * Indicates the source of a secondarily reported record
    */
  var reportOrigin: js.UndefOr[CodeableConcept] = js.native
  /**
    * How vaccine entered body
    */
  var route: js.UndefOr[CodeableConcept] = js.native
  /**
    * Body site vaccine  was administered
    */
  var site: js.UndefOr[CodeableConcept] = js.native
  /**
    * completed | entered-in-error
    */
  var status: code = js.native
  /**
    * What protocol was followed
    */
  var vaccinationProtocol: js.UndefOr[js.Array[ImmunizationVaccinationProtocol]] = js.native
  /**
    * Vaccine product administered
    */
  var vaccineCode: CodeableConcept = js.native
}

object Immunization {
  @scala.inline
  def apply(
    notGiven: Boolean,
    patient: Reference,
    primarySource: Boolean,
    status: code,
    vaccineCode: CodeableConcept
  ): Immunization = {
    val __obj = js.Dynamic.literal(notGiven = notGiven.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], primarySource = primarySource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immunization]
  }
  @scala.inline
  implicit class ImmunizationOps[Self <: Immunization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotGiven(value: Boolean): Self = this.set("notGiven", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimarySource(value: Boolean): Self = this.set("primarySource", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaccineCode(value: CodeableConcept): Self = this.set("vaccineCode", value.asInstanceOf[js.Any])
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_expirationDate(value: Element): Self = this.set("_expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_expirationDate: Self = this.set("_expirationDate", js.undefined)
    @scala.inline
    def set_lotNumber(value: Element): Self = this.set("_lotNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_lotNumber: Self = this.set("_lotNumber", js.undefined)
    @scala.inline
    def set_notGiven(value: Element): Self = this.set("_notGiven", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_notGiven: Self = this.set("_notGiven", js.undefined)
    @scala.inline
    def set_primarySource(value: Element): Self = this.set("_primarySource", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_primarySource: Self = this.set("_primarySource", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDoseQuantity(value: Quantity): Self = this.set("doseQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoseQuantity: Self = this.set("doseQuantity", js.undefined)
    @scala.inline
    def setEncounter(value: Reference): Self = this.set("encounter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncounter: Self = this.set("encounter", js.undefined)
    @scala.inline
    def setExpirationDate(value: date): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    @scala.inline
    def setExplanation(value: ImmunizationExplanation): Self = this.set("explanation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplanation: Self = this.set("explanation", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setLocation(value: Reference): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLotNumber(value: String): Self = this.set("lotNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLotNumber: Self = this.set("lotNumber", js.undefined)
    @scala.inline
    def setManufacturer(value: Reference): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setPractitionerVarargs(value: ImmunizationPractitioner*): Self = this.set("practitioner", js.Array(value :_*))
    @scala.inline
    def setPractitioner(value: js.Array[ImmunizationPractitioner]): Self = this.set("practitioner", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePractitioner: Self = this.set("practitioner", js.undefined)
    @scala.inline
    def setReactionVarargs(value: ImmunizationReaction*): Self = this.set("reaction", js.Array(value :_*))
    @scala.inline
    def setReaction(value: js.Array[ImmunizationReaction]): Self = this.set("reaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReaction: Self = this.set("reaction", js.undefined)
    @scala.inline
    def setReportOrigin(value: CodeableConcept): Self = this.set("reportOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportOrigin: Self = this.set("reportOrigin", js.undefined)
    @scala.inline
    def setRoute(value: CodeableConcept): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    @scala.inline
    def setSite(value: CodeableConcept): Self = this.set("site", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
    @scala.inline
    def setVaccinationProtocolVarargs(value: ImmunizationVaccinationProtocol*): Self = this.set("vaccinationProtocol", js.Array(value :_*))
    @scala.inline
    def setVaccinationProtocol(value: js.Array[ImmunizationVaccinationProtocol]): Self = this.set("vaccinationProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVaccinationProtocol: Self = this.set("vaccinationProtocol", js.undefined)
  }
  
}

