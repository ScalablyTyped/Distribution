package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The list of diagnosis relevant to this episode of care
     */

trait EpisodeOfCareDiagnosis extends BackboneElement {
  /**
           * Contains extended information for property 'rank'.
           */
  var _rank: js.UndefOr[Element] = js.undefined
  /**
           * Conditions/problems/diagnoses this episode of care is for
           */
  var condition: Reference
  /**
           * Ranking of the diagnosis (for each role type)
           */
  var rank: js.UndefOr[positiveInt] = js.undefined
  /**
           * Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …)
           */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}

