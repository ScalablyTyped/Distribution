package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Whether a substitution was performed on the dispense
     */

trait MedicationDispenseSubstitution extends BackboneElement {
  /**
           * Contains extended information for property 'wasSubstituted'.
           */
  var _wasSubstituted: js.UndefOr[Element] = js.undefined
  /**
           * Why was substitution made
           */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Who is responsible for the substitution
           */
  var responsibleParty: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Code signifying whether a different drug was dispensed from what was prescribed
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Whether a substitution was or was not performed on the dispense
           */
  var wasSubstituted: scala.Boolean
}

