package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Who should participate in the action
     */

trait PlanDefinitionActionParticipant extends BackboneElement {
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * E.g. Nurse, Surgeon, Parent, etc
           */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * patient | practitioner | related-person
           */
  var `type`: code
}

