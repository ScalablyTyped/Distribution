package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Details about the admission to a healthcare service
     */

trait EncounterHospitalization extends BackboneElement {
  /**
           * From where patient was admitted (physician referral, transfer)
           */
  var admitSource: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Location to which the patient is discharged
           */
  var destination: js.UndefOr[Reference] = js.undefined
  /**
           * Diet preferences reported by the patient
           */
  var dietPreference: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Category or kind of location after discharge
           */
  var dischargeDisposition: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * The location from which the patient came before admission
           */
  var origin: js.UndefOr[Reference] = js.undefined
  /**
           * Pre-admission identifier
           */
  var preAdmissionIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
           * The type of hospital re-admission that has occurred (if any). If the value is absent, then this is not identified as a readmission
           */
  var reAdmission: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Wheelchair, translator, stretcher, etc.
           */
  var specialArrangement: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Special courtesies (VIP, board member)
           */
  var specialCourtesy: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

