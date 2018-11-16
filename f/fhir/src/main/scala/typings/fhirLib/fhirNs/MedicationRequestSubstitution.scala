package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Any restrictions on medication substitution
     */

trait MedicationRequestSubstitution extends BackboneElement {
  /**
           * Contains extended information for property 'allowed'.
           */
  var _allowed: js.UndefOr[Element] = js.undefined
  /**
           * Whether substitution is allowed or not
           */
  var allowed: scala.Boolean
  /**
           * Why should (not) substitution be made
           */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
}

