package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Dispensing a medication to a named patient
     */

trait MedicationDispense extends DomainResource {
  /**
           * Contains extended information for property 'notDone'.
           */
  var _notDone: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'whenHandedOver'.
           */
  var _whenHandedOver: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'whenPrepared'.
           */
  var _whenPrepared: js.UndefOr[Element] = js.undefined
  /**
           * Medication order that authorizes the dispense
           */
  var authorizingPrescription: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Type of medication dispense
           */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Encounter / Episode associated with event
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * Amount of medication expressed as a timing amount
           */
  var daysSupply: js.UndefOr[Quantity] = js.undefined
  /**
           * Where the medication was sent
           */
  var destination: js.UndefOr[Reference] = js.undefined
  /**
           * Clinical issue with action
           */
  var detectedIssue: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * How the medication is to be used by the patient or administered by the caregiver
           */
  var dosageInstruction: js.UndefOr[js.Array[Dosage]] = js.undefined
  /**
           * A list of releveant lifecycle events
           */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * External identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * What medication was supplied
           */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * What medication was supplied
           */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  /**
           * Whether the dispense was or was not performed
           */
  var notDone: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Why a dispense was not performed
           */
  var notDoneReasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Why a dispense was not performed
           */
  var notDoneReasonReference: js.UndefOr[Reference] = js.undefined
  /**
           * Information about the dispense
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * Event that dispense is part of
           */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Who performed event
           */
  var performer: js.UndefOr[js.Array[MedicationDispensePerformer]] = js.undefined
  /**
           * Amount dispensed
           */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Who collected the medication
           */
  var receiver: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * preparation | in-progress | on-hold | completed | entered-in-error | stopped
           */
  var status: js.UndefOr[code] = js.undefined
  /**
           * Who the dispense is for
           */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
           * Whether a substitution was performed on the dispense
           */
  var substitution: js.UndefOr[MedicationDispenseSubstitution] = js.undefined
  /**
           * Information that supports the dispensing of the medication
           */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Trial fill, partial fill, emergency fill, etc.
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * When product was given out
           */
  var whenHandedOver: js.UndefOr[dateTime] = js.undefined
  /**
           * When product was packaged and reviewed
           */
  var whenPrepared: js.UndefOr[dateTime] = js.undefined
}

