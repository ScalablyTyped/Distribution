package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * List of participants involved in the encounter
     */

trait EncounterParticipant extends BackboneElement {
  /**
           * Persons involved in the encounter other than the patient
           */
  var individual: js.UndefOr[Reference] = js.undefined
  /**
           * Period of time during the encounter that the participant participated
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Role of participant in encounter
           */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

