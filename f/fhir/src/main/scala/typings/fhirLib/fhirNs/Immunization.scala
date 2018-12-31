package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Immunization event information
  */
trait Immunization extends DomainResource {
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

