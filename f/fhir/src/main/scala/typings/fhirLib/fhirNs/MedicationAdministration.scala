package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Administration of medication to a patient
     */

trait MedicationAdministration extends DomainResource {
  /**
           * Contains extended information for property 'effectiveDateTime'.
           */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'notGiven'.
           */
  var _notGiven: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Type of medication usage
           */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Encounter or Episode of Care administered as part of
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * Instantiates protocol or definition
           */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Device used to administer
           */
  var device: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Details of how medication was taken
           */
  var dosage: js.UndefOr[MedicationAdministrationDosage] = js.undefined
  /**
           * Start and end time of administration
           */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Start and end time of administration
           */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
           * A list of events of interest in the lifecycle
           */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * External identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * What was administered
           */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * What was administered
           */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  /**
           * True if medication not administered
           */
  var notGiven: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Information about the administration
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * Part of referenced event
           */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Who administered substance
           */
  var performer: js.UndefOr[js.Array[MedicationAdministrationPerformer]] = js.undefined
  /**
           * Request administration performed against
           */
  var prescription: js.UndefOr[Reference] = js.undefined
  /**
           * Reason administration performed
           */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Reason administration not performed
           */
  var reasonNotGiven: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Condition or Observation that supports why the medication was administered
           */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * in-progress | on-hold | completed | entered-in-error | stopped | unknown
           */
  var status: code
  /**
           * Who received medication
           */
  var subject: Reference
  /**
           * Additional information to support administration
           */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}

