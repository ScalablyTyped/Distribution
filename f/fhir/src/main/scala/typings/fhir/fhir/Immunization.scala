package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Immunization event information
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Immunization extends DomainResource {
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
  @scala.inline
  def apply(
    notGiven: Boolean,
    patient: Reference,
    primarySource: Boolean,
    status: code,
    vaccineCode: CodeableConcept,
    _date: Element = null,
    _expirationDate: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lotNumber: Element = null,
    _notGiven: Element = null,
    _primarySource: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    doseQuantity: Quantity = null,
    encounter: Reference = null,
    expirationDate: date = null,
    explanation: ImmunizationExplanation = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    location: Reference = null,
    lotNumber: String = null,
    manufacturer: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    practitioner: js.Array[ImmunizationPractitioner] = null,
    reaction: js.Array[ImmunizationReaction] = null,
    reportOrigin: CodeableConcept = null,
    resourceType: code = null,
    route: CodeableConcept = null,
    site: CodeableConcept = null,
    text: Narrative = null,
    vaccinationProtocol: js.Array[ImmunizationVaccinationProtocol] = null
  ): Immunization = {
    val __obj = js.Dynamic.literal(notGiven = notGiven.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], primarySource = primarySource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_expirationDate != null) __obj.updateDynamic("_expirationDate")(_expirationDate.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lotNumber != null) __obj.updateDynamic("_lotNumber")(_lotNumber.asInstanceOf[js.Any])
    if (_notGiven != null) __obj.updateDynamic("_notGiven")(_notGiven.asInstanceOf[js.Any])
    if (_primarySource != null) __obj.updateDynamic("_primarySource")(_primarySource.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (doseQuantity != null) __obj.updateDynamic("doseQuantity")(doseQuantity.asInstanceOf[js.Any])
    if (encounter != null) __obj.updateDynamic("encounter")(encounter.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (explanation != null) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (lotNumber != null) __obj.updateDynamic("lotNumber")(lotNumber.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (practitioner != null) __obj.updateDynamic("practitioner")(practitioner.asInstanceOf[js.Any])
    if (reaction != null) __obj.updateDynamic("reaction")(reaction.asInstanceOf[js.Any])
    if (reportOrigin != null) __obj.updateDynamic("reportOrigin")(reportOrigin.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (vaccinationProtocol != null) __obj.updateDynamic("vaccinationProtocol")(vaccinationProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immunization]
  }
}

