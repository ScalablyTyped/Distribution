package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Members of the care team
     */

trait ClaimCareTeam extends BackboneElement {
  /**
           * Contains extended information for property 'responsible'.
           */
  var _responsible: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'sequence'.
           */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
           * Provider individual or organization
           */
  var provider: Reference
  /**
           * Type, classification or Specialization
           */
  var qualification: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Billing provider
           */
  var responsible: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Role on the team
           */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Number to covey order of careTeam
           */
  var sequence: positiveInt
}

