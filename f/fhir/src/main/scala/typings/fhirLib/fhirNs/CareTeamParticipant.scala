package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Members of the team
     */

trait CareTeamParticipant extends BackboneElement {
  /**
           * Who is involved
           */
  var member: js.UndefOr[Reference] = js.undefined
  /**
           * Organization of the practitioner
           */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
  /**
           * Time period of participant
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Type of involvement
           */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}

