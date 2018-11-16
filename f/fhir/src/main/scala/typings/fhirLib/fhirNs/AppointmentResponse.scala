package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection
     */

trait AppointmentResponse extends DomainResource {
  /**
           * Contains extended information for property 'comment'.
           */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'end'.
           */
  var _end: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'participantStatus'.
           */
  var _participantStatus: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'start'.
           */
  var _start: js.UndefOr[Element] = js.undefined
  /**
           * Person, Location/HealthcareService or Device
           */
  var actor: js.UndefOr[Reference] = js.undefined
  /**
           * Appointment this response relates to
           */
  var appointment: Reference
  /**
           * Additional comments
           */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Time from appointment, or requested new end time
           */
  var end: js.UndefOr[instant] = js.undefined
  /**
           * External Ids for this item
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * accepted | declined | tentative | in-process | completed | needs-action | entered-in-error
           */
  var participantStatus: code
  /**
           * Role of participant in the appointment
           */
  var participantType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Time from appointment, or requested new start time
           */
  var start: js.UndefOr[instant] = js.undefined
}

