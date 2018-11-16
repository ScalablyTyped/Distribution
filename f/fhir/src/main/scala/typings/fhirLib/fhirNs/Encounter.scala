package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An interaction during which services are provided to the patient
     */

trait Encounter extends DomainResource {
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * The set of accounts that may be used for billing for this Encounter
           */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * The appointment that scheduled this encounter
           */
  var appointment: js.UndefOr[Reference] = js.undefined
  /**
           * inpatient | outpatient | ambulatory | emergency +
           */
  var `class`: js.UndefOr[Coding] = js.undefined
  /**
           * List of past encounter classes
           */
  var classHistory: js.UndefOr[js.Array[EncounterClassHistory]] = js.undefined
  /**
           * The list of diagnosis relevant to this encounter
           */
  var diagnosis: js.UndefOr[js.Array[EncounterDiagnosis]] = js.undefined
  /**
           * Episode(s) of care that this encounter should be recorded against
           */
  var episodeOfCare: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Details about the admission to a healthcare service
           */
  var hospitalization: js.UndefOr[EncounterHospitalization] = js.undefined
  /**
           * Identifier(s) by which this encounter is known
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * The ReferralRequest that initiated this encounter
           */
  var incomingReferral: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Quantity of time the encounter lasted (less time absent)
           */
  var length: js.UndefOr[Duration] = js.undefined
  /**
           * List of locations where the patient has been
           */
  var location: js.UndefOr[js.Array[EncounterLocation]] = js.undefined
  /**
           * Another Encounter this encounter is part of
           */
  var partOf: js.UndefOr[Reference] = js.undefined
  /**
           * List of participants involved in the encounter
           */
  var participant: js.UndefOr[js.Array[EncounterParticipant]] = js.undefined
  /**
           * The start and end time of the encounter
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Indicates the urgency of the encounter
           */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Reason the encounter takes place (code)
           */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * The custodian organization of this Encounter record
           */
  var serviceProvider: js.UndefOr[Reference] = js.undefined
  /**
           * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
           */
  var status: code
  /**
           * List of past encounter statuses
           */
  var statusHistory: js.UndefOr[js.Array[EncounterStatusHistory]] = js.undefined
  /**
           * The patient ro group present at the encounter
           */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
           * Specific type of encounter
           */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

