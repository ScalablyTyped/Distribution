package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An action that is being or was performed on a patient
     */

trait Procedure extends DomainResource {
  /**
           * Contains extended information for property 'notDone'.
           */
  var _notDone: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'performedDateTime'.
           */
  var _performedDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * A request for this procedure
           */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Target body sites
           */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Classification of the procedure
           */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Identification of the procedure
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Complication following the procedure
           */
  var complication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * A condition that is a result of the procedure
           */
  var complicationDetail: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Encounter or episode associated with the procedure
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * Instantiates protocol or definition
           */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Device changed in procedure
           */
  var focalDevice: js.UndefOr[js.Array[ProcedureFocalDevice]] = js.undefined
  /**
           * Instructions for follow up
           */
  var followUp: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * External Identifiers for this procedure
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Where the procedure happened
           */
  var location: js.UndefOr[Reference] = js.undefined
  /**
           * True if procedure was not performed as scheduled
           */
  var notDone: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Reason procedure was not performed
           */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Additional information about the procedure
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * The result of procedure
           */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Part of referenced event
           */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Date/Period the procedure was performed
           */
  var performedDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Date/Period the procedure was performed
           */
  var performedPeriod: js.UndefOr[Period] = js.undefined
  /**
           * The people who performed the procedure
           */
  var performer: js.UndefOr[js.Array[ProcedurePerformer]] = js.undefined
  /**
           * Coded reason procedure performed
           */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Condition that is the reason the procedure performed
           */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Any report resulting from the procedure
           */
  var report: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * preparation | in-progress | suspended | aborted | completed | entered-in-error | unknown
           */
  var status: code
  /**
           * Who the procedure was performed on
           */
  var subject: Reference
  /**
           * Coded items used during the procedure
           */
  var usedCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Items used during procedure
           */
  var usedReference: js.UndefOr[js.Array[Reference]] = js.undefined
}

