package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Immunization event information
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait Immunization extends DomainResource {
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
  var lotNumber: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Vaccine manufacturer
    */
  var manufacturer: js.UndefOr[Reference] = js.undefined
  /**
    * Flag for whether immunization was given
    */
  var notGiven: scala.Boolean
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
  var primarySource: scala.Boolean
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
    notGiven: scala.Boolean,
    patient: Reference,
    primarySource: scala.Boolean,
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
    lotNumber: java.lang.String = null,
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("notGiven")(notGiven)
    __obj.updateDynamic("patient")(patient)
    __obj.updateDynamic("primarySource")(primarySource)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("vaccineCode")(vaccineCode)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_expirationDate != null) __obj.updateDynamic("_expirationDate")(_expirationDate)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_lotNumber != null) __obj.updateDynamic("_lotNumber")(_lotNumber)
    if (_notGiven != null) __obj.updateDynamic("_notGiven")(_notGiven)
    if (_primarySource != null) __obj.updateDynamic("_primarySource")(_primarySource)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (date != null) __obj.updateDynamic("date")(date)
    if (doseQuantity != null) __obj.updateDynamic("doseQuantity")(doseQuantity)
    if (encounter != null) __obj.updateDynamic("encounter")(encounter)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (explanation != null) __obj.updateDynamic("explanation")(explanation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (location != null) __obj.updateDynamic("location")(location)
    if (lotNumber != null) __obj.updateDynamic("lotNumber")(lotNumber)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (note != null) __obj.updateDynamic("note")(note)
    if (practitioner != null) __obj.updateDynamic("practitioner")(practitioner)
    if (reaction != null) __obj.updateDynamic("reaction")(reaction)
    if (reportOrigin != null) __obj.updateDynamic("reportOrigin")(reportOrigin)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (route != null) __obj.updateDynamic("route")(route)
    if (site != null) __obj.updateDynamic("site")(site)
    if (text != null) __obj.updateDynamic("text")(text)
    if (vaccinationProtocol != null) __obj.updateDynamic("vaccinationProtocol")(vaccinationProtocol)
    __obj.asInstanceOf[Immunization]
  }
}

